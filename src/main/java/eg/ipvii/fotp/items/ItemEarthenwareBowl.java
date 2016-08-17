package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemEarthenwareBowl extends Item{
    public ItemEarthenwareBowl() {
        setUnlocalizedName(References.FotPItems.EARTHENWAREBOWL.getUnlocalizedName());
        setRegistryName(References.FotPItems.EARTHENWAREBOWL.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
    }
}
