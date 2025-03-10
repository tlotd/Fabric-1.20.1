package net.tlotd.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.tlotd.block.ModBlocks;
import net.tlotd.fluid.ModFluids;
import net.tlotd.item.ModItems;
import net.tlotd.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ModTags.Items.WOODEN_BARK)
                .add(ModItems.OAK_BARK)
                .add(ModItems.SPRUCE_BARK)
                .add(ModItems.BIRCH_BARK)
                .add(ModItems.JUNGLE_BARK)
                .add(ModItems.ACACIA_BARK)
                .add(ModItems.DARK_OAK_BARK)
                .add(ModItems.MANGROVE_BARK)
                .add(ModItems.CHERRY_BARK)
                .add(ModItems.GINKGO_BARK)
        ;

        getOrCreateTagBuilder(ModTags.Items.GINKGO_LOGS)
                .add(ModBlocks.GINKGO_LOG.asItem())
                .add(ModBlocks.GINKGO_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GINKGO_LOG.asItem())
                .add(ModBlocks.STRIPPED_GINKGO_WOOD.asItem())
        ;

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ModBlocks.GINKGO_LEAVES.asItem())
        ;

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.GINKGO_PLANKS.asItem())
                .add(ModBlocks.FANCY_OAK_PLANKS.asItem())
                .add(ModBlocks.FANCY_SPRUCE_PLANKS.asItem())
                .add(ModBlocks.FANCY_BIRCH_PLANKS.asItem())
                .add(ModBlocks.FANCY_JUNGLE_PLANKS.asItem())
                .add(ModBlocks.FANCY_ACACIA_PLANKS.asItem())
                .add(ModBlocks.FANCY_DARK_OAK_PLANKS.asItem())
                .add(ModBlocks.FANCY_MANGROVE_PLANKS.asItem())
                .add(ModBlocks.FANCY_CHERRY_PLANKS.asItem())
                .add(ModBlocks.FANCY_PALE_OAK_PLANKS.asItem())
                .add(ModBlocks.FANCY_BAMBOO_PLANKS.asItem())
                .add(ModBlocks.FANCY_CRIMSON_PLANKS.asItem())
                .add(ModBlocks.FANCY_WARPED_PLANKS.asItem())
                .add(ModBlocks.FANCY_GINKGO_PLANKS.asItem())
        ;

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(ModBlocks.GINKGO_SAPLING.asItem())
        ;

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.HELIORITE_HELMET, ModItems.HELIORITE_CHESTPLATE, ModItems.HELIORITE_LEGGINGS, ModItems.HELIORITE_BOOTS)
                .add(ModItems.ENDURIUM_HELMET, ModItems.ENDURIUM_CHESTPLATE, ModItems.ENDURIUM_LEGGINGS, ModItems.ENDURIUM_BOOTS)
                .add(ModItems.PALLADIUM_HELMET, ModItems.PALLADIUM_CHESTPLATE, ModItems.PALLADIUM_LEGGINGS, ModItems.PALLADIUM_BOOTS)
                .add(ModItems.JURASSOLINE_HELMET, ModItems.JURASSOLINE_CHESTPLATE, ModItems.JURASSOLINE_LEGGINGS, ModItems.JURASSOLINE_BOOTS)
                .add(ModItems.CINNABAR_HELMET, ModItems.CINNABAR_CHESTPLATE, ModItems.CINNABAR_LEGGINGS, ModItems.CINNABAR_BOOTS)
                .add(ModItems.NEBULAR_HELMET, ModItems.NEBULAR_CHESTPLATE, ModItems.NEBULAR_LEGGINGS, ModItems.NEBULAR_BOOTS)
                .add(ModItems.MITHRIL_HELMET, ModItems.MITHRIL_CHESTPLATE, ModItems.MITHRIL_LEGGINGS, ModItems.MITHRIL_BOOTS)
        ;

        getOrCreateTagBuilder(ItemTags.COALS)
                .add(ModItems.SULFUR)
        ;

        getOrCreateTagBuilder(ItemTags.BOOKSHELF_BOOKS)
                .add(ModItems.GUIDEBOOK)
                .add(ModItems.SPELL_BOOK)
                .add(ModItems.FORBIDDEN_SPELL_BOOK)
        ;

        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(ModBlocks.ROSE.asItem())
                .add(ModBlocks.EDELWEISS.asItem())
        ;

        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(ModItems.GINKGO_BOAT)
        ;

        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(ModItems.GINKGO_CHEST_BOAT)
        ;

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.HELIORITE_INGOT)
                .add(ModItems.ENDURIUM_INGOT)
                .add(ModItems.PALLADIUM_INGOT)
                .add(ModItems.JURASSOLINE_INGOT)
                .add(ModItems.CINNABAR_INGOT)
                .add(ModItems.NEBULAR_INGOT)
                .add(ModItems.MITHRIL_INGOT)
                .add(ModItems.ASTRAL_INGOT)
        ;

        getOrCreateTagBuilder(ModTags.Items.STICK_EFFIGIES)
                .add(ModItems.STICK_CROSS)
                .add(ModItems.STICK_EFFIGY)
                .add(ModItems.STICK_FIGURE)
        ;

        getOrCreateTagBuilder(ModTags.Items.RAW_MEAT)
                .add(Items.BEEF)
                .add(Items.PORKCHOP)
                .add(Items.MUTTON)
                .add(ModItems.DINOSAUR_MEAT)
                .add(ModItems.CURED_MEAT)
        ;

        getOrCreateTagBuilder(ModTags.Items.BEER_CONTAINER)
                .add(ModItems.BEER_GOAT_HORN)
                .add(ModFluids.BEER_BUCKET)
                .add(ModBlocks.WOODEN_BEER_STEIN.asItem())
        ;

        getOrCreateTagBuilder(ModTags.Items.EXTRACTION_PICKAXES)
                .add(ModItems.CINNABAR_PICKAXE)
                .add(ModItems.NEBULAR_PICKAXE)
                .add(ModItems.MITHRIL_PICKAXE)
                .add(ModItems.ASTRAL_PICKAXE)
        ;

        getOrCreateTagBuilder(ModTags.Items.WOODEN_LIQUID_STEINS)
                .add(ModBlocks.WOODEN_WATER_STEIN.asItem())
                .add(ModBlocks.WOODEN_BEER_STEIN.asItem())
                .add(ModBlocks.WOODEN_APPLE_JUICE_STEIN.asItem())
                .add(ModBlocks.WOODEN_ORANGE_JUICE_STEIN.asItem())
                .add(ModBlocks.WOODEN_MILK_STEIN.asItem())
                .add(ModBlocks.WOODEN_CHOCOLATE_MILKSHAKE_STEIN.asItem())
                .add(ModBlocks.WOODEN_STRAWBERRY_MILKSHAKE_STEIN.asItem())
                .add(ModBlocks.WOODEN_ORANGE_MILKSHAKE_STEIN.asItem())
                .add(ModBlocks.HOT_WOODEN_MILK_STEIN.asItem())
                .add(ModBlocks.WOODEN_HOT_CHOCOLATE_STEIN.asItem())
        ;

        getOrCreateTagBuilder(ModTags.Items.RADIATION_PROTECTION)
                .add(ModItems.HEV_SUIT_CHESTPLATE)
                .add(ModItems.HEV_SUIT_LEGGINGS)
                .add(ModItems.HEV_SUIT_BOOTS)
        ;

        getOrCreateTagBuilder(ModTags.Items.HYPOXIA_PROTECTION)
                .add(ModItems.ASTRONAUT_HELMET)
                .add(ModItems.SPACE_SUIT_CHESTPLATE)
                .add(ModItems.SPACE_SUIT_LEGGINGS)
                .add(ModItems.SPACE_SUIT_BOOTS)
        ;

        getOrCreateTagBuilder(ModTags.Items.SICKLES)
                .add(ModItems.COPPER_SICKLE)
                .add(ModItems.GOLDEN_SICKLE)
                .add(ModItems.STEEL_SICKLE)
                .add(ModItems.NETHERITE_SICKLE)
                .add(ModItems.HELIORITE_SICKLE)
                .add(ModItems.ENDURIUM_SICKLE)
                .add(ModItems.PALLADIUM_SICKLE)
                .add(ModItems.JURASSOLINE_SICKLE)
                .add(ModItems.CINNABAR_SICKLE)
                .add(ModItems.NEBULAR_SICKLE)
                .add(ModItems.MITHRIL_SICKLE)
                .add(ModItems.ASTRAL_SICKLE)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "swords")))
                .add(ModItems.HELIORITE_SWORD)
                .add(ModItems.ENDURIUM_SWORD)
                .add(ModItems.PALLADIUM_SWORD)
                .add(ModItems.JURASSOLINE_SWORD)
                .add(ModItems.CINNABAR_SWORD)
                .add(ModItems.NEBULAR_SWORD)
                .add(ModItems.MITHRIL_SWORD)
                .add(ModItems.ASTRAL_SWORD)
                .add(ModItems.NARSIL_HANDLE)
                .add(ModItems.ANDURIL)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "pickaxes")))
                .add(ModItems.HELIORITE_PICKAXE)
                .add(ModItems.ENDURIUM_PICKAXE)
                .add(ModItems.PALLADIUM_PICKAXE)
                .add(ModItems.JURASSOLINE_PICKAXE)
                .add(ModItems.CINNABAR_PICKAXE)
                .add(ModItems.NEBULAR_PICKAXE)
                .add(ModItems.MITHRIL_PICKAXE)
                .add(ModItems.ASTRAL_PICKAXE)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "axes")))
                .add(ModItems.HELIORITE_AXE)
                .add(ModItems.ENDURIUM_AXE)
                .add(ModItems.PALLADIUM_AXE)
                .add(ModItems.JURASSOLINE_AXE)
                .add(ModItems.CINNABAR_AXE)
                .add(ModItems.NEBULAR_AXE)
                .add(ModItems.MITHRIL_AXE)
                .add(ModItems.ASTRAL_AXE)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "shovels")))
                .add(ModItems.HELIORITE_SHOVEL)
                .add(ModItems.ENDURIUM_SHOVEL)
                .add(ModItems.JURASSOLINE_SHOVEL)
                .add(ModItems.PALLADIUM_SHOVEL)
                .add(ModItems.CINNABAR_SHOVEL)
                .add(ModItems.NEBULAR_SHOVEL)
                .add(ModItems.MITHRIL_SHOVEL)
                .add(ModItems.ASTRAL_SHOVEL)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "hoes")))
                .add(ModItems.HELIORITE_HOE)
                .add(ModItems.ENDURIUM_HOE)
                .add(ModItems.PALLADIUM_HOE)
                .add(ModItems.JURASSOLINE_HOE)
                .add(ModItems.CINNABAR_HOE)
                .add(ModItems.NEBULAR_HOE)
                .add(ModItems.MITHRIL_HOE)
                .add(ModItems.ASTRAL_HOE)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "flour")))
                .add(ModItems.FLOUR)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "eggs")))
                .add(Items.EGG)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "milk")))
                .add(ModBlocks.WOODEN_MILK_STEIN.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "sulfur_ores")))
                .add(ModBlocks.RED_DEEPSLATE_SULFUR_ORE.asItem())
                .add(ModBlocks.NETHER_SULFUR_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "coal_ores")))
                .add(ModBlocks.MOON_ROCK_COAL_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "copper_ores")))
                .add(ModBlocks.RED_DEEPSLATE_COPPER_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "iron_ores")))
                .add(ModBlocks.RED_DEEPSLATE_IRON_ORE.asItem())
                .add(ModBlocks.MOON_ROCK_IRON_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "gold_ores")))
                .add(ModBlocks.RED_DEEPSLATE_GOLD_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "lapis_ores")))
                .add(ModBlocks.RED_DEEPSLATE_LAPIS_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "redstone_ores")))
                .add(ModBlocks.RED_DEEPSLATE_REDSTONE_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "diamond_ores")))
                .add(ModBlocks.RED_DEEPSLATE_DIAMOND_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "emerald_ores")))
                .add(ModBlocks.RED_DEEPSLATE_EMERALD_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "uranium_ores")))
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE.asItem())
                .add(ModBlocks.RED_DEEPSLATE_URANIUM_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "palladium_ores")))
                .add(ModBlocks.PALLADIUM_ORE.asItem())
                .add(ModBlocks.RED_DEEPSLATE_PALLADIUM_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "cinnabar_ores")))
                .add(ModBlocks.CINNABAR_ORE.asItem())
                .add(ModBlocks.RED_DEEPSLATE_CINNABAR_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "lead_raw_materials")))
                .add(ModItems.RAW_LEAD)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "lead_nuggets")))
                .add(ModItems.LEAD_NUGGET)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "lead_ingots")))
                .add(ModItems.LEAD_INGOT)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "raw_lead_blocks")))
                .add(ModBlocks.RAW_LEAD_BLOCK.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "lead_blocks")))
                .add(ModBlocks.LEAD_BLOCK.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "lead_ores")))
                .add(ModBlocks.LEAD_ORE.asItem())
                .add(ModBlocks.RED_DEEPSLATE_LEAD_ORE.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "uranium_raw_materials")))
                .add(ModItems.URANIUM)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "uranium_nuggets")))
                .add(ModItems.URANIUM_NUGGET)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "uranium_ingots")))
                .add(ModItems.URANIUM_INGOT)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "raw_uranium_blocks")))
                .add(ModBlocks.RAW_URANIUM_BLOCK.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "uranium_blocks")))
                .add(ModBlocks.URANIUM_BLOCK.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "steel_raw_materials")))
                .add(ModItems.STEEL_INGREDIENTS)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "steel_nuggets")))
                .add(ModItems.STEEL_NUGGET)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "steel_ingots")))
                .add(ModItems.STEEL_INGOT)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "steel_rods")))
                .add(ModItems.STEEL_ROD)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "steel_blocks")))
                .add(ModBlocks.STEEL_BLOCK.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "mithril_raw_materials")))
                .add(ModItems.RAW_MITHRIL)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "mithril_nuggets")))
                .add(ModItems.MITHRIL_NUGGET)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "mithril_ingots")))
                .add(ModItems.MITHRIL_INGOT)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "raw_mithril_blocks")))
                .add(ModBlocks.RAW_MITHRIL_BLOCK.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "mithril_blocks")))
                .add(ModBlocks.MITHRIL_BLOCK.asItem())
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "oil_buckets")))
                .add(ModFluids.OIL_BUCKET)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "shears")))
                .add(ModItems.COPPER_SICKLE)
                .add(ModItems.GOLDEN_SICKLE)
                .add(ModItems.STEEL_SICKLE)
                .add(ModItems.NETHERITE_SICKLE)
                .add(ModItems.HELIORITE_SICKLE)
                .add(ModItems.ENDURIUM_SICKLE)
                .add(ModItems.PALLADIUM_SICKLE)
                .add(ModItems.JURASSOLINE_SICKLE)
                .add(ModItems.CINNABAR_SICKLE)
                .add(ModItems.NEBULAR_SICKLE)
                .add(ModItems.MITHRIL_SICKLE)
                .add(ModItems.ASTRAL_SICKLE)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("c", "foods")))
                .add(ModBlocks.WOODEN_WATER_STEIN.asItem())
                .add(ModBlocks.WOODEN_MILK_STEIN.asItem())
                .add(ModBlocks.WOODEN_BEER_STEIN.asItem())
                .add(ModBlocks.WOODEN_APPLE_JUICE_STEIN.asItem())
                .add(ModBlocks.WOODEN_ORANGE_JUICE_STEIN.asItem())
                .add(ModBlocks.WOODEN_STRAWBERRY_MILKSHAKE_STEIN.asItem())
                .add(ModBlocks.WOODEN_ORANGE_MILKSHAKE_STEIN.asItem())
                .add(ModBlocks.WOODEN_CHOCOLATE_MILKSHAKE_STEIN.asItem())
                .add(ModBlocks.HOT_WOODEN_MILK_STEIN.asItem())
                .add(ModBlocks.WOODEN_HOT_CHOCOLATE_STEIN.asItem())
                .add(ModItems.STRAWBERRY)
                .add(ModItems.CHOCOLATE_STRAWBERRY)
                .add(ModItems.ORANGE)
                .add(ModItems.TOAST)
                .add(ModItems.STRAWBERRY_JAM_TOAST)
                .add(ModItems.ORANGE_MARMELADE_TOAST)
                .add(ModItems.SWEET_BERRY_JAM_TOAST)
                .add(ModItems.GLOW_BERRY_JAM_TOAST)
                .add(ModItems.MAULTASCHE)
                .add(ModItems.MAULTASCHEN_BROTH)
                .add(ModItems.RAW_SCHNITZEL)
                .add(ModItems.SCHNITZEL)
                .add(ModItems.DINOSAUR_MEAT)
                .add(ModItems.COOKED_DINOSAUR_MEAT)
                .add(ModItems.CURED_MEAT)
                .add(ModItems.COOKED_MEAT)
        ;
    }
}
