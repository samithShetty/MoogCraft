package net.nullptr.moogcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.nullptr.moogcraft.MoogCraft;

public class ModItems {
    public static final Item MOOGNIUM = registerItem("moognium", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoogCraft.MOD_ID, name), item);
    } 

    private static void addItemToGroup(Item item, RegistryKey<ItemGroup> group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(item);
        });
    }

    public static void registerModItemsInGroup() {
        MoogCraft.LOGGER.info("Registering Mod Items for: " + MoogCraft.MOD_ID);
        addItemToGroup(MOOGNIUM, ItemGroups.INGREDIENTS);

        



    }
}
