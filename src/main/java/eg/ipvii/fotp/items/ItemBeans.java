<<<<<<< HEAD
package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import eg.ipvii.fotp.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class ItemBeans extends ItemSeedFood{

    public ItemBeans(){
        super(6, 0.7F, ModBlocks.beanscrop, Blocks.FARMLAND);
        setUnlocalizedName(References.FotPItems.BEANS.getUnlocalizedName());
        setRegistryName(References.FotPItems.BEANS.getRegistryName());
        setCreativeTab(FotPMod.FOODTAB);
    }
}
=======
package eg.ipvii.fotp.items;

import eg.ipvii.fotp.FotPMod;
import eg.ipvii.fotp.References;
import eg.ipvii.fotp.init.ModBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemBeans extends ItemSeedFood{

    public ItemBeans(){
        super(6, 0.7F, ModBlocks.beanscrop, Blocks.FARMLAND);
        setUnlocalizedName(References.FotPItems.BEANS.getUnlocalizedName());
        setRegistryName(References.FotPItems.BEANS.getRegistryName());
        setCreativeTab(FotPMod.CREATIVE_TAB);

    }
}
>>>>>>> a10b4a66619225eb78a70ecde64e14b3b339936b
