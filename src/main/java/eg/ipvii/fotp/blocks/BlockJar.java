package eg.ipvii.fotp.blocks;

import com.teamwizardry.librarianlib.features.base.block.tile.BlockModContainer;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModItems;
import eg.ipvii.fotp.tileentity.TileEntityJar;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockJar extends BlockModContainer {

    //1 / 16 = 0.0625
    protected String name;
    private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625 * 4, 0, 0.0625 * 4, 0.0625 * 12, 0.0625 * 12, 0.0625 * 12);
    private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(0.0625 * 4, 0, 0.0625 * 4, 0.0625 * 12, 0.0625 * 11, 0.0625 * 12);

    public BlockJar(String name) {
        super(name, Material.ROCK);
        this.name = name;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return BOUNDING_BOX;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if (tileEntity instanceof TileEntityJar) {
                TileEntityJar jar = (TileEntityJar) tileEntity;
                ItemStack heldItem = playerIn.getHeldItem(hand);
                if (heldItem != ItemStack.EMPTY) {
                    if (heldItem.getItem() == ModItems.fulsandwich) {
                        if (jar.addFood(jar.sandwichcount, jar.LIMIT)) {
                            int stackSize = heldItem.getCount();
                            heldItem.setCount(stackSize - 1);
                            if (heldItem.getCount() == 0) {
                                playerIn.setItemStackToSlot(hand == EnumHand.MAIN_HAND ? EntityEquipmentSlot.MAINHAND : EntityEquipmentSlot.OFFHAND, ItemStack.EMPTY);
                            }
                            return true;
                        }
                    }
                }
                jar.removeFood(jar.sandwichcount, new ItemStack(ModItems.fulsandwich));
            }
        }
        return true;
    }

    @Override
    public TileEntity createTileEntity(World worldIn, IBlockState meta) {
        return new TileEntityJar();
    }
}