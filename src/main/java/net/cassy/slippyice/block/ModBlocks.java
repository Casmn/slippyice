package net.cassy.slippyice.block;

import net.cassy.slippyice.SlippyIce;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SLIPPY_ICE = registerBlock(
            "slippy_ice",
            new TranslucentBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_PURPLE)
                            .slipperiness(0.25F)
                            .strength(0.5F)
                            .sounds(BlockSoundGroup.GLASS)
                            .nonOpaque()
                            .allowsSpawning((state, world, pos, entityType) -> entityType == EntityType.POLAR_BEAR)
                            .solidBlock(Blocks::never)
                            .requiresTool()

            )
    );

    //public static final Block SLIPPY_ICE = registerBlock("slippy_ice",
    //        new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.GLASS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SlippyIce.MOD_ID, name), block);

    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SlippyIce.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SlippyIce.LOGGER.info("Registering Mod Blocks for " + SlippyIce.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.SLIPPY_ICE);
        });
    }
}
