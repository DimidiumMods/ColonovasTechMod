package net.colonnova.colonovastechmod.util;

import net.colonnova.colonovastechmod.handler.registry.BlockRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

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
}
