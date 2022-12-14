package net.colonova.colonovastechmod.item.block;

import net.colonova.colonovastechmod.handler.registry.BlockRegistry;
import net.colonova.colonovastechmod.util.Reference;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BlockItemUranium extends BlockItem
{
    public BlockItemUranium()
    {
        super(BlockRegistry.URANIUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS));
    }
}
