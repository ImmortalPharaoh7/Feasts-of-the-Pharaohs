package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMortarandPestle extends Item {

    protected String name;

    public ItemMortarandPestle(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(FotPMod.COMPONENTSTAB);
        this.maxStackSize = 1;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }
}
