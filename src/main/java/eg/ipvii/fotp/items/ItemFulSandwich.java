package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.ItemFood;

public class ItemFulSandwich extends ItemFood {

    public ItemFulSandwich() {
        super(8, 1F, true);
        setUnlocalizedName(References.FotPItems.FULSANDWICH.getUnlocalizedName());
        setRegistryName(References.FotPItems.FULSANDWICH.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
