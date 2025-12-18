package net.lightamethyst.endersteel.datagen;

import net.lightamethyst.endersteel.block.ModBlocks;
import net.lightamethyst.endersteel.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> ENDERSTEEL_REFINING = List.of(ModItems.RAW_ENDERSCRAP);

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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get())
                .requires(Items.IRON_INGOT, 2)
                .requires(Items.COAL)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(recipeOutput);

        oreBlasting(recipeOutput, ENDERSTEEL_REFINING, RecipeCategory.MISC, ModItems.REFINED_ENDERSCRAP.get(), 2.0f, 200, "endersteel");

    }
}
