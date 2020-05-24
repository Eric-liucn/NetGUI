package com.github.ericliucn.netgui.items;

import com.github.ericliucn.netgui.Main;
import com.github.ericliucn.netgui.registry.IHasModel;
import com.github.ericliucn.netgui.registry.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Objects;

public class ItemMainGUI extends Item implements IHasModel {

    public ItemMainGUI() {
        this.setCreativeTab(Main.creativeTab);
        this.setMaxDamage(0);
        this.setMaxStackSize(1);
        this.setRegistryName(new ResourceLocation(Main.MOD_ID, "main_gui"));
        this.setTranslationKey("main_gui");
        ModItems.ITEM_LIST.add(this);
    }

    public void registerModel(){
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(Objects.requireNonNull(this.getRegistryName()), "inventory");
        Main.proxy.registerModel(this, 0, modelResourceLocation);
    }


}