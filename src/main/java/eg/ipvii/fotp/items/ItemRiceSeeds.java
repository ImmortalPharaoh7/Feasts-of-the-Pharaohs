package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;

public class ItemRiceSeeds extends ItemSeedMod {
    public ItemRiceSeeds() {
        super(References.FotPItems.RICESEEDS.getRegistryName(), ModBlocks.ricecrop, Blocks.FARMLAND);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
