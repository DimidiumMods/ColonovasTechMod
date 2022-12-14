package net.colonova.colonovastechmod.item.gear;


import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.item.Item;

public class ItemIridiumGear extends Item
{
    public ItemIridiumGear()
    {
        super(new Item.Properties()
                .tab(Reference.CREATIVE_TAB_ITEMS)
                .stacksTo(64));
    }
}
