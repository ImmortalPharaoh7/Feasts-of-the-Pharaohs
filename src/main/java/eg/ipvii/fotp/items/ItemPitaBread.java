package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemPitaBread extends ItemMod {

    public ItemPitaBread() {
        super(References.FotPItems.PITABREAD.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
