package com.github.ericliucn.netgui.registry;

import com.github.ericliucn.netgui.Main;
import com.github.ericliucn.netgui.client.gui.MainGUIContainer;
import com.github.ericliucn.netgui.containers.MainContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import javax.annotation.Nullable;

public class NetGuiHandler  implements IGuiHandler {

    public NetGuiHandler(){
        NetworkRegistry.INSTANCE.registerGuiHandler(Main.INSTANCE, this);
    }

    public static final int GUI_MAIN = 1;

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID){
            case GUI_MAIN:
                return new MainContainer();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID){
            case GUI_MAIN:
                return new MainGUIContainer(new MainContainer());
            default:
                return null;
        }
    }
}
