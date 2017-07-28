package eg.ipvii.fotp.init;

import com.teamwizardry.librarianlib.features.base.block.BlockMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static Block mud = new BlockMod("mud", Material.CLAY).setCreativeTab(FotPMod.FotPCreativeTab);
    public static BlockJar jar = new BlockJar("jar");
    public static BlockCrops beanscrop = new BlockCropBeans("blockcropbeans");
    public static BlockCrops cumincrop = new BlockCropCumin("blockcropcumin");
    public static BlockCrops garliccrop = new BlockCropGarlic("blockcropgarlic");
    public static BlockCrops redpeppercrop = new BlockCropRedPepper("blockcropredpepper");
    public static BlockCrops okracrop = new BlockCropOkra("blockcropokra");
    public static BlockCrops ricecrop = new BlockCropRice("blockcroprice");
    public static BlockCrops tomatocrop = new BlockCropTomato("blockcroptomato");
    public static BlockCrops parsleycrop = new BlockCropParsley("blockcropparsley");
    public static Block fulqedra = new BlockFulQedra();
    public static Block stove = new BlockStove("stove");

}
