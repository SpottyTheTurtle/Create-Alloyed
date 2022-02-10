package com.molybdenum.alloyed.data;

import com.molybdenum.alloyed.Alloyed;
import com.molybdenum.alloyed.client.registry.ModPonders;
import com.molybdenum.alloyed.common.registry.ModBlocks;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Alloyed.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataEventsHandler {
    // Datagen
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void gatherData(GatherDataEvent event) {
        Alloyed.LOGGER.debug("Gathering data for Alloyed ...");

        // Correct bronze block lang
        ModBlocks.fixBronzeLang();
        // Register ponders and generate ponder lang
        ModPonders.safeRegister();
        ModPonders.registerLang();

        Alloyed.LOGGER.debug("Finished gathering data for Alloyed");
    }
}
