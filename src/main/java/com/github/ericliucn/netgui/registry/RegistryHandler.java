package com.github.ericliucn.netgui.registry;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegistryHandler {

    @SubscribeEvent
    public void addItem(RegistryEvent.Register<Item> event){
        ModItems.ITEM_LIST.forEach(item -> {
            event.getRegistry().register(item);
            if (item instanceof IHasModel){
                ((IHasModel) item).registerModel();
            }
        });
    }
}
