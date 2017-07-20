package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemSunflowerOil extends ItemMod {
    public ItemSunflowerOil() {
        super(References.FotPItems.SUNFLOWEROIL.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
