package eg.ipvii.fotp.init;

import eg.ipvii.fotp.blocks.BlockJar;
import eg.ipvii.fotp.blocks.BlockMud;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block mud;
    public static Block jar;

    public static void init(){
        mud = new BlockMud();
        jar = new BlockJar();

    }

    public static void register(){
        registerBlock(mud);
        registerBlock(jar);

    }

    private static void registerBlock(Block block){
        GameRegistry.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRenders(){
        registerRender(mud);

    }
    private static void registerRender(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

    }
}
