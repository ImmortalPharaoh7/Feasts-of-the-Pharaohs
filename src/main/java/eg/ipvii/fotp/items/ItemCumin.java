package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ItemCumin extends ItemSeeds {
    public ItemCumin() {
        super(ModBlocks.cumincrop, Blocks.FARMLAND);
        setUnlocalizedName(References.FotPItems.CUMIN.getUnlocalizedName());
        setRegistryName(References.FotPItems.CUMIN.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
