package com.github.ericliucn.netgui.client.gui;

import codechicken.lib.gui.GuiDraw;
import codechicken.lib.gui.GuiScreenWidget;
import codechicken.lib.gui.GuiScrollPane;
import net.minecraft.client.renderer.GlStateManager;

public class MainGUI extends GuiScreenWidget {

    public MainGUI(){
        super();
        this.xSize = this.width;
        this.ySize = this.height;
    }

    public MainGUI(int xSize, int ySize){
        super(xSize, ySize);
    }


    @Override
    public void drawBackground() {
        drawDefaultBackground();
    }

    @Override
    public void addWidgets() {
        this.widgets.add(new GuiScrollPane(0,0,50,200) {
            @Override
            public int contentHeight() {
                return 20;
            }

            @Override
            public void drawContent(int mx, int my, float frame) {
                GuiDraw.drawString("test", 0,0,0x326fd1, false);
            }

        });
    }
}
