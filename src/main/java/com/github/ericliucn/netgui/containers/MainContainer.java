package com.github.ericliucn.netgui.containers;

import com.github.ericliucn.netgui.items.ItemMainGUI;
import com.github.ericliucn.netgui.registry.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class MainContainer extends Container {

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return new ItemStack(ModItems.ITEM_MAIN_GUI).isItemEqual(playerIn.getHeldItem(EnumHand.MAIN_HAND));
    }
}
