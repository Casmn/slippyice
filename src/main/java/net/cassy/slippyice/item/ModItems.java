package net.cassy.slippyice.item;

import net.cassy.slippyice.SlippyIce;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SlippyIce.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SlippyIce.LOGGER.info("Registering Mod Items for " + SlippyIce.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        });
    }
}
