package com.github.ericliucn.netgui.client.gui;


import codechicken.lib.gui.GuiCCTextField;
import codechicken.lib.gui.GuiDraw;
import codechicken.lib.gui.GuiScreenWidget;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;

public class MainGUIContainer extends GuiContainer {

    private static final ResourceLocation baseGUI = new ResourceLocation("netgui:textures/gui/main.png");
    private static final int baseGUIWidth = 248;
    private static final int baseGUIHeight = 166;


    public MainGUIContainer(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        this.mc.renderEngine.bindTexture(baseGUI);
        int base = this.mc.renderEngine.getTexture(baseGUI).getGlTextureId();

        GlStateManager.pushMatrix();
        {
            GlStateManager.bindTexture(base);
            GuiDraw.drawTexturedModalRect(0, 0, 0, 0, 248, 166);
        }
        GlStateManager.popMatrix();
    }

    @Override
    public void drawBackground(int tint) {
        drawDefaultBackground();
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

}
