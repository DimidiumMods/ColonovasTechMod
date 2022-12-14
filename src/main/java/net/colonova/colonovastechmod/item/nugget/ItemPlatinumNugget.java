package net.colonova.colonovastechmod.item.nugget;

import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.item.Item;

public class ItemPlatinumNugget extends Item
{
    public ItemPlatinumNugget()
    {
        super(new Item.Properties()
                .tab(Reference.CREATIVE_TAB_ITEMS)
                .stacksTo(64));
    }
}