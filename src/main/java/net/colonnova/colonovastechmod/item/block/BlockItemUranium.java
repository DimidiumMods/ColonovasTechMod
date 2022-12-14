package net.colonnova.colonovastechmod.item.block;

import net.colonnova.colonovastechmod.handler.registry.BlockRegistry;
import net.colonnova.colonovastechmod.util.Reference;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class BlockItemUranium extends BlockItem
{
    public BlockItemUranium()
    {
        super(BlockRegistry.URANIUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS));
    }
}
