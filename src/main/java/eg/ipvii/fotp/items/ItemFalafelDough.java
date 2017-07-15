package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemFalafelDough extends Item{
    public ItemFalafelDough(){
        setUnlocalizedName(References.FotPItems.FALAFELDOUGH.getUnlocalizedName());
        setRegistryName(References.FotPItems.FALAFELDOUGH.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
