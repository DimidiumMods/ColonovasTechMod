package net.colonova.colonovastechmod.fluid;

import net.minecraft.world.damagesource.DamageSource;

public class MoltenFluidDamageSource extends DamageSource
{

    public static final DamageSource MOLTEN_FLUID = (new DamageSource("moltenFluid"));

    private MoltenFluidDamageSource()
    {
        super("moldtenFluid");
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
