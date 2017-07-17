package eg.ipvii.fotp.tileentity;

import eg.ipvii.fotp.blocks.BlockStove;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;

public class TileEntityFulQedra extends TileEntityAddandRemove implements ITickable{

    public int beanscount = 0;
    private int fulcount = 0;
    private ItemStack[] qedraItemStack = new ItemStack[2];
    private final int COOKTIME = 400;
    public final int STACKLIMIT = 16;
    private  int currentCookTime = 0;

    public int getBeansCount(){
        return beanscount;
    }
    public int getFulCount(){
        return fulcount;
    }

    public boolean isQedraHeated(){
        BlockPos posUnderBlock = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        return worldObj.getBlockState(posUnderBlock).getBlock().getDefaultState() == ModBlocks.stove.getDefaultState() && BlockStove.isHeated();
    }

    public boolean canCook(){
        if(beanscount > 0){
            return true;
        }else return false;
    }

    @Override
    public void update() {
        if(isQedraHeated()){
            if (currentCookTime <= COOKTIME){
                currentCookTime++;
            }else if(currentCookTime > COOKTIME){
                fulcount++;
                currentCookTime = 0;
            }markDirty();
        }
    }
    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("BeansCount", this.beanscount);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.beanscount = compound.getInteger("BeansCount");
    }
}
