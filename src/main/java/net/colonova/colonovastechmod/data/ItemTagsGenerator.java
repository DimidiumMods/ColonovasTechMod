package net.colonova.colonovastechmod.data;

import net.colonova.colonovastechmod.handler.registry.ItemRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagsGenerator extends ItemTagsProvider
{
    public ItemTagsGenerator(DataGenerator generator, BlockTagsProvider provider, ExistingFileHelper helper)
    {
        super(generator, provider, Reference.MOD_ID, helper);
    }

    @Override
    protected void addTags()
    {
        tag(Tags.Items.ARMORS)
                .add(ItemRegistry.RADIATION_SUIT_HELMET.get())
                .add(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get())
                .add(ItemRegistry.RADIATION_SUIT_LEGGINGS.get())
                .add(ItemRegistry.RADIATION_SUIT_BOOTS.get());
        tag(Tags.Items.ARMORS_HELMETS)
                .add(ItemRegistry.RADIATION_SUIT_HELMET.get());
        tag(Tags.Items.ARMORS_CHESTPLATES)
                .add(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get());
        tag(Tags.Items.ARMORS_LEGGINGS)
                .add(ItemRegistry.RADIATION_SUIT_LEGGINGS.get());
        tag(Tags.Items.ARMORS_BOOTS)
                .add(ItemRegistry.RADIATION_SUIT_BOOTS.get());
        tag(Tags.Items.INGOTS)
                .add(ItemRegistry.ALUMINIUM_INGOT.get())
                .add(ItemRegistry.COPPER_INGOT.get())
                .add(ItemRegistry.IRIDIUM_INGOT.get())
                .add(ItemRegistry.LEAD_INGOT.get())
                .add(ItemRegistry.NICKEL_INGOT.get())
                .add(ItemRegistry.PLATINUM_INGOT.get())
                .add(ItemRegistry.SILVER_INGOT.get())
                .add(ItemRegistry.TIN_INGOT.get())
                .add(ItemRegistry.URANIUM_INGOT.get());
        tag(Tags.Items.NUGGETS)
                .add(ItemRegistry.ALUMINIUM_NUGGET.get())
                .add(ItemRegistry.COPPER_NUGGET.get())
                .add(ItemRegistry.IRIDIUM_NUGGET.get())
                .add(ItemRegistry.LEAD_NUGGET.get())
                .add(ItemRegistry.NICKEL_NUGGET.get())
                .add(ItemRegistry.PLATINUM_NUGGET.get())
                .add(ItemRegistry.SILVER_NUGGET.get())
                .add(ItemRegistry.TIN_NUGGET.get())
                .add(ItemRegistry.URANIUM_NUGGET.get());
        tag(Tags.Items.ORES)
                .add(ItemRegistry.ALUMINIUM_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_ALUMINIUM_ORE.get())
                .add(ItemRegistry.COPPER_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_COPPER_ORE.get())
                .add(ItemRegistry.IRIDIUM_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_IRIDIUM_ORE.get())
                .add(ItemRegistry.LEAD_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_LEAD_ORE.get())
                .add(ItemRegistry.NICKEL_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_NICKEL_ORE.get())
                .add(ItemRegistry.PLATINUM_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_PLATINUM_ORE.get())
                .add(ItemRegistry.SILVER_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_SILVER_ORE.get())
                .add(ItemRegistry.TIN_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_TIN_ORE.get())
                .add(ItemRegistry.URANIUM_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_URANIUM_ORE.get());
    }

    @Override
    public String getName()
    {
        return "Item Tags";
    }
}
