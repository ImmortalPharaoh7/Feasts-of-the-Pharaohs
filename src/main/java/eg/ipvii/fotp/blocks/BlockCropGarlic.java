package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.item.Item;

public class BlockCropGarlic extends BlockCropsMod {

    public BlockCropGarlic() {
        super(References.FotPBlocks.GARLICCROP.getRegistryName());
    }

    @Override
    protected Item getSeed() {
        return ModItems.garlic;
    }

    @Override
    protected Item getCrop() {
        return ModItems.garlic;
    }
}
