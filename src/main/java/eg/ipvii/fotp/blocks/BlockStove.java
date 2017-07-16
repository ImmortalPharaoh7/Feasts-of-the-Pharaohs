package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import eg.ipvii.fotp.tileentity.TileEntityStove;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockStove extends Block implements ITileEntityProvider{
    public BlockStove() {
        super (Material.ROCK);
        setUnlocalizedName(References.FotPBlocks.STOVE.getUnlocalizedName());
        setRegistryName(References.FotPBlocks.STOVE.getRegistryName());
        setHardness(1);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityStove();
    }

    public boolean isHeated(){
        return new TileEntityStove().isHeated();
    }
}
