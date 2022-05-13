package net.viktornr.fabric_aot;

import net.fabricmc.api.ModInitializer;
import net.viktornr.fabric_aot.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.LogManager;

public class FabricAoT implements ModInitializer {
	public static final String MOD_ID = "fabric_aot";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
