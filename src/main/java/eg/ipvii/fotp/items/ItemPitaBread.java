package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemPitaBread extends Item {

    public ItemPitaBread(){
        setUnlocalizedName(References.FotPItems.PITABREAD.getUnlocalizedName());
        setRegistryName(References.FotPItems.PITABREAD.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
