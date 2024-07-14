package com.theringfinder.fmod.item;

import com.theringfinder.fmod.FMod;
import com.theringfinder.fmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FMOD_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(FMod.MOD_ID, "fmod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fmod")).icon(() -> new ItemStack(ModItems.DAMASCUS))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.DAMASCUS);

                entries.add(ModItems.DAMASCUS_PICKAXE);
                entries.add(ModItems.DAMASCUS_AXE);
                entries.add(ModItems.DAMASCUS_SHOVEL);
                entries.add(ModItems.DAMASCUS_SWORD);
                entries.add(ModItems.DAMASCUS_HOE);

                entries.add(ModBlocks.DAMASCUS_BLOCK);
            }).build());

    public static void registerItemGroups() {
        FMod.LOGGER.info("Registering Item Groups for " + FMod.MOD_ID);
    }
}
