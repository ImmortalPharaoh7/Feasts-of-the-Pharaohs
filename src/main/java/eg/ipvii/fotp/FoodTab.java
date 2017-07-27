package eg.ipvii.fotp;

import com.teamwizardry.librarianlib.features.base.ModCreativeTab;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class FoodTab extends ModCreativeTab {

    public FoodTab() {
        this.registerDefaultTab();
    }

    @NotNull
    @Override
    public ItemStack getIconStack() {
        return new ItemStack(ModItems.fulsandwich);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.fulsandwich);
    }
}
