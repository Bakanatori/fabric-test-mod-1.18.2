package net.notbaka.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.notbaka.tutorialmod.TutorialMod;

public class ModItemGroup {
    public static final ItemGroup MYTHRIL = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "mythril"),
            () -> new ItemStack(ModItems.MYTHRIL_INGOT));
}
