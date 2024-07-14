package com.theringfinder.fmod.datagen;

import com.theringfinder.fmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.DAMASCUS_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.DAMASCUS_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.DAMASCUS_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.DAMASCUS_BOOTS);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.DAMASCUS_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.DAMASCUS_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.DAMASCUS_SHOVEL);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.DAMASCUS_SWORD);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.DAMASCUS_HOE);
    }
}
