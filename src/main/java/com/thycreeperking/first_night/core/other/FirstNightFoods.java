package com.thycreeperking.first_night.core.other;

import com.thycreeperking.first_night.core.FirstNight;
import net.minecraft.item.Food;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstNight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FirstNightFoods {

    public static final Food ROASTED_CARROT = new Food.Builder().hunger(6).saturation(0.5F).build();

}
