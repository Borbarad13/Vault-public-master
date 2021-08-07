package iskallia.vault.hook.jei.category;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import iskallia.vault.client.gui.screen.TransmogScreen;
import iskallia.vault.init.ModBlocks;
import iskallia.vault.recipe.TransmogRecipe;
import mezz.jei.api.constants.ModIds;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;


public class TransmogCategory implements IRecipeCategory<TransmogRecipe>
{
    private final IDrawable background;

    private final IDrawable icon;

    public static final ResourceLocation ID = new ResourceLocation(TransmogRecipe.SERIALIZER.getRecipeType().toString());


    public TransmogCategory(IGuiHelper guiHelper)
    {
        this.background = guiHelper.createDrawable(TransmogScreen.GUI_RESOURCE, 26, 46, 125, 18);
        this.icon = guiHelper.createDrawableIngredient(new ItemStack(ModBlocks.TRANSMOG));
    }


    @Override
    public ResourceLocation getUid()
    {
        return ID;
    }


    @Override
    public Class<? extends TransmogRecipe> getRecipeClass()
    {
        return TransmogRecipe.class;
    }


    @Override
    public String getTitle()
    {
        return this.getTitleAsTextComponent().getString();
    }

    public ITextComponent getTitleAsTextComponent() {
        return ModBlocks.TRANSMOG.getTranslatedName();
    }

    @Override
    public IDrawable getBackground()
    {
        return this.background;
    }


    @Override
    public IDrawable getIcon()
    {
        return this.icon;
    }


    public void setIngredients(TransmogRecipe recipe, IIngredients ingredients)
    {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getRecipeOutput());
    }


    @Override
    public void setRecipe(IRecipeLayout recipeLayout, TransmogRecipe recipeWrapper, IIngredients ingredients)
    {
        IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

        guiItemStacks.init(0, true, 0, 0);
        guiItemStacks.init(1, true, 49, 0);
        guiItemStacks.init(2, false, 107, 0);

        guiItemStacks.set(ingredients);
    }
}