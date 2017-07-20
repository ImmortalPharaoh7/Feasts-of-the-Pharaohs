package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemPaprikaPowder extends ItemMod {
    public ItemPaprikaPowder() {
        super(References.FotPItems.PAPRIKAPOWDER.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
    }
}
