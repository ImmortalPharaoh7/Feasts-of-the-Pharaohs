package eg.ipvii.fotp.tileentity;

import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;

public class TileEntityFulQedra extends TileEntity implements ITickable{

    public boolean isHeated(){
        BlockPos posUnderBlock = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        return worldObj.getBlockState(posUnderBlock).getBlock().getDefaultState() == ModBlocks.stove.getDefaultState() && isHeated();
    }

    @Override
    public void update() {
        if(isHeated()){

        }
    }
}
