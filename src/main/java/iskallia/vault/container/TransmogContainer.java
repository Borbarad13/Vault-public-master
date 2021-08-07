package iskallia.vault.container;

import java.util.List;

import iskallia.vault.init.ModContainers;
import iskallia.vault.init.ModItems;
import iskallia.vault.init.ModRecipes;
import iskallia.vault.item.gear.VaultGear.Rarity;
import iskallia.vault.item.gear.VaultGear;
import iskallia.vault.recipe.TransmogRecipe;
import iskallia.vault.util.EntityHelper;
import iskallia.vault.init.ModAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.CraftResultInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;



public class TransmogContainer extends Container
{
    /**
     * World where container operates
     */
    private final World world;

    /**
     * List of available recipes.
     */
    private final List<TransmogRecipe> transmogRecipeList;

    /**
     * Current recipe.
     */
    private TransmogRecipe transmogRecipe;

    /**
     * Stores crafting result
     */
    private final CraftResultInventory craftResultInventory = new CraftResultInventory();

    /**
     * Inventory with 2 slots for key press
     */
    protected final IInventory transmogInventory = new Inventory(2)
    {
        /**
         * For tile entities, ensures the chunk containing the tile entity is saved to disk later - the game won't think
         * it hasn't changed and skip it.
         */
        public void markDirty()
        {
            super.markDirty();
            TransmogContainer.this.onCraftMatrixChanged(this);
        }
    };

    /**
     * Slot for blank keys
     */
    public static final int STATS_SLOT = 0;

    /**
     * Slot for cluster
     */
    public static final int MODEL_SLOT = 1;

    /**
     * Result key
     */
    public static final int RESULT_SLOT = 2;


// ---------------------------------------------------------------------
// Section: Constructor
// ---------------------------------------------------------------------


