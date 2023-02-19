package net.notbaka.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.notbaka.tutorialmod.block.ModBlocks;
import net.notbaka.tutorialmod.item.ModItems;
import net.notbaka.tutorialmod.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID= "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
	}
}
