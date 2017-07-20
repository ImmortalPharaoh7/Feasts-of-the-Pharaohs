package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemModFood;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemFalafelSandwich extends ItemModFood {
    public ItemFalafelSandwich() {
        super(References.FotPItems.FALAFELSANDWICH.getRegistryName(), 8, 1F, true);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
