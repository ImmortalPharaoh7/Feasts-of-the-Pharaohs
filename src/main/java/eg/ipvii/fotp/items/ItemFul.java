package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemFul extends Item {

    public ItemFul(){
        setUnlocalizedName(References.FotPItems.FUL.getUnlocalizedName());
        setRegistryName(References.FotPItems.FUL.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
