package net.colonova.colonovastechmod.item.nugget;

import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ItemAluminiumNugget extends Item
{
    public ItemAluminiumNugget()
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
