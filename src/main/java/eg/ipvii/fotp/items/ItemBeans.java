package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;

public class ItemBeans extends ItemSeedFood {

    public ItemBeans() {
        super(6, 0.7F, ModBlocks.beanscrop, Blocks.FARMLAND);
        setUnlocalizedName(References.FotPItems.BEANS.getUnlocalizedName());
        setRegistryName(References.FotPItems.BEANS.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}