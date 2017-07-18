package eg.ipvii.fotp.tileentity;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityStove extends TileEntity implements ITickable {

    private int coalCount = 0;
    private int cooktime;

    public boolean addCoal(){
        if (coalCount < 8){
            coalCount++;
            markDirty();
            return true;
        }else return false;
    }

    public boolean removeCoal(){
        if (coalCount > 0){
            world.spawnEntity(new EntityItem(world, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(Items.COAL)));
            coalCount--;
            markDirty();
            return true;
        }else return false;
    }

    public void setCoalCount(int coalCount){
        this.coalCount = coalCount;
    }
    public int getCoalCount(){
        return coalCount;
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("CoalCount", this.coalCount);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.coalCount = compound.getInteger("CoalCount");
    }

    @Override
    public void update() {
        if(isHeated()){
            --cooktime;
            if(cooktime == 0 && coalCount > 0){
                cooktime += 3200;
                coalCount--;
            }
        }
    }

    public boolean isHeated(){
        return cooktime > 0;
    }
}
