package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemModFood;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemFulSandwich extends ItemModFood {

    public ItemFulSandwich() {
        super(References.FotPItems.FULSANDWICH.getRegistryName(), 8, 1F, true);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
