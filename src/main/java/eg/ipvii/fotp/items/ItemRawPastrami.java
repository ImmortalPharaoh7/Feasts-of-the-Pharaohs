package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class ItemRawPastrami extends ItemFood{
    public ItemRawPastrami() {
        super(2, 0.4F, true);
        setPotionEffect(new PotionEffect(MobEffects.HUNGER, 600, 0), 0.4F);
        setUnlocalizedName(References.FotPItems.RAWPASTRAMI.getUnlocalizedName());
        setRegistryName(References.FotPItems.RAWPASTRAMI.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
