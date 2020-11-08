package com.thycreeperking.first_night.core;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;
import com.thycreeperking.first_night.core.registry.FirstNightItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("first_night")
@Mod.EventBusSubscriber(modid = FirstNight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class FirstNight
{
    public static final String MOD_ID = "first_night";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);

    public FirstNight() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
            MinecraftForge.EVENT_BUS.register(this);

            REGISTRY_HELPER.getDeferredBlockRegister().register(modEventBus);
            REGISTRY_HELPER.getDeferredItemRegister().register(modEventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup FIRST_NIGHT_TAB = new ItemGroup("first_night_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(FirstNightItems.FLINT_PICKAXE.get());
        }
    };
}
