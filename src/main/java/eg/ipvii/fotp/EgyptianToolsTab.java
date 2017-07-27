package eg.ipvii.fotp;

import com.teamwizardry.librarianlib.features.base.ModCreativeTab;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class EgyptianToolsTab extends ModCreativeTab {

    @NotNull
    @Override
    public ItemStack getIconStack() {
        return new ItemStack(ModBlocks.fulqedra);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.fulqedra);
    }
}
