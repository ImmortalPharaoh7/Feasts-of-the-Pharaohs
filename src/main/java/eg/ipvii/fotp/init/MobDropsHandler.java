package eg.ipvii.fotp.init;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler {
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityCow) {
            ItemStack stack = new ItemStack(ModItems.okra);
            EntityItem drop = new EntityItem(event.getEntity().getEntityWorld(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);

            event.getDrops().add(drop);
        }
    }
}
