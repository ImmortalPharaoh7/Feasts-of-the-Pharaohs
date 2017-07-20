package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ItemTomatoSeeds extends ItemSeeds {
    public ItemTomatoSeeds() {
        super(ModBlocks.tomatocrop, Blocks.FARMLAND);
        setUnlocalizedName(References.FotPItems.TOMATOSEEDS.getUnlocalizedName());
        setRegistryName(References.FotPItems.TOMATOSEEDS.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
