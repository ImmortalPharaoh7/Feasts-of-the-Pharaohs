package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;

public class ItemGarlic extends ItemSeedMod {
    public ItemGarlic() {
        super(References.FotPItems.GARLIC.getRegistryName(), ModBlocks.garliccrop, Blocks.FARMLAND);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
