package eg.ipvii.fotp;

import eg.ipvii.fotp.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ComponentsTab extends CreativeTabs {

    public ComponentsTab(){
        super ("tabComponents");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.mudball;
    }
}