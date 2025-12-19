package net.lightamethyst.endersteel.block;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.block.custom.ModFlamableRotatedPillarBlock;
import net.lightamethyst.endersteel.item.ModItems;
import net.lightamethyst.endersteel.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Endersteel.MOD_ID);

    //add Blocks here \/
    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).strength(6.0F, 6.0F)));
    public static final DeferredBlock<Block> RAW_STEEL_BLOCK = registerBlock("raw_steel_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).strength(6.0F, 6.0F)));
    public static final DeferredBlock<Block> ENDERSTEEL_BLOCK = registerBlock("endersteel_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> ENDERSCRAP_ORE = registerBlock("enderscrap_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
                    .strength(30.0F, 1200.0F).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> ENDERWOOD_LOG = registerBlock("enderwood_log",
            () -> new ModFlamableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_STEM)));
    public static final DeferredBlock<Block> ENDERWOOD_WOOD = registerBlock("enderwood_wood",
            () -> new ModFlamableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HYPHAE)));
    public static final DeferredBlock<Block> STRIPPED_ENDERWOOD_LOG = registerBlock("stripped_enderwood_log",
            () -> new ModFlamableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_WARPED_STEM)));
    public static final DeferredBlock<Block> STRIPPED_ENDERWOOD_WOOD = registerBlock("stripped_enderwood_wood",
            () -> new ModFlamableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_WARPED_HYPHAE)));

    public static final DeferredBlock<Block> ENDERWOOD_PLANKS = registerBlock("enderwood_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final DeferredBlock<Block> ENDERWOOD_LEAVES = registerBlock("enderwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final DeferredBlock<Block> ENDERWOOD_SAPLING = registerBlock("enderwood_sapling",
            () -> new SaplingBlock(ModTreeGrowers.ENDERWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
