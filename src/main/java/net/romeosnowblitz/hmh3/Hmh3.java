package net.romeosnowblitz.hmh3;

import net.fabricmc.api.ModInitializer;
import net.romeosnowblitz.hmh3.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hmh3 implements ModInitializer {
	public static String MOD_ID = "hmh3";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}