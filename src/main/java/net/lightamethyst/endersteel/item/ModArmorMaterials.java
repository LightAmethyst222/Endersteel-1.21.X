package net.lightamethyst.endersteel.item;

import net.lightamethyst.endersteel.Endersteel;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final Holder<ArmorMaterial> ENDERSTEEL_ARMOR_MATERIAL = register("endersteel",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS,4);
                attribute.put(ArmorItem.Type.LEGGINGS,8);
                attribute.put(ArmorItem.Type.CHESTPLATE,12);
                attribute.put(ArmorItem.Type.HELMET,6);
                attribute.put(ArmorItem.Type.BODY,13);
            }), 20, SoundEvents.ARMOR_EQUIP_NETHERITE, 4f, 0.2f, () -> ModItems.ENDERSTEEL_INGOT.get());
    public static final Holder<ArmorMaterial> STEEL_ARMOR_MATERIAL = register("steel",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET,3);
                attribute.put(ArmorItem.Type.CHESTPLATE,7);
                attribute.put(ArmorItem.Type.LEGGINGS,5);
                attribute.put(ArmorItem.Type.BOOTS,2);
                attribute.put(ArmorItem.Type.BODY,10);
            }), 9, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> ModItems.STEEL_INGOT.get());

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, Holder<SoundEvent> equipSound, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(Endersteel.MOD_ID, name);
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }
}
