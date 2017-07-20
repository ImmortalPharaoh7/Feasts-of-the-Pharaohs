package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemModFood;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemFul extends ItemModFood {

    public ItemFul() {
        super(References.FotPItems.FUL.getRegistryName(), 3, 0.5F, false);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
