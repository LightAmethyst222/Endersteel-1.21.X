package net.lightamethyst.endersteel.datagen;

import net.lightamethyst.endersteel.block.ModBlocks;
import net.lightamethyst.endersteel.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_SWORD),
                        Ingredient.of(ModItems.ENDERSTEEL_INGOT.get()),
                        RecipeCategory.COMBAT,
                        ModItems.ENDERSTEEL_SWORD.get())
                .unlocks(getHasName(ModItems.ENDERSTEEL_INGOT.get()), has(ModItems.ENDERSTEEL_INGOT.get()))
                .save(recipeOutput,"endersteel_sword");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_PICKAXE),
                        Ingredient.of(ModItems.ENDERSTEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.ENDERSTEEL_PICKAXE.get())
                .unlocks(getHasName(ModItems.ENDERSTEEL_INGOT.get()), has(ModItems.ENDERSTEEL_INGOT.get()))
                .save(recipeOutput,"endersteel_pickaxe");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_AXE),
                        Ingredient.of(ModItems.ENDERSTEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.ENDERSTEEL_AXE.get())
                .unlocks(getHasName(ModItems.ENDERSTEEL_INGOT.get()), has(ModItems.ENDERSTEEL_INGOT.get()))
                .save(recipeOutput,"endersteel_axe");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_SHOVEL),
                        Ingredient.of(ModItems.ENDERSTEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.ENDERSTEEL_SHOVEL.get())
                .unlocks(getHasName(ModItems.ENDERSTEEL_INGOT.get()), has(ModItems.ENDERSTEEL_INGOT.get()))
                .save(recipeOutput,"endersteel_shovel");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_HOE),
                        Ingredient.of(ModItems.ENDERSTEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.ENDERSTEEL_HOE.get())
                .unlocks(getHasName(ModItems.ENDERSTEEL_INGOT.get()), has(ModItems.ENDERSTEEL_INGOT.get()))
                .save(recipeOutput,"endersteel_hoe");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_HELMET),
                        Ingredient.of(ModItems.ENDERSTEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.ENDERSTEEL_HELMET.get())
                .unlocks(getHasName(ModItems.ENDERSTEEL_INGOT.get()), has(ModItems.ENDERSTEEL_INGOT.get()))
                .save(recipeOutput,"endersteel_helmet");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_CHESTPLATE),
                        Ingredient.of(ModItems.ENDERSTEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.ENDERSTEEL_CHESTPLATE.get())
                .unlocks(getHasName(ModItems.ENDERSTEEL_INGOT.get()), has(ModItems.ENDERSTEEL_INGOT.get()))
                .save(recipeOutput,"endersteel_chestplate");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_LEGGINGS),
                        Ingredient.of(ModItems.ENDERSTEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.ENDERSTEEL_LEGGINGS.get())
                .unlocks(getHasName(ModItems.ENDERSTEEL_INGOT.get()), has(ModItems.ENDERSTEEL_INGOT.get()))
                .save(recipeOutput,"endersteel_leggings");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_BOOTS),
                        Ingredient.of(ModItems.ENDERSTEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.ENDERSTEEL_BOOTS.get())
                .unlocks(getHasName(ModItems.ENDERSTEEL_INGOT.get()), has(ModItems.ENDERSTEEL_INGOT.get()))
                .save(recipeOutput,"endersteel_boots");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_SWORD),
                        Ingredient.of(ModItems.STEEL_INGOT.get()),
                        RecipeCategory.COMBAT,
                        ModItems.STEEL_SWORD.get())
                .unlocks(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(recipeOutput,"steel_sword");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_PICKAXE),
                        Ingredient.of(ModItems.STEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.STEEL_PICKAXE.get())
                .unlocks(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(recipeOutput,"steel_pickaxe");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_AXE),
                        Ingredient.of(ModItems.STEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.STEEL_AXE.get())
                .unlocks(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(recipeOutput,"steel_axe");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_SHOVEL),
                        Ingredient.of(ModItems.STEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.STEEL_SHOVEL.get())
                .unlocks(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(recipeOutput,"steel_shovel");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_HOE),
                        Ingredient.of(ModItems.STEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.STEEL_HOE.get())
                .unlocks(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(recipeOutput,"steel_hoe");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_HELMET),
                        Ingredient.of(ModItems.STEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.STEEL_HELMET.get())
                .unlocks(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(recipeOutput,"steel_helmet");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_CHESTPLATE),
                        Ingredient.of(ModItems.STEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.STEEL_CHESTPLATE.get())
                .unlocks(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(recipeOutput,"steel_chestplate");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_LEGGINGS),
                        Ingredient.of(ModItems.STEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.STEEL_LEGGINGS.get())
                .unlocks(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(recipeOutput,"steel_leggings");
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_BOOTS),
                        Ingredient.of(ModItems.STEEL_INGOT.get()),
                        RecipeCategory.TOOLS,
                        ModItems.STEEL_BOOTS.get())
                .unlocks(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(recipeOutput,"steel_boots");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENDERSTEEL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ENDERSTEEL_INGOT.get())
                .unlockedBy("has_endersteel", has(ModItems.ENDERSTEEL_INGOT)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERSTEEL_INGOT.get(), 9)
                .requires(ModBlocks.ENDERSTEEL_BLOCK)
                .unlockedBy("has_endersteel_block", has(ModBlocks.ENDERSTEEL_BLOCK)).save(recipeOutput, "endersteel:endersteel_ingots_from_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.STEEL_INGOT.get())
                .unlockedBy("has_steel", has(ModItems.STEEL_INGOT)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK)
                .unlockedBy("has_steel_block", has(ModBlocks.STEEL_BLOCK)).save(recipeOutput, "endersteel:steel_ingots_from_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_STEEL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_STEEL.get())
                .unlockedBy("has_raw_steel", has(ModItems.RAW_STEEL)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_STEEL.get(), 9)
                .requires(ModBlocks.RAW_STEEL_BLOCK)
                .unlockedBy("has_raw_steel_block", has(ModBlocks.RAW_STEEL_BLOCK)).save(recipeOutput, "endersteel:raw_steel_ingots_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("DTD")
                .pattern("DBD")
                .pattern("DDD")
                .define('T', ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get())
                .define('B', Blocks.END_STONE)
                .define('D', Items.DIAMOND)
                .unlockedBy("has_endersteel_upgrade_template", has(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("DTD")
                .pattern("DBD")
                .pattern("DDD")
                .define('T', ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get())
                .define('D', Blocks.COBBLESTONE)
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_steel_upgrade_template", has(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE))
                .save(recipeOutput, "endersteel:steel_upgrade_template_duplication");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE.get())
                .pattern("DTD")
                .pattern("DBD")
                .pattern("DDD")
                .define('T', Blocks.IRON_BLOCK)
                .define('D', Blocks.COBBLESTONE)
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput, "endersteel:steel_upgrade_template_crafting");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERSTEEL_INGOT.get())
                .pattern("SES")
                .pattern("ENE")
                .pattern("SES")
                .define('E', ModItems.REFINED_ENDERSCRAP.get())
                .define('S', ModItems.STEEL_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy("has_refined_enderscrap", has(ModItems.REFINED_ENDERSCRAP))
                .unlockedBy("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(recipeOutput, "endersteel:endersteel_ingot_from_materials");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_STEEL.get())
                .requires(Items.IRON_INGOT, 2)
                .requires(Items.COAL)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(recipeOutput, "endersteel:raw_steel_from_materials");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RAW_STEEL_BLOCK.get())
                .requires(Blocks.IRON_BLOCK, 2)
                .requires(Blocks.COAL_BLOCK)
                .unlockedBy("has_iron_block", has(Blocks.IRON_BLOCK)).save(recipeOutput, "endersteel:raw_steel_block_from_materials");

        List<ItemLike> ENDERSTEEL_REFINING = List.of(ModItems.RAW_ENDERSCRAP);
        List<ItemLike> STEEL_REFINING = List.of(ModItems.RAW_STEEL);
        List<ItemLike> STEEL_BLOCK_REFINING = List.of(ModBlocks.RAW_STEEL_BLOCK);

        oreBlasting(recipeOutput, ENDERSTEEL_REFINING, RecipeCategory.MISC, ModItems.REFINED_ENDERSCRAP.get(), 2.0f, 200, "endersteel");
        oreBlasting(recipeOutput, STEEL_REFINING, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 2.0f, 100, "steel");
        oreBlasting(recipeOutput, STEEL_BLOCK_REFINING, RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get(), 18.0f, 900, "steel");

    }
}
