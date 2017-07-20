package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemModFood;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemParsley extends ItemModFood {
    public ItemParsley() {
        super(References.FotPItems.PARSLEY.getRegistryName(), 2, 0.3F, false);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
