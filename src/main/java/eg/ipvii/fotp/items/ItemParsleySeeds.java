package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ItemParsleySeeds extends ItemSeeds{
    public ItemParsleySeeds() {
        super(ModBlocks.parsleycrop, Blocks.FARMLAND);
        setUnlocalizedName(References.FotPItems.PARSLEYSEEDS.getUnlocalizedName());
        setRegistryName(References.FotPItems.PARSLEYSEEDS.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
