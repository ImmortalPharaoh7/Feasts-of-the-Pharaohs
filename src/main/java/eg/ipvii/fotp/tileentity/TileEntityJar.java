package eg.ipvii.fotp.tileentity;

import eg.ipvii.fotp.init.ModItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityJar extends TileEntity{

    public int sandwichcount = 0;

    public boolean addSandwich(){
            if (sandwichcount < 4) {
                sandwichcount++;
                markDirty();
                return true;
            }
        return false;
    }
    public boolean removeSandwich(){
            if (sandwichcount > 0) {
            worldObj.spawnEntityInWorld(new EntityItem(worldObj, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ModItems.fulsandwich)));
            sandwichcount--;
            }
        markDirty();
        return false;
    }

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
