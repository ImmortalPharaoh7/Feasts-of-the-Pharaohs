package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemOkra extends Item {
    public ItemOkra() {
        setUnlocalizedName(References.FotPItems.OKRA.getUnlocalizedName());
        setRegistryName(References.FotPItems.OKRA.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("Okra is love, okra is life");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }
}