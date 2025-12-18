package net.lightamethyst.endersteel.datagen;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Endersteel.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Add Items here \/
        basicItem(ModItems.ENDERSTEEL_INGOT.get());
        basicItem(ModItems.RAW_ENDERSCRAP.get());
        basicItem(ModItems.REFINED_ENDERSCRAP.get());
        basicItem(ModItems.STEEL_INGOT.get());
    }
}
