package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockCropParsley extends BlockCropsMod {
    private static final AxisAlignedBB[] PARSLEY_AABB = new AxisAlignedBB[]{new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.1875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.3125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.4375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5625D, 1.0D)};

    public BlockCropParsley() {
        super(References.FotPBlocks.PARSLEYCROP.getRegistryName());
    }

    @Override
    protected Item getSeed() {
        return ModItems.parsleyseeds;
    }

    @Override
    protected Item getCrop() {
        return ModItems.parsley;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return PARSLEY_AABB[((Integer) state.getValue(this.getAgeProperty())).intValue()];
    }
}
