package net.devjavu.jinxed.item;

import net.devjavu.jinxed.Jinxed;
import net.devjavu.jinxed.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ITEM_TEST = registerItem("item_test", new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.JINXED).register(entries -> entries.add(ITEM_TEST));
        return Registry.register(Registries.ITEM, new Identifier(Jinxed.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Jinxed.LOGGER.debug("Registering Mod Items for " + Jinxed.MOD_ID);
    }
}
