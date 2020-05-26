package com.github.ericliucn.netgui.network;

import com.github.ericliucn.netgui.client.gui.MainGUI;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class GuiMessage implements IMessage {

    public int width;
    public int height;

    public GuiMessage() {
    }

    public GuiMessage(int w, int h){
        width = w;
        height = h;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        width = buf.readInt();
        height = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(width);
        buf.writeInt(height);
    }

    public static class GuiMessageHandler implements IMessageHandler<GuiMessage, IMessage>{

        @Override
        public IMessage onMessage(GuiMessage message, MessageContext ctx) {
            if (ctx.side.isClient()){
                Minecraft.getMinecraft().addScheduledTask(new Runnable() {
                    @Override
                    public void run() {
                        Minecraft.getMinecraft().displayGuiScreen(new MainGUI(message.width, message.height));
                    }
                });
            }
            return null;
        }
    }
}
