package eg.ipvii.fotp.init;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.items.*;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems{

    public static ItemBase ful = new ItemBase("ful").setCreativeTab(FotPMod.FOODTAB);
    public static ItemBase pitabreadk = new ItemBase("pitabread").setCreativeTab(FotPMod.FOODTAB);
    public static ItemFoodBase fulsandwich = new ItemFoodBase("fulsandwich",8, 1F, true).setCreativeTab(FotPMod.FOODTAB);
    public static ItemSeedFoodBase beans = new ItemSeedFoodBase("beans", 6, 0.7F, (Block) ModBlocks.beanscrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FOODTAB);
    public static Item rawpastrami;
    public static ItemFoodBase pastrami = new ItemFoodBase("pastrami", 6, 0.6F, true).setCreativeTab(FotPMod.FOODTAB);
    public static ItemSeedsBase cumin = new ItemSeedsBase("cumin", ModBlocks.cumincrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FOODTAB);
    public static ItemSeedsBase garlic = new ItemSeedsBase("garlic", ModBlocks.garliccrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FOODTAB);
    public static ItemBase mudball = new ItemBase("mudball");
    public static ItemBase earthenware = new ItemBase("earthenware");
    public static ItemMortarandPestle mortarandpestle = new ItemMortarandPestle("mortarandpestle");
    public static ItemBase earthenwarebowl = new ItemBase("earthenwarebowl");
    public static ItemBase earthenwarestick = new ItemBase("earthenwarestick");
    public static ItemFoodBase redpepper = new ItemFoodBase("redpepper", 1, 0.5F, false);
    public static ItemSeedsBase redpepperseeds = new ItemSeedsBase("redpepperseeds", ModBlocks.redpeppercrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FOODTAB);
    public static ItemOkra okra = new ItemOkra("okra");
    public static ItemSeedsBase okraseeds = new ItemSeedsBase("okraseeds", ModBlocks.okracrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FOODTAB);
    public static ItemBase rice = new ItemBase("rice").setCreativeTab(FotPMod.FOODTAB);
    public static ItemSeedsBase riceseeds = new ItemSeedsBase("riceseeds", ModBlocks.ricecrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FOODTAB);
    public static ItemBase paprikapowder = new ItemBase("paprikapowder").setCreativeTab(FotPMod.FOODTAB);
    public static ItemFoodBase tomato = new ItemFoodBase("tomato", 1, 0.5F, false);
    public static Item tomatoseeds;
    public static Item tomatosauce;
    public static Item presser;
    public static Item sunfloweroil;
    public static Item parsley;
    public static Item parsleyseeds;
    public static Item falafeldough;
    public static Item falafel;
    public static Item falafelsandwich;
    public static Item ladle;

    public static void register(IForgeRegistry<Item> registry){
        registry.registerAll(
                ful
        );
    }
    public static void registerModels(){
        ful.registerItemModel();
    }
}
