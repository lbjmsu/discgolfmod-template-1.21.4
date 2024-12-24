package ejcraft2.discgolfmod;

import ejcraft2.discgolfmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiscGolfMod implements ModInitializer {
	public static final String MOD_ID = "discgolfmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.

		ModItems.initialize();
	}
}