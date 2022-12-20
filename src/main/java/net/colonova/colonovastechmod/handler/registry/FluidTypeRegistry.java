package net.colonova.colonovastechmod.handler.registry;

import com.mojang.math.Vector3f;

import net.colonova.colonovastechmod.fluid.MoltenFluidType;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FluidTypeRegistry
{
/*    private static final ResourceLocation MOLTEN_ALUMINIUM_SOURCE = new ResourceLocation("block/water_still");
    private static final ResourceLocation Molten_ALUMINIUM_FLOWING = new ResourceLocation("block/water_flow");
    private static final ResourceLocation MOLTEN_ALUMINIUM_OVERLAY = new ResourceLocation(Reference.MOD_ID, "misc/in_soap_water");*/

    private static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Reference.MOD_ID);

    //public static final RegistryObject<FluidType> MOLTEN_ALUMINIUM_FLUID_TYPE = register("molten_aluminium_fluid", FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK));

    public static final RegistryObject<FluidType> MOLTEN_ALUMINIUM_FLUID_TYPE = FLUID_TYPES.register("molten_aluminium_fluid",
            () -> new MoltenFluidType(
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_aluminium_source"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_aluminium_flowing"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_aluminium_overlay"), 0,
                    new Vector3f(0, 0,0), FluidType.Properties.create().lightLevel(2)
            )
    );

    public static final RegistryObject<FluidType> MOLTEN_COPPER_FLUID_TYPE = FLUID_TYPES.register("molten_copper_fluid",
            () -> new MoltenFluidType(
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_copper_source"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_copper_flowing"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_copper_overlay"), 0,
                    new Vector3f(0, 0,0), FluidType.Properties.create().lightLevel(2)
            )
    );

    public static final RegistryObject<FluidType> MOLTEN_IRIDIUM_FLUID_TYPE = FLUID_TYPES.register("molten_iridium_fluid",
            () -> new MoltenFluidType(
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_iridium_source"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_iridium_flowing"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_iridium_overlay"), 0,
                    new Vector3f(0, 0,0), FluidType.Properties.create().lightLevel(2)
            )
    );

    public static final RegistryObject<FluidType> MOLTEN_LEAD_FLUID_TYPE = FLUID_TYPES.register("molten_lead_fluid",
            () -> new MoltenFluidType(
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_lead_source"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_lead_flowing"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_lead_overlay"), 0,
                    new Vector3f(0, 0,0), FluidType.Properties.create().lightLevel(2)
            )
    );

    public static final RegistryObject<FluidType> MOLTEN_NICKEL_FLUID_TYPE = FLUID_TYPES.register("molten_nickel_fluid",
            () -> new MoltenFluidType(
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_nickel_source"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_nickel_flowing"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_nickel_overlay"), 0,
                    new Vector3f(0, 0,0), FluidType.Properties.create().lightLevel(2)
            )
    );

    public static final RegistryObject<FluidType> MOLTEN_PLATINUM_FLUID_TYPE = FLUID_TYPES.register("molten_platinum_fluid",
            () -> new MoltenFluidType(
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_platinum_source"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_platinum_flowing"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_platinum_overlay"), 0,
                    new Vector3f(0, 0,0), FluidType.Properties.create().lightLevel(2)
            )
    );

    public static final RegistryObject<FluidType> MOLTEN_SILVER_FLUID_TYPE = FLUID_TYPES.register("molten_silver_fluid",
            () -> new MoltenFluidType(
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_silver_source"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_silver_flowing"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_silver_overlay"), 0,
                    new Vector3f(0, 0,0), FluidType.Properties.create().lightLevel(2)
            )
    );

    public static final RegistryObject<FluidType> MOLTEN_TIN_FLUID_TYPE = FLUID_TYPES.register("molten_tin_fluid",
            () -> new MoltenFluidType(
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_tin_source"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_tin_flowing"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_tin_overlay"), 0,
                    new Vector3f(0, 0,0), FluidType.Properties.create().lightLevel(2)
            )
    );

    public static final RegistryObject<FluidType> MOLTEN_URANIUM_FLUID_TYPE = FLUID_TYPES.register("molten_uranium_fluid",
            () -> new MoltenFluidType(
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_uranium_source"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_uranium_flowing"),
                    new ResourceLocation(Reference.MOD_ID + "/textures/fluids/molten_uranium_overlay"), 0,
                    new Vector3f(0, 0,0), FluidType.Properties.create().lightLevel(2)
            )
    );

    public static void registerFluidTypes()
    {
        FLUID_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
