package net.colonova.colonovastechmod.handler.event;

import net.colonova.colonovascore.api.energy.EnergyAction;
import net.colonova.colonovastechmod.handler.registry.ItemRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, modid = Reference.MOD_ID)
public class DamageEvent
{
    private static final double MIN_FE = 0.0001;
    private static final String CURRENT_FE_KEY = "currentFE";

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onAttack(AttackEntityEvent event)
    {
        if(event.getTarget() instanceof final Player player)
        {
            /* 0 is boots, 1 is leggings, 2 is chestplate and 3 is helmet */

            if(!(player.level.isClientSide))
            {
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()) && player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()) && player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()) && player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    //Todo configuration for energy extraction per use and break item if no energy and custom damage source

                    extractFE(player.getInventory().armor.get(0), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(1), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(2), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(3), 1, EnergyAction.EXECUTE);
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onAttack(LivingAttackEvent event)
    {
        if(event.getEntity() instanceof final Player player)
        {
            /* 0 is boots, 1 is leggings, 2 is chestplate and 3 is helmet */

            if(!(player.level.isClientSide))
            {
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()) && player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()) && player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()) && player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    extractFE(player.getInventory().armor.get(0), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(1), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(2), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(3), 1, EnergyAction.EXECUTE);
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onDamage(LivingDamageEvent event)
    {
        if(event.getEntity() instanceof final Player player)
        {
            /* 0 is boots, 1 is leggings, 2 is chestplate and 3 is helmet */

            if(!(player.level.isClientSide))
            {
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()) && player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()) && player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()) && player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    extractFE(player.getInventory().armor.get(0), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(1), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(2), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(3), 1, EnergyAction.EXECUTE);
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onDeath(LivingDeathEvent event)
    {
        if(event.getEntity() instanceof final Player player)
        {
            /* 0 is boots, 1 is leggings, 2 is chestplate and 3 is helmet */

            if(!(player.level.isClientSide))
            {
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()) && player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()) && player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()) && player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    extractFE(player.getInventory().armor.get(0), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(1), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(2), 1, EnergyAction.EXECUTE);
                    extractFE(player.getInventory().armor.get(3), 1, EnergyAction.EXECUTE);
                }
            }
        }
    }

    private static double extractFE(ItemStack stack, double amount, EnergyAction mode)
    {
        final double currentStorage = getCurrentFE(stack);
        final double fulfillable = Math.min(amount, currentStorage);

        if (mode == EnergyAction.EXECUTE)
        {
            setCurrentFE(stack, currentStorage - fulfillable);
        }

        return fulfillable;
    }

    protected static final void setCurrentFE(ItemStack stack, double power)
    {
        if (power < MIN_FE)
        {
            stack.removeTagKey(CURRENT_FE_KEY);
        }

        else
        {
            stack.getOrCreateTag().putDouble(CURRENT_FE_KEY, power);
        }
    }

    private static double getCurrentFE(ItemStack is)
    {
        var tag = is.getTag();

        if (tag != null)
        {
            return tag.getDouble(CURRENT_FE_KEY);
        }

        else
        {
            return 0;
        }
    }
}