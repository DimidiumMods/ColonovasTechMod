package net.colonova.colonovastechmod.data;

import net.colonova.colonovastechmod.handler.registry.BlockRegistry;
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
        /* Blocks */

        withExistingParent(ItemRegistry.ALUMINIUM_BLOCK.getId().getPath(), modLoc("block/aluminium_block"));
        withExistingParent(ItemRegistry.COPPER_BLOCK.getId().getPath(), modLoc("block/copper_block"));
        withExistingParent(ItemRegistry.IRIDIUM_BLOCK.getId().getPath(), modLoc("block/iridium_block"));
        withExistingParent(ItemRegistry.LEAD_BLOCK.getId().getPath(), modLoc("block/lead_block"));
        withExistingParent(ItemRegistry.NICKEL_BLOCK.getId().getPath(), modLoc("block/nickel_block"));
        withExistingParent(ItemRegistry.PLATINUM_BLOCK.getId().getPath(), modLoc("block/platinum_block"));
        withExistingParent(ItemRegistry.SILVER_BLOCK.getId().getPath(), modLoc("block/silver_block"));
        withExistingParent(ItemRegistry.TIN_BLOCK.getId().getPath(), modLoc("block/tin_block"));
        withExistingParent(ItemRegistry.URANIUM_BLOCK.getId().getPath(), modLoc("block/uranium_block"));

        /* Ores */

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

        /* Machines */

        withExistingParent(ItemRegistry.BASIC_MACHINE_FRAME.getId().getPath(), modLoc("block/basic_machine_frame"));
        withExistingParent(ItemRegistry.INTERMEDIATE_MACHINE_FRAME.getId().getPath(), modLoc("block/intermediate_machine_frame"));
        withExistingParent(ItemRegistry.ADVANCED_MACHINE_FRAME.getId().getPath(), modLoc("block/advanced_machine_frame"));
        withExistingParent(ItemRegistry.ULTIMATE_MACHINE_FRAME.getId().getPath(), modLoc("block/ultimate_machine_frame"));

        withExistingParent(ItemRegistry.HEALER.getId().getPath(), modLoc("block/basic_machine_frame"));

        /* Items */

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
        singleTexture(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_helmet"));
        singleTexture(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_chestplate"));
        singleTexture(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_leggings"));
        singleTexture(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_boots"));

        singleTexture(ItemRegistry.LIQUID_EXPERIENCE_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/liquid_experience_bucket"));

        singleTexture(ItemRegistry.BASIC_ENERGY_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_ENERGY_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_ENERGY_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_ENERGY_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_FILTER_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_FILTER_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_FILTER_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_FILTER_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_FLUID_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_FLUID_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_FLUID_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_FLUID_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_GAS_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_GAS_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_GAS_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_GAS_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_ITEM_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_ITEM_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_ITEM_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_ITEM_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_VOID_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_VOID_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_VOID_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_VOID_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.PORTAL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.PORTAL_CONTROLLER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.PORTAL_FRAME.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.PORTAL_INTERFACE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.PORTAL_STABILIZER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.PORTAL_PROGRAMMER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ANGEL_BLOCK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.AUTOMATIC_ANVIL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_BOTTLER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_BOTTLER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_BOTTLER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_BOTTLER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BREAKER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_ENERGY_BUFFER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_ENERGY_BUFFER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_ENERGY_BUFFER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_ENERGY_BUFFER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_FLUID_BUFFER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_FLUID_BUFFER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_FLUID_BUFFER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_FLUID_BUFFER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_BUILDER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_BUILDER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_BUILDER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_BUILDER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ITEM_CANNON.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_CHARGER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_CHARGER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_CHARGER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_CHARGER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.CLOCK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_CRAFTER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_CRAFTER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_CRAFTER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_CRAFTER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_CRATE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_CRATE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_CRATE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_CRATE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.DRAIN.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.DROPPER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_DRUM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_DRUM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_DRUM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_DRUM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.MAGIC_EGG.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ELEVATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ENCHANTER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_ENDER_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_ENDER_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_ENDER_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_ENDER_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.FLAG.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_ENERGY_STORAGE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_ENERGY_STORAGE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_ENERGY_STORAGE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_ENERGY_STORAGE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_FURNACE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_FURNACE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_FURNACE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_FURNACE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.MOB_GLASS.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.GRINDER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_INFUSER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_INFUSER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_INFUSER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_INFUSER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_LAVA_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_LAVA_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_LAVA_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_LAVA_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.MELTER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_NETHER_STAR_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_NETHER_STAR_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_NETHER_STAR_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_NETHER_STAR_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.PAINT_CAN.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.PAINTER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.PLACER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.POWER_MONITOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_PROJECTOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_PROJECTOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_PROJECTOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_PROJECTOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.QUARRY.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.QUARRY_SPEED_UPGRADE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.QUARRY_SILK_UPGRADE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.QUARRY_FORTUNE_UPGRADE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.QUARRY_VOID_UPGRADE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.SHOWER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_SOLAR_PANEL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_SOLAR_PANEL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_SOLAR_PANEL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_SOLAR_PANEL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.SOUND_MUFFLER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.SPAWNER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_SPIKES.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_SPIKES.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_SPIKES.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_SPIKES.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_STEAM_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_STEAM_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_STEAM_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_STEAM_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_STIRLING_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_STIRLING_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_STIRLING_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_STIRLING_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.TANK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.TIME_CONTROLLER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.WEATHER_CONTROLLER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.TRANSCEIVER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.UNCRAFTER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.VACuUM_HOPPER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.VILLAGE_LOCATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.VOID_PORTAL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_WATER_WHEEL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_WATER_WHEEL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_WATER_WHEEL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_WATER_WHEEL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.WEATHER_MUFFLER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_WINDMILL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_WINDMILL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_WINDMILL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_WINDMILL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.WIRELESS_CHARGER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.WITHER_BUILDER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.WITHER_GLASS.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.WITHER_STONE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_FLUID_TANK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_FLUID_TANK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_FLUID_TANK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_FLUID_TANK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_GAS_TANK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_GAS_TANK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_GAS_TANK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_GAS_TANK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.PUMP.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.REPAIRER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.BASIC_TNT_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.INTERMEDIATE_TNT_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ADVANCED_TNT_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.ULTIMATE_TNT_GENERATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
        singleTexture(ItemRegistry.TRADER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/uranium_block"));
    }
}
