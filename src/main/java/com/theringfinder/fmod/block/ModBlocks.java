package com.theringfinder.fmod.block;

import com.theringfinder.fmod.FMod;
import com.theringfinder.fmod.block.custom.DamascusForgeBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block DAMASCUS_BLOCK = registerBlock("damascus_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block DAMASCUS_FORGE = registerBlock("damascus_forge", new DamascusForgeBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(FMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        FMod.LOGGER.info("Registering ModBlocks for " + FMod.MOD_ID);
    }
}
