<<<<<<< HEAD
package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockCropBeans extends BlockCrops{

    private static final AxisAlignedBB[] BEANS_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.1875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.3125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.4375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5625D, 1.0D)};

    public BlockCropBeans(){
        setUnlocalizedName(References.FotPBlocks.BEANSCROP.getUnlocalizedName());
        setRegistryName(References.FotPBlocks.BEANSCROP.getRegistryName());
    }

    @Override
    protected Item getSeed() {
        return ModItems.beans;
    }

    @Override
    protected Item getCrop() {
        return ModItems.beans;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return BEANS_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
    }
}
=======
package eg.ipvii.fotp.blocks;

import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

public class BlockCropBeans extends BlockCrops{
    public BlockCropBeans(){
        setUnlocalizedName(References.FotPBlocks.BEANSCROP.getUnlocalizedName());
        setRegistryName(References.FotPBlocks.BEANSCROP.getRegistryName());
    }

    @Override
    protected Item getSeed() {
        return ModItems.beans;
    }
    

    @Override
    protected Item getCrop() {
        return ModItems.beans;
    }
}
>>>>>>> a10b4a66619225eb78a70ecde64e14b3b339936b
