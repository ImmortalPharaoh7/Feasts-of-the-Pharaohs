package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.ItemFood;

public class ItemFalafel extends ItemFood {
    public ItemFalafel() {
        super(4, 0.5F, false);
        setUnlocalizedName(References.FotPItems.FALAFEL.getUnlocalizedName());
        setRegistryName(References.FotPItems.FALAFEL.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
