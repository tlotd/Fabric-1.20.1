package net.tlotd.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.tlotd.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VHSCassetteItem extends Item {

    public VHSCassetteItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.getItem().equals(ModItems.VHS_CASSETTE)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_1)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_1.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_2)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_2.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_3)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_3.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_4)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_4.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_5)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_5.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_6)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_6.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_7)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_7.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_8)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_8.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_9)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_9.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_NO_SLEEP)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_no_sleep.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_EBS)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_ebs.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_BROKEN)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_broken.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.VHS_CASSETTE_KV31)) {
            tooltip.add(Text.translatable("item.tlotd.vhs_cassette_kv31.tooltip").formatted(Formatting.GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}