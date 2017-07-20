package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ItemGarlic extends ItemSeeds {
    public ItemGarlic() {
        super(ModBlocks.garliccrop, Blocks.FARMLAND);
        setUnlocalizedName(References.FotPItems.GARLIC.getUnlocalizedName());
        setRegistryName(References.FotPItems.GARLIC.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
