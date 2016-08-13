package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

public class BlockCropBeans extends BlockCrops{
    public BlockCropBeans(){
        setUnlocalizedName(References.FotPBlocks.BEANSCROP.getUnlocalizedName());
        setRegistryName(References.FotPBlocks.BEANSCROP.getRegistryName());
    }

    @Override
    protected Item getSeed() {
        return ModItems.beans;
    }
    

    @Override
    protected Item getCrop() {
        return ModItems.beans;
    }
}
