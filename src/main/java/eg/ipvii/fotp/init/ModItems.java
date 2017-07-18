package eg.ipvii.fotp.init;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems{

    public static ItemBase ful = new ItemBase("ful").setCreativeTab(FotPMod.FOODTAB);
    public static Item pitabread;
    public static Item fulsandwich;
    public static Item beans;
    public static Item rawpastrami;
    public static Item pastrami;
    public static Item cumin;
    public static Item garlic;
    public static Item mudball;
    public static Item earthenware;
    public static Item mortarandpestle;
    public static Item earthenwarebowl;
    public static Item earthenwarestick;
    public static Item redpepper;
    public static Item redpepperseeds;
    public static Item okra;
    public static Item okraseeds;
    public static Item rice;
    public static Item riceseeds;
    public static Item paprikapowder;
    public static Item tomato;
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
