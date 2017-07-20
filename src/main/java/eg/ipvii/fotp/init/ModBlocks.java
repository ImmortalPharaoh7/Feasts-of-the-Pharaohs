package eg.ipvii.fotp.init;

import com.teamwizardry.librarianlib.features.base.block.BlockMod;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static Block mud = new BlockMod("mud", Material.CLAY).setCreativeTab(FotPMod.COMPONENTSTAB);
    public static BlockJar jar = new BlockJar();
    public static BlockCropBeans beanscrop = new BlockCropBeans();
    public static BlockCropCumin cumincrop = new BlockCropCumin();
    public static BlockCropGarlic garliccrop = new BlockCropGarlic();
    public static BlockCropRedPepper redpeppercrop = new BlockCropRedPepper();
    public static BlockCropOkra okracrop = new BlockCropOkra();
    public static BlockCropRice ricecrop = new BlockCropRice();
    public static BlockCropTomato tomatocrop = new BlockCropTomato();
    public static BlockCropParsley parsleycrop = new BlockCropParsley();
    public static BlockFulQedra fulqedra = new BlockFulQedra();
    public static BlockStove stove = new BlockStove();

}
