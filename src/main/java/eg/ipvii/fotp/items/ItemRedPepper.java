package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.ItemFood;

public class ItemRedPepper extends ItemFood {
    public ItemRedPepper() {
        super(1, 0.5F, false);
        setUnlocalizedName(References.FotPItems.REDPEPPER.getUnlocalizedName());
        setRegistryName(References.FotPItems.REDPEPPER.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
