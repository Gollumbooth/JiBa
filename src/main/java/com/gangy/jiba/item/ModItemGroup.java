package com.gangy.jiba.item;

import com.gangy.jiba.JiBa;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup JiBa_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(JiBa.MOD_ID, "jiba_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.jiba_group"))
                    .icon(()-> new ItemStack(ModItems.JiBa_Icon)).entries((displayContext, entries) -> {
                        entries.add(ModItems.XJJ);
                        entries.add(ModItems.DJJ);
                    }).build());
    public static void registerModItemGroup() {

    }
}
