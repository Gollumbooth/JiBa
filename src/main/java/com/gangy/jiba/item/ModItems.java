package com.gangy.jiba.item;

import com.gangy.jiba.JiBa;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item XJJ = registerItems("xjj", new Item(new FabricItemSettings().food(ModFoodComponents.XJJ)));
    public static final Item DJJ = registerItems("djj", new Item(new FabricItemSettings().food(ModFoodComponents.DJJ)));
    public static final Item JiBa_Icon = registerItems("jiba_icon", new Item(new FabricItemSettings()));

    private static void addItemsToItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(XJJ);
        fabricItemGroupEntries.add(DJJ);
    }
    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(JiBa.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToItemGroup);
    }
}
