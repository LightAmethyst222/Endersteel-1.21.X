package net.lightamethyst.endersteel.datagen;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Endersteel.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Put Blocks here \/
        blockWithItem(ModBlocks.ENDERSTEEL_BLOCK);
        blockWithItem(ModBlocks.ENDERSCRAP_ORE);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.RAW_STEEL_BLOCK);

        logBlock(((RotatedPillarBlock) ModBlocks.ENDERWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ENDERWOOD_WOOD.get()), blockTexture(ModBlocks.ENDERWOOD_LOG.get()), blockTexture(ModBlocks.ENDERWOOD_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ENDERWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ENDERWOOD_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ENDERWOOD_LOG.get()), blockTexture(ModBlocks.STRIPPED_ENDERWOOD_LOG.get()));

        blockItem(ModBlocks.ENDERWOOD_LOG);
        blockItem(ModBlocks.ENDERWOOD_WOOD);
        blockItem(ModBlocks.STRIPPED_ENDERWOOD_LOG);
        blockItem(ModBlocks.STRIPPED_ENDERWOOD_WOOD);

        blockWithItem(ModBlocks.ENDERWOOD_PLANKS);

        leavesBlock(ModBlocks.ENDERWOOD_LEAVES);
        saplingBlock(ModBlocks.ENDERWOOD_SAPLING);

    }
    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("endersteel:block/" + deferredBlock.getId().getPath()));
    }

}
