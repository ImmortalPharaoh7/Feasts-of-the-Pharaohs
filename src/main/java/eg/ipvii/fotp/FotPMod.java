package eg.ipvii.fotp;

import eg.ipvii.fotp.init.*;
import eg.ipvii.fotp.proxy.CommonProxy;

import eg.ipvii.fotp.tileentity.TileEntityFulQedra;
import eg.ipvii.fotp.tileentity.TileEntityJar;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = References.MOD_ID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.ACCEPTED_MC_VERSIONS)
public class FotPMod {

    @Mod.Instance(References.MOD_ID)
    public static FotPMod instance;

    @SidedProxy(serverSide = References.SERVER_PROXY_CLASS, clientSide = References.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs FOODTAB = new FoodTab();
    public static final CreativeTabs COMPONENTSTAB = new ComponentsTab();
    public static final CreativeTabs EGYTPIANTOOLSTAB = new EgyptianToolsTab();


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
        MinecraftForge.EVENT_BUS.register(new GrassDropsHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        ModCrafting.register();

        GameRegistry.registerTileEntity(TileEntityJar.class, References.MOD_ID + "TileEntityJar");
        GameRegistry.registerTileEntity(TileEntityFulQedra.class, References.MOD_ID + "TileEntityFulQedra");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventBusSubscriber(value = Side.CLIENT, modid = References.MOD_ID)
    public static class RegistrationHandler{

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
            ModItems.register(event.getRegistry());
        }

    }

    @Mod.EventBusSubscriber
    public static class ModelsRegistrationHandler{

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event){
            ModItems.registerModels();
        }
    }
    @Mod.EventBusSubscriber
    public static class registrationBlocks{

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event){
            ModBlocks.register(event.getRegistry());
        }
    }
}