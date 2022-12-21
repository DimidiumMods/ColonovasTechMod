package net.colonova.colonovastechmod.data;

import net.colonova.colonovastechmod.handler.registry.BlockRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagsGenerator extends BlockTagsProvider
{
    public BlockTagsGenerator(DataGenerator generator, ExistingFileHelper helper)
    {
        super(generator, Reference.MOD_ID, helper);
    }

    @Override
    protected void addTags()
    {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockRegistry.ALUMINIUM_BLOCK.get())
                .add(BlockRegistry.ALUMINIUM_ORE.get())
                .add(BlockRegistry.COPPER_BLOCK.get())
                .add(BlockRegistry.COPPER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_COPPER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_LEAD_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_SILVER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_TIN_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get())
                .add(BlockRegistry.IRIDIUM_BLOCK.get())
                .add(BlockRegistry.IRIDIUM_ORE.get())
                .add(BlockRegistry.LEAD_BLOCK.get())
                .add(BlockRegistry.LEAD_ORE.get())
                .add(BlockRegistry.NICKEL_ORE.get())
                .add(BlockRegistry.NICKEL_BLOCK.get())
                .add(BlockRegistry.PLATINUM_BLOCK.get())
                .add(BlockRegistry.PLATINUM_ORE.get())
                .add(BlockRegistry.SILVER_BLOCK.get())
                .add(BlockRegistry.SILVER_ORE.get())
                .add(BlockRegistry.TIN_BLOCK.get())
                .add(BlockRegistry.TIN_ORE.get())
                .add(BlockRegistry.URANIUM_BLOCK.get())
                .add(BlockRegistry.URANIUM_ORE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get())
                .add(BlockRegistry.IRIDIUM_BLOCK.get())
                .add(BlockRegistry.IRIDIUM_ORE.get())
                .add(BlockRegistry.PLATINUM_BLOCK.get())
                .add(BlockRegistry.PLATINUM_ORE.get())
                .add(BlockRegistry.URANIUM_BLOCK.get())
                .add(BlockRegistry.URANIUM_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockRegistry.ALUMINIUM_BLOCK.get())
                .add(BlockRegistry.ALUMINIUM_ORE.get())
                .add(BlockRegistry.COPPER_BLOCK.get())
                .add(BlockRegistry.COPPER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_COPPER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_LEAD_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_SILVER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_TIN_ORE.get())
                .add(BlockRegistry.LEAD_BLOCK.get())
                .add(BlockRegistry.LEAD_ORE.get())
                .add(BlockRegistry.NICKEL_ORE.get())
                .add(BlockRegistry.NICKEL_BLOCK.get())
                .add(BlockRegistry.SILVER_BLOCK.get())
                .add(BlockRegistry.SILVER_ORE.get())
                .add(BlockRegistry.TIN_BLOCK.get())
                .add(BlockRegistry.TIN_ORE.get());
        tag(Tags.Blocks.ORES)
                .add(BlockRegistry.ALUMINIUM_ORE.get())
                .add(BlockRegistry.COPPER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_COPPER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_LEAD_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_SILVER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_TIN_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get())
                .add(BlockRegistry.IRIDIUM_ORE.get())
                .add(BlockRegistry.LEAD_ORE.get())
                .add(BlockRegistry.NICKEL_ORE.get())
                .add(BlockRegistry.PLATINUM_ORE.get())
                .add(BlockRegistry.SILVER_ORE.get())
                .add(BlockRegistry.TIN_ORE.get())
                .add(BlockRegistry.URANIUM_ORE.get());
    }

    @Override
    public String getName()
    {
        return "Block Tags";
    }
}
