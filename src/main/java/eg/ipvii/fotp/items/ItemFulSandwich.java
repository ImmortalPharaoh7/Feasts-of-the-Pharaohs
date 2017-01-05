<<<<<<< HEAD
package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.ItemFood;

public class ItemFulSandwich extends ItemFood {

    public ItemFulSandwich(){
        super(8, 10, true);
        setUnlocalizedName(References.FotPItems.FULSANDWICH.getUnlocalizedName());
        setRegistryName(References.FotPItems.FULSANDWICH.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
=======
package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.ItemFood;

public class ItemFulSandwich extends ItemFood {

    public ItemFulSandwich(){
        super(8, 10, true);
        setUnlocalizedName(References.FotPItems.FULSANDWICH.getUnlocalizedName());
        setRegistryName(References.FotPItems.FULSANDWICH.getRegistryName());
        setCreativeTab(FotPMod.CREATIVE_TAB);
    }
}
>>>>>>> a10b4a66619225eb78a70ecde64e14b3b339936b
