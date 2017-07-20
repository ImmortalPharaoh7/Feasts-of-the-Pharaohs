package eg.ipvii.fotp.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class GrassDropsHandler {
    public GrassDropsHandler() {
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.beans), 3);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.cumin), 7);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.garlic), 5);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.okraseeds), 6);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.redpepperseeds), 6);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.riceseeds), 6);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.tomatoseeds), 5);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.parsleyseeds), 5);
    }
}
