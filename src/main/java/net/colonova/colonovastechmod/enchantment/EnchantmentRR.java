package net.colonova.colonovastechmod.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class EnchantmentRR extends Enchantment
{

    private static final EquipmentSlot[] ARMOR_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};

    public EnchantmentRR()
    {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.ARMOR, ARMOR_SLOTS);
    }

    @Override
    public int getMinLevel()
    {
        return 1;
    }

    @Override
    public int getMaxLevel()
    {
        return 1;
    }

    @Override
    public int getMinCost(int p_45102_)
    {
        return p_45102_ * 25;
    }

    @Override
    public int getMaxCost(int p_45105_)
    {
        return this.getMinCost(p_45105_) + 50;
    }

    @Override
    public boolean isTreasureOnly()
    {
        return false;
    }
}
