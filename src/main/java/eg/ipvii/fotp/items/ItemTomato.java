package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemModFood;
import eg.ipvii.fotp.References;

public class ItemTomato extends ItemModFood {
    public ItemTomato() {
        super(References.FotPItems.TOMATO.getRegistryName(), 1, 0.5F, false);
    }
}
