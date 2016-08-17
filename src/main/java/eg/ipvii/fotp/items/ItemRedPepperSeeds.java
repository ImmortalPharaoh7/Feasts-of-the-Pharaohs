package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ItemRedPepperSeeds extends ItemSeeds{
    public ItemRedPepperSeeds() {
        super(ModBlocks.redpeppercrop, Blocks.FARMLAND);
        setUnlocalizedName(References.FotPItems.REDPEPPERSEEDS.getUnlocalizedName());
        setRegistryName(References.FotPItems.REDPEPPERSEEDS.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
