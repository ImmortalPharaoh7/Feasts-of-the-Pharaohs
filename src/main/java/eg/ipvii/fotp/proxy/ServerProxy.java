package eg.ipvii.fotp.proxy;

import net.minecraft.item.Item;

public class ServerProxy implements CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        // no op
    }
//    @Override
//    public void init() {
//
//    }
}
