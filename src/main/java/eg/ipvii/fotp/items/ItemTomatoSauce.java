package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemTomatoSauce extends Item {
    public ItemTomatoSauce() {
        setUnlocalizedName(References.FotPItems.TOMATOSAUCE.getUnlocalizedName());
        setRegistryName(References.FotPItems.TOMATOSAUCE.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
