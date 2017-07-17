package eg.ipvii.fotp.tileentity;

import eg.ipvii.fotp.init.ModItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityJar extends TileEntityAddandRemove{

    public int sandwichcount = 0;
    public final int LIMIT = 4;

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
