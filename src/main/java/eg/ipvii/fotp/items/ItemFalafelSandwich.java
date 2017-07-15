package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.ItemFood;

public class ItemFalafelSandwich extends ItemFood{
    public ItemFalafelSandwich() {
        super(8, 1F, true);
        setUnlocalizedName(References.FotPItems.FALAFELSANDWICH.getUnlocalizedName());
        setRegistryName(References.FotPItems.FALAFELSANDWICH.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
