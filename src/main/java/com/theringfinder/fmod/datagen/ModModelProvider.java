package com.theringfinder.fmod.datagen;

import com.theringfinder.fmod.block.ModBlocks;
import com.theringfinder.fmod.item.ModItems;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAMASCUS_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DAMASCUS, Models.GENERATED);

        itemModelGenerator.register(ModItems.DAMASCUS_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMASCUS_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMASCUS_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMASCUS_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMASCUS_HOE, Models.HANDHELD);
    }

}
