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
                        output.accept(ModItems.STEEL_INGOT);

                        output.accept(ModBlocks.ENDERSTEEL_BLOCK);
                        output.accept(ModBlocks.ENDERSCRAP_ORE);
                        output.accept(ModItems.RAW_ENDERSCRAP);
                        output.accept(ModItems.REFINED_ENDERSCRAP);
                        output.accept(ModItems.ENDERSTEEL_INGOT);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
