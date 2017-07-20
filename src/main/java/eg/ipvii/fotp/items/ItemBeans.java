package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;

public class ItemBeans extends ItemSeedFoodMod {

    public ItemBeans() {
        super(References.FotPItems.BEANS.getRegistryName(), ModBlocks.beanscrop, Blocks.FARMLAND, 6, 0.7F);
        setCreativeTab(FotPMod.FOODTAB);
    }
}