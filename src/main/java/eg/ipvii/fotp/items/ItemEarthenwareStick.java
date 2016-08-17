package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemEarthenwareStick extends Item{
    public ItemEarthenwareStick(){
        setUnlocalizedName(References.FotPItems.EARTHENWARESTICK.getUnlocalizedName());
        setRegistryName(References.FotPItems.EARTHENWARESTICK.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
    }
}
