package eg.ipvii.fotp;

import eg.ipvii.fotp.init.ModItems;
import eg.ipvii.fotp.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ComponentsTab extends CreativeTabs {

    public ComponentsTab(){
        super ("tabComponents");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.mudball);
    }
}