package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ItemRiceSeeds extends ItemSeeds {
    public ItemRiceSeeds() {
        super(ModBlocks.ricecrop, Blocks.FARMLAND);
        setUnlocalizedName(References.FotPItems.RICESEEDS.getUnlocalizedName());
        setRegistryName(References.FotPItems.RICESEEDS.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
