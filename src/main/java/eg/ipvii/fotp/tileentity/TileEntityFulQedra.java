package eg.ipvii.fotp.tileentity;

import com.teamwizardry.librarianlib.features.autoregister.TileRegister;
import com.teamwizardry.librarianlib.features.saving.Save;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;

@TileRegister("TileEntityFulQedra")
public class TileEntityFulQedra extends TileEntityAddandRemove implements ITickable {


    public static final int STACKLIMIT = 16;
    public static final int COOKTIME = 400;
    @Save
    public int beanscount = 0;
    @Save
    private int fulcount = 0;
    @Save
    private ItemStack[] qedraItemStack = new ItemStack[2];
    @Save
    private int currentCookTime = 0;

    public int getBeansCount() {
        return beanscount;
    }

    public int getFulCount() {
        return fulcount;
    }

    public boolean isQedraHeated() {
        BlockPos posUnderBlock = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        return getWorld().getBlockState(posUnderBlock).getBlock().getDefaultState() == ModBlocks.stove.getDefaultState() && isQedraHeated();
    }

    public boolean canCook() {
        if (beanscount > 0) {
            return true;
        } else return false;
    }

    @Override
    public void update() {
        if (isQedraHeated()) {
            if (currentCookTime <= COOKTIME) {
                currentCookTime++;
            } else if (currentCookTime > COOKTIME) {
                fulcount++;
                currentCookTime = 0;
            }
            markDirty();
        }
    }

//    @Override
//    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
//        super.writeToNBT(compound);
//        compound.setInteger("BeansCount", this.beanscount);
//        return compound;
//    }
//
//    @Override
//    public void readFromNBT(NBTTagCompound compound) {
//        super.readFromNBT(compound);
//        this.beanscount = compound.getInteger("BeansCount");
//    }
}
