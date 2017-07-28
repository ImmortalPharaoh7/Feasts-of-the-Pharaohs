package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.item.ItemStack;

public class ItemPresser extends ItemMod {

    protected String name;


    public ItemPresser(String name) {
        super(name);
        this.name = name;
        setCreativeTab(FotPMod.FotPCreativeTab);
        this.maxStackSize = 1;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }
}
