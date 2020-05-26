package com.github.ericliucn.netgui.command;

import com.github.ericliucn.netgui.Main;
import com.github.ericliucn.netgui.network.GuiMessage;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class TestCommand extends CommandBase {
    @Override
    public String getName() {
        return "test";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "for test";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        int w = 100;
        int h = 100;
        if (args.length == 2){
            w = Integer.parseInt(args[0]);
            h = Integer.parseInt(args[1]);
        }
        Main.simpleNetworkWrapper.sendToAll(new GuiMessage(w, h));
    }
}
