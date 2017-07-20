package eg.ipvii.fotp.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void register() {
        //Item Smelting Recipes
        GameRegistry.addSmelting(ModItems.beans, new ItemStack(ModItems.ful), 0.7F);
        GameRegistry.addSmelting(ModItems.rawpastrami, new ItemStack(ModItems.pastrami), 0.7F);
        GameRegistry.addSmelting(ModItems.mudball, new ItemStack(ModItems.earthenware), 0.7F);
        GameRegistry.addSmelting(ModItems.falafeldough, new ItemStack(ModItems.falafel), 0.7F);


    }
}
