package eg.ipvii.fotp.blocks

import com.teamwizardry.librarianlib.features.base.ModCreativeTab
import com.teamwizardry.librarianlib.features.base.block.IModBlock
import com.teamwizardry.librarianlib.features.base.block.ItemModBlock
import com.teamwizardry.librarianlib.features.helpers.VariantHelper
import com.teamwizardry.librarianlib.features.helpers.currentModId
import net.minecraft.block.Block
import net.minecraft.block.BlockCrops
import net.minecraft.item.ItemBlock

/**
 * Created by Elad on 7/20/2017.
 */
@Suppress("LeakingThis")
open class BlockCropsMod(name: String, vararg variants: String) : BlockCrops(), IModBlock {

    override val bareName: String = VariantHelper.toSnakeCase(name)
    override val variants: Array<out String> = VariantHelper.beginSetupBlock(bareName, variants)
    val modId = currentModId

    val itemForm: ItemBlock? by lazy { createItemForm() }

    init {
        VariantHelper.finishSetupBlock(this, bareName, itemForm, this::creativeTab)
    }

    override fun setUnlocalizedName(name: String): Block {
        super.setUnlocalizedName(name)
        VariantHelper.setUnlocalizedNameForBlock(this, modId, name, itemForm)
        return this
    }

    /**
     * Override this to have a custom ItemBlock implementation.
     */
    open fun createItemForm(): ItemBlock? {
        return ItemModBlock(this)
    }

    /**
     * Override this to have a custom creative tab. Leave blank to have a default tab (or none if no default tab is set).
     */
    override val creativeTab: ModCreativeTab?
        get() = ModCreativeTab.defaultTabs[modId]
}