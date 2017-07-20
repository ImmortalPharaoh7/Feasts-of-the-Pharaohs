package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemEarthenwareBowl extends ItemMod {
    public ItemEarthenwareBowl() {
        super(References.FotPItems.EARTHENWAREBOWL.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
    }
}
