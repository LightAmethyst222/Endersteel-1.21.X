package net.lightamethyst.endersteel.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class SteelUpgradeTemplateItem extends Item {
    public SteelUpgradeTemplateItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.endersteel.steel_upgrade").withStyle(ChatFormatting.GRAY));
        tooltipComponents.add(Component.literal(""));
        tooltipComponents.add(Component.translatable("tooltip.endersteel.steel_upgrade_applies_to_title").withStyle(ChatFormatting.GRAY));
        tooltipComponents.add(Component.translatable("tooltip.endersteel.steel_upgrade_applies_to").withStyle(ChatFormatting.BLUE));
        tooltipComponents.add(Component.translatable("tooltip.endersteel.steel_upgrade_ingredients_title").withStyle(ChatFormatting.GRAY));
        tooltipComponents.add(Component.translatable("tooltip.endersteel.steel_upgrade_ingredients").withStyle(ChatFormatting.BLUE));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
