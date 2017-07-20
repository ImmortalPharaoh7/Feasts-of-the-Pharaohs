package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModItems;
import eg.ipvii.fotp.tileentity.TileEntityFulQedra;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockFulQedra extends BlockContainer {

    public BlockFulQedra() {
        super(Material.ROCK);
        setUnlocalizedName(References.FotPBlocks.FULQEDRA.getUnlocalizedName());
        setRegistryName(References.FotPBlocks.FULQEDRA.getRegistryName());
        setHardness(1);
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
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityFulQedra();
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @javax.annotation.Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            return true;
        } else {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if (tileentity instanceof TileEntityFulQedra) {
                TileEntityFulQedra qedra = (TileEntityFulQedra) tileentity;
                if (heldItem != null) {
                    if (heldItem.getItem() == ModItems.beans && qedra.addFood(qedra.getBeansCount(), qedra.STACKLIMIT)) {
                        int stackSize = heldItem.getCount();
                        heldItem.setCount(stackSize - 1);
                        if (heldItem.getCount() == 0) {
                            playerIn.setItemStackToSlot(hand == EnumHand.MAIN_HAND ? EntityEquipmentSlot.MAINHAND : EntityEquipmentSlot.OFFHAND, ItemStack.EMPTY);
                        }
                        return true;
                    } else if (heldItem.getItem() == ModItems.ladle && qedra.removeFood(qedra.getFulCount(), new ItemStack(ModItems.ful))) {
                        return true;
                    }
                }
                qedra.removeFood(qedra.getBeansCount(), new ItemStack(ModItems.beans));
            }
        }
        return true;
    }
}
