package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPresser extends Item {
    public ItemPresser() {
        setUnlocalizedName(References.FotPItems.PRESSER.getUnlocalizedName());
        setRegistryName(References.FotPItems.PRESSER.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
        this.maxStackSize = 1;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }
}
