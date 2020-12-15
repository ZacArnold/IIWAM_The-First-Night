package com.thycreeperking.first_night.core.registry;


import com.google.common.collect.ImmutableSet;
import com.thycreeperking.first_night.core.FirstNight;
import net.minecraft.entity.ai.brain.task.GiveHeroGiftsTask;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.village.PointOfInterestType;
import net.minecraft.world.gen.feature.jigsaw.JigsawPattern;
import net.minecraft.world.gen.feature.jigsaw.JigsawPatternRegistry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.lang.reflect.InvocationTargetException;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FirstNightVillagers {
    public static final DeferredRegister<VillagerProfession> PROFFESSIONS = DeferredRegister.create(ForgeRegistries.PROFESSIONS, FirstNight.MOD_ID);
    public static final DeferredRegister<PointOfInterestType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, FirstNight.MOD_ID);

    public static final RegistryObject<PointOfInterestType> ENGINEERING_TABLE = POI_TYPES.register("engineering_table", () -> new PointOfInterestType("mechanic", PointOfInterestType.getAllStates(FirstNightBlocks.ENGINEERING_TABLE.get()), 1, 1));
    public static final RegistryObject<VillagerProfession> MECHANIC = PROFFESSIONS.register("mechanic", () -> new VillagerProfession("mechanic", ENGINEERING_TABLE.get(), ImmutableSet.of(Items.REDSTONE, Items.REDSTONE_BLOCK), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH));

    public static void registerVillagers() {
        registerGifts();
        registerPointOfInterests();
        //registerVillagerHouses();
    }

    private static void registerGifts() {
        GiveHeroGiftsTask.GIFTS.put(MECHANIC.get(), new ResourceLocation(FirstNight.MOD_ID, "gameplay/hero_of_the_village/mechanic_gift"));
    }

    private static void registerPointOfInterests() {
        try {
            ObfuscationReflectionHelper.findMethod(PointOfInterestType.class, "func_221052_a", PointOfInterestType.class).invoke(null, ENGINEERING_TABLE.get());
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    //private static void registerVillagerHouses() {
    //    JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(FirstNight.MOD_ID, "village/mechanic")))
    //}
}
