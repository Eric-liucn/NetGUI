package com.github.ericliucn.netgui.proxy;

import com.github.ericliucn.netgui.registry.RegistryHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLEvent;
import net.minecraftforge.fml.common.network.FMLEventChannel;

public class CommonProxy {

    public void preInit(){
        MinecraftForge.EVENT_BUS.register(new RegistryHandler());
    }

    public void init(){

    }

    public void postInit(){

    }

    public void registerModel(Item item, int meta, ModelResourceLocation resourceLocation){

    }

}