package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import eg.ipvii.fotp.tileentity.TileEntityStove;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockStove extends Block implements ITileEntityProvider {
    public BlockStove() {
        super(Material.ROCK);
        setUnlocalizedName(References.FotPBlocks.STOVE.getUnlocalizedName());
        setRegistryName(References.FotPBlocks.STOVE.getRegistryName());
        setHardness(1);
    }

    public static boolean isHeated() {
        return new TileEntityStove().isHeated();
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityStove();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if (tileEntity instanceof TileEntityStove) {
                TileEntityStove stove = (TileEntityStove) tileEntity;
                ItemStack heldItem = playerIn.getHeldItem(hand);
                if (heldItem != ItemStack.EMPTY && heldItem.getItem() == Items.COAL) {
                    int stackSize = heldItem.getCount();
                    heldItem.setCount(stackSize - 1);
                    if (heldItem.getCount() == 0) {
                        playerIn.setItemStackToSlot(hand == EnumHand.MAIN_HAND ? EntityEquipmentSlot.MAINHAND : EntityEquipmentSlot.OFFHAND, ItemStack.EMPTY);
                    }
                }
                stove.removeCoal();
            }
        }
        return true;
    }

}
