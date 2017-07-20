package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemPaprikaPowder extends Item {
    public ItemPaprikaPowder() {
        setUnlocalizedName(References.FotPItems.PAPRIKAPOWDER.getUnlocalizedName());
        setRegistryName(References.FotPItems.PAPRIKAPOWDER.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
    }
}
