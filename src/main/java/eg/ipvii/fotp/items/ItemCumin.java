package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;

public class ItemCumin extends ItemSeedMod {
    public ItemCumin() {
        super(References.FotPItems.CUMIN.getRegistryName(), ModBlocks.cumincrop, Blocks.FARMLAND);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
