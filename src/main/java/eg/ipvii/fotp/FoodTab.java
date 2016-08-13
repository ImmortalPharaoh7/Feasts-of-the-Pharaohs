package eg.ipvii.fotp;

import eg.ipvii.fotp.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FoodTab extends CreativeTabs{

    public FoodTab(){
        super ("tabFood");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.fulsandwich;
    }
}
