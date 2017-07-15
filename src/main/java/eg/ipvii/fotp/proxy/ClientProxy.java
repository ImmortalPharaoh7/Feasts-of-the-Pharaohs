package eg.ipvii.fotp.proxy;

import eg.ipvii.fotp.init.ModBlocks;
import eg.ipvii.fotp.init.ModItems;
import eg.ipvii.fotp.tileentity.TileEntityJar;
import eg.ipvii.fotp.tileentity.render.RendererJar;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy implements CommonProxy {
    @Override
    public void init() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJar.class, new RendererJar());
    }
}
