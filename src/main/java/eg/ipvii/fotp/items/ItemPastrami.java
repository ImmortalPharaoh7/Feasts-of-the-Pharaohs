package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.ItemFood;

public class ItemPastrami extends ItemFood {
    public ItemPastrami() {
        super(6, 0.6F, true);
        setUnlocalizedName(References.FotPItems.PASTRAMI.getUnlocalizedName());
        setRegistryName(References.FotPItems.PASTRAMI.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
