package eg.ipvii.fotp.init;

import com.teamwizardry.librarianlib.features.base.item.ItemMod;
import com.teamwizardry.librarianlib.features.base.item.ItemModFood;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.items.*;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ModItems {

    public static Item ful = new ItemMod("ful").setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item pitabreadk = new ItemMod("pitabread").setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item fulsandwich = new ItemModFood("fulsandwich", 8, 1F, true).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item beans = new ItemSeedFoodMod("beans", ModBlocks.beanscrop, Blocks.FARMLAND, 6, 0.7F).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item rawpastrami = new ItemRawPastrami("rawpastrami");
    public static Item pastrami = new ItemModFood("pastrami", 6, 0.6F, true).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item cumin = new ItemSeedMod("cumin", ModBlocks.cumincrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item garlic = new ItemSeedMod("garlic", ModBlocks.garliccrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item mudball = new ItemMod("mudball");
    public static Item earthenware = new ItemMod("earthenware");
    public static ItemMortarandPestle mortarandpestle = new ItemMortarandPestle("mortarandpestle");
    public static Item earthenwarebowl = new ItemMod("earthenwarebowl");
    public static Item earthenwarestick = new ItemMod("earthenwarestick");
    public static Item redpepper = new ItemModFood("redpepper", 1, 0.5F, false);
    public static Item redpepperseeds = new ItemSeedMod("redpepperseeds", ModBlocks.redpeppercrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FotPCreativeTab);
    public static ItemOkra okra = new ItemOkra("okra");
    public static Item okraseeds = new ItemSeedMod("okraseeds", ModBlocks.okracrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item rice = new ItemMod("rice").setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item riceseeds = new ItemSeedMod("riceseeds", ModBlocks.ricecrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item paprikapowder = new ItemMod("paprikapowder").setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item tomato = new ItemModFood("tomato", 1, 0.5F, false);
    public static Item tomatoseeds = new ItemSeedMod("tomatoseeds", ModBlocks.tomatocrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item tomatosauce = new ItemMod("tomatosauce").setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item presser = new ItemPresser("presser");
    public static Item sunfloweroil = new ItemMod("sunfloweroil").setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item parsley = new ItemModFood("parsley", 2, 0.3F, false).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item parsleyseeds = new ItemSeedMod("parsleyseeds", ModBlocks.parsleycrop, Blocks.FARMLAND).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item falafeldough = new ItemMod("falafeldough").setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item falafel = new ItemModFood("falafel", 4, 0.5F, false).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item falafelsandwich = new ItemModFood("falafelsandwich", 8, 1F, true).setCreativeTab(FotPMod.FotPCreativeTab);
    public static Item ladle = new ItemMod("ladle").setCreativeTab(FotPMod.FotPCreativeTab);

}
