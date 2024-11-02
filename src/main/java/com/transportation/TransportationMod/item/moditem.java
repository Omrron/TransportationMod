package com.transportation.TransportationMod.item;

import com.transportation.TransportationMod.TransportationMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class moditem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TransportationMod.MODID);

    public static final DeferredItem<Item> corrupted_bow = ITEMS.register("corrupted_bow",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
