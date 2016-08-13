package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;

public class ItemPlainSandwich extends Item {

    public ItemPlainSandwich(){
        setUnlocalizedName(References.FotPItems.PLAINSANDWICH.getUnlocalizedName());
        setRegistryName(References.FotPItems.PLAINSANDWICH.getRegistryName());
        setCreativeTab(FotPMod.CREATIVE_TAB);
    }
}
