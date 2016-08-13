package eg.ipvii.fotp.proxy;

import eg.ipvii.fotp.init.ModBlocks;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy implements CommonProxy {
    @Override
    public void init() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();

    }
}
