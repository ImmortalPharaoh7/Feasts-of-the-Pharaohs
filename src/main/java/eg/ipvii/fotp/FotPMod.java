package eg.ipvii.fotp;

import eg.ipvii.fotp.init.*;
import eg.ipvii.fotp.proxy.CommonProxy;

import eg.ipvii.fotp.tileentity.TileEntityFulQedra;
import eg.ipvii.fotp.tileentity.TileEntityJar;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
        ModBlocks.init();
        ModBlocks.register();

        ModItems.init();
        ModItems.register();

        MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
        MinecraftForge.EVENT_BUS.register(new GrassDropsHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();

        ModCrafting.register();

        GameRegistry.registerTileEntity(TileEntityJar.class, References.MOD_ID + "TileEntityJar");
        GameRegistry.registerTileEntity(TileEntityFulQedra.class, References.MOD_ID + "TileEntityFulQedra");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}