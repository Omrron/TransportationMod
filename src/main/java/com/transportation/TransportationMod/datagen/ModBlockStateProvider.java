package com.transportation.TransportationMod.datagen;

import com.transportation.TransportationMod.TransportationMod;
import com.transportation.TransportationMod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper fileHelper){
        super(output, TransportationMod.MODID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CORRUPTION_BLOCK);
        blockWithItem(ModBlocks.SPREADING_CORRUPTION_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
//        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
