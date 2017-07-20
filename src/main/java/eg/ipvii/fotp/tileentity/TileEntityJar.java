package eg.ipvii.fotp.tileentity;

import net.minecraft.nbt.NBTTagCompound;

public class TileEntityJar extends TileEntityAddandRemove {

    public final int LIMIT = 4;
    public int sandwichcount = 0;

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("SandwichCount", this.sandwichcount);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.sandwichcount = compound.getInteger("SandwichCount");
    }
}
