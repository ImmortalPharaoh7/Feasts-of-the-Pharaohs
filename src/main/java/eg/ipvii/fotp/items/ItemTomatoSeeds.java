package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;

public class ItemTomatoSeeds extends ItemSeedMod {
    public ItemTomatoSeeds() {
        super(References.FotPItems.TOMATOSEEDS.getRegistryName(), ModBlocks.tomatocrop, Blocks.FARMLAND);
        setUnlocalizedName(References.FotPItems.TOMATOSEEDS.getUnlocalizedName());
        setRegistryName(References.FotPItems.TOMATOSEEDS.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
