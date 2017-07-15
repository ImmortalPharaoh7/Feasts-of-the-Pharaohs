package eg.ipvii.fotp.tileentity;

import eg.ipvii.fotp.blocks.BlockFulQedra;
import eg.ipvii.fotp.init.QedraRecipes;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.*;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class TileEntityFulQedra extends TileEntityLockable implements ITickable, ISidedInventory {

    private static final int[] SLOTS_TOP = new int[] {0};
    private static final int[] SLOTS_BOTTOM = new int[] {2, 1};
    private static final int[] SLOTS_SIDES = new int[] {1};
    private ItemStack[] qedraItemStacks = new ItemStack[3];
    private int qedraBurnTime;
    private int currentItemBurnTime;
    private int cookTime;
    private int totalCookTime;
    private String qedraCustomName;

    @Override
    public int getSizeInventory() {
        return this.qedraItemStacks.length;
    }

    @Nullable
    @Override
    public ItemStack getStackInSlot(int index) {
        return this.qedraItemStacks[index];
    }

    @Nullable
    @Override
    public ItemStack decrStackSize(int index, int count) {
        return ItemStackHelper.getAndSplit(this.qedraItemStacks, index, count);
    }

    @Nullable
    @Override
    public ItemStack removeStackFromSlot(int index) {
        return ItemStackHelper.getAndRemove(this.qedraItemStacks, index);
    }

    public static boolean isItemFuel(ItemStack stack){
        return getItemBurnTime(stack) > 0;
    }

    @Override
    public void setInventorySlotContents(int index, @Nullable ItemStack stack) {
        boolean flag = stack != null && stack.isItemEqual(this.qedraItemStacks[index]) && ItemStack.areItemStackTagsEqual(stack, this.qedraItemStacks[index]);
        this.qedraItemStacks[index] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }

        if (index == 0 && !flag)
        {
            this.totalCookTime = this.getCookTime(stack);
            this.cookTime = 0;
            this.markDirty();
        }
    }

    private boolean canSmelt(){
        if (this.qedraItemStacks[0] == null) {
            return false;
        }
        else {
            ItemStack itemstack = QedraRecipes.instance().getSmeltingResult(this.qedraItemStacks[0]);
            if (itemstack == null) return false;
            if (this.qedraItemStacks[2] == null) return true;
            if (!this.qedraItemStacks[2].isItemEqual(itemstack)) return false;
            int result = qedraItemStacks[2].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.qedraItemStacks[2].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
    }

    public void cookFul(){
        if (this.canSmelt())
        {
            ItemStack itemstack = QedraRecipes.instance().getSmeltingResult(this.qedraItemStacks[0]);

            if (this.qedraItemStacks[2] == null)
            {
                this.qedraItemStacks[2] = itemstack.copy();
            }
            else if (this.qedraItemStacks[2].getItem() == itemstack.getItem())
            {
                this.qedraItemStacks[2].stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
            }

            --this.qedraItemStacks[0].stackSize;

            if (this.qedraItemStacks[0].stackSize <= 0)
            {
                this.qedraItemStacks[0] = null;
            }
        }
    }

    public static int getItemBurnTime(ItemStack stack){
        if (stack == null) {
            return 0;
        }
        else {
            Item item = stack.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.AIR) {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.WOODEN_SLAB) {
                    return 150;
                }

                if (block.getDefaultState().getMaterial() == Material.WOOD) {
                    return 300;
                }

                if (block == Blocks.COAL_BLOCK) {
                    return 16000;
                }
            }

            if (item instanceof ItemTool && "WOOD".equals(((ItemTool)item).getToolMaterialName())) return 200;
            if (item instanceof ItemSword && "WOOD".equals(((ItemSword)item).getToolMaterialName())) return 200;
            if (item instanceof ItemHoe && "WOOD".equals(((ItemHoe)item).getMaterialName())) return 200;
            if (item == Items.STICK) return 100;
            if (item == Items.COAL) return 1600;
            if (item == Items.LAVA_BUCKET) return 20000;
            if (item == Item.getItemFromBlock(Blocks.SAPLING)) return 100;
            if (item == Items.BLAZE_ROD) return 2400;
            return net.minecraftforge.fml.common.registry.GameRegistry.getFuelValue(stack);
        }
    }

    @Override
    public void update()
    {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if (this.isBurning())
        {
            --this.qedraBurnTime;
        }

        if (!this.worldObj.isRemote)
        {
            if (this.isBurning() || this.qedraItemStacks[1] != null && this.qedraItemStacks[0] != null)
            {
                if (!this.isBurning() && this.canSmelt())
                {
                    this.qedraBurnTime = getItemBurnTime(this.qedraItemStacks[1]);
                    this.currentItemBurnTime = this.qedraBurnTime;

                    if (this.isBurning())
                    {
                        flag1 = true;

                        if (this.qedraItemStacks[1] != null)
                        {
                            --this.qedraItemStacks[1].stackSize;

                            if (this.qedraItemStacks[1].stackSize == 0)
                            {
                                this.qedraItemStacks[1] = qedraItemStacks[1].getItem().getContainerItem(qedraItemStacks[1]);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt())
                {
                    ++this.cookTime;

                    if (this.cookTime == this.totalCookTime)
                    {
                        this.cookTime = 0;
                        this.totalCookTime = this.getCookTime(this.qedraItemStacks[0]);
                        this.cookFul();
                        flag1 = true;
                    }
                }
                else
                {
                    this.cookTime = 0;
                }
            }
            else if (!this.isBurning() && this.cookTime > 0)
            {
                this.cookTime = MathHelper.clamp_int(this.cookTime - 2, 0, this.totalCookTime);
            }

            if (flag != this.isBurning())
            {
                flag1 = true;
                BlockFulQedra.setState(this.isBurning(), this.worldObj, this.pos);
            }
        }

        if (flag1)
        {
            this.markDirty();
        }
    }
    public boolean isBurning()
    {
        return this.qedraBurnTime > 0;
    }

    @SideOnly(Side.CLIENT)
    public static boolean isBurning(IInventory inventory)
    {
        return inventory.getField(0) > 0;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return this.worldObj.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        if (index == 2)
        {
            return false;
        }
        else if (index != 1)
        {
            return true;
        }
        else
        {
            ItemStack itemstack = this.qedraItemStacks[1];
            return isItemFuel(stack) || SlotQedraFuel.isBucket(stack) && (itemstack == null || itemstack.getItem() != Items.BUCKET);
        }
    }

    @Override
    public int getField(int id) {
        switch (id)
        {
            case 0:
                return this.qedraBurnTime;
            case 1:
                return this.currentItemBurnTime;
            case 2:
                return this.cookTime;
            case 3:
                return this.totalCookTime;
            default:
                return 0;
        }
    }

    @Override
    public void setField(int id, int value) {
        switch (id)
        {
            case 0:
                this.qedraBurnTime = value;
                break;
            case 1:
                this.currentItemBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            case 3:
                this.totalCookTime = value;
        }
    }

    @Override
    public int getFieldCount() {
        return 4;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.qedraItemStacks.length; ++i) {
            this.qedraItemStacks[i] = null;
        }
    }


    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
        return null;
    }

    @Override
    public String getGuiID() {
        return "fotp:fulqedra";
    }

    @Override
    public String getName() {
        return this.hasCustomName() ? this.qedraCustomName : "container.furnace";
    }

    @Override
    public boolean hasCustomName() {
        return this.qedraCustomName != null && !this.qedraCustomName.isEmpty();
    }

    @Override
    public int[] getSlotsForFace(EnumFacing side) {
        return new int[0];
    }

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return false;
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
        return false;
    }
    private int getCookTime(@Nullable ItemStack stack) {
        return 100;
    }
}
