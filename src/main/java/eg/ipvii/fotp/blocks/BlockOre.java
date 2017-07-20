package eg.ipvii.fotp.blocks;

import com.teamwizardry.librarianlib.features.base.block.BlockMod;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOre extends BlockMod {
    public BlockOre(String name) {
        super(name, Material.ROCK);

        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
