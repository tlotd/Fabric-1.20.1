package net.tlotd.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tlotd.TLOTD;
import net.tlotd.block.custom.ChemicalWasteFluidBlock;
import net.tlotd.item.custom.ChemicalWasteBucketItem;

public class ModFluids {
    public static FlowableFluid STILL_BEER;
    public static FlowableFluid FLOWING_BEER;
    public static Block BEER_BLOCK;
    public static Item BEER_BUCKET;

    public static FlowableFluid STILL_OIL;
    public static FlowableFluid FLOWING_OIL;
    public static Block OIL_BLOCK;
    public static Item OIL_BUCKET;

    public static FlowableFluid STILL_BLOOD;
    public static FlowableFluid FLOWING_BLOOD;
    public static Block BLOOD_BLOCK;
    public static Item BLOOD_BUCKET;

    public static FlowableFluid STILL_CHEMICAL_WASTE;
    public static FlowableFluid FLOWING_CHEMICAL_WASTE;
    public static Block CHEMICAL_WASTE_BLOCK;
    public static Item CHEMICAL_WASTE_BUCKET;

    public static void registerModFluids() {
        STILL_BEER = Registry.register(Registries.FLUID, new Identifier(TLOTD.MOD_ID, "beer"), new BeerFluid.Still());
        FLOWING_BEER = Registry.register(Registries.FLUID, new Identifier(TLOTD.MOD_ID, "flowing_beer"), new BeerFluid.Flowing());
        BEER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, "beer_block"), new FluidBlock(ModFluids.STILL_BEER, FabricBlockSettings.copyOf(Blocks.WATER)){});
        BEER_BUCKET = Registry.register(Registries.ITEM, new Identifier(TLOTD.MOD_ID, "beer_bucket"), new BucketItem(ModFluids.STILL_BEER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_OIL = Registry.register(Registries.FLUID, new Identifier(TLOTD.MOD_ID, "oil"), new OilFluid.Still());
        FLOWING_OIL = Registry.register(Registries.FLUID, new Identifier(TLOTD.MOD_ID, "flowing_oil"), new OilFluid.Flowing());
        OIL_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, "oil_block"), new FluidBlock(ModFluids.STILL_OIL, FabricBlockSettings.copyOf(Blocks.WATER)){});
        OIL_BUCKET = Registry.register(Registries.ITEM, new Identifier(TLOTD.MOD_ID, "oil_bucket"), new BucketItem(ModFluids.STILL_OIL , new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_BLOOD = Registry.register(Registries.FLUID, new Identifier(TLOTD.MOD_ID, "blood"), new BloodFluid.Still());
        FLOWING_BLOOD = Registry.register(Registries.FLUID, new Identifier(TLOTD.MOD_ID, "flowing_blood"), new BloodFluid.Flowing());
        BLOOD_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, "blood_block"), new FluidBlock(ModFluids.STILL_BLOOD, FabricBlockSettings.copyOf(Blocks.WATER)){});
        BLOOD_BUCKET = Registry.register(Registries.ITEM, new Identifier(TLOTD.MOD_ID, "blood_bucket"), new BucketItem(ModFluids.STILL_BLOOD, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_CHEMICAL_WASTE = Registry.register(Registries.FLUID, new Identifier(TLOTD.MOD_ID, "chemical_waste"), new ChemicalWasteFluid.Still());
        FLOWING_CHEMICAL_WASTE = Registry.register(Registries.FLUID, new Identifier(TLOTD.MOD_ID, "flowing_chemical_waste"), new ChemicalWasteFluid.Flowing());
        CHEMICAL_WASTE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, "chemical_waste_block"), new ChemicalWasteFluidBlock(ModFluids.STILL_CHEMICAL_WASTE, FabricBlockSettings.copyOf(Blocks.LAVA)){});
        CHEMICAL_WASTE_BUCKET = Registry.register(Registries.ITEM, new Identifier(TLOTD.MOD_ID, "chemical_waste_bucket"), new ChemicalWasteBucketItem(ModFluids.STILL_CHEMICAL_WASTE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        TLOTD.LOGGER.info("Registering ModFluids for " + TLOTD.MOD_ID
        );
    }
}
