package com.theringfinder.fmod.item;

import com.theringfinder.fmod.FMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DAMASCUS = registerItem("damascus", new Item(new Item.Settings()));

    public static final Item DAMASCUS_PICKAXE = registerItem("damascus_pickaxe", new PickaxeItem(ModToolMaterial.DAMASCUS, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.DAMASCUS, 3, 2f))));
    public static final Item DAMASCUS_AXE = registerItem("damascus_axe", new PickaxeItem(ModToolMaterial.DAMASCUS, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.DAMASCUS, 5, 1f))));
    public static final Item DAMASCUS_SHOVEL = registerItem("damascus_shovel", new PickaxeItem(ModToolMaterial.DAMASCUS, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.DAMASCUS, 2, 2.5f))));
    public static final Item DAMASCUS_SWORD = registerItem("damascus_sword", new PickaxeItem(ModToolMaterial.DAMASCUS, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.DAMASCUS, 4, 1.75f))));
    public static final Item DAMASCUS_HOE = registerItem("damascus_hoe", new PickaxeItem(ModToolMaterial.DAMASCUS, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.DAMASCUS, 2, 2.5f))));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DAMASCUS);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FMod.LOGGER.info("Registering mod items for " + FMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

}
