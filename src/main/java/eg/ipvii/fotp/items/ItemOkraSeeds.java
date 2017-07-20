package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ItemOkraSeeds extends ItemSeeds {
    public ItemOkraSeeds() {
        super(ModBlocks.okracrop, Blocks.FARMLAND);
        setUnlocalizedName(References.FotPItems.OKRASEEDS.getUnlocalizedName());
        setRegistryName(References.FotPItems.OKRASEEDS.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
