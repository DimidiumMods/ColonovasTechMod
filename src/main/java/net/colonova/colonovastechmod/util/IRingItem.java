package net.colonova.colonovastechmod.util;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;

public interface IRingItem
{
    Double getCapacity(double feCapacity);

    Double getUse (double feUse);

    MobEffectInstance applyEffect(MobEffect effect, int strength, int duration);
}