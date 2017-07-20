package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;

public class ItemOkraSeeds extends ItemSeedMod {
    public ItemOkraSeeds() {
        super(References.FotPItems.OKRASEEDS.getRegistryName(), ModBlocks.okracrop, Blocks.FARMLAND);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
