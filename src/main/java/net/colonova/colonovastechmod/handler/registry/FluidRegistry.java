package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.util.Reference;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FluidRegistry
{
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Reference.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ALUMINIUM = FLUIDS.register("molten_aluminium_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.MOLTEN_ALUMINIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ALUMINIUM = FLUIDS.register("flowing_molten_aluminium", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.MOLTEN_ALUMINIUM_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_ALUMINIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeRegistry.MOLTEN_ALUMINIUM_FLUID_TYPE, SOURCE_MOLTEN_ALUMINIUM, FLOWING_MOLTEN_ALUMINIUM).slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockRegistry.MOLTEN_ALUMINIUM_BLOCK).bucket(ItemRegistry.MOLTEN_ALUMINIUM_BUCKET);
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COPPER = FLUIDS.register("molten_copper_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.MOLTEN_COPPER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COPPER = FLUIDS.register("flowing_copper_aluminium", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.MOLTEN_COPPER_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeRegistry.MOLTEN_COPPER_FLUID_TYPE, SOURCE_MOLTEN_COPPER, FLOWING_MOLTEN_COPPER).slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockRegistry.MOLTEN_COPPER_BLOCK).bucket(ItemRegistry.MOLTEN_COPPER_BUCKET);


    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRIDIUM = FLUIDS.register("molten_iridium_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.MOLTEN_IRIDIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRIDIUM = FLUIDS.register("flowing_molten_iridium", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.MOLTEN_IRIDIUM_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_IRIDIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeRegistry.MOLTEN_IRIDIUM_FLUID_TYPE, SOURCE_MOLTEN_IRIDIUM, FLOWING_MOLTEN_IRIDIUM).slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockRegistry.MOLTEN_IRIDIUM_BLOCK).bucket(ItemRegistry.MOLTEN_IRIDIUM_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LEAD = FLUIDS.register("molten_lead_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.MOLTEN_LEAD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LEAD = FLUIDS.register("flowing_molten_lead", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.MOLTEN_LEAD_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_LEAD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeRegistry.MOLTEN_LEAD_FLUID_TYPE, SOURCE_MOLTEN_LEAD, FLOWING_MOLTEN_LEAD).slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockRegistry.MOLTEN_LEAD_BLOCK).bucket(ItemRegistry.MOLTEN_LEAD_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NICKEL = FLUIDS.register("molten_nickel_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.MOLTEN_NICKEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NICKEL = FLUIDS.register("flowing_molten_nickel", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.MOLTEN_NICKEL_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_NICKEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeRegistry.MOLTEN_NICKEL_FLUID_TYPE, SOURCE_MOLTEN_NICKEL, FLOWING_MOLTEN_NICKEL).slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockRegistry.MOLTEN_NICKEL_BLOCK).bucket(ItemRegistry.MOLTEN_NICKEL_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_PLATINUM = FLUIDS.register("molten_platinum_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.MOLTEN_PLATINUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_PLATINUM = FLUIDS.register("flowing_molten_platinum", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.MOLTEN_PLATINUM_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_PLATINUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeRegistry.MOLTEN_PLATINUM_FLUID_TYPE, SOURCE_MOLTEN_PLATINUM, FLOWING_MOLTEN_PLATINUM).slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockRegistry.MOLTEN_PLATINUM_BLOCK).bucket(ItemRegistry.MOLTEN_PLATINUM_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SILVER = FLUIDS.register("molten_silver_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.MOLTEN_SILVER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SILVER = FLUIDS.register("flowing_molten_silver", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.MOLTEN_SILVER_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_SILVER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeRegistry.MOLTEN_SILVER_FLUID_TYPE, SOURCE_MOLTEN_SILVER, FLOWING_MOLTEN_SILVER).slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockRegistry.MOLTEN_SILVER_BLOCK).bucket(ItemRegistry.MOLTEN_SILVER_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TIN = FLUIDS.register("molten_tin_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.MOLTEN_TIN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TIN = FLUIDS.register("flowing_molten_tin", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.MOLTEN_TIN_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeRegistry.MOLTEN_TIN_FLUID_TYPE, SOURCE_MOLTEN_TIN, FLOWING_MOLTEN_TIN).slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockRegistry.MOLTEN_TIN_BLOCK).bucket(ItemRegistry.MOLTEN_TIN_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM = FLUIDS.register("molten_uranium_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.MOLTEN_URANIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM = FLUIDS.register("flowing_molten_uranium", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.MOLTEN_URANIUM_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeRegistry.MOLTEN_URANIUM_FLUID_TYPE, SOURCE_MOLTEN_URANIUM, FLOWING_MOLTEN_URANIUM).slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockRegistry.MOLTEN_ALUMINIUM_BLOCK).bucket(ItemRegistry.MOLTEN_ALUMINIUM_BUCKET);


    public static void registerFluids()
    {
        FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
