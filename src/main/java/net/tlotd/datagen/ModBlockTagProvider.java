package net.tlotd.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.tlotd.block.ModBlocks;
import net.tlotd.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Blocks.STONE_EXTRACTABLE_BLOCKS)
                .add(Blocks.COAL_ORE)
                .add(Blocks.COPPER_ORE)
                .add(Blocks.LAPIS_ORE)
                .add(Blocks.IRON_ORE)
                .add(Blocks.REDSTONE_ORE)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.EMERALD_ORE)
                .add(ModBlocks.LEAD_ORE)
                .addOptional(Identifier.tryParse("create:zinc_ore"))
        ;
        getOrCreateTagBuilder(ModTags.Blocks.ANDESITE_EXTRACTABLE_BLOCKS)
                .addOptional(Identifier.tryParse("universal_ores:andesite_coal_ore"))
                .addOptional(Identifier.tryParse("universal_ores:andesite_iron_ore"))
                .addOptional(Identifier.tryParse("universal_ores:andesite_gold_ore"))
                .addOptional(Identifier.tryParse("universal_ores:andesite_copper_ore"))
                .addOptional(Identifier.tryParse("universal_ores:andesite_redstone_ore"))
                .addOptional(Identifier.tryParse("universal_ores:andesite_lapis_ore"))
                .addOptional(Identifier.tryParse("universal_ores:andesite_emerald_ore"))
                .addOptional(Identifier.tryParse("universal_ores:andesite_diamond_ore"))
        ;
        getOrCreateTagBuilder(ModTags.Blocks.DIORITE_EXTRACTABLE_BLOCKS)
                .addOptional(Identifier.tryParse("universal_ores:diorite_coal_ore"))
                .addOptional(Identifier.tryParse("universal_ores:diorite_iron_ore"))
                .addOptional(Identifier.tryParse("universal_ores:diorite_gold_ore"))
                .addOptional(Identifier.tryParse("universal_ores:diorite_copper_ore"))
                .addOptional(Identifier.tryParse("universal_ores:diorite_redstone_ore"))
                .addOptional(Identifier.tryParse("universal_ores:diorite_lapis_ore"))
                .addOptional(Identifier.tryParse("universal_ores:diorite_emerald_ore"))
                .addOptional(Identifier.tryParse("universal_ores:diorite_diamond_ore"))
        ;
        getOrCreateTagBuilder(ModTags.Blocks.GRANITE_EXTRACTABLE_BLOCKS)
                .addOptional(Identifier.tryParse("universal_ores:granite_coal_ore"))
                .addOptional(Identifier.tryParse("universal_ores:granite_iron_ore"))
                .addOptional(Identifier.tryParse("universal_ores:granite_gold_ore"))
                .addOptional(Identifier.tryParse("universal_ores:granite_copper_ore"))
                .addOptional(Identifier.tryParse("universal_ores:granite_redstone_ore"))
                .addOptional(Identifier.tryParse("universal_ores:granite_lapis_ore"))
                .addOptional(Identifier.tryParse("universal_ores:granite_emerald_ore"))
                .addOptional(Identifier.tryParse("universal_ores:granite_diamond_ore"))
        ;
        getOrCreateTagBuilder(ModTags.Blocks.TUFF_EXTRACTABLE_BLOCKS)
                .addOptional(Identifier.tryParse("universal_ores:tuff_coal_ore"))
                .addOptional(Identifier.tryParse("universal_ores:tuff_iron_ore"))
                .addOptional(Identifier.tryParse("universal_ores:tuff_gold_ore"))
                .addOptional(Identifier.tryParse("universal_ores:tuff_copper_ore"))
                .addOptional(Identifier.tryParse("universal_ores:tuff_redstone_ore"))
                .addOptional(Identifier.tryParse("universal_ores:tuff_lapis_ore"))
                .addOptional(Identifier.tryParse("universal_ores:tuff_emerald_ore"))
                .addOptional(Identifier.tryParse("universal_ores:tuff_diamond_ore"))
        ;
        getOrCreateTagBuilder(ModTags.Blocks.CALCITE_EXTRACTABLE_BLOCKS)
                .addOptional(Identifier.tryParse("universal_ores:calcite_coal_ore"))
                .addOptional(Identifier.tryParse("universal_ores:calcite_iron_ore"))
                .addOptional(Identifier.tryParse("universal_ores:calcite_gold_ore"))
                .addOptional(Identifier.tryParse("universal_ores:calcite_copper_ore"))
                .addOptional(Identifier.tryParse("universal_ores:calcite_redstone_ore"))
                .addOptional(Identifier.tryParse("universal_ores:calcite_lapis_ore"))
                .addOptional(Identifier.tryParse("universal_ores:calcite_emerald_ore"))
                .addOptional(Identifier.tryParse("universal_ores:calcite_diamond_ore"))
        ;
        getOrCreateTagBuilder(ModTags.Blocks.DEEPSLATE_EXTRACTABLE_BLOCKS)
                .add(Blocks.DEEPSLATE_COAL_ORE)
                .add(Blocks.DEEPSLATE_COPPER_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE)
                .add(Blocks.DEEPSLATE_IRON_ORE)
                .add(Blocks.DEEPSLATE_REDSTONE_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_EMERALD_ORE)
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE)
                .add(ModBlocks.HELIORITE_ORE)
                .add(ModBlocks.PALLADIUM_ORE)
                .add(ModBlocks.JURASSOLINE_ORE)
                .add(ModBlocks.CINNABAR_ORE)
                .add(ModBlocks.NEBULAR_ORE)
                .add(ModBlocks.DEEPSLATE_FOSSIL)
                .addOptional(Identifier.tryParse("create:deepslate_zinc_ore"))
        ;
        getOrCreateTagBuilder(ModTags.Blocks.RED_DEEPSLATE_EXTRACTABLE_BLOCKS)
                .add(ModBlocks.RED_DEEPSLATE_IRON_ORE)
                .add(ModBlocks.RED_DEEPSLATE_COPPER_ORE)
                .add(ModBlocks.RED_DEEPSLATE_GOLD_ORE)
                .add(ModBlocks.RED_DEEPSLATE_REDSTONE_ORE)
                .add(ModBlocks.RED_DEEPSLATE_EMERALD_ORE)
                .add(ModBlocks.RED_DEEPSLATE_LAPIS_ORE)
                .add(ModBlocks.RED_DEEPSLATE_DIAMOND_ORE)

                .add(ModBlocks.RED_DEEPSLATE_SULFUR_ORE)
                .add(ModBlocks.RED_DEEPSLATE_LEAD_ORE)
                .add(ModBlocks.RED_DEEPSLATE_URANIUM_ORE)
                .add(ModBlocks.RED_DEEPSLATE_HELIORITE_ORE)
                .add(ModBlocks.RED_DEEPSLATE_PALLADIUM_ORE)
                .add(ModBlocks.RED_DEEPSLATE_JURASSOLINE_ORE)
                .add(ModBlocks.RED_DEEPSLATE_CINNABAR_ORE)
                .add(ModBlocks.RED_DEEPSLATE_NEBULAR_ORE)
        ;
        getOrCreateTagBuilder(ModTags.Blocks.BEDROCK_EXTRACTABLE_BLOCKS)
                .add(ModBlocks.MITHRIL_ORE)
        ;
        getOrCreateTagBuilder(ModTags.Blocks.END_STONE_EXTRACTABLE_BLOCKS)
                .add(ModBlocks.END_STONE_ENDURIUM_ORE)
        ;
        getOrCreateTagBuilder(ModTags.Blocks.MOON_ROCK_EXTRACTABLE_BLOCKS)
                .add(ModBlocks.MOON_ROCK_COAL_ORE)
                .add(ModBlocks.MOON_ROCK_IRON_ORE)
                .add(ModBlocks.MOON_ROCK_LUNAR_CALLAINUS_ORE)
        ;
        getOrCreateTagBuilder(ModTags.Blocks.NETHERRACK_EXTRACTABLE_BLOCKS)
                .add(ModBlocks.NETHER_SULFUR_ORE)
                .add(Blocks.NETHER_QUARTZ_ORE)
                .add(Blocks.NETHER_GOLD_ORE)
        ;
        getOrCreateTagBuilder(ModTags.Blocks.BASALT_EXTRACTABLE_BLOCKS)
                .addOptional(Identifier.tryParse("universal_ores:basalt_gold_ore"))
                .addOptional(Identifier.tryParse("universal_ores:basalt_quartz_ore"))
        ;
        getOrCreateTagBuilder(ModTags.Blocks.BLACKSTONE_EXTRACTABLE_BLOCKS)
                .addOptional(Identifier.tryParse("universal_ores:blackstone_gold_ore"))
                .addOptional(Identifier.tryParse("universal_ores:blackstone_quartz_ore"))
        ;

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.GINKGO_LEAVES)
        ;

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(ModBlocks.GINKGO_SAPLING)
        ;

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.STANDING_GINKGO_SIGN)
        ;

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(ModBlocks.WALL_GINKGO_SIGN)
        ;

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.HANGING_GINKGO_SIGN)
        ;

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.WALL_HANGING_GINKGO_SIGN)
        ;

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.GINKGO_BUTTON)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.GINKGO_DOOR)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.GINKGO_FENCE)
        ;

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.GINKGO_FENCE_GATE)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.GINKGO_PRESSURE_PLATE)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.GINKGO_SLAB)
                .add(ModBlocks.FANCY_OAK_SLAB)
                .add(ModBlocks.FANCY_SPRUCE_SLAB)
                .add(ModBlocks.FANCY_BIRCH_SLAB)
                .add(ModBlocks.FANCY_JUNGLE_SLAB)
                .add(ModBlocks.FANCY_ACACIA_SLAB)
                .add(ModBlocks.FANCY_DARK_OAK_SLAB)
                .add(ModBlocks.FANCY_MANGROVE_SLAB)
                .add(ModBlocks.FANCY_CHERRY_SLAB)
                .add(ModBlocks.FANCY_PALE_OAK_SLAB)
                .add(ModBlocks.FANCY_BAMBOO_SLAB)
                .add(ModBlocks.FANCY_CRIMSON_SLAB)
                .add(ModBlocks.FANCY_WARPED_SLAB)
                .add(ModBlocks.FANCY_GINKGO_SLAB)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.GINKGO_STAIRS)
                .add(ModBlocks.FANCY_OAK_STAIRS)
                .add(ModBlocks.FANCY_SPRUCE_STAIRS)
                .add(ModBlocks.FANCY_BIRCH_STAIRS)
                .add(ModBlocks.FANCY_JUNGLE_STAIRS)
                .add(ModBlocks.FANCY_ACACIA_STAIRS)
                .add(ModBlocks.FANCY_DARK_OAK_STAIRS)
                .add(ModBlocks.FANCY_MANGROVE_STAIRS)
                .add(ModBlocks.FANCY_CHERRY_STAIRS)
                .add(ModBlocks.FANCY_PALE_OAK_STAIRS)
                .add(ModBlocks.FANCY_BAMBOO_STAIRS)
                .add(ModBlocks.FANCY_CRIMSON_STAIRS)
                .add(ModBlocks.FANCY_WARPED_STAIRS)
                .add(ModBlocks.FANCY_GINKGO_STAIRS)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.GINKGO_TRAPDOOR)
                .add(ModBlocks.FANCY_OAK_TRAPDOOR)
                .add(ModBlocks.FANCY_SPRUCE_TRAPDOOR)
                .add(ModBlocks.FANCY_BIRCH_TRAPDOOR)
                .add(ModBlocks.FANCY_JUNGLE_TRAPDOOR)
                .add(ModBlocks.FANCY_ACACIA_TRAPDOOR)
                .add(ModBlocks.FANCY_DARK_OAK_TRAPDOOR)
                .add(ModBlocks.FANCY_MANGROVE_TRAPDOOR)
                .add(ModBlocks.FANCY_CHERRY_TRAPDOOR)
                .add(ModBlocks.FANCY_PALE_OAK_TRAPDOOR)
                .add(ModBlocks.FANCY_BAMBOO_TRAPDOOR)
                .add(ModBlocks.FANCY_CRIMSON_TRAPDOOR)
                .add(ModBlocks.FANCY_WARPED_TRAPDOOR)
                .add(ModBlocks.FANCY_GINKGO_TRAPDOOR)
        ;

        getOrCreateTagBuilder(ModTags.Blocks.GINKGO_LOGS)
                .add(ModBlocks.GINKGO_LOG)
                .add(ModBlocks.GINKGO_WOOD)
                .add(ModBlocks.STRIPPED_GINKGO_LOG)
                .add(ModBlocks.STRIPPED_GINKGO_WOOD)
        ;

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.GINKGO_PLANKS)
                .add(ModBlocks.FANCY_OAK_PLANKS)
                .add(ModBlocks.FANCY_SPRUCE_PLANKS)
                .add(ModBlocks.FANCY_BIRCH_PLANKS)
                .add(ModBlocks.FANCY_JUNGLE_PLANKS)
                .add(ModBlocks.FANCY_ACACIA_PLANKS)
                .add(ModBlocks.FANCY_DARK_OAK_PLANKS)
                .add(ModBlocks.FANCY_MANGROVE_PLANKS)
                .add(ModBlocks.FANCY_CHERRY_PLANKS)
                .add(ModBlocks.FANCY_PALE_OAK_PLANKS)
                .add(ModBlocks.FANCY_BAMBOO_PLANKS)
                .add(ModBlocks.FANCY_CRIMSON_PLANKS)
                .add(ModBlocks.FANCY_WARPED_PLANKS)
                .add(ModBlocks.FANCY_GINKGO_PLANKS)
        ;

        getOrCreateTagBuilder(ModTags.Blocks.WOODEN_STEINS)
                .add(ModBlocks.WOODEN_STEIN)
                .add(ModBlocks.WOODEN_WATER_STEIN)
                .add(ModBlocks.WOODEN_MILK_STEIN)
                .add(ModBlocks.WOODEN_BEER_STEIN)
                .add(ModBlocks.WOODEN_APPLE_JUICE_STEIN)
                .add(ModBlocks.WOODEN_ORANGE_JUICE_STEIN)
                .add(ModBlocks.WOODEN_STRAWBERRY_MILKSHAKE_STEIN)
                .add(ModBlocks.WOODEN_ORANGE_MILKSHAKE_STEIN)
                .add(ModBlocks.WOODEN_CHOCOLATE_MILKSHAKE_STEIN)
                .add(ModBlocks.HOT_WOODEN_MILK_STEIN)
                .add(ModBlocks.WOODEN_HOT_CHOCOLATE_STEIN)
        ;

        getOrCreateTagBuilder(ModTags.Blocks.LOGS_WITH_BARK)
                .add(Blocks.OAK_LOG)
                .add(Blocks.OAK_WOOD)
                .add(Blocks.SPRUCE_LOG)
                .add(Blocks.SPRUCE_WOOD)
                .add(Blocks.BIRCH_LOG)
                .add(Blocks.BIRCH_WOOD)
                .add(Blocks.JUNGLE_LOG)
                .add(Blocks.JUNGLE_WOOD)
                .add(Blocks.ACACIA_LOG)
                .add(Blocks.ACACIA_WOOD)
                .add(Blocks.DARK_OAK_LOG)
                .add(Blocks.DARK_OAK_WOOD)
                .add(Blocks.MANGROVE_LOG)
                .add(Blocks.MANGROVE_WOOD)
                .add(Blocks.CHERRY_LOG)
                .add(Blocks.CHERRY_WOOD)
                .add(ModBlocks.GINKGO_LOG)
                .add(ModBlocks.GINKGO_WOOD)
        ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.RICH_GRASS_BLOCK)
                .add(ModBlocks.RICH_DIRT)
                .add(ModBlocks.RICH_DIRT_PATH)
                .add(ModBlocks.RICH_FARMLAND)

                .add(ModBlocks.RED_SANDY_DEEPSLATE)
                .add(ModBlocks.RED_GRAVEL)
        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

                .add(ModBlocks.APPARATUS)

                .add(ModBlocks.GLOBUS_CRUCIGER)

                .add(ModBlocks.GARBAGE_CAN)

                .add(ModBlocks.GRAVESTONE)
                .add(ModBlocks.MOSSY_GRAVESTONE)
                .add(ModBlocks.GRAVESTONE_CROSS)
                .add(ModBlocks.MOSSY_GRAVESTONE_CROSS)

                .add(ModBlocks.SKELETON)
                .add(ModBlocks.EMERGING_SKELETON)

                .add(ModBlocks.BLOOD_CAULDRON)

                .add(ModBlocks.RADIO)
                .add(ModBlocks.RADIO_ON)
                .add(ModBlocks.TELEVISION)
                .add(ModBlocks.TELEVISION_ON)
                .add(ModBlocks.COMPUTER)
                .add(ModBlocks.COMPUTER_ON)
                .add(ModBlocks.INTERDIMENSIONAL_RECEIVER)
                .add(ModBlocks.OXYGEN_COLLECTOR)

                .add(ModBlocks.MINING_ELEVATOR_CONTROLLER)
                .add(ModBlocks.MINING_ELEVATOR_BASE)
                .add(ModBlocks.WOODEN_ELEVATOR_CONTROLLER)
                .add(ModBlocks.WOODEN_ELEVATOR_BASE)
                .add(ModBlocks.QUARTZ_ELEVATOR_CONTROLLER)
                .add(ModBlocks.QUARTZ_ELEVATOR_BASE)
                .add(ModBlocks.GLASS_ELEVATOR_CONTROLLER)
                .add(ModBlocks.GLASS_ELEVATOR_BASE)

                .add(ModBlocks.MARBLE)
                .add(ModBlocks.MARBLE_STAIRS)
                .add(ModBlocks.MARBLE_SLAB)
                .add(ModBlocks.MARBLE_WALL)
                .add(ModBlocks.MARBLE_PRESSURE_PLATE)
                .add(ModBlocks.MARBLE_BUTTON)
                .add(ModBlocks.LIMESTONE)
                .add(ModBlocks.LIMESTONE_STAIRS)
                .add(ModBlocks.LIMESTONE_SLAB)
                .add(ModBlocks.LIMESTONE_WALL)
                .add(ModBlocks.LIMESTONE_PRESSURE_PLATE)
                .add(ModBlocks.LIMESTONE_BUTTON)

                .add(ModBlocks.RED_SANDY_DEEPSLATE)

                .add(ModBlocks.RED_DEEPSLATE)
                .add(ModBlocks.RED_DEEPSLATE_STAIRS)
                .add(ModBlocks.RED_DEEPSLATE_SLAB)
                .add(ModBlocks.RED_DEEPSLATE_WALL)
                .add(ModBlocks.POLISHED_RED_DEEPSLATE)
                .add(ModBlocks.RED_DEEPSLATE_BRICKS)
                .add(ModBlocks.RED_DEEPSLATE_BRICK_STAIRS)
                .add(ModBlocks.RED_DEEPSLATE_BRICK_SLAB)
                .add(ModBlocks.RED_DEEPSLATE_BRICK_WALL)
                .add(ModBlocks.MOSSY_RED_DEEPSLATE_BRICKS)
                .add(ModBlocks.CRACKED_RED_DEEPSLATE_BRICKS)

                .add(ModBlocks.COBBLED_RED_DEEPSLATE)
                .add(ModBlocks.COBBLED_RED_DEEPSLATE_STAIRS)
                .add(ModBlocks.COBBLED_RED_DEEPSLATE_SLAB)
                .add(ModBlocks.COBBLED_RED_DEEPSLATE_WALL)
                .add(ModBlocks.POLISHED_COBBLED_RED_DEEPSLATE)
                .add(ModBlocks.COBBLED_RED_DEEPSLATE_BRICKS)
                .add(ModBlocks.COBBLED_RED_DEEPSLATE_BRICK_STAIRS)
                .add(ModBlocks.COBBLED_RED_DEEPSLATE_BRICK_SLAB)
                .add(ModBlocks.COBBLED_RED_DEEPSLATE_BRICK_WALL)
                .add(ModBlocks.MOSSY_COBBLED_RED_DEEPSLATE_BRICKS)
                .add(ModBlocks.CRACKED_COBBLED_RED_DEEPSLATE_BRICKS)

                .add(ModBlocks.REINFORCED_RED_DEEPSLATE)

                .add(ModBlocks.RED_DEEPSLATE_IRON_ORE)
                .add(ModBlocks.RED_DEEPSLATE_COPPER_ORE)
                .add(ModBlocks.RED_DEEPSLATE_GOLD_ORE)
                .add(ModBlocks.RED_DEEPSLATE_REDSTONE_ORE)
                .add(ModBlocks.RED_DEEPSLATE_EMERALD_ORE)
                .add(ModBlocks.RED_DEEPSLATE_LAPIS_ORE)
                .add(ModBlocks.RED_DEEPSLATE_DIAMOND_ORE)

                .add(ModBlocks.RED_DEEPSLATE_SULFUR_ORE)
                .add(ModBlocks.RED_DEEPSLATE_LEAD_ORE)
                .add(ModBlocks.RED_DEEPSLATE_URANIUM_ORE)
                .add(ModBlocks.RED_DEEPSLATE_HELIORITE_ORE)
                .add(ModBlocks.RED_DEEPSLATE_PALLADIUM_ORE)
                .add(ModBlocks.RED_DEEPSLATE_JURASSOLINE_ORE)
                .add(ModBlocks.RED_DEEPSLATE_CINNABAR_ORE)
                .add(ModBlocks.RED_DEEPSLATE_NEBULAR_ORE)

                .add(ModBlocks.XEN_CRYSTAL_CLUSTER)
                .add(ModBlocks.XEN_CRYSTAL_BLOCK)

                .add(ModBlocks.MOON_ROCK)
                .add(ModBlocks.MOON_ROCK_COAL_ORE)
                .add(ModBlocks.MOON_ROCK_IRON_ORE)
                .add(ModBlocks.MOON_ROCK_LUNAR_CALLAINUS_ORE)

                .add(ModBlocks.STEEL_BLOCK)

                .add(ModBlocks.NETHER_SULFUR_ORE)
                .add(ModBlocks.SULFUR_BLOCK)

                .add(ModBlocks.LEAD_ORE)
                .add(ModBlocks.RAW_LEAD_BLOCK)
                .add(ModBlocks.LEAD_BLOCK)

                .add(ModBlocks.DEEPSLATE_URANIUM_ORE)
                .add(ModBlocks.RAW_URANIUM_BLOCK)
                .add(ModBlocks.URANIUM_BLOCK)

                .add(ModBlocks.DEEPSLATE_FOSSIL)

                .add(ModBlocks.HELIORITE_ORE)
                .add(ModBlocks.HELIORITE_COMB_BLOCK)
                .add(ModBlocks.HELIORITE_BLOCK)

                .add(ModBlocks.END_STONE_ENDURIUM_ORE)
                .add(ModBlocks.RAW_ENDURIUM_BLOCK)
                .add(ModBlocks.ENDURIUM_BLOCK)

                .add(ModBlocks.PALLADIUM_ORE)
                .add(ModBlocks.RAW_PALLADIUM_BLOCK)
                .add(ModBlocks.PALLADIUM_BLOCK)

                .add(ModBlocks.JURASSOLINE_ORE)
                .add(ModBlocks.JURASSOLINE_CRYSTAL_BLOCK)
                .add(ModBlocks.JURASSOLINE_BLOCK)

                .add(ModBlocks.CINNABAR_ORE)
                .add(ModBlocks.CINNABAR_CRYSTAL_BLOCK)
                .add(ModBlocks.CINNABAR_BLOCK)

                .add(ModBlocks.NEBULAR_ORE)
                .add(ModBlocks.RAW_NEBULAR_BLOCK)
                .add(ModBlocks.NEBULAR_BLOCK)

                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.RAW_MITHRIL_BLOCK)
                .add(ModBlocks.MITHRIL_BLOCK)

                .add(ModBlocks.MITHRIL_ANVIL)
        ;

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.GINKGO_LEAVES)
        ;

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.MARBLE_WALL)
                .add(ModBlocks.LIMESTONE_WALL)
                .add(ModBlocks.RED_DEEPSLATE_WALL)
                .add(ModBlocks.RED_DEEPSLATE_BRICK_WALL)
                .add(ModBlocks.COBBLED_RED_DEEPSLATE_WALL)
                .add(ModBlocks.COBBLED_RED_DEEPSLATE_BRICK_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.STONE_BUTTONS)
                .add(ModBlocks.MARBLE_BUTTON)
                .add(ModBlocks.LIMESTONE_BUTTON)
                .add(ModBlocks.RED_DEEPSLATE_BUTTON)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.GINKGO_BUTTON)
        ;

        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.ROSE)
                .add(ModBlocks.EDELWEISS)
        ;

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POTTED_ROSE)
                .add(ModBlocks.POTTED_EDELWEISS)
                .add(ModBlocks.POTTED_GINKGO_SAPLING)
        ;

        getOrCreateTagBuilder(BlockTags.ANIMALS_SPAWNABLE_ON)
                .add(ModBlocks.RICH_GRASS_BLOCK)
        ;
        getOrCreateTagBuilder(BlockTags.RABBITS_SPAWNABLE_ON)
                .add(ModBlocks.RICH_GRASS_BLOCK)
        ;
        getOrCreateTagBuilder(BlockTags.SNIFFER_DIGGABLE_BLOCK)
                .add(ModBlocks.RICH_GRASS_BLOCK)
                .add(ModBlocks.RICH_DIRT)
        ;
        getOrCreateTagBuilder(BlockTags.WOLVES_SPAWNABLE_ON)
                .add(ModBlocks.RICH_GRASS_BLOCK)
        ;
        getOrCreateTagBuilder(BlockTags.PARROTS_SPAWNABLE_ON)
                .add(ModBlocks.RICH_GRASS_BLOCK)
        ;
        getOrCreateTagBuilder(BlockTags.GOATS_SPAWNABLE_ON)
                .add(ModBlocks.RICH_GRASS_BLOCK)
        ;
        getOrCreateTagBuilder(BlockTags.FROGS_SPAWNABLE_ON)
                .add(ModBlocks.RICH_GRASS_BLOCK)
        ;
        getOrCreateTagBuilder(BlockTags.FOXES_SPAWNABLE_ON)
                .add(ModBlocks.RICH_GRASS_BLOCK)
        ;
        getOrCreateTagBuilder(BlockTags.VALID_SPAWN)
                .add(ModBlocks.RICH_GRASS_BLOCK)
        ;
        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.RICH_GRASS_BLOCK)
                .add(ModBlocks.RICH_DIRT)
        ;

        getOrCreateTagBuilder(BlockTags.VIBRATION_RESONATORS)
                .add(ModBlocks.XEN_CRYSTAL_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(ModBlocks.XEN_CRYSTAL_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.CAULDRONS)
                .add(ModBlocks.BLOOD_CAULDRON)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("c", "clusters")))
                .add(ModBlocks.XEN_CRYSTAL_CLUSTER)
        ;

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.HELIORITE_BLOCK)
                .add(ModBlocks.ENDURIUM_BLOCK)
                .add(ModBlocks.PALLADIUM_BLOCK)
                .add(ModBlocks.JURASSOLINE_BLOCK)
                .add(ModBlocks.CINNABAR_BLOCK)
                .add(ModBlocks.NEBULAR_BLOCK)
                .add(ModBlocks.MITHRIL_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LEAD_ORE)
                .add(ModBlocks.RAW_LEAD_BLOCK)
                .add(ModBlocks.LEAD_BLOCK)

                .add(ModBlocks.MOON_ROCK_IRON_ORE)

                .add(ModBlocks.RED_DEEPSLATE_LEAD_ORE)
                .add(ModBlocks.RED_DEEPSLATE_IRON_ORE)
                .add(ModBlocks.RED_DEEPSLATE_COPPER_ORE)
                .add(ModBlocks.RED_DEEPSLATE_LAPIS_ORE)

                .add(ModBlocks.STEEL_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)

                .add(ModBlocks.DEEPSLATE_URANIUM_ORE)
                .add(ModBlocks.RAW_URANIUM_BLOCK)
                .add(ModBlocks.URANIUM_BLOCK)

                .add(ModBlocks.RED_DEEPSLATE_URANIUM_ORE)
                .add(ModBlocks.RED_DEEPSLATE_GOLD_ORE)
                .add(ModBlocks.RED_DEEPSLATE_REDSTONE_ORE)
                .add(ModBlocks.RED_DEEPSLATE_EMERALD_ORE)
                .add(ModBlocks.RED_DEEPSLATE_DIAMOND_ORE)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PREHISTORIC_DEBRIS)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.HELIORITE_ORE)
                .add(ModBlocks.HELIORITE_COMB_BLOCK)
                .add(ModBlocks.HELIORITE_BLOCK)
                .add(ModBlocks.END_STONE_ENDURIUM_ORE)
                .add(ModBlocks.RAW_ENDURIUM_BLOCK)
                .add(ModBlocks.ENDURIUM_BLOCK)

                .add(ModBlocks.RED_DEEPSLATE_HELIORITE_ORE)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.PALLADIUM_ORE)
                .add(ModBlocks.RAW_PALLADIUM_BLOCK)
                .add(ModBlocks.PALLADIUM_BLOCK)
                .add(ModBlocks.RED_DEEPSLATE_PALLADIUM_ORE)
                .add(ModBlocks.JURASSOLINE_ORE)
                .add(ModBlocks.JURASSOLINE_CRYSTAL_BLOCK)
                .add(ModBlocks.JURASSOLINE_BLOCK)
                .add(ModBlocks.RED_DEEPSLATE_JURASSOLINE_ORE)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_6")))
                .add(ModBlocks.CINNABAR_ORE)
                .add(ModBlocks.CINNABAR_CRYSTAL_BLOCK)
                .add(ModBlocks.CINNABAR_BLOCK)
                .add(ModBlocks.RED_DEEPSLATE_CINNABAR_ORE)
                .add(ModBlocks.NEBULAR_ORE)
                .add(ModBlocks.RAW_NEBULAR_BLOCK)
                .add(ModBlocks.NEBULAR_BLOCK)
                .add(ModBlocks.RED_DEEPSLATE_NEBULAR_ORE)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_7")))
                .add(ModBlocks.RAW_MITHRIL_BLOCK)
                .add(ModBlocks.MITHRIL_BLOCK)
                .add(ModBlocks.MITHRIL_ANVIL)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_8")))
                .add(ModBlocks.MOON_ROCK_LUNAR_CALLAINUS_ORE)
        ;

        getOrCreateTagBuilder(ModTags.Blocks.ELEVATOR_CONTROLLERS)
                .add(ModBlocks.MINING_ELEVATOR_CONTROLLER)
                .add(ModBlocks.WOODEN_ELEVATOR_CONTROLLER)
                .add(ModBlocks.QUARTZ_ELEVATOR_CONTROLLER)
                .add(ModBlocks.GLASS_ELEVATOR_CONTROLLER)
        ;
        getOrCreateTagBuilder(ModTags.Blocks.ELEVATOR_BASES)
                .add(ModBlocks.MINING_ELEVATOR_BASE)
                .add(ModBlocks.WOODEN_ELEVATOR_BASE)
                .add(ModBlocks.QUARTZ_ELEVATOR_BASE)
                .add(ModBlocks.GLASS_ELEVATOR_BASE)
        ;

        getOrCreateTagBuilder(ModTags.Blocks.TELEVISIONS)
                .add(ModBlocks.TELEVISION)
                .add(ModBlocks.TELEVISION_ON)
        ;
    }
}
