package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BlockJar extends Block {

    //1 / 16 = 0.0625
    private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625 * 5, 0, 0.0625 * 5, 0.0625 * 13,0.0625 * 12, 0.0625 * 13);
    private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(0.0625 * 4, 0, 0.0625 * 4, 0.0625 * 12,0.0625 * 11, 0.0625 * 12);

    public BlockJar(){
        super (Material.ICE);
        setUnlocalizedName(References.FotPBlocks.JAR.getUnlocalizedName());
        setRegistryName(References.FotPBlocks.JAR.getRegistryName());
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return BOUNDING_BOX;
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn) {
        super.addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX);
    }
}