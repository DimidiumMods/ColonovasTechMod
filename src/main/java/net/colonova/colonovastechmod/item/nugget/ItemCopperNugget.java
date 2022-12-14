package net.colonova.colonovastechmod.item.nugget;

import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.item.Item;

public class ItemCopperNugget extends Item
{
    public ItemCopperNugget()
    {
        super(new Item.Properties()
                .tab(Reference.CREATIVE_TAB_ITEMS)
                .stacksTo(64));
    }
}
