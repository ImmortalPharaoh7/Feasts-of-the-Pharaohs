package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemRice extends Item {
    public ItemRice() {
        setUnlocalizedName(References.FotPItems.RICE.getUnlocalizedName());
        setRegistryName(References.FotPItems.RICE.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}