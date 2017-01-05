package eg.ipvii.fotp;

<<<<<<< HEAD
import eg.ipvii.fotp.init.*;
import eg.ipvii.fotp.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
=======
import eg.ipvii.fotp.init.ModBlocks;
import eg.ipvii.fotp.init.ModCrafting;
import eg.ipvii.fotp.init.ModItems;
import eg.ipvii.fotp.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
>>>>>>> a10b4a66619225eb78a70ecde64e14b3b339936b
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MOD_ID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.ACCEPTED_MC_VERSIONS)
public class FotPMod {

    @Mod.Instance(References.MOD_ID)
    public static FotPMod instance;

    @SidedProxy(serverSide = References.SERVER_PROXY_CLASS, clientSide = References.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

<<<<<<< HEAD
    public static final CreativeTabs FOODTAB = new FoodTab();
    public static final CreativeTabs COMPONENTSTAB = new ComponentsTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModBlocks.register();

        ModItems.init();
        ModItems.register();

        MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
        MinecraftForge.EVENT_BUS.register(new GrassDropsHandler());
=======
    public static final CreativeTabs CREATIVE_TAB = new FoodTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModItems.register();

        ModBlocks.init();
        ModBlocks.register();

>>>>>>> a10b4a66619225eb78a70ecde64e14b3b339936b
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();

        ModCrafting.register();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}