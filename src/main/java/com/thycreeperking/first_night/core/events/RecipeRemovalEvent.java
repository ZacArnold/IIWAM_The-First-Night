package com.thycreeperking.first_night.core.events;

import com.thycreeperking.first_night.core.FirstNight;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartedEvent;

@Mod.EventBusSubscriber(modid = FirstNight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RecipeRemovalEvent
{
    @SubscribeEvent
    public void onServerStarted(FMLServerStartedEvent event) {
        RecipeManager recipeManager = event.getServer().getRecipeManager();
        
    }
}
