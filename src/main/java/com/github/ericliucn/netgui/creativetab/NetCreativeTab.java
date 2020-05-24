package com.github.ericliucn.netgui.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class NetCreativeTab extends CreativeTabs {

    public NetCreativeTab(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.ITEM_FRAME);
    }
}
