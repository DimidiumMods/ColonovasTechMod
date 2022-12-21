package net.colonova.colonovastechmod.handler.event;

import net.colonova.colonovascore.api.energy.EnergyAction;
import net.colonova.colonovastechmod.ColonovasTechMod;
import net.colonova.colonovastechmod.handler.ConfigurationHandler;
import net.colonova.colonovastechmod.handler.registry.EnchantmentRegistry;
import net.colonova.colonovastechmod.handler.registry.ItemRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, modid = Reference.MOD_ID)
public class DamageEvent
{
    private static final double MIN_FE = 0.0001;
    private static final String CURRENT_FE_KEY = "currentFE";
    private static final ArrayList<ItemStack> ITEMS = new ArrayList<>();

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onAttack(AttackEntityEvent event)
    {
        if(event.getTarget() instanceof final Player player)
        {
            /* 0 is boots, 1 is leggings, 2 is chestplate and 3 is helmet */

            if(!(player.level.isClientSide))
            {
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(0);

                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.FEET, new ItemStack(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(1);

                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()))
                {
                    ItemStack item = player.getInventory().armor.get(2);
                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    ItemStack item = player.getInventory().armor.get(3);
                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get()));
                    }
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
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(0);

                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.FEET, new ItemStack(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(1);

                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()))
                {
                    ItemStack item = player.getInventory().armor.get(2);
                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    ItemStack item = player.getInventory().armor.get(3);
                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get()));
                    }
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
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(0);

                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.FEET, new ItemStack(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(1);

                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()))
                {
                    ItemStack item = player.getInventory().armor.get(2);
                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    ItemStack item = player.getInventory().armor.get(3);
                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get()));
                    }
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
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(0);

                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.FEET, new ItemStack(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(1);

                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()))
                {
                    ItemStack item = player.getInventory().armor.get(2);
                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    ItemStack item = player.getInventory().armor.get(3);
                    extractFE(item, ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get(), EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < ConfigurationHandler.RADIATION_ARMOR_ENERGY_PER_DAMAGE.get())
                    {
                        player.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get()));
                    }
                }
            }
        }
    }


    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onDrop(LivingDropsEvent event)
    {
        for(ItemEntity item : event.getDrops())
        {
            if(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentRegistry.SOUL_BINDING.get(), item.getItem()) > 0)
            {
                ITEMS.add(item.getItem());
            }

            ColonovasTechMod.LOGGER.debug("No");
        }
    }

    @SubscribeEvent(priority =  EventPriority.HIGHEST)
    public static void onRespawn(PlayerEvent.PlayerRespawnEvent event)
    {
        for(ItemStack item : ITEMS)
        {
            event.getEntity().getInventory().add(item);
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