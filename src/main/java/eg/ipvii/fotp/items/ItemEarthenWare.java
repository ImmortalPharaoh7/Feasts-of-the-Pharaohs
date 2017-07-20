package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemEarthenWare extends ItemMod {
    public ItemEarthenWare() {
        super(References.FotPItems.EARTHENWARE.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
    }
}