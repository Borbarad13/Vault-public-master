package iskallia.vault.recipe;

import com.google.gson.JsonObject;

import iskallia.vault.container.TransmogContainer;
import iskallia.vault.init.ModBlocks;
import iskallia.vault.init.ModRecipes;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistryEntry;


/**
 * Key Press Recipes class.
 */
public class TransmogRecipe implements IRecipe<IInventory>
{
	/**
	 * Class serializer.
	 */
	public static final Serializer SERIALIZER = new Serializer();

	/**
	 * Key slot ingredient.
	 */
	private final Ingredient stats;

	/**
	 * Cluster slot ingredient.
	 */
	private final Ingredient model;

	/**
	 * Result from crafting.
	 */
	private final ItemStack result;

	/**
	 * Recipe resource ID.
	 */
	private final ResourceLocation recipeId;


	// ---------------------------------------------------------------------
	// Section: Constructor
	// ---------------------------------------------------------------------


	/**
	 * Default stats recipe constructor.
	 * @param recipeId Resource ID.
	 * @param stats Key Ingredient
	 * @param model Cluster Ingredient
	 * @param result ItemStuck from recipe.
	 */
	public TransmogRecipe(ResourceLocation recipeId, Ingredient stats, Ingredient model, ItemStack result)
	{
		this.recipeId = recipeId;
		this.stats = stats;
		this.model = model;
		this.result = result;
	}


	/**
	 * Used to check if a recipe matches current crafting inventory
	 */
	public boolean matches(IInventory inv, World worldIn)
	{
		return this.stats.test(inv.getStackInSlot(TransmogContainer.STATS_SLOT)) &&
			this.model.test(inv.getStackInSlot(TransmogContainer.MODEL_SLOT));
	}


	/**
	 * Returns an Item that is the result of this recipe
	 */
	public ItemStack getCraftingResult(IInventory inv)
	{
		ItemStack itemstack = this.result.copy();
		CompoundNBT compoundnbt = inv.getStackInSlot(TransmogContainer.RESULT_SLOT).getTag();
		if (compoundnbt != null)
		{
			itemstack.setTag(compoundnbt.copy());
		}

		return itemstack;
	}


	/**
	 * Used to determine if this recipe can fit in a grid of the given width/height
	 */
	public boolean canFit(int width, int height)
	{
		return width * height >= 2;
	}


	/**
	 * Get the result of this recipe, usually for display purposes (e.g. recipe book). If your recipe has more than one
	 * possible result (e.g. it's dynamic and depends on its inputs), then return an empty stack.
	 */
	public ItemStack getRecipeOutput()
	{
		return this.result;
	}


	/**
	 * This method returns if given item is valid for model ingredient.
	 * @param itemStack ItemStack that must be checked.
	 * @return {@code true} if given item is valid for model recipe, {@code false} otherwise.
	 */
	public boolean isValidModel(ItemStack itemStack)
	{
		return this.model.test(itemStack);
	}

	/**
	 * This method returns if given item is valid for stats ingredient.
	 * @param itemStack ItemStack that must be checked.
	 * @return {@code true} if given item is valid for stats recipe, {@code false} otherwise.
	 */
	public boolean isValidStats(ItemStack itemStack)
	{
		return this.stats.test(itemStack);
	}


	/**
	 * This method returns icon for recipe.
	 * @return Transmog icon.
	 */
	public ItemStack getIcon()
	{
		return new ItemStack(ModBlocks.TRANSMOG);
	}


	/**
	 * This method returns recipe Id.
	 */
	public ResourceLocation getId()
	{
		return this.recipeId;
	}


	/**
	 * This method returns serializer.
	 */
	public IRecipeSerializer<?> getSerializer()
	{
		return TransmogRecipe.SERIALIZER;
	}


	/**
	 * This method returns recipe type.
	 */
	public IRecipeType<?> getType()
	{
		return SERIALIZER.getRecipeType();
	}


	/**
	 * This method returns recipes ingredient list.
	 */
	@Override
	public NonNullList<Ingredient> getIngredients()
	{
		NonNullList<Ingredient> list = NonNullList.create();
		list.add(this.stats);
		list.add(this.model);
		return list;
	}


	// ---------------------------------------------------------------------
	// Section: Serializer
	// ---------------------------------------------------------------------


	/**
	 * This class manages recipes serialization and deserialization.
	 */
	public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<TransmogRecipe>
	{

		// This registry name is what people will specify in their json files.
		Serializer()
		{
			this.setRegistryName(ModRecipes.TRANSMOG_RECIPE.toString());
		}


		/**
		 * This method reads TransmogRecipe from given json object.
		 */
		public TransmogRecipe read(ResourceLocation recipeId, JsonObject json)
		{
			Ingredient stats = Ingredient.deserialize(JSONUtils.getJsonObject(json, "stats"));
			Ingredient model = Ingredient.deserialize(JSONUtils.getJsonObject(json, "model"));
			ItemStack result = ShapedRecipe.deserializeItem(JSONUtils.getJsonObject(json, "result"));
			return new TransmogRecipe(recipeId, stats, model, result);
		}


		/**
		 * This method reads TransmogRecipe from given buffer.
		 */
		public TransmogRecipe read(ResourceLocation recipeId, PacketBuffer buffer)
		{
			Ingredient stats = Ingredient.read(buffer);
			Ingredient model = Ingredient.read(buffer);
			ItemStack result = buffer.readItemStack();
			return new TransmogRecipe(recipeId, stats, model, result);
		}


		/**
		 * This method serializes TransmogRecipe to given buffer.
		 */
		public void write(PacketBuffer buffer, TransmogRecipe recipe)
		{
			recipe.stats.write(buffer);
			recipe.model.write(buffer);
			buffer.writeItemStack(recipe.result);
		}


		public IRecipeType<?> getRecipeType()
		{
			return ModRecipes.TRANSMOG_RECIPE;
		}
	}
} 