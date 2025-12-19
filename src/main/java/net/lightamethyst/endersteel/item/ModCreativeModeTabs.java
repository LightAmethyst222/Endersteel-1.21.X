package net.lightamethyst.endersteel.item;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Endersteel.MOD_ID);

    public static final Supplier<CreativeModeTab> ENDERSTEEL_TAB = CREATIVE_MODE_TAB.register("endersteel_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDERSTEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.endersteel.endersteel_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //add items and blocks here \/
                        //reorder once items are added
                        output.accept(ModBlocks.STEEL_BLOCK);
                        output.accept(ModBlocks.RAW_STEEL_BLOCK);
                        output.accept(ModItems.RAW_STEEL);
                        output.accept(ModItems.STEEL_INGOT);
                        output.accept(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE);

                        output.accept(ModItems.STEEL_SWORD);
                        output.accept(ModItems.STEEL_PICKAXE);
                        output.accept(ModItems.STEEL_AXE);
                        output.accept(ModItems.STEEL_SHOVEL);
                        output.accept(ModItems.STEEL_HOE);

                        output.accept(ModItems.STEEL_HELMET);
                        output.accept(ModItems.STEEL_CHESTPLATE);
                        output.accept(ModItems.STEEL_LEGGINGS);
                        output.accept(ModItems.STEEL_BOOTS);

                        output.accept(ModBlocks.ENDERSTEEL_BLOCK);
                        output.accept(ModBlocks.ENDERSCRAP_ORE);
                        output.accept(ModItems.RAW_ENDERSCRAP);
                        output.accept(ModItems.REFINED_ENDERSCRAP);
                        output.accept(ModItems.ENDERSTEEL_INGOT);
                        output.accept(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE);

                        output.accept(ModItems.ENDERSTEEL_SWORD);
                        output.accept(ModItems.ENDERSTEEL_PICKAXE);
                        output.accept(ModItems.ENDERSTEEL_AXE);
                        output.accept(ModItems.ENDERSTEEL_SHOVEL);
                        output.accept(ModItems.ENDERSTEEL_HOE);

                        output.accept(ModItems.ENDERSTEEL_HELMET);
                        output.accept(ModItems.ENDERSTEEL_CHESTPLATE);
                        output.accept(ModItems.ENDERSTEEL_LEGGINGS);
                        output.accept(ModItems.ENDERSTEEL_BOOTS);

                        output.accept(ModBlocks.ENDERWOOD_LOG);
                        output.accept(ModBlocks.ENDERWOOD_WOOD);
                        output.accept(ModBlocks.STRIPPED_ENDERWOOD_LOG);
                        output.accept(ModBlocks.STRIPPED_ENDERWOOD_WOOD);

                        output.accept(ModBlocks.ENDERWOOD_LEAVES);
                        output.accept(ModBlocks.ENDERWOOD_PLANKS);

                        output.accept(ModBlocks.ENDERWOOD_SAPLING);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
