package eg.ipvii.fotp.init;

import eg.ipvii.fotp.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems{

    public static Item ful;
    public static Item plainsandwich;
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

    public static void init(){
        ful = new ItemFul();
        plainsandwich = new ItemPlainSandwich();
        fulsandwich = new ItemFulSandwich();
        beans = new ItemBeans();
        rawpastrami = new ItemRawPastrami();
        pastrami = new ItemPastrami();
        cumin = new ItemCumin();
        garlic = new ItemGarlic();
        mudball = new ItemMudBall();
        earthenware = new ItemEarthenWare();
        mortarandpestle = new ItemMortarandPestle();
        earthenwarebowl = new ItemEarthenwareBowl();
        earthenwarestick = new ItemEarthenwareStick();
        redpepper = new ItemRedPepper();
        redpepperseeds = new ItemRedPepperSeeds();
        okra = new ItemOkra();
        okraseeds = new ItemOkraSeeds();
        rice = new ItemRice();
        riceseeds = new ItemRiceSeeds();
        paprikapowder = new ItemPaprikaPowder();
        tomato = new ItemTomato();
        tomatoseeds = new ItemTomatoSeeds();
        tomatosauce = new ItemTomatoSauce();
        presser = new ItemPresser();
    }

    public static void register(){
        GameRegistry.register(ful);
        GameRegistry.register(plainsandwich);
        GameRegistry.register(fulsandwich);
        GameRegistry.register(beans);
        GameRegistry.register(rawpastrami);
        GameRegistry.register(pastrami);
        GameRegistry.register(cumin);
        GameRegistry.register(garlic);
        GameRegistry.register(mudball);
        GameRegistry.register(earthenware);
        GameRegistry.register(mortarandpestle);
        GameRegistry.register(earthenwarebowl);
        GameRegistry.register(earthenwarestick);
        GameRegistry.register(redpepper);
        GameRegistry.register(redpepperseeds);
        GameRegistry.register(okra);
        GameRegistry.register(okraseeds);
        GameRegistry.register(rice);
        GameRegistry.register(riceseeds);
        GameRegistry.register(paprikapowder);
        GameRegistry.register(tomato);
        GameRegistry.register(tomatoseeds);
        GameRegistry.register(tomatosauce);
        GameRegistry.register(presser);
    }
    public static void registerRenders(){
        registerRender(ful);
        registerRender(plainsandwich);
        registerRender(fulsandwich);
        registerRender(beans);
        registerRender(rawpastrami);
        registerRender(pastrami);
        registerRender(cumin);
        registerRender(garlic);
        registerRender(mudball);
        registerRender(earthenware);
        registerRender(mortarandpestle);
        registerRender(earthenwarebowl);
        registerRender(earthenwarestick);
        registerRender(redpepper);
        registerRender(redpepperseeds);
        registerRender(okra);
        registerRender(okraseeds);
        registerRender(rice);
        registerRender(riceseeds);
        registerRender(tomato);
        registerRender(tomatoseeds);
        registerRender(tomatosauce);
        registerRender(presser);
    }
    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }
}
