package net.colonova.colonovastechmod.item.ring;

import net.colonova.colonovascore.api.energy.EnergyAction;
import net.colonova.colonovascore.api.energy.item.PoweredItemBase;
import net.colonova.colonovastechmod.util.IRingItem;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemRing extends PoweredItemBase implements IRingItem
{

    private final double capacity;
    private final MobEffect mobEffect;
    private final int strength;
    private final int duration;
    private final Double useCost;
    private final Boolean activated = true;

    public ItemRing(double feCapacity, CreativeModeTab tab, int stackSize, MobEffect mobEffect, int strength, int duration, Double useCost)
    {
        super(feCapacity, tab, stackSize);
        this.capacity = feCapacity;
        this.mobEffect = mobEffect;
        this.strength = strength;
        this.duration = duration;
        this.useCost = useCost;
    }

    @Override
    public double getMaxInput(ItemStack itemStack)
    {
        return 10D;
    }

    @Override
    public Double getCapacity(double feCapacity)
    {
        return capacity;
    }

    @Override
    public Double getUse(double feUse)
    {
        return useCost;
    }

    @Override
    public MobEffectInstance applyEffect(MobEffect effect, int strength, int duration)
    {
        return new MobEffectInstance(effect, strength, duration);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
    {
        if(!(level.isClientSide))
        {
            if(player.isShiftKeyDown())
            {
                final ItemStack item = player.getItemInHand(hand);

                if(!item.getOrCreateTag().getBoolean("activated"))
                {
                    item.getOrCreateTag().putBoolean("activated", true);
                    player.sendSystemMessage(Component.translatable("messages.item.ring.activated").withStyle(ChatFormatting.GREEN));
                }

                else
                {
                    item.getOrCreateTag().putBoolean("activated", false);
                    player.sendSystemMessage(Component.translatable("messages.item.ring.deactivated").withStyle(ChatFormatting.RED));
                }
            }
        }

        return super.use(level, player, hand);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean bool)
    {
        if(entity instanceof final Player player)
        {
            switch (stack.getItem().toString())
            {
                case "basic_absorption_ring", "intermediate_absorption_ring", "advanced_absorption_ring", "ultimate_absorption_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.ABSORPTION, strength, duration));
                        extractFE(stack, useCost, EnergyAction.EXECUTE);
                    }
                }

                case "basic_haste_ring", "intermediate_haste_ring", "advanced_haste_ring", "ultimate_haste_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.DIG_SPEED, strength, duration));
                        extractFE(stack, useCost, EnergyAction.EXECUTE);
                    }
                }

                case "basic_health_ring", "intermediate_health_ring", "advanced_health_ring", "ultimate_health_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.HEALTH_BOOST, strength, duration));
                        extractFE(stack, useCost, EnergyAction.EXECUTE);
                    }
                }

                case "basic_resistance_ring", "intermediate_resistance_ring", "advanced_resistance_ring", "ultimate_resistance_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.DAMAGE_RESISTANCE, strength, duration));
                        extractFE(stack, useCost, EnergyAction.EXECUTE);
                    }
                }


                case "basic_strength_ring", "intermediate_strength_ring", "advanced_strength_ring", "ultimate_strength_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.DAMAGE_BOOST, strength, duration));
                        extractFE(stack, useCost, EnergyAction.EXECUTE);
                    }
                }
            }
        }
/*
       if(entity instanceof final Player player)
        {
            player.maxUpStep = 0.5F;
        }
*/

        //super.inventoryTick(stack, level, entity, slot, bool);
    }
}