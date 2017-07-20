package eg.ipvii.fotp.items;

import com.teamwizardry.librarianlib.features.base.item.ItemModFood;
import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class ItemRawPastrami extends ItemModFood {
    public ItemRawPastrami() {
        super(References.FotPItems.RAWPASTRAMI.getRegistryName(), 2, 0.4F, true);
        setPotionEffect(new PotionEffect(MobEffects.HUNGER, 600, 0), 0.4F);
        setCreativeTab(FotPMod.FOODTAB);
    }
}
