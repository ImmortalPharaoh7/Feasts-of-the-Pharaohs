package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemModFood;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemRedPepper extends ItemModFood {
    public ItemRedPepper() {
        super(References.FotPItems.REDPEPPER.getRegistryName(), 1, 0.5F, false);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
