<<<<<<< HEAD
package eg.ipvii.fotp.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void register(){
        //Blocks Recipes
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.jar), " W ", "G G", "GGG", 'W', Blocks.WOODEN_PRESSURE_PLATE, 'G', Blocks.GLASS);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.mud, 5), "DCD", "CWC", "DCD", 'D', Blocks.DIRT, 'C', Blocks.CLAY, 'W', Items.WATER_BUCKET);

        //Items Recipes

        //Shaped
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.plainsandwich), "WW", "WW", 'W', Items.WHEAT);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.earthenwarebowl), "E E", "E", 'E', ModItems.earthenware);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.presser), "SES", "SES", "SES", 'S', ModItems.earthenwarestick, 'E', ModItems.earthenware);

        //Shapeless
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fulsandwich), ModItems.ful, ModItems.plainsandwich);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mudball, 9), ModBlocks.mud);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.earthenwarestick, 4), ModItems.earthenware, ModItems.earthenware);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mortarandpestle), ModItems.earthenwarebowl, ModItems.earthenwarestick);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.redpepperseeds, 2), ModItems.redpepper);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paprikapowder, 3), ModItems.mortarandpestle, ModItems.redpepper);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tomatosauce), ModItems.tomato, ModItems.presser);

        //Item Smelting Recipes
        GameRegistry.addSmelting(ModItems.beans, new ItemStack(ModItems.ful), 0.7F);
        GameRegistry.addSmelting(ModItems.rawpastrami, new ItemStack(ModItems.pastrami), 0.7F);
        GameRegistry.addSmelting(ModItems.mudball, new ItemStack(ModItems.earthenware), 0.7F);

    }
}
=======
package eg.ipvii.fotp.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void register(){
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.jar), " W ", "G G", "G G", 'W', Blocks.WOODEN_PRESSURE_PLATE, 'G', Blocks.GLASS);
    }
}
>>>>>>> a10b4a66619225eb78a70ecde64e14b3b339936b
