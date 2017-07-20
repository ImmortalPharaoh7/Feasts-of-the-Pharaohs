package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;

public class ItemRedPepperSeeds extends ItemSeedMod {
    public ItemRedPepperSeeds() {
        super(References.FotPItems.REDPEPPERSEEDS.getRegistryName(), ModBlocks.redpeppercrop, Blocks.FARMLAND);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
