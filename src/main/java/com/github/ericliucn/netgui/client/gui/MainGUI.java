package com.github.ericliucn.netgui.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Mouse;

public class MainGUI extends GuiScreen {

    private final int xSize;
    private final int ySize;
    private final double scaleX;
    private final double scaleY;

    private static final ResourceLocation baseGUI = new ResourceLocation("netgui", "textures/gui/main.png");
    private static final int baseGUIWidth = 248;
    private static final int baseGUIHeight = 166;

    
    public MainGUI(int w, int h){
        this.xSize = w;
        this.ySize = h;
        scaleX = (double) w / (double) baseGUIWidth;
        scaleY = (double) h/(double) baseGUIHeight;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {

        //calculate start point
        int guiTop = (int) ((height - ySize) / 2 / scaleY);
        int guiLeft = (int) ((width - xSize) / 2 / scaleX);

        this.mc.renderEngine.bindTexture(baseGUI);
        int baseGUIID = this.mc.renderEngine.getTexture(baseGUI).getGlTextureId();

        //background
        drawDefaultBackground();

        //set colour
        GlStateManager.color(1F, 1F, 1F);

        //draw base GUI
        GlStateManager.pushMatrix();
        {
            GlStateManager.bindTexture(baseGUIID);
            GlStateManager.scale(scaleX, scaleY, 1D);
            drawTexturedModalRect(guiLeft, guiTop, 0, 0, baseGUIWidth, baseGUIHeight);
        }
        GlStateManager.popMatrix();

        super.drawScreen(mouseX, mouseY, partialTicks);
        //Mouse.setGrabbed(false);
    }

    @Override
    public void drawBackground(int tint) {
        drawDefaultBackground();
    }
}
