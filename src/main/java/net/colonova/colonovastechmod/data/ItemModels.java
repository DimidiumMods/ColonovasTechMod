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

        singleTexture(ItemRegistry.ALUMINIUM_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_gear"));
        singleTexture(ItemRegistry.COPPER_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_gear"));
        singleTexture(ItemRegistry.IRIDIUM_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iridium_gear"));
        singleTexture(ItemRegistry.LEAD_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/lead_gear"));
        singleTexture(ItemRegistry.NICKEL_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/nickel_gear"));
        singleTexture(ItemRegistry.PLATINUM_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/platinum_gear"));
        singleTexture(ItemRegistry.SILVER_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/silver_gear"));
        singleTexture(ItemRegistry.TIN_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/tin_gear"));
        singleTexture(ItemRegistry.URANIUM_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/uranium_gear"));
        singleTexture(ItemRegistry.ALUMINIUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_ingot"));
        singleTexture(ItemRegistry.COPPER_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_ingot"));
        singleTexture(ItemRegistry.IRIDIUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iridium_ingot"));
        singleTexture(ItemRegistry.LEAD_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/lead_ingot"));
        singleTexture(ItemRegistry.NICKEL_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/nickel_ingot"));
        singleTexture(ItemRegistry.PLATINUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/platinum_ingot"));
        singleTexture(ItemRegistry.SILVER_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/silver_ingot"));
        singleTexture(ItemRegistry.TIN_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/tin_ingot"));
        singleTexture(ItemRegistry.URANIUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/uranium_ingot"));
        singleTexture(ItemRegistry.ALUMINIUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_nugget"));
        singleTexture(ItemRegistry.COPPER_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_nugget"));
        singleTexture(ItemRegistry.IRIDIUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iridium_nugget"));
        singleTexture(ItemRegistry.LEAD_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/lead_nugget"));
        singleTexture(ItemRegistry.NICKEL_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/nickel_nugget"));
        singleTexture(ItemRegistry.PLATINUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/platinum_nugget"));
        singleTexture(ItemRegistry.SILVER_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/silver_nugget"));
        singleTexture(ItemRegistry.TIN_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/tin_nugget"));
        singleTexture(ItemRegistry.URANIUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/uranium_nugget"));

        singleTexture(ItemRegistry.RADIATION_SUIT_HELMET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_helmet"));
        singleTexture(ItemRegistry.RADIATION_SUIT_CHESTPLATE.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_chestplate"));
        singleTexture(ItemRegistry.RADIATION_SUIT_LEGGINGS.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_leggings"));
        singleTexture(ItemRegistry.RADIATION_SUIT_BOOTS.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_boots"));

        singleTexture(ItemRegistry.MOLTEN_ALUMINIUM_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_COPPER_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_IRIDIUM_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_LEAD_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_NICKEL_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_PLATINUM_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_SILVER_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_TIN_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_URANIUM_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/water_bucket"));
    }
}
