package net.cassy.slippyice.datagen;

import net.cassy.slippyice.block.ModBlocks;
import net.cassy.slippyice.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool slippyIcePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SLIPPY_ICE);

        slippyIcePool.stairs(ModBlocks.SLIPPY_ICE_STAIRS);
        slippyIcePool.slab(ModBlocks.SLIPPY_ICE_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
