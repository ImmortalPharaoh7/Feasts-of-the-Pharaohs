package eg.ipvii.fotp.init;

import net.minecraft.block.BlockFlower;
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
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pitabread), "WW", "WW", 'W', Items.WHEAT);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.earthenwarebowl), "E E", "E", 'E', ModItems.earthenware);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.presser), "SES", "SES", "SES", 'S', ModItems.earthenwarestick, 'E', ModItems.earthenware);

        //Shapeless
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fulsandwich), ModItems.ful, ModItems.pitabread);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mudball, 9), ModBlocks.mud);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.earthenwarestick, 4), ModItems.earthenware, ModItems.earthenware);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mortarandpestle), ModItems.earthenwarebowl, ModItems.earthenwarestick);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.redpepperseeds, 2), ModItems.redpepper);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.paprikapowder, 3), ModItems.mortarandpestle, ModItems.redpepper);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tomatosauce), ModItems.tomato, ModItems.presser);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.falafeldough), ModItems.beans, ModItems.sunfloweroil, ModItems.parsley, Items.EGG);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.falafelsandwich), ModItems.falafel, ModItems.pitabread);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sunfloweroil), ModItems.presser, new ItemStack(Blocks.DOUBLE_PLANT, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.riceseeds, 2), ModItems.rice);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.parsleyseeds, 2), ModItems.parsley);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.okraseeds, 2), ModItems.okra);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tomatoseeds, 2), ModItems.tomato);

        //Item Smelting Recipes
        GameRegistry.addSmelting(ModItems.beans, new ItemStack(ModItems.ful), 0.7F);
        GameRegistry.addSmelting(ModItems.rawpastrami, new ItemStack(ModItems.pastrami), 0.7F);
        GameRegistry.addSmelting(ModItems.mudball, new ItemStack(ModItems.earthenware), 0.7F);
        GameRegistry.addSmelting(ModItems.falafeldough, new ItemStack(ModItems.falafel), 0.7F);

        //Testing for ful qedra


    }
}
