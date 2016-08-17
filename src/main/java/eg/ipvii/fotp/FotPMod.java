package eg.ipvii.fotp;

import eg.ipvii.fotp.init.*;
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

    @Mod.Instance(References.MOD_ID)
    public static FotPMod instance;

    @SidedProxy(serverSide = References.SERVER_PROXY_CLASS, clientSide = References.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

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