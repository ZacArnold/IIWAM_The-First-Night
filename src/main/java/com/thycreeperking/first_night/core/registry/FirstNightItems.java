package com.thycreeperking.first_night.core.registry;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;
import com.thycreeperking.first_night.common.item.FireStarterItem;
import com.thycreeperking.first_night.core.FirstNight;
import com.thycreeperking.first_night.core.other.FirstNightFoods;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstNight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FirstNightItems {

    public static final RegistryHelper HELPER = FirstNight.REGISTRY_HELPER;

    //Basic Items
    public static final RegistryObject<Item> CATGUT = HELPER.createItem("catgut", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    //Food Items
    public static final RegistryObject<Item> ROASTED_CARROT = HELPER.createItem("roasted_carrot", () ->
            new Item(new Item.Properties().food(FirstNightFoods.ROASTED_CARROT).group(ItemGroup.FOOD)));

    //Tool Items
    public static final RegistryObject<Item> FIRE_STARTER = HELPER.createItem("fire_starter", () ->
    new FireStarterItem(new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
}
