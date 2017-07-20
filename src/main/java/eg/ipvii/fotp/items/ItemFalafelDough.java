package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemFalafelDough extends ItemMod {
    public ItemFalafelDough() {
        super(References.FotPItems.FALAFELDOUGH.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
