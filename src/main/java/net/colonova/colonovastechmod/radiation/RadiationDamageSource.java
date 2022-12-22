package net.colonova.colonovastechmod.radiation;

import net.minecraft.world.damagesource.DamageSource;

public class RadiationDamageSource extends DamageSource
{
    public RadiationDamageSource()
    {
        super("radiation");
    }

    @Override
    public boolean isBypassArmor()
    {
        return true;
    }

    @Override
    public boolean isBypassInvul() {
        return true;
    }

    public boolean isBypassMagic()
    {
        return true;
    }

}
