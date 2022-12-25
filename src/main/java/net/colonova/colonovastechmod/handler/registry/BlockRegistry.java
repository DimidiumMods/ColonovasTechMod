package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.block.*;
import net.colonova.colonovastechmod.block.machine.*;
import net.colonova.colonovastechmod.block.machine.cable.*;
import net.colonova.colonovastechmod.block.machine.portal.*;
import net.colonova.colonovastechmod.block.machine.quarry.*;
import net.colonova.colonovastechmod.block.ore.*;
import net.colonova.colonovastechmod.util.CableType;
import net.colonova.colonovastechmod.util.MachineType;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    /* Ores */

    public static final RegistryObject<Block> ALUMINIUM_ORE = BLOCKS.register("aluminium_ore", () -> new BlockAluminiumOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> IRIDIUM_ORE = BLOCKS.register("iridium_ore", () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore",   () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> DEEP_SLATE_ALUMINIUM_ORE = BLOCKS.register("deepslate_aluminium_ore",  () -> new BlockAluminiumOre(Material.STONE, 4.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> DEEP_SLATE_COPPER_ORE = BLOCKS.register("deepslate_copper_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> DEEP_SLATE_IRIDIUM_ORE = BLOCKS.register("deepslate_iridium_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_LEAD_ORE = BLOCKS.register("deepslate_lead_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_NICKEL_ORE = BLOCKS.register("deepslate_nickel_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_PLATINUM_ORE = BLOCKS.register("deepslate_platinum_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_URANIUM_ORE = BLOCKS.register("deepslate_uranium_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));

    /* Ore Blocks */

    public static final RegistryObject<Block> ALUMINIUM_BLOCK = BLOCKS.register("aluminium_block", () -> new BlockAluminiumBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block",  () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));

    /* Fluid blocks */

    public static final RegistryObject<LiquidBlock> MOLTEN_ALUMINIUM_BLOCK = BLOCKS.register("molten_aluminium_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_ALUMINIUM, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = BLOCKS.register("molten_copper_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_COPPER, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_IRIDIUM_BLOCK = BLOCKS.register("molten_iridium_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_IRIDIUM, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LEAD_BLOCK = BLOCKS.register("molten_lead_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_LEAD, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_NICKEL_BLOCK = BLOCKS.register("molten_nickel_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_NICKEL, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_PLATINUM_BLOCK = BLOCKS.register("molten_platinum_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_PLATINUM, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_SILVER_BLOCK = BLOCKS.register("molten_silver_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_SILVER, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TIN_BLOCK = BLOCKS.register("molten_tin_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_SILVER, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_BLOCK = BLOCKS.register("molten_uranium_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_SILVER, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> LIQUID_EXPERIENCE_BLOCK = BLOCKS.register("liquid_experience", () -> new LiquidBlock(FluidRegistry.SOURCE_LIQUID_EXPERIENCE, BlockBehaviour.Properties.of(Material.WATER)));


    /* Machines */

    public static final RegistryObject<Block> BASIC_MACHINE_FRAME = BLOCKS.register("basic_machine_frame", () -> new BlockMachineFrame(MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_MACHINE_FRAME = BLOCKS.register("intermediate_machine_frame", () -> new BlockMachineFrame(MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_MACHINE_FRAME = BLOCKS.register("advanced_machine_frame", () -> new BlockMachineFrame(MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_MACHINE_FRAME = BLOCKS.register("ultimate_machine_frame", () -> new BlockMachineFrame(MachineType.ULTIMATE));

    public static final RegistryObject<Block> HEALER = BLOCKS.register("healer", BlockHealer::new);

    public static final RegistryObject<Block> BASIC_ENERGY_CABLE = BLOCKS.register("basic_energy_cable", () -> new BlockEnergyCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> INTERMEDIATE_ENERGY_CABLE = BLOCKS.register("intermediate_energy_cable", () -> new BlockEnergyCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ADVANCED_ENERGY_CABLE = BLOCKS.register("advanced_energy_cable", () -> new BlockEnergyCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ULTIMATE_ENERGY_CABLE = BLOCKS.register("ultimate_energy_cable", () -> new BlockEnergyCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> BASIC_FILTER_CABLE = BLOCKS.register("basic_filter_cable", () -> new BlockFilterCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> INTERMEDIATE_FILTER_CABLE = BLOCKS.register("intermediate_filter_cable", () -> new BlockFilterCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ADVANCED_FILTER_CABLE = BLOCKS.register("advanced_filter_cable", () -> new BlockFilterCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ULTIMATE_FILTER_CABLE = BLOCKS.register("ultimate_filter_cable", () -> new BlockFilterCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE, true, true, 1, 1, 1, 1, CableType.FILTER));

    public static final RegistryObject<Block> BASIC_FLUID_CABLE = BLOCKS.register("basic_fluid_cable", () -> new BlockFluidCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> INTERMEDIATE_FLUID_CABLE = BLOCKS.register("intermediate_fluid_cable", () -> new BlockFluidCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ADVANCED_FLUID_CABLE = BLOCKS.register("advanced_fluid_cable", () -> new BlockFluidCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ULTIMATE_FLUID_CABLE = BLOCKS.register("ultimate_fluid_cable", () -> new BlockFluidCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> BASIC_GAS_CABLE = BLOCKS.register("basic_gas_cable", () -> new BlockGasCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> INTERMEDIATE_GAS_CABLE = BLOCKS.register("intermediate_gas_cable", () -> new BlockGasCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ADVANCED_GAS_CABLE = BLOCKS.register("advanced_gas_cable", () -> new BlockGasCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ULTIMATE_GAS_CABLE = BLOCKS.register("ultimate_gas_cable", () -> new BlockGasCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> BASIC_ITEM_CABLE = BLOCKS.register("basic_item_cable", () -> new BlockItemCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> INTERMEDIATE_ITEM_CABLE = BLOCKS.register("intermediate_item_cable", () -> new BlockItemCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ADVANCED_ITEM_CABLE = BLOCKS.register("advanced_item_cable", () -> new BlockItemCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ULTIMATE_ITEM_CABLE = BLOCKS.register("ultimate_item_cable", () -> new BlockItemCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> BASIC_VOID_CABLE = BLOCKS.register("basic_void_cable", () -> new BlockVoidCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> INTERMEDIATE_VOID_CABLE = BLOCKS.register("intermediate_void_cable", () -> new BlockVoidCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ADVANCED_VOID_CABLE = BLOCKS.register("advanced_void_cable", () -> new BlockVoidCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> ULTIMATE_VOID_CABLE = BLOCKS.register("ultimate_void_cable", () -> new BlockVoidCable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE, true, true, 1, 1, 1, 1, CableType.FILTER));
    public static final RegistryObject<Block> PORTAL = BLOCKS.register("portal", () -> new BlockPortal(Material.PORTAL, Float.MAX_VALUE, Float.MAX_VALUE, SoundType.GLASS, MachineType.BASIC));
    public static final RegistryObject<Block> PORTAL_CONTROLLER = BLOCKS.register("portal_controller", () -> new BlockPortalController(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> PORTAL_FRAME = BLOCKS.register("portal_frame", () -> new BlockPortalFrame(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> PORTAL_INTERFACE = BLOCKS.register("portal_interface", () -> new BlockPortalInterface(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> PORTAL_STABILIZER = BLOCKS.register("portal_stabilizer", () -> new BlockPortalStabilizer(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> PORTAL_PROGRAMMER = BLOCKS.register("portal_programmer", () -> new BlockProgrammable(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> ANGEL_BLOCK = BLOCKS.register("angel_block", () -> new BlockAngelBlock(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL));
    public static final RegistryObject<Block> AUTOMATIC_ANVIL = BLOCKS.register("automatic_anvil", () -> new BlockAutoAnvil(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> BASIC_BOTTLER = BLOCKS.register("basic_bottler", () -> new BlockBottler(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_BOTTLER = BLOCKS.register("intermediate_bottler", () -> new BlockBottler(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_BOTTLER = BLOCKS.register("advanced_bottler", () -> new BlockBottler(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_BOTTLER = BLOCKS.register("ultimate_bottler", () -> new BlockBottler(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> BREAKER = BLOCKS.register("breaker", () -> new BlockBreaker(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> BASIC_ENERGY_BUFFER = BLOCKS.register("basic_energy_buffer", () -> new BlockEnergyBuffer(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_ENERGY_BUFFER = BLOCKS.register("intermediate_energy_buffer", () -> new BlockEnergyBuffer(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_ENERGY_BUFFER = BLOCKS.register("advanced_energy_buffer", () -> new BlockEnergyBuffer(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_ENERGY_BUFFER = BLOCKS.register("ultimate_energy_buffer", () -> new BlockEnergyBuffer(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> BASIC_FLUID_BUFFER = BLOCKS.register("basic_fluid_buffer", () -> new BlockFluidBuffer(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_FLUID_BUFFER = BLOCKS.register("intermediate_fluid_buffer", () -> new BlockFluidBuffer(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_FLUID_BUFFER = BLOCKS.register("advanced_fluid_buffer", () -> new BlockFluidBuffer(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_FLUID_BUFFER = BLOCKS.register("ultimate_fluid_buffer", () -> new BlockFluidBuffer(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> BASIC_BUILDER = BLOCKS.register("basic_builder", () -> new BlockBuilder(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_BUILDER = BLOCKS.register("intermediate_builder", () -> new BlockBuilder(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_BUILDER = BLOCKS.register("advanced_builder", () -> new BlockBuilder(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_BUILDER = BLOCKS.register("ultimate_builder", () -> new BlockBuilder(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> ITEM_CANNON = BLOCKS.register("item_cannon", () -> new BlockCannon(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> BASIC_CHARGER = BLOCKS.register("basic_charger", () -> new BlockCharger(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_CHARGER = BLOCKS.register("intermediate_charger", () -> new BlockCharger(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_CHARGER = BLOCKS.register("advanced_charger", () -> new BlockCharger(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_CHARGER = BLOCKS.register("ultimate_charger", () -> new BlockCharger(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> CLOCK = BLOCKS.register("clock", () -> new BlockClock(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL));
    public static final RegistryObject<Block> BASIC_CRAFTER = BLOCKS.register("basic_crafter", () -> new BlockCrafter(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_CRAFTER = BLOCKS.register("intermediate_crafter", () -> new BlockCrafter(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_CRAFTER = BLOCKS.register("advanced_crafter", () -> new BlockCrafter(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_CRAFTER = BLOCKS.register("ultimate_crafter", () -> new BlockCrafter(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> BASIC_CRATE = BLOCKS.register("basic_crate", () -> new BlockCrate(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_CRATE = BLOCKS.register("intermediate_crate", () -> new BlockCrate(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_CRATE = BLOCKS.register("advanced_crate", () -> new BlockCrate(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_CRATE = BLOCKS.register("ultimate_crate", () -> new BlockCrate(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> DRAIN = BLOCKS.register("drain", () -> new BlockDrain(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL));
    public static final RegistryObject<Block> DROPPER = BLOCKS.register("dropper", () -> new BlockDropper(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> BASIC_DRUM = BLOCKS.register("basic_drum", () -> new BlockDrum(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_DRUM = BLOCKS.register("intermediate_drum", () -> new BlockDrum(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_DRUM = BLOCKS.register("advanced_drum", () -> new BlockDrum(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_DRUM = BLOCKS.register("ultimate_drum", () -> new BlockDrum(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> MAGIC_EGG = BLOCKS.register("magic_egg", () -> new BlockEgg(Material.EGG, 2.0F, 5.0F, SoundType.GRASS));
    public static final RegistryObject<Block> ELEVATOR = BLOCKS.register("elevator", () -> new BlockElevator(Material.WOOL, 2.0F, 5.0F, SoundType.WOOL));
    public static final RegistryObject<Block> ENCHANTER = BLOCKS.register("enchanter", () -> new BlockEnchanter(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> BASIC_ENDER_GENERATOR = BLOCKS.register("basic_ender_generator", () -> new BlockEnderGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_ENDER_GENERATOR = BLOCKS.register("intermediate_ender_generator", () -> new BlockEnderGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_ENDER_GENERATOR = BLOCKS.register("advanced_ender_generator", () -> new BlockEnderGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_ENDER_GENERATOR = BLOCKS.register("ultimate_ender_generator", () -> new BlockEnderGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> FLAG = BLOCKS.register("flag", () -> new BlockFlag(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL));
    public static final RegistryObject<Block> BASIC_ENERGY_STORAGE = BLOCKS.register("basic_energy_storage", () -> new BlockEnergyStorage(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_ENERGY_STORAGE = BLOCKS.register("intermediate_energy_storage", () -> new BlockEnergyStorage(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_ENERGY_STORAGE = BLOCKS.register("advanced_energy_storage", () -> new BlockEnergyStorage(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_ENERGY_STORAGE = BLOCKS.register("ultimate_energy_storage", () -> new BlockEnergyStorage(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> BASIC_FURNACE = BLOCKS.register("basic_furnace", () -> new BlockFurnace(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_FURNACE = BLOCKS.register("intermediate_furnace", () -> new BlockFurnace(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_FURNACE = BLOCKS.register("advanced_furnace", () -> new BlockFurnace(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_FURNACE = BLOCKS.register("ultimate_furnace", () -> new BlockFurnace(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> MOB_GLASS = BLOCKS.register("mob_glass", () -> new BlockGlass(Material.GLASS, 2.0F, 5.0F, SoundType.GLASS));
    public static final RegistryObject<Block> GRINDER = BLOCKS.register("grinder", () -> new BlockGrinder(Material.HEAVY_METAL, 2.0F, Float.MAX_VALUE, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> BASIC_INFUSER = BLOCKS.register("basic_infuser", () -> new BlockInfuser(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_INFUSER = BLOCKS.register("intermediate_infuser", () -> new BlockInfuser(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_INFUSER = BLOCKS.register("advanced_infuser", () -> new BlockInfuser(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_INFUSER = BLOCKS.register("ultimate_infuser", () -> new BlockInfuser(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> BASIC_LAVA_GENERATOR = BLOCKS.register("basic_lava_generator", () -> new BlockLavaGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_LAVA_GENERATOR = BLOCKS.register("intermediate_lava_generator", () -> new BlockLavaGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_LAVA_GENERATOR = BLOCKS.register("advanced_lava_generator", () -> new BlockLavaGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_LAVA_GENERATOR = BLOCKS.register("ultimate_lava_generator", () -> new BlockLavaGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> MELTER = BLOCKS.register("melter", () -> new BlockMelter(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> BASIC_NETHER_STAR_GENERATOR = BLOCKS.register("basic_nether_star_generator", () -> new BlockNetherStarGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_NETHER_STAR_GENERATOR = BLOCKS.register("intermediate_nether_star_generator", () -> new BlockNetherStarGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_NETHER_STAR_GENERATOR = BLOCKS.register("advanced_nether_star_generator", () -> new BlockNetherStarGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_NETHER_STAR_GENERATOR = BLOCKS.register("ultimate_nether_star_generator", () -> new BlockNetherStarGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> PAINT_CAN = BLOCKS.register("paint_can", () -> new BlockPaintCan(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL));
    public static final RegistryObject<Block> PAINTER = BLOCKS.register("painter", () -> new BlockPainter(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> PLACER = BLOCKS.register("placer", () -> new BlockPlacer(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL));
    public static final RegistryObject<Block> POWER_MONITOR = BLOCKS.register("power_monitor", () -> new BlockPowerMonitor(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> BASIC_PROJECTOR = BLOCKS.register("basic_projector", () -> new BlockProjector(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_PROJECTOR = BLOCKS.register("intermediate_projector", () -> new BlockProjector(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_PROJECTOR = BLOCKS.register("advanced_projector", () -> new BlockProjector(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_PROJECTOR = BLOCKS.register("ultimate_projector", () -> new BlockProjector(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> QUARRY = BLOCKS.register("quarry", () -> new BlockQuarry(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> QUARRY_SPEED_UPGRADE = BLOCKS.register("quarry_speed_upgrade", () -> new BlockQuarrySpeedUpgrade(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> QUARRY_SILK_UPGRADE = BLOCKS.register("quarry_silk_upgrade", () -> new BlockQuarrySilkUpgrade(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> QUARRY_FORTUNE_UPGRADE = BLOCKS.register("quarry_fortune_upgrade", () -> new BlockQuarryFortuneUpgrade(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> QUARRY_VOID_UPGRADE = BLOCKS.register("quarry_void_upgrade", () -> new BlockQuarryVoidUpgrade(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> SHOWER = BLOCKS.register("shower", () -> new BlockShower(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> BASIC_SOLAR_PANEL = BLOCKS.register("basic_solar_panel", () -> new BlockSolarPanel(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_SOLAR_PANEL = BLOCKS.register("intermediate_solar_panel", () -> new BlockSolarPanel(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_SOLAR_PANEL = BLOCKS.register("advanced_solar_panel", () -> new BlockSolarPanel(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_SOLAR_PANEL = BLOCKS.register("ultimate_solar_panel", () -> new BlockSolarPanel(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> SOUND_MUFFLER = BLOCKS.register("sound_muffler", () -> new BlockSoundMuffler(Material.WOOL, 2.0F, 5.0F, SoundType.WOOL));
    public static final RegistryObject<Block> SPAWNER = BLOCKS.register("spawner", () -> new BlockSpawner(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> BASIC_SPIKES = BLOCKS.register("basic_spikes", () -> new BlockSpikes(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_SPIKES = BLOCKS.register("intermediate_spikes", () -> new BlockSpikes(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_SPIKES = BLOCKS.register("advanced_spikes", () -> new BlockSpikes(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_SPIKES = BLOCKS.register("ultimate_spikes", () -> new BlockSpikes(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> BASIC_STEAM_GENERATOR = BLOCKS.register("basic_steam_generator", () -> new BlockSteamGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_STEAM_GENERATOR = BLOCKS.register("intermediate_steam_generator", () -> new BlockSteamGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_STEAM_GENERATOR = BLOCKS.register("advanced_steam_generator", () -> new BlockSteamGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_STEAM_GENERATOR = BLOCKS.register("ultimate_steam_generator", () -> new BlockSteamGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> BASIC_STIRLING_GENERATOR = BLOCKS.register("basic_stirling_generator", () -> new BlockStirlingGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_STIRLING_GENERATOR = BLOCKS.register("intermediate_stirling_generator", () -> new BlockStirlingGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_STIRLING_GENERATOR = BLOCKS.register("advanced_stirling_generator", () -> new BlockStirlingGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_STIRLING_GENERATOR = BLOCKS.register("ultimate_stirling_generator", () -> new BlockStirlingGenerator(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> TANK = BLOCKS.register("tank", () -> new BlockTank(Material.GLASS, 2.0F, 5.0F, SoundType.GLASS, MachineType.BASIC, 16000));
    public static final RegistryObject<Block> BASIC_FLUID_TANK = BLOCKS.register("basic_fluid_tank", () -> new BlockFluidTank(Material.GLASS, 2.0F, 5.0F, SoundType.GLASS, MachineType.BASIC, 16000));
    public static final RegistryObject<Block> INTERMEDIATE_FLUID_TANK = BLOCKS.register("intermediate_fluid_tank", () -> new BlockFluidTank(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE, 32000));
    public static final RegistryObject<Block> ADVANCED_FLUID_TANK = BLOCKS.register("advanced_fluid_tank", () -> new BlockFluidTank(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED, 64000));
    public static final RegistryObject<Block> ULTIMATE_FLUID_TANK = BLOCKS.register("ultimate_fluid_tank", () -> new BlockFluidTank(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE, 128000));
    public static final RegistryObject<Block> BASIC_GAS_TANK = BLOCKS.register("basic_gas_tank", () -> new BlockGasTank(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC, 16000));
    public static final RegistryObject<Block> INTERMEDIATE_GAS_TANK = BLOCKS.register("intermediate_gas_tank", () -> new BlockGasTank(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED, 32000));
    public static final RegistryObject<Block> ADVANCED_GAS_TANK = BLOCKS.register("advanced_gas_tank", () -> new BlockGasTank(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE, 64000));
    public static final RegistryObject<Block> ULTIMATE_GAS_TANK = BLOCKS.register("ultimate_gas_tank", () -> new BlockGasTank(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE, 128000));
    public static final RegistryObject<Block> PUMP = BLOCKS.register("pump", () -> new BlockPump(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> TIME_CONTROLLER = BLOCKS.register("time_controller", () -> new BlockTimeController(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> BASIC_TNT_GENERATOR = BLOCKS.register("basic_tnt_generator", () -> new BlockTNTGenerator(Material.EXPLOSIVE, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_TNT_GENERATOR = BLOCKS.register("intermediate_tnt_generator", () -> new BlockTNTGenerator(Material.EXPLOSIVE, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_TNT_GENERATOR = BLOCKS.register("advanced_tnt_generator", () -> new BlockTNTGenerator(Material.EXPLOSIVE, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_TNT_GENERATOR = BLOCKS.register("ultimate_tnt_generator", () -> new BlockTNTGenerator(Material.EXPLOSIVE, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> TRADER = BLOCKS.register("trader", () -> new BlockTrader(Material.WOOD, 2.0F, 5.0F, SoundType.WOOD, MachineType.BASIC));
    public static final RegistryObject<Block> WEATHER_CONTROLLER = BLOCKS.register("weather_controller", () -> new BlockWeatherController(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> TRANSCEIVER = BLOCKS.register("transceiver", () -> new BlockTransceiver(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> UNCRAFTER = BLOCKS.register("uncrafter", () -> new BlockUncrafter(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> REPAIRER = BLOCKS.register("repairer", () -> new BlockRepairer(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> VACUUM_HOPPER = BLOCKS.register("vacuum_hopper", () -> new BlockVacuumHopper(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> VILLAGE_LOCATOR = BLOCKS.register("village_locator", () -> new BlockVillageLocator(Material.WOOD, 2.0F, 5.0F, SoundType.WOOD, MachineType.BASIC));

    //TODO Recipe types depending on machine tier!

    public static final RegistryObject<Block> VOID_PORTAL = BLOCKS.register("void_portal", () -> new BlockVoidPortal(Material.PORTAL, 2.0F, 5.0F, SoundType.GLASS));
    public static final RegistryObject<Block> BASIC_WATER_WHEEL = BLOCKS.register("basic_water_wheel", () -> new BlockWaterWheel(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_WATER_WHEEL = BLOCKS.register("intermediate_water_wheel", () -> new BlockWaterWheel(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_WATER_WHEEL = BLOCKS.register("advanced_water_wheel", () -> new BlockWaterWheel(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_WATER_WHEEL = BLOCKS.register("ultimate_water_wheel", () -> new BlockWaterWheel(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> WEATHER_MUFFLER = BLOCKS.register("weather_muffler", () -> new BlockWeatherMuffler(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> BASIC_WINDMILL = BLOCKS.register("basic_windmill", () -> new BlockWindmill(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_WINDMILL = BLOCKS.register("intermediate_windmill", () -> new BlockWindmill(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_WINDMILL = BLOCKS.register("advanced_windmill", () -> new BlockWindmill(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_WINDMILL = BLOCKS.register("ultimate_windmill", () -> new BlockWindmill(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> WIRELESS_CHARGER = BLOCKS.register("wireless_charger", () -> new BlockWirelessCharger(Material.HEAVY_METAL, 2.0F, 5.0F, SoundType.METAL, MachineType.BASIC));
    public static final RegistryObject<Block> WITHER_BUILDER = BLOCKS.register("wither_builder", () -> new BlockWither(Material.HEAVY_METAL, 20.0F, Float.MAX_VALUE, SoundType.METAL, MachineType.ULTIMATE));
    public static final RegistryObject<Block> WITHER_GLASS = BLOCKS.register("wither_glass", () -> new BlockWitherGlass(Material.GLASS, 20.0F, Float.MAX_VALUE, SoundType.GLASS));
    public static final RegistryObject<Block> WITHER_STONE = BLOCKS.register("wither_stone", () -> new BlockWitherStone(Material.STONE, 20.0F, Float.MAX_VALUE, SoundType.STONE));

    public static void registerBlocks()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}