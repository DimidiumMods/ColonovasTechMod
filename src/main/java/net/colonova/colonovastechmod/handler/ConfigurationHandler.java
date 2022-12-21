package net.colonova.colonovastechmod.handler;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;

public class ConfigurationHandler
{
    private static final String CATEGORY_BASIC_WRENCH = "Electric Wrench";
    private static final String CATEGORY_RADIATION_ARMOR = "Radiation Armor";
    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec SERVER_CONFIG;

    public static ForgeConfigSpec.DoubleValue ELECTRIC_WRENCH_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue ELECTRIC_WRENCH_ENERGY_PER_USE;
    public static ForgeConfigSpec.DoubleValue RADIATION_ARMOR_ENERGY_PER_DAMAGE;

    static
    {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();

        SERVER_BUILDER.comment("Electric Wrench Settings").push(CATEGORY_BASIC_WRENCH);
        SERVER_BUILDER.comment("Radiation Armor Settings").push(CATEGORY_RADIATION_ARMOR);

        setup(SERVER_BUILDER);

        SERVER_CONFIG = SERVER_BUILDER.build();
    }

    public static void setup(ForgeConfigSpec.Builder SERVER_BUILDER)
    {
        ELECTRIC_WRENCH_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the wrench charge?").defineInRange("chargingSpeed", 30D, Double.MIN_VALUE, Double.MAX_VALUE);
        ELECTRIC_WRENCH_ENERGY_PER_USE = SERVER_BUILDER.comment("How much energy should the wrench consume when used?").defineInRange("energyUse", 50D, Double.MIN_VALUE, Double.MAX_VALUE);
        RADIATION_ARMOR_ENERGY_PER_DAMAGE = SERVER_BUILDER.comment("How much energy should the radiation armor consume on damage?").defineInRange("energyConsumption", 1D, Double.MIN_VALUE, Double.MAX_VALUE);

        SERVER_BUILDER.pop();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent.Loading event)
    {

    }

    @SubscribeEvent
    public static void onReload(final ModConfigEvent.Reloading event)
    {

    }
}
