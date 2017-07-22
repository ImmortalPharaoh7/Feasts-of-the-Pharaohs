package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.init.ModItems;
import net.minecraft.item.Item;

public class BlockCropGarlic extends BlockCropsMod {

    protected String name;

    public BlockCropGarlic(String name) {
        super(name);
        this.name = name;
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
