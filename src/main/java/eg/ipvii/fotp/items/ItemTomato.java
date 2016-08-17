package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.ItemFood;

public class ItemTomato extends ItemFood{
    public ItemTomato() {
        super(1, 0.5F, false);
        setUnlocalizedName(References.FotPItems.TOMATO.getUnlocalizedName());
        setRegistryName(References.FotPItems.TOMATO.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
