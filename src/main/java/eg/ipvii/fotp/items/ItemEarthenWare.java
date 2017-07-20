package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemEarthenWare extends Item {
    public ItemEarthenWare() {
        setUnlocalizedName(References.FotPItems.EARTHENWARE.getUnlocalizedName());
        setRegistryName(References.FotPItems.EARTHENWARE.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
    }
}