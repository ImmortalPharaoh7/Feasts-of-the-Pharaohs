package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMortarandPestle extends Item{
    public ItemMortarandPestle(){
        setUnlocalizedName(References.FotPItems.MORTARANDPESTLE.getUnlocalizedName());
        setRegistryName(References.FotPItems.MORTARANDPESTLE.getRegistryName());
        setCreativeTab(FotPMod.COMPONENTSTAB);
        this.maxStackSize=1;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }
}
