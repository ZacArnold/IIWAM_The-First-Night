package com.thycreeperking.iiwam.init;

import com.thycreeperking.iiwam.IIWAM;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(IIWAM.MOD_ID)
@Mod.EventBusSubscriber(modid = IIWAM.MOD_ID, bus = Bus.MOD)
public class BlockInit
{
    //Cobblestone Variants
    public static final Block andesite_cobblestone = null;
    public static final Block granite_cobblestone = null;
    public static final Block diorite_cobblestone = null;
    public static final Block basalt_cobblestone = null;
    public static final Block jasper_cobblestone = null;
    public static final Block limestone_cobblestone = null;
    public static final Block marble_cobblestone = null;
    public static final Block slate_cobblestone = null;

    //Brick Variants
    public static final Block black_stained_bricks = null;
    public static final Block blue_stained_bricks = null;
    public static final Block brown_stained_bricks = null;
    public static final Block cyan_stained_bricks = null;
    public static final Block gray_stained_bricks = null;
    public static final Block green_stained_bricks = null;
    public static final Block light_blue_stained_bricks = null;
    public static final Block light_gray_stained_bricks = null;
    public static final Block lime_stained_bricks = null;
    public static final Block magenta_stained_bricks = null;
    public static final Block orange_stained_bricks = null;
    public static final Block pink_stained_bricks = null;
    public static final Block purple_stained_bricks = null;
    public static final Block red_stained_bricks = null;
    public static final Block white_stained_bricks = null;
    public static final Block yellow_stained_bricks = null;


    //Block Register
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        //COBBLESTONE VARIANTS//
        //Andesite Cobblestone
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,30))
                .setRegistryName("andesite_cobblestone")
        );
        //Granite Cobblestone
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,30))
                .setRegistryName("granite_cobblestone")
        );
        //Diorite Cobblestone
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,30))
                .setRegistryName("diorite_cobblestone")
        );
        //Basalt Cobblestone
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,30))
                .setRegistryName("basalt_cobblestone")
        );
        //Jasper Cobblestone
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,30))
                .setRegistryName("jasper_cobblestone")
        );
        //Limestone Cobblestone
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,30))
                .setRegistryName("limestone_cobblestone")
        );
        //Marble Cobblestone
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,30))
                .setRegistryName("marble_cobblestone")
        );
        //Slate Cobblestone
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,30))
                .setRegistryName("slate_cobblestone")
        );


        //BRICK VARIANTS//
        //Black Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("black_stained_bricks")
        );
        //Blue Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("blue_stained_bricks")
        );
        //Brown Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("brown_stained_bricks")
        );
        //Cyan Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("cyan_stained_bricks")
        );
        //Gray Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("gray_stained_bricks")
        );
        //Green Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("green_stained_bricks")
        );
        //Light Blue Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("light_blue_stained_bricks")
        );
        //Light Gray Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("light_gray_stained_bricks")
        );
        //Lime Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("lime_stained_bricks")
        );
        //Magenta Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("magenta_stained_bricks")
        );//Orange Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("orange_stained_bricks")
        );
        //Pink Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("pink_stained_bricks")
        );
        //Purple Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("purple_stained_bricks")
        );
        //Red Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("red_stained_bricks")
        );
        //White Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("white_stained_bricks")
        );
        //Yellow Stained Bricks
        event.getRegistry().register(new Block(
                Block.Properties
                        .create(Material.ROCK).sound(SoundType.STONE)
                        .harvestLevel(0).harvestTool(ToolType.PICKAXE)
                        .hardnessAndResistance(2,6))
                .setRegistryName("yellow_stained_bricks")
        );



    }
    
    //Block Item Register
    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)
    {
        assert false;
        //Cobblestone Variants
        event.getRegistry().register(new BlockItem(andesite_cobblestone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("andesite_cobblestone"));
        event.getRegistry().register(new BlockItem(granite_cobblestone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("granite_cobblestone"));
        event.getRegistry().register(new BlockItem(diorite_cobblestone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("diorite_cobblestone"));
        event.getRegistry().register(new BlockItem(basalt_cobblestone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("basalt_cobblestone"));
        event.getRegistry().register(new BlockItem(jasper_cobblestone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("jasper_cobblestone"));
        event.getRegistry().register(new BlockItem(limestone_cobblestone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("limestone_cobblestone"));
        event.getRegistry().register(new BlockItem(marble_cobblestone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("marble_cobblestone"));
        event.getRegistry().register(new BlockItem(slate_cobblestone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("slate_cobblestone"));

        //Brick Variants
        event.getRegistry().register(new BlockItem(black_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("black_stained_bricks"));
        event.getRegistry().register(new BlockItem(blue_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("blue_stained_bricks"));
        event.getRegistry().register(new BlockItem(brown_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("brown_stained_bricks"));
        event.getRegistry().register(new BlockItem(cyan_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cyan_stained_bricks"));
        event.getRegistry().register(new BlockItem(gray_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gray_stained_bricks"));
        event.getRegistry().register(new BlockItem(green_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("green_stained_bricks"));
        event.getRegistry().register(new BlockItem(light_blue_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("light_blue_stained_bricks"));
        event.getRegistry().register(new BlockItem(light_gray_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("light_gray_stained_bricks"));
        event.getRegistry().register(new BlockItem(lime_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("lime_stained_bricks"));
        event.getRegistry().register(new BlockItem(magenta_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("magenta_stained_bricks"));
        event.getRegistry().register(new BlockItem(orange_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("orange_stained_bricks"));
        event.getRegistry().register(new BlockItem(pink_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("pink_stained_bricks"));
        event.getRegistry().register(new BlockItem(purple_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("purple_stained_bricks"));
        event.getRegistry().register(new BlockItem(red_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("red_stained_bricks"));
        event.getRegistry().register(new BlockItem(white_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("white_stained_bricks"));
        event.getRegistry().register(new BlockItem(yellow_stained_bricks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("yellow_stained_bricks"));
    }
}
