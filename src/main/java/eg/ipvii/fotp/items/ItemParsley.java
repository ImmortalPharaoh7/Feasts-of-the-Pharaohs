package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.ItemFood;

public class ItemParsley extends ItemFood {
    public ItemParsley() {
        super(2, 0.3F, false);
        setUnlocalizedName(References.FotPItems.PARSLEY.getUnlocalizedName());
        setRegistryName(References.FotPItems.PARSLEY.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
