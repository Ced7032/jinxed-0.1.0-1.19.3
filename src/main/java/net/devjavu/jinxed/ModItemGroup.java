package net.devjavu.jinxed;

import net.devjavu.jinxed.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup JINXED = FabricItemGroup.builder(new Identifier(Jinxed.MOD_ID, "jinxed"))
            .icon(() -> new ItemStack(ModItems.ITEM_TEST))
            .build();
}
