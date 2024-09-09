package net.cassy.slippyice.datagen;

import net.cassy.slippyice.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        createStairsRecipe(ModBlocks.SLIPPY_ICE_STAIRS, Ingredient.ofItems(ModBlocks.SLIPPY_ICE)).criterion(FabricRecipeProvider.hasItem(ModBlocks.SLIPPY_ICE),FabricRecipeProvider.conditionsFromItem(ModBlocks.SLIPPY_ICE));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SLIPPY_ICE_SLAB, ModBlocks.SLIPPY_ICE);
    }
}
