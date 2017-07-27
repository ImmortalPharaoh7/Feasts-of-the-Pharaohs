package eg.ipvii.fotp;

import com.teamwizardry.librarianlib.features.base.ModCreativeTab;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ComponentsTab extends ModCreativeTab {

    @NotNull
    @Override
    public ItemStack getIconStack() {
        return new ItemStack(ModItems.mudball); // idk about egypt, dude, but here we don't use mudballs as a component in our foods.
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.mudball);
    }
}
