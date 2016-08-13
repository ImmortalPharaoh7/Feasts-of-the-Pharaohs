package eg.ipvii.fotp.init;

import eg.ipvii.fotp.items.ItemBeans;
import eg.ipvii.fotp.items.ItemFul;
import eg.ipvii.fotp.items.ItemFulSandwich;
import eg.ipvii.fotp.items.ItemPlainSandwich;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems{

    public static Item ful;
    public static Item plainsandwich;
    public static Item fulsandwich;
    public static Item beans;

    public static void init(){
        ful = new ItemFul();
        plainsandwich = new ItemPlainSandwich();
        fulsandwich = new ItemFulSandwich();
        beans = new ItemBeans();
    }

    public static void register(){
        GameRegistry.register(ful);
        GameRegistry.register(plainsandwich);
        GameRegistry.register(fulsandwich);
        GameRegistry.register(beans);

    }
    public static void registerRenders(){
        registerRender(ful);
        registerRender(plainsandwich);
        registerRender(fulsandwich);
        registerRender(beans);

    }
    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }
}
