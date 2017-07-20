package eg.ipvii.fotp;

import eg.ipvii.fotp.init.GrassDropsHandler;
import eg.ipvii.fotp.init.MobDropsHandler;
import eg.ipvii.fotp.init.ModCrafting;
import eg.ipvii.fotp.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MOD_ID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.ACCEPTED_MC_VERSIONS)
public class FotPMod {

    public static final CreativeTabs FOODTAB = new FoodTab();
    public static final CreativeTabs COMPONENTSTAB = new ComponentsTab();
    public static final CreativeTabs EGYTPIANTOOLSTAB = new EgyptianToolsTab();
    @Mod.Instance(References.MOD_ID)
    public static FotPMod instance;
    @SidedProxy(serverSide = References.SERVER_PROXY_CLASS, clientSide = References.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
        MinecraftForge.EVENT_BUS.register(new GrassDropsHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        ModCrafting.register();

//        GameRegistry.registerTileEntity(TileEntityJar.class, References.MOD_ID + "TileEntityJar");
//        GameRegistry.registerTileEntity(TileEntityFulQedra.class, References.MOD_ID + "TileEntityFulQedra");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

//    @Mod.EventBusSubscriber(value = Side.CLIENT, modid = References.MOD_ID)
//    public static class RegistrationHandler {
//
//        @SubscribeEvent
//        public static void registerItems(RegistryEvent.Register<Item> event) {
//            ModItems.register(event.getRegistry());
//        }
//
//    }
//
//    @Mod.EventBusSubscriber
//    public static class ModelsRegistrationHandler {
//
//        @SubscribeEvent
//        public static void registerItems(ModelRegistryEvent event) {
//            ModItems.registerModels();
//        }
//    }
//
//    @Mod.EventBusSubscriber
//    public static class registrationBlocks { // god immortal, are you out of your mind
//
//        @SubscribeEvent
//        public static void registerBlocks(RegistryEvent.Register<Block> event) {
//            ModBlocks.register(event.getRegistry());
//        }
//    }
}