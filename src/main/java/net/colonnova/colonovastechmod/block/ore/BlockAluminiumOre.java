package net.colonnova.colonovastechmod.block.ore;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;


import javax.annotation.Nullable;
import java.util.List;

public class BlockAluminiumOre extends Block
{
    public BlockAluminiumOre()
    {
        super(Block.Properties.of(Material.STONE)
                .strength(10.0F, 100.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops());
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter world, List<Component> tooltip, TooltipFlag options)
    {
        tooltip.add(Component.translatable("messages.colonovastechmod.aluminium")
                .withStyle(ChatFormatting.BOLD)
                .withStyle(ChatFormatting.DARK_RED));
    }
}