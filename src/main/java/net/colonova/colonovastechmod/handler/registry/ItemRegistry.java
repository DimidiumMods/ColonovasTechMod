package net.colonova.colonovastechmod.handler.registry;


import net.colonova.colonovascore.api.item.ItemBase;
import net.colonova.colonovastechmod.block.machine.*;
import net.colonova.colonovastechmod.handler.EnumHandler;
import net.colonova.colonovastechmod.item.*;
import net.colonova.colonovastechmod.item.block.*;
import net.colonova.colonovastechmod.item.armor.*;
import net.colonova.colonovastechmod.item.gear.*;
import net.colonova.colonovastechmod.item.ingot.*;
import net.colonova.colonovastechmod.item.nugget.*;
import net.colonova.colonovastechmod.item.ring.ItemRing;
import net.colonova.colonovastechmod.util.CableType;
import net.colonova.colonovastechmod.util.MachineType;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    /* Ores */

    public static final RegistryObject<Item> ALUMINIUM_ORE = ITEMS.register("aluminium_ore", () -> new BlockItem(BlockRegistry.ALUMINIUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> COPPER_ORE = ITEMS.register("copper_ore", () -> new BlockItem(BlockRegistry.COPPER_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> IRIDIUM_ORE = ITEMS.register("iridium_ore", () -> new BlockItem(BlockRegistry.IRIDIUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> LEAD_ORE = ITEMS.register("lead_ore", () -> new BlockItem(BlockRegistry.LEAD_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> NICKEL_ORE = ITEMS.register("nickel_ore", () -> new BlockItem(BlockRegistry.NICKEL_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> PLATINUM_ORE = ITEMS.register("platinum_ore", () -> new BlockItem(BlockRegistry.PLATINUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(BlockRegistry.SILVER_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem(BlockRegistry.TIN_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> URANIUM_ORE = ITEMS.register("uranium_ore", BlockItemUranium::new);
    public static final RegistryObject<Item> DEEP_SLATE_ALUMINIUM_ORE = ITEMS.register("deepslate_aluminium_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_COPPER_ORE = ITEMS.register("deepslate_copper_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_COPPER_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_IRIDIUM_ORE = ITEMS.register("deepslate_iridium_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_LEAD_ORE = ITEMS.register("deepslate_lead_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_LEAD_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_NICKEL_ORE = ITEMS.register("deepslate_nickel_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_PLATINUM_ORE = ITEMS.register("deepslate_platinum_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_SILVER_ORE = ITEMS.register("deepslate_silver_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_SILVER_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_TIN_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_URANIUM_ORE = ITEMS.register("deepslate_uranium_ore", BlockItemUranium::new);

    /* Blocks */

    public static final RegistryObject<Item> ALUMINIUM_BLOCK = ITEMS.register("aluminium_block", () -> new BlockItem(BlockRegistry.ALUMINIUM_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> COPPER_BLOCK = ITEMS.register("copper_block", () -> new BlockItem(BlockRegistry.COPPER_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> IRIDIUM_BLOCK = ITEMS.register("iridium_block", () -> new BlockItem(BlockRegistry.IRIDIUM_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> LEAD_BLOCK = ITEMS.register("lead_block", () -> new BlockItem(BlockRegistry.LEAD_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> NICKEL_BLOCK = ITEMS.register("nickel_block", () -> new BlockItem(BlockRegistry.NICKEL_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> PLATINUM_BLOCK = ITEMS.register("platinum_block", () -> new BlockItem(BlockRegistry.PLATINUM_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(BlockRegistry.SILVER_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(BlockRegistry.TIN_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> URANIUM_BLOCK = ITEMS.register("uranium_block", BlockItemUranium::new);

    /* Machines */

    public static final RegistryObject<Item> BASIC_MACHINE_FRAME = ITEMS.register("basic_machine_frame", () -> new BlockItem(BlockRegistry.BASIC_MACHINE_FRAME.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> INTERMEDIATE_MACHINE_FRAME = ITEMS.register("intermediate_machine_frame", () -> new BlockItem(BlockRegistry.INTERMEDIATE_MACHINE_FRAME.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> ADVANCED_MACHINE_FRAME = ITEMS.register("advanced_machine_frame", () -> new BlockItem(BlockRegistry.ADVANCED_MACHINE_FRAME.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> ULTIMATE_MACHINE_FRAME = ITEMS.register("ultimate_machine_frame", () -> new BlockItem(BlockRegistry.ULTIMATE_MACHINE_FRAME.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> HEALER = ITEMS.register("healer", () -> new BlockItem(BlockRegistry.HEALER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));

    public static final RegistryObject<Item> BASIC_ENERGY_CABLE = ITEMS.register("basic_energy_cable", () -> new BlockItem(BlockRegistry.BASIC_ENERGY_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> INTERMEDIATE_ENERGY_CABLE = ITEMS.register("intermediate_energy_cable", () -> new BlockItem(BlockRegistry.INTERMEDIATE_ENERGY_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ADVANCED_ENERGY_CABLE = ITEMS.register("advanced_energy_cable", () -> new BlockItem(BlockRegistry.ADVANCED_ENERGY_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ULTIMATE_ENERGY_CABLE = ITEMS.register("ultimate_energy_cable", () -> new BlockItem(BlockRegistry.ULTIMATE_ENERGY_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));

    public static final RegistryObject<Item> BASIC_FILTER_CABLE = ITEMS.register("basic_filter_cable", () -> new BlockItem(BlockRegistry.BASIC_FILTER_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> INTERMEDIATE_FILTER_CABLE = ITEMS.register("intermediate_filter_cable", () -> new BlockItem(BlockRegistry.INTERMEDIATE_FILTER_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ADVANCED_FILTER_CABLE = ITEMS.register("advanced_filter_cable", () -> new BlockItem(BlockRegistry.ADVANCED_FILTER_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ULTIMATE_FILTER_CABLE = ITEMS.register("ultimate_filter_cable", () -> new BlockItem(BlockRegistry.ULTIMATE_FILTER_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));

    public static final RegistryObject<Item> BASIC_FLUID_CABLE = ITEMS.register("basic_fluid_cable", () -> new BlockItem(BlockRegistry.BASIC_FLUID_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> INTERMEDIATE_FLUID_CABLE = ITEMS.register("intermediate_fluid_cable", () -> new BlockItem(BlockRegistry.INTERMEDIATE_FLUID_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ADVANCED_FLUID_CABLE = ITEMS.register("advanced_fluid_cable", () -> new BlockItem(BlockRegistry.ADVANCED_FLUID_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ULTIMATE_FLUID_CABLE = ITEMS.register("ultimate_fluid_cable", () -> new BlockItem(BlockRegistry.ULTIMATE_FLUID_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));

    public static final RegistryObject<Item> BASIC_GAS_CABLE = ITEMS.register("basic_gas_cable", () -> new BlockItem(BlockRegistry.BASIC_GAS_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> INTERMEDIATE_GAS_CABLE = ITEMS.register("intermediate_gas_cable", () -> new BlockItem(BlockRegistry.INTERMEDIATE_GAS_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ADVANCED_GAS_CABLE = ITEMS.register("advanced_gas_cable", () -> new BlockItem(BlockRegistry.ADVANCED_GAS_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ULTIMATE_GAS_CABLE = ITEMS.register("ultimate_gas_cable", () -> new BlockItem(BlockRegistry.ULTIMATE_GAS_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> BASIC_ITEM_CABLE = ITEMS.register("basic_item_cable", () -> new BlockItem(BlockRegistry.BASIC_ITEM_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> INTERMEDIATE_ITEM_CABLE = ITEMS.register("intermediate_item_cable", () -> new BlockItem(BlockRegistry.INTERMEDIATE_ITEM_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ADVANCED_ITEM_CABLE = ITEMS.register("advanced_item_cable", () -> new BlockItem(BlockRegistry.ADVANCED_ITEM_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ULTIMATE_ITEM_CABLE = ITEMS.register("ultimate_item_cable", () -> new BlockItem(BlockRegistry.ULTIMATE_ITEM_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> BASIC_VOID_CABLE = ITEMS.register("basic_void_cable", () -> new BlockItem(BlockRegistry.BASIC_VOID_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> INTERMEDIATE_VOID_CABLE = ITEMS.register("intermediate_void_cable", () -> new BlockItem(BlockRegistry.INTERMEDIATE_VOID_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ADVANCED_VOID_CABLE = ITEMS.register("advanced_void_cable", () -> new BlockItem(BlockRegistry.ADVANCED_VOID_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ULTIMATE_VOID_CABLE = ITEMS.register("ultimate_void_cable", () -> new BlockItem(BlockRegistry.ULTIMATE_VOID_CABLE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> PORTAL = ITEMS.register("portal", () -> new BlockItem(BlockRegistry.PORTAL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> PORTAL_CONTROLLER = ITEMS.register("portal_controller", () -> new BlockItem(BlockRegistry.PORTAL_CONTROLLER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> PORTAL_FRAME = ITEMS.register("portal_frame", () -> new BlockItem(BlockRegistry.PORTAL_FRAME.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> PORTAL_INTERFACE = ITEMS.register("portal_interface", () -> new BlockItem(BlockRegistry.PORTAL_INTERFACE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> PORTAL_STABILIZER = ITEMS.register("portal_stabilizer", () -> new BlockItem(BlockRegistry.PORTAL_STABILIZER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> PORTAL_PROGRAMMER = ITEMS.register("portal_programmer", () -> new BlockItem(BlockRegistry.PORTAL_PROGRAMMER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ANGEL_BLOCK = ITEMS.register("angel_block", () -> new BlockItem(BlockRegistry.ANGEL_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> AUTOMATIC_ANVIL = ITEMS.register("automatic_anvil", () -> new BlockItem(BlockRegistry.AUTOMATIC_ANVIL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));

    public static final RegistryObject<Item> BASIC_BOTTLER = ITEMS.register("basic_bottler", () -> new BlockItem(BlockRegistry.BASIC_BOTTLER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_BOTTLER = ITEMS.register("intermediate_bottler", () -> new BlockItem(BlockRegistry.INTERMEDIATE_BOTTLER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_BOTTLER = ITEMS.register("advanced_bottler", () -> new BlockItem(BlockRegistry.ADVANCED_BOTTLER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_BOTTLER = ITEMS.register("ultimate_bottler", () -> new BlockItem(BlockRegistry.ULTIMATE_BOTTLER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BREAKER = ITEMS.register("breaker", () -> new BlockItem(BlockRegistry.BREAKER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_ENERGY_BUFFER = ITEMS.register("basic_energy_buffer", () -> new BlockItem(BlockRegistry.BASIC_ENERGY_BUFFER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_ENERGY_BUFFER = ITEMS.register("intermediate_energy_buffer", () -> new BlockItem(BlockRegistry.INTERMEDIATE_ENERGY_BUFFER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_ENERGY_BUFFER = ITEMS.register("advanced_energy_buffer", () -> new BlockItem(BlockRegistry.ADVANCED_ENERGY_BUFFER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_ENERGY_BUFFER = ITEMS.register("ultimate_energy_buffer", () -> new BlockItem(BlockRegistry.ULTIMATE_ENERGY_BUFFER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_FLUID_BUFFER = ITEMS.register("basic_fluid_buffer", () -> new BlockItem(BlockRegistry.BASIC_FLUID_BUFFER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_FLUID_BUFFER = ITEMS.register("intermediate_fluid_buffer", () -> new BlockItem(BlockRegistry.INTERMEDIATE_FLUID_BUFFER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_FLUID_BUFFER = ITEMS.register("advanced_fluid_buffer", () -> new BlockItem(BlockRegistry.ADVANCED_FLUID_BUFFER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_FLUID_BUFFER = ITEMS.register("ultimate_fluid_buffer", () -> new BlockItem(BlockRegistry.ULTIMATE_FLUID_BUFFER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_BUILDER = ITEMS.register("basic_builder", () -> new BlockItem(BlockRegistry.BASIC_BUILDER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_BUILDER = ITEMS.register("intermediate_builder", () -> new BlockItem(BlockRegistry.INTERMEDIATE_BUILDER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_BUILDER = ITEMS.register("advanced_builder", () -> new BlockItem(BlockRegistry.ADVANCED_BUILDER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_BUILDER = ITEMS.register("ultimate_builder", () -> new BlockItem(BlockRegistry.ULTIMATE_BUILDER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ITEM_CANNON = ITEMS.register("item_cannon", () -> new BlockItem(BlockRegistry.ITEM_CANNON.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_CHARGER = ITEMS.register("basic_charger", () -> new BlockItem(BlockRegistry.BASIC_CHARGER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_CHARGER = ITEMS.register("intermediate_charger", () -> new BlockItem(BlockRegistry.INTERMEDIATE_CHARGER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_CHARGER = ITEMS.register("advanced_charger", () -> new BlockItem(BlockRegistry.ADVANCED_CHARGER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_CHARGER = ITEMS.register("ultimate_charger", () -> new BlockItem(BlockRegistry.ULTIMATE_CHARGER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> CLOCK = ITEMS.register("clock", () -> new BlockItem(BlockRegistry.CLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_CRAFTER = ITEMS.register("basic_crafter", () -> new BlockItem(BlockRegistry.BASIC_CRAFTER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_CRAFTER = ITEMS.register("intermediate_crafter", () -> new BlockItem(BlockRegistry.INTERMEDIATE_CRAFTER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_CRAFTER = ITEMS.register("advanced_crafter", () -> new BlockItem(BlockRegistry.ADVANCED_CRAFTER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_CRAFTER = ITEMS.register("ultimate_crafter", () -> new BlockItem(BlockRegistry.ULTIMATE_CRAFTER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_CRATE = ITEMS.register("basic_crate", () -> new BlockItem(BlockRegistry.BASIC_CRATE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_CRATE = ITEMS.register("intermediate_crate", () -> new BlockItem(BlockRegistry.INTERMEDIATE_CRATE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_CRATE = ITEMS.register("advanced_crate", () -> new BlockItem(BlockRegistry.ADVANCED_CRATE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_CRATE = ITEMS.register("ultimate_crate", () -> new BlockItem(BlockRegistry.ULTIMATE_CRATE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> DRAIN = ITEMS.register("drain", () -> new BlockItem(BlockRegistry.DRAIN.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> DROPPER = ITEMS.register("dropper", () -> new BlockItem(BlockRegistry.DROPPER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_DRUM = ITEMS.register("basic_drum", () -> new BlockItem(BlockRegistry.BASIC_DRUM.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_DRUM = ITEMS.register("intermediate_drum", () -> new BlockItem(BlockRegistry.INTERMEDIATE_DRUM.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_DRUM = ITEMS.register("advanced_drum", () -> new BlockItem(BlockRegistry.ADVANCED_DRUM.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_DRUM = ITEMS.register("ultimate_drum", () -> new BlockItem(BlockRegistry.ULTIMATE_DRUM.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> MAGIC_EGG = ITEMS.register("magic_egg", () -> new BlockItem(BlockRegistry.MAGIC_EGG.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ELEVATOR = ITEMS.register("elevator", () -> new BlockItem(BlockRegistry.ELEVATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ENCHANTER = ITEMS.register("enchanter", () -> new BlockItem(BlockRegistry.ENCHANTER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_ENDER_GENERATOR = ITEMS.register("basic_ender_generator", () -> new BlockItem(BlockRegistry.BASIC_ENDER_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_ENDER_GENERATOR = ITEMS.register("intermediate_ender_generator", () -> new BlockItem(BlockRegistry.INTERMEDIATE_ENDER_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_ENDER_GENERATOR = ITEMS.register("advanced_ender_generator", () -> new BlockItem(BlockRegistry.ADVANCED_ENDER_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_ENDER_GENERATOR = ITEMS.register("ultimate_ender_generator", () -> new BlockItem(BlockRegistry.ULTIMATE_ENDER_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));

    public static final RegistryObject<Item> FLAG = ITEMS.register("flag", () -> new BlockItem(BlockRegistry.FLAG.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_ENERGY_STORAGE = ITEMS.register("basic_energy_storage", () -> new BlockItem(BlockRegistry.BASIC_ENERGY_STORAGE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_ENERGY_STORAGE = ITEMS.register("intermediate_energy_storage", () -> new BlockItem(BlockRegistry.INTERMEDIATE_ENERGY_STORAGE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_ENERGY_STORAGE = ITEMS.register("advanced_energy_storage", () -> new BlockItem(BlockRegistry.ADVANCED_ENERGY_STORAGE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_ENERGY_STORAGE = ITEMS.register("ultimate_energy_storage", () -> new BlockItem(BlockRegistry.ULTIMATE_ENERGY_STORAGE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_FURNACE = ITEMS.register("basic_furnace", () -> new BlockItem(BlockRegistry.BASIC_FURNACE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_FURNACE = ITEMS.register("intermediate_furnace", () -> new BlockItem(BlockRegistry.INTERMEDIATE_FURNACE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_FURNACE = ITEMS.register("advanced_furnace", () -> new BlockItem(BlockRegistry.ADVANCED_FURNACE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_FURNACE = ITEMS.register("ultimate_furnace", () -> new BlockItem(BlockRegistry.ULTIMATE_FURNACE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> MOB_GLASS = ITEMS.register("mob_glass", () -> new BlockItem(BlockRegistry.MOB_GLASS.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> GRINDER = ITEMS.register("grinder", () -> new BlockItem(BlockRegistry.GRINDER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_INFUSER = ITEMS.register("basic_infuser", () -> new BlockItem(BlockRegistry.BASIC_INFUSER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_INFUSER = ITEMS.register("intermediate_infuser", () -> new BlockItem(BlockRegistry.INTERMEDIATE_INFUSER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_INFUSER = ITEMS.register("advanced_infuser", () -> new BlockItem(BlockRegistry.ADVANCED_INFUSER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_INFUSER = ITEMS.register("ultimate_infuser", () -> new BlockItem(BlockRegistry.ULTIMATE_INFUSER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_LAVA_GENERATOR = ITEMS.register("basic_lava_generator", () -> new BlockItem(BlockRegistry.BASIC_LAVA_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_LAVA_GENERATOR = ITEMS.register("intermediate_lava_generator", () -> new BlockItem(BlockRegistry.INTERMEDIATE_LAVA_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_LAVA_GENERATOR = ITEMS.register("advanced_lava_generator", () -> new BlockItem(BlockRegistry.ADVANCED_LAVA_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_LAVA_GENERATOR = ITEMS.register("ultimate_lava_generator", () -> new BlockItem(BlockRegistry.ULTIMATE_LAVA_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> MELTER = ITEMS.register("melter", () -> new BlockItem(BlockRegistry.MELTER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_NETHER_STAR_GENERATOR = ITEMS.register("basic_nether_star_generator", () -> new BlockItem(   BlockRegistry.BASIC_NETHER_STAR_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_NETHER_STAR_GENERATOR = ITEMS.register("intermediate_nether_star_generator", () -> new BlockItem(BlockRegistry.INTERMEDIATE_NETHER_STAR_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_NETHER_STAR_GENERATOR = ITEMS.register("advanced_nether_star_generator", () -> new BlockItem(BlockRegistry.ADVANCED_NETHER_STAR_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_NETHER_STAR_GENERATOR = ITEMS.register("ultimate_nether_star_generator", () -> new BlockItem(BlockRegistry.ULTIMATE_NETHER_STAR_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> PAINT_CAN = ITEMS.register("paint_can", () -> new BlockItem(BlockRegistry.PAINT_CAN.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> PAINTER = ITEMS.register("painter", () -> new BlockItem(BlockRegistry.PAINTER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> PLACER = ITEMS.register("placer", () -> new BlockItem(BlockRegistry.PLACER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> POWER_MONITOR = ITEMS.register("power_monitor", () -> new BlockItem(BlockRegistry.POWER_MONITOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_PROJECTOR = ITEMS.register("basic_projector", () -> new BlockItem(BlockRegistry.BASIC_PROJECTOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_PROJECTOR = ITEMS.register("intermediate_projector", () -> new BlockItem(BlockRegistry.INTERMEDIATE_PROJECTOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_PROJECTOR = ITEMS.register("advanced_projector", () -> new BlockItem(BlockRegistry.ADVANCED_PROJECTOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_PROJECTOR = ITEMS.register("ultimate_projector", () -> new BlockItem(BlockRegistry.ULTIMATE_PROJECTOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> QUARRY = ITEMS.register("quarry", () -> new BlockItem(BlockRegistry.QUARRY.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> QUARRY_SPEED_UPGRADE = ITEMS.register("quarry_speed_upgrade", () -> new BlockItem(BlockRegistry.QUARRY_SPEED_UPGRADE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> QUARRY_SILK_UPGRADE = ITEMS.register("quarry_silk_upgrade", () -> new BlockItem(BlockRegistry.QUARRY_SILK_UPGRADE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> QUARRY_FORTUNE_UPGRADE = ITEMS.register("quarry_fortune_upgrade", () -> new BlockItem(BlockRegistry.QUARRY_FORTUNE_UPGRADE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> QUARRY_VOID_UPGRADE = ITEMS.register("quarry_void_upgrade", () -> new BlockItem(BlockRegistry.QUARRY_VOID_UPGRADE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> SHOWER = ITEMS.register("shower", () -> new BlockItem(BlockRegistry.SHOWER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_SOLAR_PANEL = ITEMS.register("basic_solar_panel", () -> new BlockItem(BlockRegistry.BASIC_SOLAR_PANEL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_SOLAR_PANEL = ITEMS.register("intermediate_solar_panel", () -> new BlockItem(BlockRegistry.INTERMEDIATE_SOLAR_PANEL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_SOLAR_PANEL = ITEMS.register("advanced_solar_panel", () -> new BlockItem(BlockRegistry.ADVANCED_SOLAR_PANEL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_SOLAR_PANEL = ITEMS.register("ultimate_solar_panel", () -> new BlockItem(BlockRegistry.ULTIMATE_SOLAR_PANEL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> SOUND_MUFFLER = ITEMS.register("sound_muffler", () -> new BlockItem(BlockRegistry.SOUND_MUFFLER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> SPAWNER = ITEMS.register("spawner", () -> new BlockItem(BlockRegistry.SPAWNER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_SPIKES = ITEMS.register("basic_spikes", () -> new BlockItem(BlockRegistry.BASIC_SPIKES.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_SPIKES = ITEMS.register("intermediate_spikes", () -> new BlockItem(BlockRegistry.INTERMEDIATE_SPIKES.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_SPIKES = ITEMS.register("advanced_spikes", () -> new BlockItem(BlockRegistry.ADVANCED_SPIKES.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_SPIKES = ITEMS.register("ultimate_spikes", () -> new BlockItem(BlockRegistry.ULTIMATE_SPIKES.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_STEAM_GENERATOR = ITEMS.register("basic_steam_generator", () -> new BlockItem(BlockRegistry.BASIC_STEAM_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_STEAM_GENERATOR = ITEMS.register("intermediate_steam_generator", () -> new BlockItem(BlockRegistry.INTERMEDIATE_STEAM_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_STEAM_GENERATOR = ITEMS.register("advanced_steam_generator", () -> new BlockItem(BlockRegistry.ADVANCED_STEAM_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_STEAM_GENERATOR = ITEMS.register("ultimate_steam_generator", () -> new BlockItem(BlockRegistry.ULTIMATE_STEAM_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_STIRLING_GENERATOR = ITEMS.register("basic_stirling_generator", () -> new BlockItem(BlockRegistry.BASIC_STIRLING_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_STIRLING_GENERATOR = ITEMS.register("intermediate_stirling_generator", () -> new BlockItem(BlockRegistry.INTERMEDIATE_STIRLING_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_STIRLING_GENERATOR = ITEMS.register("advanced_stirling_generator", () -> new BlockItem(BlockRegistry.ADVANCED_STIRLING_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_STIRLING_GENERATOR = ITEMS.register("ultimate_stirling_generator", () -> new BlockItem(BlockRegistry.ULTIMATE_STIRLING_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));

    //TODDO Block item tank
    public static final RegistryObject<Item> TANK = ITEMS.register("tank", () -> new BlockItemTank(BlockRegistry.TANK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> TIME_CONTROLLER = ITEMS.register("time_controller", () -> new BlockItem(BlockRegistry.TIME_CONTROLLER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> WEATHER_CONTROLLER = ITEMS.register("weather_controller", () -> new BlockItem(BlockRegistry.WEATHER_CONTROLLER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> TRANSCEIVER = ITEMS.register("transceiver", () -> new BlockItem(BlockRegistry.TRANSCEIVER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> UNCRAFTER = ITEMS.register("uncrafter", () -> new BlockItem(BlockRegistry.UNCRAFTER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> VACuUM_HOPPER = ITEMS.register("vacuum_hopper", () -> new BlockItem(BlockRegistry.VACUUM_HOPPER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> VILLAGE_LOCATOR = ITEMS.register("village_locator", () -> new BlockItem(BlockRegistry.VILLAGE_LOCATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> VOID_PORTAL = ITEMS.register("void_portal", () -> new BlockItem(BlockRegistry.VOID_PORTAL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_WATER_WHEEL = ITEMS.register("basic_water_wheel", () -> new BlockItem(BlockRegistry.BASIC_WATER_WHEEL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_WATER_WHEEL = ITEMS.register("intermediate_water_wheel", () -> new BlockItem(BlockRegistry.INTERMEDIATE_WATER_WHEEL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_WATER_WHEEL = ITEMS.register("advanced_water_wheel", () -> new BlockItem(BlockRegistry.ADVANCED_WATER_WHEEL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_WATER_WHEEL = ITEMS.register("ultimate_water_wheel", () -> new BlockItem(BlockRegistry.ULTIMATE_WATER_WHEEL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> WEATHER_MUFFLER = ITEMS.register("weather_muffler", () -> new BlockItem(BlockRegistry.WEATHER_MUFFLER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> BASIC_WINDMILL = ITEMS.register("basic_windmill", () -> new BlockItem(BlockRegistry.BASIC_WINDMILL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> INTERMEDIATE_WINDMILL = ITEMS.register("intermediate_windmill", () -> new BlockItem(BlockRegistry.INTERMEDIATE_WINDMILL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ADVANCED_WINDMILL = ITEMS.register("advanced_windmill", () -> new BlockItem(BlockRegistry.ADVANCED_WINDMILL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> ULTIMATE_WINDMILL = ITEMS.register("ultimate_windmill", () -> new BlockItem(BlockRegistry.ULTIMATE_WINDMILL.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> WIRELESS_CHARGER = ITEMS.register("wireless_charger", () -> new BlockItem(BlockRegistry.WIRELESS_CHARGER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> WITHER_BUILDER = ITEMS.register("wither_builder", () -> new BlockItem(BlockRegistry.WITHER_BUILDER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> WITHER_GLASS = ITEMS.register("wither_glass", () -> new BlockItem(BlockRegistry.WITHER_GLASS.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));
    public static final RegistryObject<Item> WITHER_STONE = ITEMS.register("wither_stone", () -> new BlockItem(BlockRegistry.WITHER_STONE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(64)));

    //todo fluid tank class

    public static final RegistryObject<Item> BASIC_FLUID_TANK = ITEMS.register("basic_fluid_tank", () -> new BlockItem(BlockRegistry.BASIC_FLUID_TANK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> INTERMEDIATE_FLUID_TANK = ITEMS.register("intermediate_fluid_tank", () -> new BlockItem(BlockRegistry.INTERMEDIATE_FLUID_TANK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ADVANCED_FLUID_TANK = ITEMS.register("advanced_fluid_tank", () -> new BlockItem(BlockRegistry.ADVANCED_FLUID_TANK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ULTIMATE_FLUID_TANK = ITEMS.register("ultimate_fluid_tank", () -> new BlockItem(BlockRegistry.ULTIMATE_FLUID_TANK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> BASIC_GAS_TANK = ITEMS.register("basic_gas_tank", () -> new BlockItem(BlockRegistry.BASIC_GAS_TANK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> INTERMEDIATE_GAS_TANK = ITEMS.register("intermediate_gas_tank", () -> new BlockItem(BlockRegistry.INTERMEDIATE_GAS_TANK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ADVANCED_GAS_TANK = ITEMS.register("advanced_gas_tank", () -> new BlockItem(BlockRegistry.ADVANCED_GAS_TANK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ULTIMATE_GAS_TANK = ITEMS.register("ultimate_gas_tank", () -> new BlockItem(BlockRegistry.ULTIMATE_GAS_TANK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> PUMP = ITEMS.register("pump", () -> new BlockItem(BlockRegistry.PUMP.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> REPAIRER = ITEMS.register("repairer", () -> new BlockItem(BlockRegistry.REPAIRER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> BASIC_TNT_GENERATOR = ITEMS.register("basic_tnt_generator", () -> new BlockItem(BlockRegistry.BASIC_TNT_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> INTERMEDIATE_TNT_GENERATOR = ITEMS.register("intermediate_tnt_generator", () -> new BlockItem(BlockRegistry.INTERMEDIATE_TNT_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ADVANCED_TNT_GENERATOR = ITEMS.register("advanced_tnt_generator", () -> new BlockItem(BlockRegistry.ADVANCED_TNT_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> ULTIMATE_TNT_GENERATOR = ITEMS.register("ultimate_tnt_generator", () -> new BlockItem(BlockRegistry.ULTIMATE_TNT_GENERATOR.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));
    public static final RegistryObject<Item> TRADER = ITEMS.register("trader", () -> new BlockItem(BlockRegistry.TRADER.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS).stacksTo(1)));

    /* Gears */

    public static final RegistryObject<Item> ALUMINIUM_GEAR = ITEMS.register("aluminium_gear", () -> new ItemAluminiumGear(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> COPPER_GEAR = ITEMS.register("copper_gear", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> IRIDIUM_GEAR = ITEMS.register("iridium_gear", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> LEAD_GEAR = ITEMS.register("lead_gear", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> NICKEL_GEAR = ITEMS.register("nickel_gear", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> PLATINUM_GEAR = ITEMS.register("platinum_gear", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> SILVER_GEAR = ITEMS.register("silver_gear", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> URANIUM_GEAR = ITEMS.register("uranium_gear", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));

    /* Ingots */

    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> new ItemAluminiumIngot(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));

    /* Nuggets */

    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget", () -> new ItemAluminiumNugget(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));

    public static final RegistryObject<Item> RADIATION_SUIT_HELMET = ITEMS.register("radiation_suit_helmet", () -> new ItemRadiationSuitBase(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> RADIATION_SUIT_CHESTPLATE = ITEMS.register("radiation_suit_chestplate", () -> new ItemRadiationSuitBase(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> RADIATION_SUIT_LEGGINGS = ITEMS.register("radiation_suit_leggings", () -> new ItemRadiationSuitBase(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> RADIATION_SUIT_BOOTS = ITEMS.register("radiation_suit_boots", () -> new ItemRadiationSuitBase(EquipmentSlot.FEET));

    public static final RegistryObject<Item> RADIATION_SUIT_HELMET_BROKEN = ITEMS.register("radiation_suit_helmet_broken", () -> new ArmorItem(EnumHandler.BrokenPlasticArmorMaterial.BROKEN_PLASTIC, EquipmentSlot.HEAD, new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> RADIATION_SUIT_CHESTPLATE_BROKEN = ITEMS.register("radiation_suit_chestplate_broken", () -> new ArmorItem(EnumHandler.BrokenPlasticArmorMaterial.BROKEN_PLASTIC, EquipmentSlot.CHEST, new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> RADIATION_SUIT_LEGGINGS_BROKEN = ITEMS.register("radiation_suit_leggings_broken", () -> new ArmorItem(EnumHandler.BrokenPlasticArmorMaterial.BROKEN_PLASTIC, EquipmentSlot.LEGS, new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> RADIATION_SUIT_BOOTS_BROKEN = ITEMS.register("radiation_suit_boots_broken", () -> new ArmorItem(EnumHandler.BrokenPlasticArmorMaterial.BROKEN_PLASTIC, EquipmentSlot.FEET, new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> WRENCH = ITEMS.register("electric_wrench",() -> new ItemElectricWrench(Reference.CREATIVE_TAB_ITEMS, 1));

    public static final RegistryObject<Item> MOLTEN_ALUMINIUM_BUCKET = ITEMS.register("molten_aluminium_bucket",
            () -> new BucketItem(FluidRegistry.SOURCE_MOLTEN_ALUMINIUM,
                    new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("molten_copper_bucket",
            () -> new BucketItem(FluidRegistry.SOURCE_MOLTEN_COPPER,
                    new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_IRIDIUM_BUCKET = ITEMS.register("molten_iridium_bucket",
            () -> new BucketItem(FluidRegistry.SOURCE_MOLTEN_IRIDIUM,
                    new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_LEAD_BUCKET = ITEMS.register("molten_lead_bucket",
            () -> new BucketItem(FluidRegistry.SOURCE_MOLTEN_LEAD,
                    new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_NICKEL_BUCKET = ITEMS.register("molten_nickel_bucket",
            () -> new BucketItem(FluidRegistry.SOURCE_MOLTEN_NICKEL,
                    new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_PLATINUM_BUCKET = ITEMS.register("molten_platinum_bucket",
            () -> new BucketItem(FluidRegistry.SOURCE_MOLTEN_PLATINUM,
                    new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_SILVER_BUCKET = ITEMS.register("molten_silver_bucket",
            () -> new BucketItem(FluidRegistry.SOURCE_MOLTEN_SILVER,
                    new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_TIN_BUCKET = ITEMS.register("molten_tin_bucket",
            () -> new BucketItem(FluidRegistry.SOURCE_MOLTEN_TIN,
                    new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_URANIUM_BUCKET = ITEMS.register("molten_uranium_bucket",
            () -> new BucketItem(FluidRegistry.SOURCE_MOLTEN_URANIUM,
                    new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> LIQUID_EXPERIENCE_BUCKET = ITEMS.register("liquid_experience_bucket",
            () -> new BucketItem(FluidRegistry.SOURCE_LIQUID_EXPERIENCE,
                    new Item.Properties().tab(Reference.CREATIVE_TAB_ITEMS).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber", ItemRubber::new);
    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic", () -> new ItemBase(Reference.CREATIVE_TAB_ITEMS, 64, false));

    public static final RegistryObject<Item> BASIC_ABSORPTION_RING = ITEMS.register("basic_absorption_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.ABSORPTION, 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_ABSORPTION_RING = ITEMS.register("intermediate_absorption_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.ABSORPTION, 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_ABSORPTION_RING = ITEMS.register("advanced_absorption_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.ABSORPTION, 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_ABSORPTION_RING = ITEMS.register("ultimate_absorption_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.ABSORPTION, 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_BREEDING_RING = ITEMS.register("basic_breeding_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.BREEDING.get(), 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_BREEDING_RING = ITEMS.register("intermediate_breeding_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.BREEDING.get(), 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_BREEDING_RING = ITEMS.register("advanced_breeding_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.BREEDING.get(), 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_BREEDING_RING = ITEMS.register("ultimate_breeding_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.BREEDING.get(), 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_ENTITY_PULLER_RING = ITEMS.register("basic_entity_puller_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.ENTITY_PULLER.get(), 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_ENTITY_PULLER_RING = ITEMS.register("intermediate_entity_puller_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.ENTITY_PULLER.get(), 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_ENTITY_PULLER_RING = ITEMS.register("advanced_entity_puller_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.ENTITY_PULLER.get(), 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_ENTITY_PULLER_RING = ITEMS.register("ultimate_entity_puller_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.ENTITY_PULLER.get(), 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_FIRE_RING = ITEMS.register("basic_fire_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.ABSORPTION, 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_FIRE_RING = ITEMS.register("intermediate_fire_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.ABSORPTION, 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_FIRE_RING = ITEMS.register("advanced_fire_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.ABSORPTION, 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_FIRE_RING = ITEMS.register("ultimate_fire_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.ABSORPTION, 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_FLIGHT_RING = ITEMS.register("basic_flight_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.FLIGHT.get(), 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_FLIGHT_RING = ITEMS.register("intermediate_flight_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.FLIGHT.get(), 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_FLIGHT_RING = ITEMS.register("advanced_flight_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.FLIGHT.get(), 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_FLIGHT_RING = ITEMS.register("ultimate_flight_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.FLIGHT.get(), 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_FREEZE_RING = ITEMS.register("basic_freeze_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.FREEZE.get(), 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_FREEZE_RING = ITEMS.register("intermediate_freeze_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.FREEZE.get(), 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_FREEZE_RING = ITEMS.register("advanced_freeze_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.FREEZE.get(), 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_FREEZE_RING = ITEMS.register("ultimate_freeze_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.FREEZE.get(), 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_GREEN_THUMB_RING = ITEMS.register("basic_green_thumb_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.GREEN_THUMB.get(), 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_GREEN_THUMB_RING = ITEMS.register("intermediate_green_thumb_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.GREEN_THUMB.get(), 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_GREEN_THUMB_RING = ITEMS.register("advanced_green_thumb_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.GREEN_THUMB.get(), 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_GREEN_THUMB_RING = ITEMS.register("ultimate_green_thumb_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.GREEN_THUMB.get(), 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_HASTE_RING = ITEMS.register("basic_haste_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DIG_SPEED, 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_HASTE_RING = ITEMS.register("intermediate_haste_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DIG_SPEED, 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_HASTE_RING = ITEMS.register("advanced_haste_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DIG_SPEED, 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_HASTE_RING = ITEMS.register("ultimate_haste_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DIG_SPEED, 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_HEALTH_RING = ITEMS.register("basic_health_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.HEALTH_BOOST, 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_HEALTH_RING = ITEMS.register("intermediate_health_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.HEALTH_BOOST, 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_HEALTH_RING = ITEMS.register("advanced_health_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.HEALTH_BOOST, 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_HEALTH_RING = ITEMS.register("ultimate_health_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.HEALTH_BOOST, 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_MAGNETIZATION_RING = ITEMS.register("basic_magnetization_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.MAGNETIZATION.get(), 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_MAGNETIZATION_RING = ITEMS.register("intermediate_magnetization_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.MAGNETIZATION.get(), 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_MAGNETIZATION_RING = ITEMS.register("advanced_magnetization_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.MAGNETIZATION.get(), 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_MAGNETIZATION_RING = ITEMS.register("ultimate_magnetization_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.MAGNETIZATION.get(), 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_REGENERATION_RING = ITEMS.register("basic_regeneration_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.MAGNETIZATION.get(), 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> INTERMEDIATE_REGENERATION_RING = ITEMS.register("intermediate_regeneration_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.MAGNETIZATION.get(), 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> ADVANCED_REGENERATION_RING = ITEMS.register("advanced_regeneration_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.MAGNETIZATION.get(), 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> ULTIMATE_REGENERATION_RING = ITEMS.register("ultimate_regeneration_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.MAGNETIZATION.get(), 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_RESISTANCE_RING = ITEMS.register("basic_resistance_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_RESISTANCE, 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_RESISTANCE_RING = ITEMS.register("intermediate_resistance_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_RESISTANCE, 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_RESISTANCE_RING = ITEMS.register("advanced_resistance_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_RESISTANCE, 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_RESISTANCE_RING = ITEMS.register("ultimate_resistance_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_RESISTANCE, 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_SATURATION_RING = ITEMS.register("basic_saturation_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_BOOST, 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_SATURATION_RING = ITEMS.register("intermediate_saturation_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_BOOST, 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> ADVANCED_SATURATION_RING = ITEMS.register("advanced_saturation_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_BOOST, 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> ULTIMATE_SATURATION_RING = ITEMS.register("ultimate_saturation_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_BOOST, 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> BASIC_STEP_ASSIST_RING = ITEMS.register("basic_step_assist_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.STEP_ASSIST.get(), 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_STEP_ASSIST_RING = ITEMS.register("intermediate_step_assist_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.STEP_ASSIST.get(), 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_STEP_ASSIST_RING = ITEMS.register("advanced_step_assist_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.STEP_ASSIST.get(), 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_STEP_ASSIST_RING = ITEMS.register("ultimate_step_assist_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, EffectRegistry.STEP_ASSIST.get(), 3, Integer.MAX_VALUE, 20.D));
    public static final RegistryObject<Item> BASIC_STRENGTH_RING = ITEMS.register("basic_strength_ring", () -> new ItemRing(2500, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_BOOST, 0, Integer.MAX_VALUE, 2.5D));
    public static final RegistryObject<Item> INTERMEDIATE_STRENGTH_RING = ITEMS.register("intermediate_strength_ring", () -> new ItemRing(5000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_BOOST, 1, Integer.MAX_VALUE, 5.0D));
    public static final RegistryObject<Item> ADVANCED_STRENGTH_RING = ITEMS.register("advanced_strength_ring", () -> new ItemRing(15000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_BOOST, 2, Integer.MAX_VALUE, 10.0D));
    public static final RegistryObject<Item> ULTIMATE_STRENGTH_RING = ITEMS.register("ultimate_strength_ring", () -> new ItemRing(25000, Reference.CREATIVE_TAB_ITEMS, 1, MobEffects.DAMAGE_BOOST, 3, Integer.MAX_VALUE, 20.D));
    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
