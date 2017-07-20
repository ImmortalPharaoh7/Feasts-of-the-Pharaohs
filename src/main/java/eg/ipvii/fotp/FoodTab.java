package eg.ipvii.fotp;

import eg.ipvii.fotp.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FoodTab extends CreativeTabs {

    public FoodTab() {
        super("tabFood");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.fulsandwich);
    }
}
