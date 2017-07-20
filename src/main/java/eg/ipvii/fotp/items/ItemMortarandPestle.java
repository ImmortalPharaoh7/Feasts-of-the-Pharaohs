package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import eg.ipvii.fotp.FotPMod;
import net.minecraft.item.ItemStack;

public class ItemMortarandPestle extends ItemMod {

    protected String name;

    public ItemMortarandPestle(String name) {
        super(name);
        this.name = name;
        setCreativeTab(FotPMod.COMPONENTSTAB);
        this.maxStackSize = 1;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }
}
