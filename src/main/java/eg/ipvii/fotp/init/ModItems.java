package eg.ipvii.fotp.init;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import com.teamwizardry.librarianlib.features.base.item.ItemModFood;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.items.*;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ModItems {

    public static Item ful = new ItemMod("ful").setCreativeTab(FotPMod.FOODTAB);
    public static Item pitabreadk = new ItemMod("pitabread").setCreativeTab(FotPMod.FOODTAB);
    public static Item fulsandwich = new ItemModFood("fulsandwich", 8, 1F, true).setCreativeTab(FotPMod.FOODTAB);
    public static Item beans = new ItemSeedFoodMod("beans", ModBlocks.beanscrop, Blocks.FARMLAND, 6, 0.7F).setCreativeTab(FotPMod.FOODTAB);
    public static Item rawpastrami;
    public static Item pastrami = new ItemModFood("pastrami", 6, 0.6F, true).setCreativeTab(FotPMod.FOODTAB);
    public static Item cumin = new ItemSeedMod("cumin", ModBlocks.cumincrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FOODTAB);
    public static Item garlic = new ItemSeedMod("garlic", ModBlocks.garliccrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FOODTAB);
    public static Item mudball = new ItemMod("mudball");
    public static Item earthenware = new ItemMod("earthenware");
    public static ItemMortarandPestle mortarandpestle = new ItemMortarandPestle("mortarandpestle");
    public static Item earthenwarebowl = new ItemMod("earthenwarebowl");
    public static Item earthenwarestick = new ItemMod("earthenwarestick");
    public static Item redpepper = new ItemModFood("redpepper", 1, 0.5F, false);
    public static Item redpepperseeds = new ItemSeedMod("redpepperseeds", ModBlocks.redpeppercrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FOODTAB);
    public static ItemOkra okra = new ItemOkra("okra");
    public static Item okraseeds = new ItemSeedMod("okraseeds", ModBlocks.okracrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FOODTAB);
    public static Item rice = new ItemMod("rice").setCreativeTab(FotPMod.FOODTAB);
    public static Item riceseeds = new ItemSeedMod("riceseeds", ModBlocks.ricecrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FOODTAB);
    public static Item paprikapowder = new ItemMod("paprikapowder").setCreativeTab(FotPMod.FOODTAB);
    public static Item tomato = new ItemModFood("tomato", 1, 0.5F, false);
    public static Item tomatoseeds = new ItemTomatoSeeds();
    public static Item tomatosauce = new ItemTomatoSauce();
    public static Item presser = new ItemPresser();
    public static Item sunfloweroil = new ItemSunflowerOil();
    public static Item parsley = new ItemParsley();
    public static Item parsleyseeds = new ItemParsleySeeds();
    public static Item falafeldough = new ItemFalafelDough();
    public static Item falafel = new ItemFalafel();
    public static Item falafelsandwich = new ItemFalafelSandwich();
    public static Item ladle = new ItemLadle();

}
