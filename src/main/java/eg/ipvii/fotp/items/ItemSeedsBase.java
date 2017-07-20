package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;

public class ItemSeedsBase extends ItemSeeds {

    protected String name;

    public ItemSeedsBase(String name, Block crops, Block soil) {
        super(crops, soil);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        FotPMod.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemSeedsBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
