package com.transportation.TransportationMod.block;

import com.transportation.TransportationMod.TransportationMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks Blocks = DeferredRegister.createBlocks(TransportationMod.MODID);

    public static void register(IEventBus bus) {
        Blocks.register(bus);
    }
}
