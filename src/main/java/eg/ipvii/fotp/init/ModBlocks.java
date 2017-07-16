package eg.ipvii.fotp.init;

import eg.ipvii.fotp.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block mud;
    public static Block jar;
    public static Block beanscrop;
    public static Block cumincrop;
    public static Block garliccrop;
    public static Block redpeppercrop;
    public static Block okracrop;
    public static Block ricecrop;
    public static Block tomatocrop;
    public static Block parsleycrop;
    public static Block fulqedra;

    public static void init(){
        mud = new BlockMud();
        jar = new BlockJar();
        beanscrop = new BlockCropBeans();
        cumincrop = new BlockCropCumin();
        garliccrop = new BlockCropGarlic();
        redpeppercrop = new BlockCropRedPepper();
        okracrop = new BlockCropOkra();
        ricecrop = new BlockCropRice();
        tomatocrop = new BlockCropTomato();
        parsleycrop = new BlockCropParsley();
        fulqedra = new BlockFulQedra();

    }

    public static void register(){
        registerBlock(mud);
        registerBlock(jar);
        registerBlock(beanscrop);
        registerBlock(cumincrop);
        registerBlock(garliccrop);
        registerBlock(redpeppercrop);
        registerBlock(okracrop);
        registerBlock(ricecrop);
        registerBlock(tomatocrop);
        registerBlock(parsleycrop);
        registerBlock(fulqedra);
    }

    private static void registerBlock(Block block){
        GameRegistry.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRenders(){
        registerRender(mud);
        registerRender(jar);
        registerRender(beanscrop);
        registerRender(cumincrop);
        registerRender(garliccrop);
        registerRender(redpeppercrop);
        registerRender(okracrop);
        registerRender(ricecrop);
        registerRender(tomatocrop);
        registerRender(parsleycrop);
        registerRender(fulqedra);
    }
    private static void registerRender(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

    }
}
