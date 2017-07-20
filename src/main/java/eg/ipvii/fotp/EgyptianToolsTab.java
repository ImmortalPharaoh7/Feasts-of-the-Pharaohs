package eg.ipvii.fotp;

import eg.ipvii.fotp.init.ModBlocks;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EgyptianToolsTab extends CreativeTabs{
    public EgyptianToolsTab(){
        super ("tabEgyptianTools");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(ModBlocks.fulqedra));
    }
}
