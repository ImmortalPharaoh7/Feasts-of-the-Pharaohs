package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import eg.ipvii.fotp.tileentity.TileEntityStove;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockStove extends Block implements ITileEntityProvider{
    public BlockStove() {
        super (Material.ROCK);
        setUnlocalizedName(References.FotPBlocks.STOVE.getUnlocalizedName());
        setRegistryName(References.FotPBlocks.STOVE.getRegistryName());
        setHardness(1);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityStove();
    }

    public static boolean isHeated(){
        return new TileEntityStove().isHeated();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote){
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if(tileEntity instanceof TileEntityStove){
                TileEntityStove stove = (TileEntityStove) tileEntity;
                if(heldItem != null && heldItem.getItem() == Items.COAL){
                    if(stove.addCoal()){
                        heldItem.stackSize--;
                        return true;
                    }
                }
                stove.removeCoal();
            }
        }return true;
    }
}
