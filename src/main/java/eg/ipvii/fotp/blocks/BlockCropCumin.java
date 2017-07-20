package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.item.Item;

public class BlockCropCumin extends BlockCropsMod {
    public BlockCropCumin() {
        super(References.FotPBlocks.BEANSCROP.getRegistryName());
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
