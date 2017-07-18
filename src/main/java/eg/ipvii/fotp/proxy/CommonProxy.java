package eg.ipvii.fotp.proxy;

import net.minecraft.item.Item;

public interface CommonProxy {
    void registerItemRenderer(Item item, int meta, String id);
}
