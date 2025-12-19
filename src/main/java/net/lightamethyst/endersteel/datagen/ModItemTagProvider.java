package net.lightamethyst.endersteel.datagen;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.block.ModBlocks;
import net.lightamethyst.endersteel.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Endersteel.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.ENDERSTEEL_SWORD.get())
                .add(ModItems.STEEL_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.ENDERSTEEL_PICKAXE.get())
                .add(ModItems.STEEL_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.ENDERSTEEL_AXE.get())
                .add(ModItems.STEEL_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.ENDERSTEEL_SHOVEL.get())
                .add(ModItems.STEEL_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.ENDERSTEEL_HOE.get())
                .add(ModItems.STEEL_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ENDERSTEEL_HELMET.get())
                .add(ModItems.STEEL_HELMET.get())
                .add(ModItems.ENDERSTEEL_CHESTPLATE.get())
                .add(ModItems.STEEL_CHESTPLATE.get())
                .add(ModItems.ENDERSTEEL_LEGGINGS.get())
                .add(ModItems.STEEL_LEGGINGS.get())
                .add(ModItems.ENDERSTEEL_BOOTS.get())
                .add(ModItems.STEEL_BOOTS.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ENDERWOOD_LOG.get().asItem())
                .add(ModBlocks.ENDERWOOD_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ENDERWOOD_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ENDERWOOD_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.ENDERWOOD_PLANKS.asItem());

    }
}
