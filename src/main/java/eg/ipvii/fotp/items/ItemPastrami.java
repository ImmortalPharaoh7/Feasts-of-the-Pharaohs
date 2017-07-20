package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemModFood;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemPastrami extends ItemModFood {
    public ItemPastrami() {
        super(References.FotPItems.PASTRAMI.getRegistryName(), 6, 0.6F, true);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
