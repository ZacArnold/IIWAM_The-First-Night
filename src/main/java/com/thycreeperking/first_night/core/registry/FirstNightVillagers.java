package com.thycreeperking.first_night.core.registry;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.common.collect.ImmutableSet;

import com.mojang.datafixers.util.Pair;

import com.thycreeperking.first_night.core.FirstNight;
import net.minecraft.entity.ai.brain.task.GiveHeroGiftsTask;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.village.PointOfInterestType;
import net.minecraft.world.gen.feature.jigsaw.JigsawManager;
import net.minecraft.world.gen.feature.jigsaw.JigsawPattern;
import net.minecraft.world.gen.feature.jigsaw.JigsawPattern.PlacementBehaviour;
import net.minecraft.world.gen.feature.jigsaw.JigsawPiece;
import net.minecraft.world.gen.feature.jigsaw.SingleJigsawPiece;
import net.minecraft.world.gen.feature.structure.DesertVillagePools;
import net.minecraft.world.gen.feature.structure.PlainsVillagePools;
import net.minecraft.world.gen.feature.structure.SavannaVillagePools;
import net.minecraft.world.gen.feature.structure.SnowyVillagePools;
import net.minecraft.world.gen.feature.structure.TaigaVillagePools;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FirstNightVillagers {
    public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(ForgeRegistries.PROFESSIONS, FirstNight.MOD_ID);
    public static final DeferredRegister<PointOfInterestType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, FirstNight.MOD_ID);

    public static final RegistryObject<PointOfInterestType> ENGINEERING_TABLE = POI_TYPES.register("engineering_table", () -> new PointOfInterestType("mechanic", PointOfInterestType.getAllStates(FirstNightBlocks.ENGINEERING_TABLE.get()), 1, 1));
    public static final RegistryObject<PointOfInterestType> DEMOLITION_WORKBENCH = POI_TYPES.register("demolition_workbench", () -> new PointOfInterestType("pyrotechnic", PointOfInterestType.getAllStates(FirstNightBlocks.DEMOLITION_WORKBENCH.get()), 1, 1));

    public static final RegistryObject<VillagerProfession> MECHANIC = PROFESSIONS.register("mechanic", () -> new VillagerProfession("mechanic", ENGINEERING_TABLE.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_BUTCHER));
    public static final RegistryObject<VillagerProfession> PYROTECHNIC = PROFESSIONS.register("pyrotechnic", () -> new VillagerProfession("pyrotechnic", DEMOLITION_WORKBENCH.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_MASON));

    //public static void registerVillagerTypes() {
    //    GiveHeroGiftsTask.GIFTS.put(MECHANIC.get(), new ResourceLocation(FirstNight.MOD_ID, "gameplay/hero_of_the_village/mechanic_gift"));
    //    GiveHeroGiftsTask.GIFTS.put(PYROTECHNIC.get(), new ResourceLocation(FirstNight.MOD_ID, "gameplay/hero_of_the_village/pyrotechnic_gift"));

    //    setupVillagerHouses();
    //}

    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PointOfInterestType.class, "func_221052_a", PointOfInterestType.class).invoke(null, ENGINEERING_TABLE.get());
            ObfuscationReflectionHelper.findMethod(PointOfInterestType.class, "func_221052_a", PointOfInterestType.class).invoke(null, DEMOLITION_WORKBENCH.get());
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static void setupVillagerHouses() {
        PlainsVillagePools.init();
        SnowyVillagePools.init();
        SavannaVillagePools.init();
        DesertVillagePools.init();
        TaigaVillagePools.init();

        addVillagerHouse("mechanic", "plains", 2);
        addVillagerHouse("mechanic", "snowy", 4);
        addVillagerHouse("mechanic", "savanna", 6);
        addVillagerHouse("mechanic", "desert", 5);
        addVillagerHouse("mechanic", "taiga", 7);

        addVillagerHouse("pyrotechnic", "plains", 10);
        addVillagerHouse("pyrotechnic", "snowy", 11);
        addVillagerHouse("pyrotechnic", "savanna", 7);
        addVillagerHouse("pyrotechnic", "desert", 9);
        addVillagerHouse("pyrotechnic", "taiga", 5);
    }

    private static void addVillagerHouse(String type, String biome, int weight) {
        addToPool(new ResourceLocation("village/" + biome + "/houses"), new ResourceLocation(FirstNight.MOD_ID, "village/" + type + "_house_" + biome + "_1"), 5);
    }

    private static void addToPool(ResourceLocation pool, ResourceLocation toAdd, int weight) {
        JigsawPattern old = JigsawManager.REGISTRY.get(pool);
        List<JigsawPiece> shuffled = old.getShuffledPieces(new Random());
        List<Pair<JigsawPiece, Integer>> newPieces = new ArrayList<>();
        for (JigsawPiece p : shuffled) {
            newPieces.add(new Pair<>(p, 1));
        }
        newPieces.add(new Pair<>(new SingleJigsawPiece(toAdd.toString()), weight));
        ResourceLocation something = old.getFallback();
        JigsawManager.REGISTRY.register(new JigsawPattern(pool, something, newPieces, PlacementBehaviour.RIGID));
    }
}