package eg.ipvii.fotp.init;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockBase mud = new BlockBase("mud", Material.CLAY).setCreativeTab(FotPMod.COMPONENTSTAB);
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
    public static Block stove;

    public static void register(IForgeRegistry<Block> registry){
        registry.registerAll(
                mud
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry){

    }

    public static void registerModels(){

    }
}
