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

public class GameCartridgeItem extends Item {

    public GameCartridgeItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.getItem().equals(ModItems.GAME_CARTRIDGE)) {
            tooltip.add(Text.translatable("item.tlotd.game_cartridge.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.GAME_CARTRIDGE_1)) {
            tooltip.add(Text.translatable("item.tlotd.game_cartridge_1.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.GAME_CARTRIDGE_2)) {
            tooltip.add(Text.translatable("item.tlotd.game_cartridge_2.tooltip").formatted(Formatting.GRAY));
        } else if (stack.getItem().equals(ModItems.GAME_CARTRIDGE_3)) {
            tooltip.add(Text.translatable("item.tlotd.game_cartridge_3.tooltip").formatted(Formatting.GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}