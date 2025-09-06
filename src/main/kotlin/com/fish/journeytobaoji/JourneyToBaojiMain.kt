package com.fish.journeytobaoji

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

object JourneyToBaojiMain : ModInitializer {
    const val MODID: String = "JourneyToBaoji"
    val logger: Logger = LogManager.getLogger(MODID)
    override fun onInitialize() {
        // This code runs as soon as Minecraft is in a **mod-load-ready** state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        logger.info("Create a World!")
    }
}