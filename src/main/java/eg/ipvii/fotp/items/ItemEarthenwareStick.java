package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemEarthenwareStick extends ItemMod {
    public ItemEarthenwareStick() {
        super(References.FotPItems.EARTHENWARESTICK.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
    }
}
