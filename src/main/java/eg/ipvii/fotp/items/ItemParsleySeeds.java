package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;

public class ItemParsleySeeds extends ItemSeedMod {
    public ItemParsleySeeds() {
        super(References.FotPItems.PARSLEYSEEDS.getRegistryName(), ModBlocks.parsleycrop, Blocks.FARMLAND);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
