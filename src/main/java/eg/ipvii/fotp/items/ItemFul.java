package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.ItemFood;

public class ItemFul extends ItemFood {

    public ItemFul() {
        super(3, 0.5F, false);
        setUnlocalizedName(References.FotPItems.FUL.getUnlocalizedName());
        setRegistryName(References.FotPItems.FUL.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
