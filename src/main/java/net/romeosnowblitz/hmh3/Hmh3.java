package net.romeosnowblitz.hmh3;

import net.fabricmc.api.ModInitializer;
import net.romeosnowblitz.hmh3.block.ModBlocks;
import net.romeosnowblitz.hmh3.entity.ModBlockEntities;
import net.romeosnowblitz.hmh3.item.ModItemGroup;
import net.romeosnowblitz.hmh3.item.ModItems;
import net.romeosnowblitz.hmh3.painting.ModPaintings;
import net.romeosnowblitz.hmh3.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hmh3 implements ModInitializer {
	public static String MOD_ID = "hmh3";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerModItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModPaintings.registerPaintings();
		ModRegistries.ModStuffs();
		ModBlockEntities.registerAllBlockEntities();

	}
}