package com.thycreeperking.iiwam.init;

import com.google.common.eventbus.Subscribe;
import com.thycreeperking.iiwam.IIWAM;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = IIWAM.MOD_ID, bus = Bus.MOD)
@ObjectHolder(IIWAM.MOD_ID)
public class ItemInit
{
    //Items
    public static final Item catgut = null;
    public static final Item dough = null;
    public static final Item flour = null;
    public static final Item roasted_carrot = null;
    public static final Item sweet_berry_pie = null;

    //Item Register
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        //Catgut
        event.getRegistry().register(new Item(new
                Item.Properties()
                .group(ItemGroup.MISC))
                .setRegistryName("catgut")
        );
        //Dough
        event.getRegistry().register(new Item(new
                Item.Properties()
                .group(ItemGroup.FOOD))
                .setRegistryName("dough")
        );
        //Flour
        event.getRegistry().register(new Item(new
                Item.Properties()
                .group(ItemGroup.FOOD))
                .setRegistryName("flour")
        );
        //Roasted Carrot
        event.getRegistry().register(new Item(new
                Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder().hunger(5).saturation(0.6F).build()))
                .setRegistryName("roasted_carrot")
        );
        //Sweet Berry Pie
        event.getRegistry().register(new Item (new
                Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder().hunger(6).saturation(0.5F).build()))
                .setRegistryName("sweet_berry_pie")
        );
    }
    
}
