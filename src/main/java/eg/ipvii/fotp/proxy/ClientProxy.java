package eg.ipvii.fotp.proxy;

import eg.ipvii.fotp.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
//import eg.ipvii.fotp.tileentity.TileEntityJar;
//import eg.ipvii.fotp.tileentity.render.RendererJar;
//import net.minecraft.item.Item;
//import net.minecraftforge.client.model.ModelLoader;
//import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy implements CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(References.MOD_ID + ":" + id, "inventory"));
    }
//    @Override
//    public void init() {
//        ModItems.registerRenders();
//        ModBlocks.registerRenders();

//        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJar.class, new RendererJar());
//    }
}
