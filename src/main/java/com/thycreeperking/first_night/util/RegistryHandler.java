package com.thycreeperking.first_night.util;

import com.thycreeperking.first_night.blocks.BlockItemBase;
import com.thycreeperking.first_night.blocks.CobblestoneBlock;
import com.thycreeperking.first_night.FirstNight;
import com.thycreeperking.first_night.items.ItemBase;
import com.thycreeperking.first_night.tools.FirstNightItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    //Deferred Registries
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstNight.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS =DeferredRegister.create(ForgeRegistries.BLOCKS, FirstNight.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Items
    public static final RegistryObject<Item> CATGUT = ITEMS.register("catgut", ItemBase::new);
    public static final RegistryObject<Item> ROASTED_CARROT = ITEMS.register("roasted_carrot", ItemBase::new);


    //Tools
    public static final RegistryObject<PickaxeItem> FLINT_PICKAXE = ITEMS.register("flint_pickaxe", () ->
            new PickaxeItem(FirstNightItemTier.FLINT, 0, -2.8F, new Item.Properties().group(FirstNight.FIRST_NIGHT_TAB)));
    public static final RegistryObject<AxeItem> FLINT_AXE = ITEMS.register("flint_axe", () ->
            new AxeItem(FirstNightItemTier.FLINT, 5, -3.2F, new Item.Properties().group(FirstNight.FIRST_NIGHT_TAB)));

    //Blocks
    public static final RegistryObject<Block> ANDESITE_COBBLESTONE_BLOCK = BLOCKS.register("andesite_cobblestone", CobblestoneBlock::new);
    public static final RegistryObject<Block> GRANITE_COBBLESTONE_BLOCK = BLOCKS.register("granite_cobblestone", CobblestoneBlock::new);
    public static final RegistryObject<Block> DIORITE_COBBLESTONE_BLOCK = BLOCKS.register("diorite_cobblestone", CobblestoneBlock::new);


    //Block Items
    public static final RegistryObject<Item> ANDESITE_COBBLESTONE_BLOCK_ITEM = ITEMS.register("andesite_cobblestone", () -> new BlockItemBase(ANDESITE_COBBLESTONE_BLOCK.get()));
    public static final RegistryObject<Item> GRANITE_COBBLESTONE_BLOCK_ITEM = ITEMS.register("granite_cobblestone", () -> new BlockItemBase(GRANITE_COBBLESTONE_BLOCK.get()));
    public static final RegistryObject<Item> DIORITE_COBBLESTONE_BLOCK_ITEM = ITEMS.register("diorite_cobblestone", () -> new BlockItemBase(DIORITE_COBBLESTONE_BLOCK.get()));

}
