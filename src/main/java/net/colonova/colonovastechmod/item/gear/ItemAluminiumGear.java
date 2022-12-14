package net.colonova.colonovastechmod.item.gear;

import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemAluminiumGear extends Item
{
    public ItemAluminiumGear()
    {
        super(new Item.Properties()
                .tab(Reference.CREATIVE_TAB_ITEMS)
                .stacksTo(64));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag options)
    {
        tooltip.add(Component.translatable("messages.colonovastechmod.aluminium")
                .withStyle(ChatFormatting.BOLD)
                .withStyle(ChatFormatting.DARK_RED));
    }
}
