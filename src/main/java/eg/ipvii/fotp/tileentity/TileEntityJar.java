package eg.ipvii.fotp.tileentity;

import com.teamwizardry.librarianlib.features.autoregister.TileRegister;
import com.teamwizardry.librarianlib.features.saving.Save;

@TileRegister("TileEntityJar")
public class TileEntityJar extends TileEntityAddandRemove {

    public static final int LIMIT = 4;
    @Save
    public int sandwichcount = 0;

//    @Override
//    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
//        super.writeToNBT(compound);
//        compound.setInteger("SandwichCount", this.sandwichcount);
//        return compound;
//    }
//
//    @Override
//    public void readFromNBT(NBTTagCompound compound) {
//        super.readFromNBT(compound);
//        this.sandwichcount = compound.getInteger("SandwichCount");
//    }
}
