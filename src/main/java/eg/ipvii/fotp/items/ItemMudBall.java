package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;

public class ItemMudBall extends ItemMod {
    public ItemMudBall() {
        super(References.FotPItems.MUDBALL.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
    }
}
