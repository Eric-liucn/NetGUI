package com.github.ericliucn.netgui;

import com.github.ericliucn.netgui.command.TestCommand;
import com.github.ericliucn.netgui.creativetab.NetCreativeTab;
import com.github.ericliucn.netgui.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = Main.MOD_ID,
        name = Main.MOD_NAME,
        version = Main.VERSION
)
public class Main {

    public static final String MOD_ID = "netgui";
    public static final String MOD_NAME = "Netgui";
    public static final String VERSION = "2020.1-1.3.5";

    public static NetCreativeTab creativeTab = new NetCreativeTab("NetGUI");
    public static SimpleNetworkWrapper simpleNetworkWrapper = NetworkRegistry.INSTANCE.newSimpleChannel(Main.MOD_ID);

    @SidedProxy(serverSide = "com.github.ericliucn.netgui.ServerProxy", clientSide = "com.github.ericliucn.netgui.proxy.ClientProxy")
    public static CommonProxy proxy;

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static Main INSTANCE;



    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

    @Mod.EventHandler
    public void onStart(FMLServerStartingEvent event){
        event.registerServerCommand(new TestCommand());
    }


}
