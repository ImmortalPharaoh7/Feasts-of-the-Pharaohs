package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemOkra extends ItemFood{
    public ItemOkra() {
        super(1, 0.8F, false);
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