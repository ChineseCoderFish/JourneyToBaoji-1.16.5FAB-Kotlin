package com.fish.journeytobaoji

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager

object JourneyToBaojiMain : ModInitializer {
    private val logger = LogManager.getLogger("journeytobaoji-1165fab-kotlin")
    override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
	}
}