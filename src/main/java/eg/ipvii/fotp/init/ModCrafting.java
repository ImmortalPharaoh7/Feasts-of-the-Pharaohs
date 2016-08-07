package eg.ipvii.fotp.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void register(){
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.jar), " W ", "G G", "G G", 'W', Blocks.WOODEN_PRESSURE_PLATE, 'G', Blocks.GLASS);
    }
}
