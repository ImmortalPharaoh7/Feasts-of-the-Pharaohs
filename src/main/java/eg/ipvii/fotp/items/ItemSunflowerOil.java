package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemSunflowerOil extends Item{
    public ItemSunflowerOil(){
        setUnlocalizedName(References.FotPItems.SUNFLOWEROIL.getUnlocalizedName());
        setRegistryName(References.FotPItems.SUNFLOWEROIL.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
