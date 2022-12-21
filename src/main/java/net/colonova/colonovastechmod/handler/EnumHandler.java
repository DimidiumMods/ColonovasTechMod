package net.colonova.colonovastechmod.handler;

import net.colonova.colonovastechmod.handler.registry.ItemRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.sql.Ref;
import java.util.function.Supplier;

public class EnumHandler
{
    public enum RubberArmorMaterial implements ArmorMaterial
    {
        PLASTIC("plastic", 1500, new int[] { 2, 2, 2, 2 }, 0, SoundEvents.ARMOR_EQUIP_LEATHER, 3f, 0.1f, () -> Ingredient.of(ItemRegistry.PLASTIC.get()));

        private final int[] MAX_DAMAGE_ARRAY = new int[] { 13, 15, 16, 11 };
        private final String name;
        private final int durability;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundOnEquip;
        private final float toughness;
        private final float knockbackResistance;
        private final Supplier<Ingredient> repairMaterial;

        RubberArmorMaterial(String nameIn, int durabilityIn, int[] damageReductionAmountArrayIn, int enchantabilityIn, SoundEvent soundOnEquip, float toughnessIn, float knockbackResistanceIn, Supplier<Ingredient> repairMaterialIn)
        {
            this.name = Reference.MOD_ID + ":" + nameIn;
            this.durability = durabilityIn;
            this.damageReductionAmountArray = damageReductionAmountArrayIn;
            this.enchantability = enchantabilityIn;
            this.soundOnEquip = soundOnEquip;
            this.toughness = toughnessIn;
            this.knockbackResistance = knockbackResistanceIn;
            this.repairMaterial = repairMaterialIn;
        }

        @OnlyIn(Dist.CLIENT)
        public String getName()
        {
            return this.name;
        }

        @Override
        public int getDurabilityForSlot(EquipmentSlot slotIn)
        {
            return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.durability;
        }

        @Override
        public int getDefenseForSlot(EquipmentSlot slotIn)
        {
            return this.damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantmentValue()
        {
            return this.enchantability;
        }

        @Override
        public SoundEvent getEquipSound()
        {
            return this.soundOnEquip;
        }

        @Override
        public float getToughness()
        {
            return this.toughness;
        }

        @Override
        public float getKnockbackResistance()
        {
            return this.knockbackResistance;
        }

        @Override
        public Ingredient getRepairIngredient()
        {
            return this.repairMaterial.get();
        }
    }
}
