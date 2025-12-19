package net.lightamethyst.endersteel.item;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.item.custom.EndersteelUpgradeTemplateItem;
import net.lightamethyst.endersteel.item.custom.SteelUpgradeTemplateItem;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.Locale;

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
    public static final DeferredItem<Item> RAW_STEEL = ITEMS.register("raw_steel",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("endersteel_upgrade_smithing_template",
            () -> new EndersteelUpgradeTemplateItem(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("steel_upgrade_smithing_template",
            () -> new SteelUpgradeTemplateItem(new Item.Properties()));

    public static final DeferredItem<SwordItem> ENDERSTEEL_SWORD = ITEMS.register("endersteel_sword",
            () -> new SwordItem(ModToolTiers.ENDERSTEEL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ENDERSTEEL, 4, -2.4F))));
    public static final DeferredItem<PickaxeItem> ENDERSTEEL_PICKAXE = ITEMS.register("endersteel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDERSTEEL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ENDERSTEEL, 2, -2.8F))));
    public static final DeferredItem<AxeItem> ENDERSTEEL_AXE = ITEMS.register("endersteel_axe",
            () -> new AxeItem(ModToolTiers.ENDERSTEEL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ENDERSTEEL, 6, -3F))));
    public static final DeferredItem<ShovelItem> ENDERSTEEL_SHOVEL = ITEMS.register("endersteel_shovel",
            () -> new ShovelItem(ModToolTiers.ENDERSTEEL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ENDERSTEEL, 2.5F, -3F))));
    public static final DeferredItem<HoeItem> ENDERSTEEL_HOE = ITEMS.register("endersteel_hoe",
            () -> new HoeItem(ModToolTiers.ENDERSTEEL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ENDERSTEEL, -5, 0F))));

    public static final DeferredItem<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.STEEL, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.STEEL, 1, -2.8F))));
    public static final DeferredItem<AxeItem> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.STEEL, 5.5F, -3F))));
    public static final DeferredItem<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.STEEL, 1.5F, -3F))));
    public static final DeferredItem<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.STEEL, -2, 0F))));

    public static final DeferredItem<ArmorItem> ENDERSTEEL_HELMET = ITEMS.register("endersteel_helmet",
            () -> new ArmorItem(ModArmorMaterials.ENDERSTEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(41)).fireResistant()));
    public static final DeferredItem<ArmorItem> ENDERSTEEL_CHESTPLATE = ITEMS.register("endersteel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ENDERSTEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(41)).fireResistant()));
    public static final DeferredItem<ArmorItem> ENDERSTEEL_LEGGINGS = ITEMS.register("endersteel_leggings",
            () -> new ArmorItem(ModArmorMaterials.ENDERSTEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(41)).fireResistant()));
    public static final DeferredItem<ArmorItem> ENDERSTEEL_BOOTS = ITEMS.register("endersteel_boots",
            () -> new ArmorItem(ModArmorMaterials.ENDERSTEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(41)).fireResistant()));

    public static final DeferredItem<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(24))));
    public static final DeferredItem<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(24))));
    public static final DeferredItem<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(24))));
    public static final DeferredItem<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(24))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
