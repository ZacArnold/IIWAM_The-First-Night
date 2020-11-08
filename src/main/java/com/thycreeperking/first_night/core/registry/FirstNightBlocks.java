package com.thycreeperking.first_night.core.registry;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;
import com.thycreeperking.first_night.core.FirstNight;
import com.thycreeperking.first_night.common.block.CobblestoneBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstNight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FirstNightBlocks {

    public static final RegistryHelper HELPER = FirstNight.REGISTRY_HELPER;

    //Basic Blocks
    public static final RegistryObject<Block> ANDESITE_COBBLESTONE = HELPER.createBlock("andesite_cobblestone", () ->
            new CobblestoneBlock(AbstractBlock.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> GRANITE_COBBLESTONE = HELPER.createBlock("granite_cobblestone", () ->
            new CobblestoneBlock(AbstractBlock.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> DIORITE_COBBLESTONE = HELPER.createBlock("diorite_cobblestone", () ->
            new CobblestoneBlock(AbstractBlock.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);

    //COMPAT BLOCKS

    //Quark
    public static final RegistryObject<Block> BASALT_COBBLESTONE = HELPER.createCompatBlock("quark", "basalt_cobblestone", () ->
            new CobblestoneBlock(AbstractBlock.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> JASPER_COBBLESTONE = HELPER.createCompatBlock("quark", "jasper_cobblestone", () ->
            new CobblestoneBlock(AbstractBlock.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE = HELPER.createCompatBlock("quark", "limestone_cobblestone", () ->
            new CobblestoneBlock(AbstractBlock.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MARBLE_COBBLESTONE = HELPER.createCompatBlock("quark", "marble_cobblestone", () ->
            new CobblestoneBlock(AbstractBlock.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> SLATE_COBBLESTONE = HELPER.createCompatBlock("quark", "slate_cobblestone", () ->
            new CobblestoneBlock(AbstractBlock.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);

}
