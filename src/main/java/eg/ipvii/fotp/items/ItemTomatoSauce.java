package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemTomatoSauce extends ItemMod {
    public ItemTomatoSauce() {
        super(References.FotPItems.TOMATOSAUCE.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
