package eg.ipvii.fotp.blocks;

        import eg.ipvii.fotp.References;
        import eg.ipvii.fotp.init.ModItems;
        import net.minecraft.block.BlockCrops;
        import net.minecraft.block.state.IBlockState;
        import net.minecraft.item.Item;
        import net.minecraft.util.math.AxisAlignedBB;
        import net.minecraft.util.math.BlockPos;
        import net.minecraft.world.IBlockAccess;

public class BlockCropGarlic extends BlockCrops{

    public BlockCropGarlic(){
        setUnlocalizedName(References.FotPBlocks.GARLICCROP.getUnlocalizedName());
        setRegistryName(References.FotPBlocks.GARLICCROP.getRegistryName());
    }

    @Override
    protected Item getSeed() {
        return ModItems.garlic;
    }

    @Override
    protected Item getCrop() {
        return ModItems.garlic;
    }
}
