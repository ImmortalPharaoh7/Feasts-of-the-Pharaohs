package eg.ipvii.fotp.blocks;

import com.teamwizardry.librarianlib.features.base.block.BlockMod;
import eg.ipvii.fotp.References;
import net.minecraft.block.material.Material;

public class BlockMud extends BlockMod {
    public BlockMud() {
        super(References.FotPBlocks.MUD.getRegistryName(), Material.ROCK);
        setHardness(1);
    }
}
