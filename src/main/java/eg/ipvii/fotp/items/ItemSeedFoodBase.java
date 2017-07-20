package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeedFood;

public class ItemSeedFoodBase extends ItemSeedFood {

    protected String name;

    public ItemSeedFoodBase(String name, int healAmount, float saturation, Block crops, Block soil) {
        super(healAmount, saturation, crops, soil);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        FotPMod.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemSeedFoodBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
