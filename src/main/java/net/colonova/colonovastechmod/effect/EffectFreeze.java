package net.colonova.colonovastechmod.effect;

import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class EffectFreeze extends MobEffect
{
    public EffectFreeze()
    {
        super(MobEffectCategory.NEUTRAL, 0x98D982);
    }

    @Override
    public int getColor()
    {
        return Mth.hsvToRgb(0, 0,0);
    }
}
