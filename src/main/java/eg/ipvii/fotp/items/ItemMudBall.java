package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemMudBall extends Item {
    public ItemMudBall() {
        setUnlocalizedName(References.FotPItems.MUDBALL.getUnlocalizedName());
        setRegistryName(References.FotPItems.MUDBALL.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
    }
}
