package com.transportation.TransportationMod.datagen;

import com.transportation.TransportationMod.TransportationMod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {


    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TransportationMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
