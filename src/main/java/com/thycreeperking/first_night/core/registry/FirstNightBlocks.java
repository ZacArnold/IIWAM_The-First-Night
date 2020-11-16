package com.thycreeperking.first_night.core.registry;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;
import com.thycreeperking.first_night.core.FirstNight;
import net.minecraft.block.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstNight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FirstNightBlocks {

    public static final RegistryHelper HELPER = FirstNight.REGISTRY_HELPER;


    ////////////////////////////////////////////////////////////FIRST NIGHT BLOCKS////////////////////////////////////////////////////////////
    //Cobblestone Blocks//
    //Andesite Cobble Block Set
    public static final RegistryObject<Block> ANDESITE_COBBLESTONE = HELPER.createBlock("andesite_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ANDESITE_COBBLESTONE_SLAB = HELPER.createBlock("andesite_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ANDESITE_COBBLESTONE_STAIRS = HELPER.createBlock("andesite_cobblestone_stairs", () ->
            new StairsBlock(ANDESITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ANDESITE_COBBLESTONE_WALL = HELPER.createBlock("andesite_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Andesite Cobble Block Set
    public static final RegistryObject<Block> MOSSY_ANDESITE_COBBLESTONE = HELPER.createBlock("mossy_andesite_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_ANDESITE_COBBLESTONE_SLAB = HELPER.createBlock("mossy_andesite_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_ANDESITE_COBBLESTONE_STAIRS = HELPER.createBlock("mossy_andesite_cobblestone_stairs", () ->
            new StairsBlock(MOSSY_ANDESITE_COBBLESTONE.get().getDefaultState(),Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_ANDESITE_COBBLESTONE_WALL = HELPER.createBlock("mossy_andesite_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);

    //Diorite Cobble Block Set
    public static final RegistryObject<Block> DIORITE_COBBLESTONE = HELPER.createBlock("diorite_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> DIORITE_COBBLESTONE_SLAB = HELPER.createBlock("diorite_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> DIORITE_COBBLESTONE_STAIRS = HELPER.createBlock("diorite_cobblestone_stairs", () ->
            new StairsBlock(DIORITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> DIORITE_COBBLESTONE_WALL = HELPER.createBlock("diorite_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Diorite Cobble Block Set
    public static final RegistryObject<Block> MOSSY_DIORITE_COBBLESTONE = HELPER.createBlock("mossy_diorite_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_DIORITE_COBBLESTONE_SLAB = HELPER.createBlock("mossy_diorite_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_DIORITE_COBBLESTONE_STAIRS = HELPER.createBlock("mossy_diorite_cobblestone_stairs", () ->
            new StairsBlock(MOSSY_DIORITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_DIORITE_COBBLESTONE_WALL = HELPER.createBlock("mossy_diorite_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);

    //Granite Cobble Block Set
    public static final RegistryObject<Block> GRANITE_COBBLESTONE = HELPER.createBlock("granite_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> GRANITE_COBBLESTONE_SLAB = HELPER.createBlock("granite_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> GRANITE_COBBLESTONE_STAIRS = HELPER.createBlock("granite_cobblestone_stairs", () ->
            new StairsBlock(GRANITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> GRANITE_COBBLESTONE_WALL = HELPER.createBlock("granite_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Granite Cobble Block Set
    public static final RegistryObject<Block> MOSSY_GRANITE_COBBLESTONE = HELPER.createBlock("mossy_granite_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_GRANITE_COBBLESTONE_SLAB = HELPER.createBlock("mossy_granite_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_GRANITE_COBBLESTONE_STAIRS = HELPER.createBlock("mossy_granite_cobblestone_stairs", () ->
            new StairsBlock(MOSSY_GRANITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_GRANITE_COBBLESTONE_WALL = HELPER.createBlock("mossy_granite_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);




    ////////////////////////////////////////////////////////////COMPAT BLOCKS////////////////////////////////////////////////////////////
    //First Night//
    //Andesite Cobble Bricks Block Set
    public static final RegistryObject<Block> ANDESITE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "andesite_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ANDESITE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","andesite_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ANDESITE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","andesite_cobblestone_bricks_stairs", () ->
            new StairsBlock(ANDESITE_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ANDESITE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","andesite_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Andesite Cobble Bricks Block Set
    public static final RegistryObject<Block> MOSSY_ANDESITE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "mossy_andesite_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_ANDESITE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","mossy_andesite_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_ANDESITE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","mossy_andesite_cobblestone_bricks_stairs", () ->
            new StairsBlock(MOSSY_ANDESITE_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_ANDESITE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","mossy_andesite_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);

    //Diorite Cobble Bricks Block Set
    public static final RegistryObject<Block> DIORITE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "diorite_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> DIORITE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","diorite_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> DIORITE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","diorite_cobblestone_bricks_stairs", () ->
            new StairsBlock(DIORITE_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> DIORITE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","diorite_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Diorite Cobble Bricks Block Set
    public static final RegistryObject<Block> MOSSY_DIORITE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "mossy_diorite_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_DIORITE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","mossy_diorite_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_DIORITE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","mossy_diorite_cobblestone_bricks_stairs", () ->
            new StairsBlock(MOSSY_DIORITE_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_DIORITE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","mossy_diorite_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);

    //Granite Cobble Bricks Block Set
    public static final RegistryObject<Block> GRANITE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "granite_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> GRANITE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","granite_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> GRANITE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","granite_cobblestone_bricks_stairs", () ->
            new StairsBlock(GRANITE_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> GRANITE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","granite_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Granite Cobble Bricks Block Set
    public static final RegistryObject<Block> MOSSY_GRANITE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "mossy_granite_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_GRANITE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","mossy_granite_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_GRANITE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","mossy_granite_cobblestone_bricks_stairs", () ->
            new StairsBlock(MOSSY_GRANITE_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_GRANITE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","mossy_granite_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);


    ///Quark///
    //Voidstone Cobble Block Set
    public static final RegistryObject<Block> BASALT_COBBLESTONE = HELPER.createCompatBlock("quark", "basalt_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> BASALT_COBBLESTONE_SLAB = HELPER.createCompatBlock("quark","basalt_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> BASALT_COBBLESTONE_STAIRS = HELPER.createCompatBlock("quark","basalt_cobblestone_stairs", () ->
            new StairsBlock(BASALT_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> BASALT_COBBLESTONE_WALL = HELPER.createCompatBlock("quark","basalt_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Chorus Voidstone Cobble Block Set
    public static final RegistryObject<Block> CHORUS_BASALT_COBBLESTONE = HELPER.createCompatBlock("quark", "chorus_basalt_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> CHORUS_BASALT_COBBLESTONE_SLAB = HELPER.createCompatBlock("quark","chorus_basalt_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> CHORUS_BASALT_COBBLESTONE_STAIRS = HELPER.createCompatBlock("quark","chorus_basalt_cobblestone_stairs", () ->
            new StairsBlock(CHORUS_BASALT_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> CHORUS_BASALT_COBBLESTONE_WALL = HELPER.createCompatBlock("quark","chorus_basalt_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Voidstone Cobble Bricks Block Set
    public static final RegistryObject<Block> BASALT_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "basalt_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> BASALT_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","basalt_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> BASALT_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","basalt_cobblestone_bricks_stairs", () ->
            new StairsBlock(BASALT_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> BASALT_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","basalt_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Chorus Voidstone Cobble Bricks Block Set
    public static final RegistryObject<Block> CHORUS_BASALT_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "chorus_basalt_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> CHORUS_BASALT_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","chorus_basalt_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> CHORUS_BASALT_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","chorus_basalt_cobblestone_bricks_stairs", () ->
            new StairsBlock(CHORUS_BASALT_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> CHORUS_BASALT_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","chorus_basalt_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);

    //Jasper Cobble Block Set
    public static final RegistryObject<Block> JASPER_COBBLESTONE = HELPER.createCompatBlock("quark", "jasper_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> JASPER_COBBLESTONE_SLAB = HELPER.createCompatBlock("quark","jasper_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> JASPER_COBBLESTONE_STAIRS = HELPER.createCompatBlock("quark","jasper_cobblestone_stairs", () ->
            new StairsBlock(JASPER_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> JASPER_COBBLESTONE_WALL = HELPER.createCompatBlock("quark","jasper_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Jasper Cobble Block Set
    public static final RegistryObject<Block> MOSSY_JASPER_COBBLESTONE = HELPER.createCompatBlock("quark", "mossy_jasper_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_JASPER_COBBLESTONE_SLAB = HELPER.createCompatBlock("quark","mossy_jasper_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_JASPER_COBBLESTONE_STAIRS = HELPER.createCompatBlock("quark","mossy_jasper_cobblestone_stairs", () ->
            new StairsBlock(MOSSY_JASPER_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_JASPER_COBBLESTONE_WALL = HELPER.createCompatBlock("quark","mossy_jasper_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Jasper Cobble Bricks Block Set
    public static final RegistryObject<Block> JASPER_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "jasper_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> JASPER_COBBLESTONE_SLAB_BRICKS = HELPER.createCompatBlock("quark","jasper_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> JASPER_COBBLESTONE_STAIRS_BRICKS = HELPER.createCompatBlock("quark","jasper_cobblestone_bricks_stairs", () ->
            new StairsBlock(JASPER_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> JASPER_COBBLESTONE_WALL_BRICKS = HELPER.createCompatBlock("quark","jasper_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Jasper Cobble Bricks Block Set
    public static final RegistryObject<Block> MOSSY_JASPER_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "mossy_jasper_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_JASPER_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","mossy_jasper_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_JASPER_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","mossy_jasper_cobblestone_bricks_stairs", () ->
            new StairsBlock(MOSSY_JASPER_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_JASPER_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","mossy_jasper_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);

    //Limestone Cobble Block Set
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE = HELPER.createCompatBlock("quark", "limestone_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_SLAB = HELPER.createCompatBlock("quark","limestone_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_STAIRS = HELPER.createCompatBlock("quark","limestone_cobblestone_stairs", () ->
            new StairsBlock(LIMESTONE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_WALL = HELPER.createCompatBlock("quark","limestone_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Limestone Cobble Block Set
    public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE = HELPER.createCompatBlock("quark", "mossy_limestone_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_SLAB = HELPER.createCompatBlock("quark","mossy_limestone_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_STAIRS = HELPER.createCompatBlock("quark","mossy_limestone_cobblestone_stairs", () ->
            new StairsBlock(MOSSY_LIMESTONE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_WALL = HELPER.createCompatBlock("quark","mossy_limestone_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Limestone Cobble Bricks Block Set
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "limestone_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","limestone_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","limestone_cobblestone_bricks_stairs", () ->
            new StairsBlock(LIMESTONE_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","limestone_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Limestone Cobble Bricks Block Set
    public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "mossy_limestone_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","mossy_limestone_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","mossy_limestone_cobblestone_bricks_stairs", () ->
            new StairsBlock(MOSSY_LIMESTONE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","mossy_limestone_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);

    //Marble Cobble Block Set
    public static final RegistryObject<Block> MARBLE_COBBLESTONE = HELPER.createCompatBlock("quark", "marble_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MARBLE_COBBLESTONE_SLAB = HELPER.createCompatBlock("quark","marble_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MARBLE_COBBLESTONE_STAIRS = HELPER.createCompatBlock("quark","marble_cobblestone_stairs", () ->
            new StairsBlock(MARBLE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MARBLE_COBBLESTONE_WALL = HELPER.createCompatBlock("quark","marble_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Marble Cobble Block Set
    public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE = HELPER.createCompatBlock("quark", "mossy_marble_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_SLAB = HELPER.createCompatBlock("quark","mossy_marble_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_STAIRS = HELPER.createCompatBlock("quark","mossy_marble_cobblestone_stairs", () ->
            new StairsBlock(MOSSY_MARBLE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_WALL = HELPER.createCompatBlock("quark","mossy_marble_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Marble Cobble Bricks Block Set
    public static final RegistryObject<Block> MARBLE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "marble_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MARBLE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","marble_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MARBLE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","marble_cobblestone_bricks_stairs", () ->
            new StairsBlock(MARBLE_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MARBLE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","marble_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Mossy Marble Cobble Bricks Block Set
    public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "mossy_marble_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","mossy_marble_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","mossy_marble_cobblestone_bricks_stairs", () ->
            new StairsBlock(MOSSY_MARBLE_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","mossy_marble_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);

    //Slate Cobble Block Set
    public static final RegistryObject<Block> SLATE_COBBLESTONE = HELPER.createCompatBlock("quark", "slate_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> SLATE_COBBLESTONE_SLAB = HELPER.createCompatBlock("quark","slate_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> SLATE_COBBLESTONE_STAIRS = HELPER.createCompatBlock("quark","slate_cobblestone_stairs", () ->
            new StairsBlock(SLATE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> SLATE_COBBLESTONE_WALL = HELPER.createCompatBlock("quark","slate_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Icy Slate Cobble Block Set
    public static final RegistryObject<Block> ICY_SLATE_COBBLESTONE = HELPER.createCompatBlock("quark", "icy_slate_cobblestone", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ICY_SLATE_COBBLESTONE_SLAB = HELPER.createCompatBlock("quark","icy_slate_cobblestone_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ICY_SLATE_COBBLESTONE_STAIRS = HELPER.createCompatBlock("quark","icy_slate_cobblestone_stairs", () ->
            new StairsBlock(ICY_SLATE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ICY_SLATE_COBBLESTONE_WALL = HELPER.createCompatBlock("quark","icy_slate_cobblestone_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Slate Cobble Bricks Block Set
    public static final RegistryObject<Block> SLATE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "slate_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> SLATE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","slate_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> SLATE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","slate_cobblestone_bricks_stairs", () ->
            new StairsBlock(SLATE_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> SLATE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","slate_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
    //Icy Slate Cobble Bricks Block Set
    public static final RegistryObject<Block> ICY_SLATE_COBBLESTONE_BRICKS = HELPER.createCompatBlock("quark", "icy_slate_cobblestone_bricks", () ->
            new Block(Block.Properties.from(Blocks.COBBLESTONE)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ICY_SLATE_COBBLESTONE_BRICKS_SLAB = HELPER.createCompatBlock("quark","icy_slate_cobblestone_bricks_slab", () ->
            new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ICY_SLATE_COBBLESTONE_BRICKS_STAIRS = HELPER.createCompatBlock("quark","icy_slate_cobblestone_bricks_stairs", () ->
            new StairsBlock(ICY_SLATE_COBBLESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)), FirstNight.FIRST_NIGHT_TAB);
    public static final RegistryObject<Block> ICY_SLATE_COBBLESTONE_BRICKS_WALL = HELPER.createCompatBlock("quark","icy_slate_cobblestone_bricks_wall", () ->
            new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)), FirstNight.FIRST_NIGHT_TAB);
}
