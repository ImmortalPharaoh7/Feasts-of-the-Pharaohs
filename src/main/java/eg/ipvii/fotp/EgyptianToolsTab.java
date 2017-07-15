package eg.ipvii.fotp;

import eg.ipvii.fotp.init.ModBlocks;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EgyptianToolsTab extends CreativeTabs{
    public EgyptianToolsTab(){
        super ("tabEgyptianTools");
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ModBlocks.fulqedra);
    }
}
