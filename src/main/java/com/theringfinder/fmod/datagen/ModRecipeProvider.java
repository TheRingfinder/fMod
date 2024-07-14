package com.theringfinder.fmod.datagen;

import com.theringfinder.fmod.block.ModBlocks;
import com.theringfinder.fmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DAMASCUS, RecipeCategory.DECORATIONS, ModBlocks.DAMASCUS_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DAMASCUS_PICKAXE, 1)
                .pattern("DDD")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('D', ModItems.DAMASCUS)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.DAMASCUS), conditionsFromItem(ModItems.DAMASCUS))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.DAMASCUS_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DAMASCUS_AXE, 1)
                .pattern(" DD")
                .pattern(" SD")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('D', ModItems.DAMASCUS)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.DAMASCUS), conditionsFromItem(ModItems.DAMASCUS))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.DAMASCUS_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DAMASCUS_SHOVEL, 1)
                .pattern(" D ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('D', ModItems.DAMASCUS)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.DAMASCUS), conditionsFromItem(ModItems.DAMASCUS))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.DAMASCUS_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DAMASCUS_SWORD, 1)
                .pattern(" D ")
                .pattern(" D ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('D', ModItems.DAMASCUS)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.DAMASCUS), conditionsFromItem(ModItems.DAMASCUS))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.DAMASCUS_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DAMASCUS_HOE, 1)
                .pattern(" DD")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('D', ModItems.DAMASCUS)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.DAMASCUS), conditionsFromItem(ModItems.DAMASCUS))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.DAMASCUS_HOE)));
    }
}
