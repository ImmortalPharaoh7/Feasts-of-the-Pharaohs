package eg.ipvii.fotp.items

import com.teamwizardry.librarianlib.features.base.ModCreativeTab
import com.teamwizardry.librarianlib.features.base.item.IModItemProvider
import com.teamwizardry.librarianlib.features.helpers.VariantHelper
import com.teamwizardry.librarianlib.features.helpers.currentModId
import net.minecraft.block.Block
import net.minecraft.block.BlockCrops
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.item.ItemSeedFood
import net.minecraft.item.ItemStack
import net.minecraft.util.NonNullList

/**
 * Created by Elad on 7/20/2017.
 */
@Suppress("LeakingThis")
open class ItemSeedFoodMod(name: String, crops: BlockCrops, soil: Block, healAmount: Int = 0, sautration: Float, vararg variants: String) : ItemSeedFood(healAmount, sautration, crops, soil), IModItemProvider {

    override val providedItem: Item
        get() = this

    private val bareName = VariantHelper.toSnakeCase(name)
    private val modId = currentModId
    override val variants = VariantHelper.setupItem(this, bareName, variants, this::creativeTab)

    override fun setUnlocalizedName(name: String): Item {
        VariantHelper.setUnlocalizedNameForItem(this, modId, name)
        return super.setUnlocalizedName(name)
    }

    override fun getUnlocalizedName(stack: ItemStack): String {
        val dmg = stack.itemDamage
        val variants = this.variants
        val name = if (dmg >= variants.size) this.bareName else variants[dmg]

        return "item.$modId:$name"
    }

    override fun getSubItems(tab: CreativeTabs?, subItems: NonNullList<ItemStack>) {
        variants.indices.mapTo(subItems) { ItemStack(this, 1, it) }
    }

    /**
     * Override this to have a custom creative tab. Leave blank to have a default tab (or none if no default tab is set).
     */
    open val creativeTab: ModCreativeTab?
        get() = ModCreativeTab.defaultTabs[modId]
}