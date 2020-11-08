package com.thycreeperking.first_night.core.registry;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;
import com.thycreeperking.first_night.core.FirstNight;
import com.thycreeperking.first_night.common.item.FirstNightToolTier;
import com.thycreeperking.first_night.core.other.FirstNightFoods;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstNight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FirstNightItems {

    public static final RegistryHelper HELPER = FirstNight.REGISTRY_HELPER;

    //Basic Items
    public static final RegistryObject<Item> CATGUT = HELPER.createItem("catgut", () ->
            new Item(new Item.Properties().group(FirstNight.FIRST_NIGHT_TAB)));

    //Food Items
    public static final RegistryObject<Item> ROASTED_CARROT = HELPER.createItem("roasted_carrot", () ->
            new Item(new Item.Properties().food(FirstNightFoods.ROASTED_CARROT).group(FirstNight.FIRST_NIGHT_TAB)));

    //Tool Items
    public static final RegistryObject<PickaxeItem> FLINT_PICKAXE = HELPER.createItem("flint_pickaxe", () ->
            new PickaxeItem(FirstNightToolTier.FLINT, 0, -2.8F, new Item.Properties().group(FirstNight.FIRST_NIGHT_TAB)));
    public static final RegistryObject<AxeItem> FLINT_AXE = HELPER.createItem("flint_axe", () ->
            new AxeItem(FirstNightToolTier.FLINT,  5, -3.2F, new Item.Properties().group(FirstNight.FIRST_NIGHT_TAB)));

}
