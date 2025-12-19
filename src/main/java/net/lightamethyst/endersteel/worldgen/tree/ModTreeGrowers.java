package net.lightamethyst.endersteel.worldgen.tree;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower ENDERWOOD = new TreeGrower(Endersteel.MOD_ID + ":enderwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ENDERWOOD_KEY), Optional.empty());
}
