package eg.ipvii.fotp.tileentity;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public abstract class TileEntityAddandRemove extends TileEntity {
    public boolean addFood(int foodcount, int limit) {
        if (foodcount < limit) {
            foodcount++;
            markDirty();
            return true;
        } else return false;
    }

    public boolean removeFood(int foodcount, ItemStack food) {
        if (foodcount > 0) {
            world.spawnEntity(new EntityItem(world, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, food));
            foodcount--;
            markDirty();
            return true;
        } else return false;
    }
}
