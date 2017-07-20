package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemModFood;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemFalafel extends ItemModFood {
    public ItemFalafel() {
        super(References.FotPItems.FALAFEL.getRegistryName(),4, 0.5F, false);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
