package eg.ipvii.fotp.init;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.blocks.BlockBase;
import eg.ipvii.fotp.blocks.BlockJar;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockBase mud = new BlockBase("mud", Material.CLAY).setCreativeTab(FotPMod.COMPONENTSTAB);
    public static BlockJar jar = new BlockJar();
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

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                mud
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                mud.createItemBlock()
        );
    }

    public static void registerModels() {
        mud.registerItemModel((ItemBlock) Item.getItemFromBlock(mud));
    }
}
