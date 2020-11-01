package com.thycreeperking.first_night.util;

import com.sun.javafx.menu.CheckMenuItemBase;
import com.thycreeperking.first_night.first_night;
import com.thycreeperking.first_night.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, first_night.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS =DeferredRegister.create(ForgeRegistries.BLOCKS, first_night.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Items
    public static final RegistryObject<Item> CATGUT = ITEMS.register("catgut", ItemBase::new);
    public static final RegistryObject<Item> ROASTED_CARROT = ITEMS.register("roasted_carrot", ItemBase::new);




}
