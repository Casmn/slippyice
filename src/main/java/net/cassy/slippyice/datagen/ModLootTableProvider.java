package net.cassy.slippyice.datagen;

import net.cassy.slippyice.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SLIPPY_ICE);
        addDrop(ModBlocks.SLIPPY_ICE_STAIRS);
        addDrop(ModBlocks.SLIPPY_ICE_SLAB, slabDrops(ModBlocks.SLIPPY_ICE_SLAB));

    }
}
