package net.colonova.colonovastechmod.handler;

import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class MachineTags
{
    public static final TagKey<Block> NEEDS_WRENCH = BlockTags.create(new ResourceLocation(Reference.MOD_ID, "needs_wrench"));
    public static final TagKey<Block> MINEABLE_WITH_WRENCH = BlockTags.create(new ResourceLocation(Reference.MOD_ID, "mineable/wrench"));
}
