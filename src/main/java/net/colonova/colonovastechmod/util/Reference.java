package net.colonova.colonovastechmod.util;

import net.colonova.colonovastechmod.handler.registry.BlockRegistry;
import net.colonova.colonovastechmod.handler.registry.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.sql.Ref;

public class Reference
{
    public static final String MOD_ID = "colonovastechmod";

    public static final CreativeModeTab CREATIVE_TAB_BLOCKS = new CreativeModeTab(Reference.MOD_ID + ".tab.blocks")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(BlockRegistry.ALUMINIUM_ORE.get());
        }
    };

    public static final CreativeModeTab CREATIVE_TAB_ITEMS = new CreativeModeTab(Reference.MOD_ID + ".tab.items")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ItemRegistry.ALUMINIUM_INGOT.get());
        }
    };
}
