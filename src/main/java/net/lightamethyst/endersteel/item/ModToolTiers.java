package net.lightamethyst.endersteel.item;

import net.lightamethyst.endersteel.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier ENDERSTEEL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ENDERSTEEL_TOOL,
            2500, 10f, 5f, 18, () -> Ingredient.of(ModItems.ENDERSTEEL_INGOT));

    public static final Tier STEEL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL,
            905, 7f, 2.5f, 12, () -> Ingredient.of(ModItems.STEEL_INGOT));
}
