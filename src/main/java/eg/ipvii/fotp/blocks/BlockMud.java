package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockMud extends Block{
    public BlockMud(){
        super (Material.ROCK);
        setUnlocalizedName(References.FotPBlocks.MUD.getUnlocalizedName());
        setRegistryName(References.FotPBlocks.MUD.getRegistryName());
        setHardness(1);
    }
}
