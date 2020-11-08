package com.thycreeperking.first_night.common.item;

import com.thycreeperking.first_night.core.registry.FirstNightItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum FirstNightToolTier implements IItemTier {

    //Flint Tool Tier
    FLINT(0, 98, 3.0F, 1.5F, 12, () -> {
        return Ingredient.fromItems(FirstNightItems.FLINT_PICKAXE.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantibility;
    private final Supplier<Ingredient> repairMaterial;

    FirstNightToolTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantibility = enchantibility;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantibility;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }
}
