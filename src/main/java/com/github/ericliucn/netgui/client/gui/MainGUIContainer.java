package com.github.ericliucn.netgui.client.gui;


import codechicken.lib.gui.GuiCCTextField;
import codechicken.lib.gui.GuiScreenWidget;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.util.text.TextComponentString;

public class MainGUIContainer extends GuiContainer {


    public MainGUIContainer(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {

    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

}
