package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropCumin extends BlockCrops {
    public BlockCropCumin() {
        setUnlocalizedName(References.FotPBlocks.CUMMINCROP.getUnlocalizedName());
        setRegistryName(References.FotPBlocks.CUMMINCROP.getRegistryName());
    }

    @Override
    protected Item getSeed() {
        return ModItems.cumin;
    }

    @Override
    protected Item getCrop() {
        return ModItems.cumin;
    }
}
