package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.init.ModItems;
import net.minecraft.item.Item;

public class BlockCropCumin extends BlockCropsMod {

    protected String name;

    public BlockCropCumin(String name) {
        super(name);
        this.name = name;
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
