package net.colonova.colonovastechmod.data;

import net.colonova.colonovastechmod.handler.registry.ItemRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider
{
    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        withExistingParent(ItemRegistry.ALUMINIUM_BLOCK.getId().getPath(), modLoc("block/aluminium_block"));
        withExistingParent(ItemRegistry.COPPER_BLOCK.getId().getPath(), modLoc("block/copper_block"));
        withExistingParent(ItemRegistry.IRIDIUM_BLOCK.getId().getPath(), modLoc("block/iridium_block"));
        withExistingParent(ItemRegistry.LEAD_BLOCK.getId().getPath(), modLoc("block/lead_block"));
        withExistingParent(ItemRegistry.NICKEL_BLOCK.getId().getPath(), modLoc("block/nickel_block"));
        withExistingParent(ItemRegistry.PLATINUM_BLOCK.getId().getPath(), modLoc("block/platinum_block"));
        withExistingParent(ItemRegistry.SILVER_BLOCK.getId().getPath(), modLoc("block/silver_block"));
        withExistingParent(ItemRegistry.TIN_BLOCK.getId().getPath(), modLoc("block/tin_block"));
        withExistingParent(ItemRegistry.URANIUM_BLOCK.getId().getPath(), modLoc("block/uranium_block"));
        withExistingParent(ItemRegistry.ALUMINIUM_ORE.getId().getPath(), modLoc("block/aluminium_ore"));
        withExistingParent(ItemRegistry.COPPER_ORE.getId().getPath(), modLoc("block/copper_ore"));
        withExistingParent(ItemRegistry.IRIDIUM_ORE.getId().getPath(), modLoc("block/iridium_ore"));
        withExistingParent(ItemRegistry.LEAD_ORE.getId().getPath(), modLoc("block/lead_ore"));
        withExistingParent(ItemRegistry.NICKEL_ORE.getId().getPath(), modLoc("block/nickel_ore"));
        withExistingParent(ItemRegistry.PLATINUM_ORE.getId().getPath(), modLoc("block/platinum_ore"));
        withExistingParent(ItemRegistry.SILVER_ORE.getId().getPath(), modLoc("block/silver_ore"));
        withExistingParent(ItemRegistry.TIN_ORE.getId().getPath(), modLoc("block/tin_ore"));
        withExistingParent(ItemRegistry.URANIUM_ORE.getId().getPath(), modLoc("block/uranium_ore"));
        withExistingParent(ItemRegistry.DEEP_SLATE_ALUMINIUM_ORE.getId().getPath(), modLoc("block/deepslate_aluminium_ore"));
        withExistingParent(ItemRegistry.DEEP_SLATE_COPPER_ORE.getId().getPath(), modLoc("block/deepslate_aluminium_ore"));
        withExistingParent(ItemRegistry.DEEP_SLATE_IRIDIUM_ORE.getId().getPath(), modLoc("block/deepslate_aluminium_ore"));
        withExistingParent(ItemRegistry.DEEP_SLATE_LEAD_ORE.getId().getPath(), modLoc("block/deepslate_aluminium_ore"));
        withExistingParent(ItemRegistry.DEEP_SLATE_NICKEL_ORE.getId().getPath(), modLoc("block/deepslate_aluminium_ore"));
        withExistingParent(ItemRegistry.DEEP_SLATE_PLATINUM_ORE.getId().getPath(), modLoc("block/deepslate_aluminium_ore"));
        withExistingParent(ItemRegistry.DEEP_SLATE_SILVER_ORE.getId().getPath(), modLoc("block/deepslate_aluminium_ore"));
        withExistingParent(ItemRegistry.DEEP_SLATE_TIN_ORE.getId().getPath(), modLoc("block/deepslate_aluminium_ore"));
        withExistingParent(ItemRegistry.DEEP_SLATE_URANIUM_ORE.getId().getPath(), modLoc("block/deepslate_aluminium_ore"));
    }
}
