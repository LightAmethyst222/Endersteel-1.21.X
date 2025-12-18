package net.lightamethyst.endersteel.item;

import net.lightamethyst.endersteel.Endersteel;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Endersteel.MOD_ID);




    public static final DeferredItem<Item> ENDERSTEEL_INGOT = ITEMS.register("endersteel_ingot",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> RAW_ENDERSCRAP = ITEMS.register("raw_enderscrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REFINED_ENDERSCRAP = ITEMS.register("refined_enderscrap",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
