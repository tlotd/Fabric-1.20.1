package net.tlotd.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

public class SequencedAssemblyItem extends Item {

    public SequencedAssemblyItem(Settings settings) {
        super(settings);
    }

    public float getProgress(ItemStack stack) {
        if (!stack.hasNbt()) {
            return 0;
        }
        NbtCompound tag = stack.getNbt();
        if (!tag.contains("SequencedAssembly")) {
            return 0;
        } else {
            return tag.getCompound("SequencedAssembly").getFloat("Progress");
        }
    }

    @Override
    public boolean isItemBarVisible(ItemStack stack) {
        return true;
    }

    @Override
    public int getItemBarStep(ItemStack stack) {
        return Math.round(getProgress(stack) * 13);
    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        return 0xffc074;
    }
}