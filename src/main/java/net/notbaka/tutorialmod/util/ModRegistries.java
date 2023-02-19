package net.notbaka.tutorialmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.notbaka.tutorialmod.TutorialMod;
import net.notbaka.tutorialmod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuel();
    }

    private static void registerFuel() {
        TutorialMod.LOGGER.info("Registering Fuels for " + TutorialMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LILAC_FLOWER_BULB, 500);
    }
}