    /**
     * Constructor for the container.
     *
     * @param windowId WindowId.
     * @param player Player instance.
     */
    public TransmogContainer(int windowId, PlayerEntity player)
    {
        super(ModContainers.TRANSMOG_CONTAINER, windowId);

        this.world = player.world;
        this.transmogRecipeList = this.world.getRecipeManager().getRecipesForType(ModRecipes.TRANSMOG_RECIPE);

        this.addSlot(new Slot(this.transmogInventory, STATS_SLOT, 27, 47));
        this.addSlot(new Slot(this.transmogInventory, MODEL_SLOT, 76, 47));
        this.addSlot(new Slot(this.craftResultInventory, RESULT_SLOT, 134, 47)
        {

            /**
             * Return whether this slot's stack can be taken from this slot.
             */
            @Override
            public boolean canTakeStack(PlayerEntity playerIn)
            {
                return TransmogContainer.this.canTakeStack(playerIn, this.getHasStack());
            }


            @Override
            public ItemStack onTake(PlayerEntity thePlayer, ItemStack stack)
            {
                return TransmogContainer.this.onTake(thePlayer, stack);
            }


            @Override
            public boolean isItemValid(ItemStack stack)
            {
                return false; // Do not accept any item in
            }
        });

        // Manages player inventory
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlot(new Slot(player.inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        // Manages player toolbar
        for (int k = 0; k < 9; ++k)
        {
            this.addSlot(new Slot(player.inventory, k, 8 + k * 18, 142));
        }
    }


// ---------------------------------------------------------------------
// Section: Methods
// ---------------------------------------------------------------------


    /**
     * This method checks if player can take stacks.
     *
     * @param playerIn PlayerEntity.
     * @param hasStack boolean that indicate if it is stack.
     * @return {@code true} if stack can be taken, {@code false} otherwise.
     */
    private boolean canTakeStack(PlayerEntity playerIn, boolean hasStack)
    {
        return true;
    }


    /**
     * This method process recipe processing.
     *
     * @param player Player Entity.
     * @param craftedItem Crafted item stack.
     * @return Crafted ItemStack.
     */
    private ItemStack onTake(PlayerEntity player, ItemStack craftedItem)
    {
        craftedItem.onCrafting(player.world, player, craftedItem.getCount());
        this.craftResultInventory.onCrafting(player);
        this.reduceItemInSlot(STATS_SLOT);
        this.reduceItemInSlot(MODEL_SLOT);

        if (!player.world.isRemote && !craftedItem.isEmpty())
        {
            player.world.playEvent(1030, player.getPosition(), 0);
        }

        return craftedItem;
    }


    /**
     * This method shrinks item stack in given slot by 1.
     *
     * @param slot Index of the slot.
     */
    private void reduceItemInSlot(int slot)
    {
        ItemStack itemstack = this.transmogInventory.getStackInSlot(slot);
        itemstack.shrink(1);
        this.transmogInventory.setInventorySlotContents(slot, itemstack);
    }


    /**
     * Called when the Key Press Input Slot changes, calculates the new result and puts it in the output slot
     */
    public void updateTransmogOutput()
    {
        List<TransmogRecipe> recipeList = this.world.getRecipeManager().getRecipes(
            ModRecipes.TRANSMOG_RECIPE,
            this.transmogInventory,
            this.world);
        ItemStack output = this.transmogInventory.getStackInSlot(0).copy();
        ItemStack modelCopy = this.transmogInventory.getStackInSlot(1).copy();
        if((ModAttributes.GEAR_STATE.getOrDefault(output, VaultGear.State.UNIDENTIFIED).getValue(output) != VaultGear.State.UNIDENTIFIED) && (ModAttributes.GEAR_STATE.getOrDefault(modelCopy, VaultGear.State.UNIDENTIFIED).getValue(modelCopy) != VaultGear.State.UNIDENTIFIED))
        {
            if((ModAttributes.GEAR_RARITY.getOrDefault(output, Rarity.SCRAPPY).getValue(output) != Rarity.SCRAPPY) && (ModAttributes.GEAR_RARITY.getOrDefault(modelCopy, Rarity.SCRAPPY).getValue(modelCopy) != Rarity.SCRAPPY))
            {
                if (this.transmogInventory.getStackInSlot(0).getItem() != this.transmogInventory.getStackInSlot(1).getItem())
                {
                    this.craftResultInventory.setInventorySlotContents(0, ItemStack.EMPTY);
                }
                else
                {
                    
                    ModAttributes.GEAR_MODEL.create(output, ModAttributes.GEAR_MODEL.getOrDefault(modelCopy, -1).getValue(modelCopy));
                    ModAttributes.GEAR_COLOR.create(output, ModAttributes.GEAR_COLOR.getOrDefault(modelCopy, -1).getValue(modelCopy));
                    if(this.transmogInventory.getStackInSlot(1).getItem() == ModItems.SWORD)
                        ModAttributes.GEAR_RARITY.create(output, ModAttributes.GEAR_RARITY.getOrDefault(modelCopy, Rarity.SCRAPPY).getValue(modelCopy));
                    this.craftResultInventory.setInventorySlotContents(0, output);
                }
            }
            else
            {
                this.craftResultInventory.setInventorySlotContents(0, ItemStack.EMPTY);
            }
        }
        else
        {  
            this.craftResultInventory.setInventorySlotContents(0, ItemStack.EMPTY);
        }
    }


    /**this.transmogInventory.getStackInSlot(0).getItem() == ModItems.CHESTPLATE
     * Callback for when the crafting matrix is changed.
     */
    public void onCraftMatrixChanged(IInventory inventoryIn)
    {
        super.onCraftMatrixChanged(inventoryIn);

        if (inventoryIn == this.transmogInventory)
        {
            this.updateTransmogOutput();
        }
    }


    /**
     * Return items in players inventory.
     *
     * @param player Player who closed inventory.
     */
    @Override
    public void onContainerClosed(PlayerEntity player)
    {
        super.onContainerClosed(player);

        ItemStack statsStack = this.transmogInventory.getStackInSlot(STATS_SLOT);
        ItemStack modelStack = this.transmogInventory.getStackInSlot(MODEL_SLOT);

        if (!statsStack.isEmpty())
        {
            EntityHelper.giveItem(player, statsStack);
            EntityHelper.giveItem(player, modelStack);
        }
    }


    /**
     * Determines whether supplied player can use this container
     */
    @Override
    public boolean canInteractWith(PlayerEntity player)
    {
        return true;
    }


    /**
     * Transfers items from with shift+click.
     */
    @Override
    public ItemStack transferStackInSlot(PlayerEntity player, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemStackInSlot = slot.getStack();
            itemstack = itemStackInSlot.copy();

            if (index == RESULT_SLOT)
            {
                if (!this.mergeItemStack(itemStackInSlot, 3, 39, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemStackInSlot, itemstack);
            }
            else if (index != STATS_SLOT && index != MODEL_SLOT)
            {
                if (index < 39)
                {
                    int mergeIndex = this.getMergeSlotIndex(itemstack);

                    if (mergeIndex == -1 ||
                        !this.mergeItemStack(itemStackInSlot, mergeIndex, 2, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
            }
            else if (!this.mergeItemStack(itemStackInSlot, 3, 39, false))
            {
                return ItemStack.EMPTY;
            }

            if (itemStackInSlot.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemStackInSlot.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(player, itemStackInSlot);
        }

        return itemstack;
    }


    /**
     * This method returns merge slot index for given item stack.
     *
     * @param itemStack Item Stack that must be merged.
     * @return slot index.
     */
    private int getMergeSlotIndex(ItemStack itemStack)
    {   
        
        if(ModAttributes.GEAR_STATE.getOrDefault(itemStack, VaultGear.State.UNIDENTIFIED).getValue(itemStack) != VaultGear.State.UNIDENTIFIED)
        {
            if(ModAttributes.GEAR_RARITY.getOrDefault(itemStack, Rarity.SCRAPPY).getValue(itemStack) != Rarity.SCRAPPY)
            {
                if (this.transmogInventory.getStackInSlot(0) == ItemStack.EMPTY)
                {
                    // return key slot for main item
                    return STATS_SLOT;
                }
                if (this.transmogInventory.getStackInSlot(1) == ItemStack.EMPTY)
                {
                    // return cluster slot for cluster
                    return MODEL_SLOT;
                }
            }
        }
        // Return -1 by default.
        return -1;
    }
}