package dev.saperate;

import dev.saperate.elements.example.ExampleElement;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementalExampleAddon implements ModInitializer {
	public static final String MOD_ID = "elementalexampleaddon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		new ExampleElement();

		LOGGER.info("Hello Fabric world!");
	}
}