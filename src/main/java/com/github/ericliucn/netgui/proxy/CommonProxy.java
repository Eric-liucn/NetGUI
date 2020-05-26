package com.github.ericliucn.netgui.proxy;

import com.github.ericliucn.netgui.Main;
import com.github.ericliucn.netgui.network.GuiMessage;
import com.github.ericliucn.netgui.registry.NetGuiHandler;
import com.github.ericliucn.netgui.registry.RegistryHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class CommonProxy {

    public void preInit(){
        MinecraftForge.EVENT_BUS.register(new RegistryHandler());
        NetworkRegistry.INSTANCE.registerGuiHandler(Main.INSTANCE, new NetGuiHandler());
        Main.simpleNetworkWrapper.registerMessage(GuiMessage.GuiMessageHandler.class, GuiMessage.class, 932065, Side.CLIENT);
    }

    public void init(){

    }

    public void postInit(){

    }

    public void registerModel(Item item, int meta, ModelResourceLocation resourceLocation){

    }

}
