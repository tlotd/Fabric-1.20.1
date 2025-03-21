package net.tlotd.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RadiationProofArmorItem extends ArmorItem {
    public RadiationProofArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.tlotd.radiaton_proof_armor.tooltip").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.tlotd.radiaton_proof_armor.tooltip_2").formatted(Formatting.BLUE));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
