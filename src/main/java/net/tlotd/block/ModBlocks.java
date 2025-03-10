package net.tlotd.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.tlotd.TLOTD;
import net.tlotd.block.custom.*;
import net.tlotd.item.ModFoodComponents;
import net.tlotd.item.custom.DrinkableWoodenSteinBlockItem;
import net.tlotd.item.custom.IrradiatedBlockItem;
import net.tlotd.item.custom.WoodenSteinBlockItem;
import net.tlotd.world.tree.GinkgoSaplingGenerator;

public class ModBlocks {

    public static final Block TREX_EGG = registerBlock("t-rex_egg",
            new TRexEggBlock(FabricBlockSettings.create().mapColor(MapColor.RED).strength(0.5f, 0.5f).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block BW_STICKER = registerBlock("bw_sticker",
            new StickerBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).breakInstantly().sounds(BlockSoundGroup.GRASS).collidable(false).nonOpaque()));
    public static final Block TLOTD_STICKER = registerBlock("tlotd_sticker",
            new StickerBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).breakInstantly().sounds(BlockSoundGroup.GRASS).collidable(false).nonOpaque()));

    public static final Block APPARATUS = registerIrradiatedBlock("apparatus",
            new ApparatusBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).strength(2.0F, 2.0F).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)));

    public static final Block BLOOD_CAULDRON = registerBlockWithoutItem("blood_cauldron",
            new BloodCauldronBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(2.0F, 2.0F).nonOpaque()));

    public static final Block STRAWBERRY_BUSH = registerBlockWithoutItem("strawberry_bush",
            new StrawberryBushBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ORANGE_TREE = registerBlockWithoutItem("orange_tree",
            new OrangeTreeBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block STRAWBERRY_CAKE = registerBlock("strawberry_cake", new CakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block ORANGE_CAKE = registerBlock("orange_cake", new CakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));

    public static final Block GRAVESTONE = registerBlock("gravestone",
            new GravestoneBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block MOSSY_GRAVESTONE = registerBlock("mossy_gravestone",
            new GravestoneBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block GRAVESTONE_CROSS = registerBlock("gravestone_cross",
            new GravestoneBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block MOSSY_GRAVESTONE_CROSS = registerBlock("mossy_gravestone_cross",
            new GravestoneBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(2.0F, 3.0F)));

    public static final Block SKELETON = registerBlock("skeleton",
            new SkeletonBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).noCollision().sounds(BlockSoundGroup.BONE).strength(1.0F, 1.0F)));
    public static final Block EMERGING_SKELETON = registerBlock("emerging_skeleton",
            new SkeletonBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).noCollision().sounds(BlockSoundGroup.BONE).strength(1.0F, 1.0F)));

    public static final Block EFFIGIES = registerBlock("effigies",
            new EffigiesBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque().collidable(false).ticksRandomly()));

    public static final Block WITCHING_TABLE = registerBlock("witching_table",
            new WitchingTableBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));

    public static final Block OUIJA_BOARD = registerBlock("ouija_board",
            new OuijaBoardBlock(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(1.0F, 1.0F).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GOAT_HEAD = registerBlock("goat_head",
            new GoatHeadBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(2.0F, 3.0F).nonOpaque()));

    public static final Block MARBLE = registerBlock("marble",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(2.75F, 6.0F)));
    public static final Block MARBLE_STAIRS = registerBlock("marble_stairs",
            new StairsBlock(ModBlocks.MARBLE.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(2.75F, 6.0F)));
    public static final Block MARBLE_SLAB = registerBlock("marble_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(2.75F, 6.0F)));
    public static final Block MARBLE_WALL = registerBlock("marble_wall",
            new WallBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(2.75F, 6.0F)));
    public static final Block MARBLE_BUTTON = registerBlock("marble_button",
            new ButtonBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(0.5F, 0.5F).collidable(false), BlockSetType.STONE, 20, false));
    public static final Block MARBLE_PRESSURE_PLATE = registerBlock("marble_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(0.5F, 0.5F).collidable(false), BlockSetType.STONE));

    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(1.75F, 3.0F)));
    public static final Block LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            new StairsBlock(ModBlocks.LIMESTONE.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(1.75F, 3.0F)));
    public static final Block LIMESTONE_SLAB = registerBlock("limestone_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(1.75F, 3.0F)));
    public static final Block LIMESTONE_WALL = registerBlock("limestone_wall",
            new WallBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(1.75F, 3.0F)));
    public static final Block LIMESTONE_BUTTON = registerBlock("limestone_button",
            new ButtonBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(0.5F, 0.5F).collidable(false), BlockSetType.STONE, 20, false));
    public static final Block LIMESTONE_PRESSURE_PLATE = registerBlock("limestone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(0.5F, 0.5F).collidable(false), BlockSetType.STONE));

    public static final Block RICH_DIRT = registerBlock("rich_dirt",
            new RichDirtBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block RICH_FARMLAND = registerBlock("rich_farmland",
            new RichFarmlandBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block RICH_DIRT_PATH = registerBlock("rich_dirt_path",
            new RichDirtPathBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block RICH_GRASS_BLOCK = registerBlock("rich_grass_block",
            new RichGrassBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).requiresTool().strength(0.6F, 0.6F).sounds(BlockSoundGroup.GRASS).ticksRandomly()));

    public static final Block RED_GRAVEL = registerBlock("red_gravel",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(0.6F, 0.6F).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block RED_SANDY_DEEPSLATE = registerBlock("red_sandy_deepslate",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.SAND)));

    public static final Block RED_DEEPSLATE = registerBlock("red_deepslate",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_STAIRS = registerBlock("red_deepslate_stairs",
            new StairsBlock(ModBlocks.RED_DEEPSLATE.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_SLAB = registerBlock("red_deepslate_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_WALL = registerBlock("red_deepslate_wall",
            new WallBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_BUTTON = registerBlock("red_deepslate_button",
            new ButtonBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(0.5F, 0.5F).collidable(false), BlockSetType.STONE, 20, false));
    public static final Block RED_DEEPSLATE_PRESSURE_PLATE = registerBlock("red_deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(0.5F, 0.5F).collidable(false), BlockSetType.STONE));
    public static final Block POLISHED_RED_DEEPSLATE = registerBlock("polished_red_deepslate",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_BRICKS = registerBlock("red_deepslate_bricks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_BRICK_STAIRS = registerBlock("red_deepslate_brick_stairs",
            new StairsBlock(ModBlocks.RED_DEEPSLATE_BRICKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_BRICK_SLAB = registerBlock("red_deepslate_brick_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_BRICK_WALL = registerBlock("red_deepslate_brick_wall",
            new WallBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CRACKED_RED_DEEPSLATE_BRICKS = registerBlock("cracked_red_deepslate_bricks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block MOSSY_RED_DEEPSLATE_BRICKS = registerBlock("mossy_red_deepslate_bricks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block COBBLED_RED_DEEPSLATE = registerBlock("cobbled_red_deepslate",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block COBBLED_RED_DEEPSLATE_STAIRS = registerBlock("cobbled_red_deepslate_stairs",
            new StairsBlock(ModBlocks.COBBLED_RED_DEEPSLATE.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block COBBLED_RED_DEEPSLATE_SLAB = registerBlock("cobbled_red_deepslate_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block COBBLED_RED_DEEPSLATE_WALL = registerBlock("cobbled_red_deepslate_wall",
            new WallBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block POLISHED_COBBLED_RED_DEEPSLATE = registerBlock("polished_cobbled_red_deepslate",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block COBBLED_RED_DEEPSLATE_BRICKS = registerBlock("cobbled_red_deepslate_bricks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block COBBLED_RED_DEEPSLATE_BRICK_STAIRS = registerBlock("cobbled_red_deepslate_brick_stairs",
            new StairsBlock(ModBlocks.COBBLED_RED_DEEPSLATE_BRICKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block COBBLED_RED_DEEPSLATE_BRICK_SLAB = registerBlock("cobbled_red_deepslate_brick_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block COBBLED_RED_DEEPSLATE_BRICK_WALL = registerBlock("cobbled_red_deepslate_brick_wall",
            new WallBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CRACKED_COBBLED_RED_DEEPSLATE_BRICKS = registerBlock("cracked_cobbled_red_deepslate_bricks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block MOSSY_COBBLED_RED_DEEPSLATE_BRICKS = registerBlock("mossy_cobbled_red_deepslate_bricks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(2.75F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block REINFORCED_RED_DEEPSLATE = registerBlock("reinforced_red_deepslate",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).requiresTool().strength(55.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block RED_DEEPSLATE_IRON_ORE = registerBlock("red_deepslate_iron_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.RAW_IRON_PINK).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_COPPER_ORE = registerBlock("red_deepslate_copper_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_GOLD_ORE = registerBlock("red_deepslate_gold_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GOLD).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_REDSTONE_ORE = registerBlock("red_deepslate_redstone_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.RED).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_EMERALD_ORE = registerBlock("red_deepslate_emerald_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.EMERALD_GREEN).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_LAPIS_ORE = registerBlock("red_deepslate_lapis_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.LAPIS_BLUE).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_DIAMOND_ORE = registerBlock("red_deepslate_diamond_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DIAMOND_BLUE).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block PREHISTORIC_DEBRIS = registerBlock("prehistoric_debris",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(30.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block RED_DEEPSLATE_SULFUR_ORE = registerBlock("red_deepslate_sulfur_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_LEAD_ORE = registerBlock("red_deepslate_lead_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_URANIUM_ORE = registerIrradiatedBlock("red_deepslate_uranium_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_HELIORITE_ORE = registerBlock("red_deepslate_heliorite_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.MAGENTA).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_PALLADIUM_ORE = registerBlock("red_deepslate_palladium_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.MAGENTA).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_JURASSOLINE_ORE = registerBlock("red_deepslate_jurassoline_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_CINNABAR_ORE = registerBlock("red_deepslate_cinnabar_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RED_DEEPSLATE_NEBULAR_ORE = registerBlock("red_deepslate_nebular_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block XEN_CRYSTAL_CLUSTER = registerBlock("xen_crystal_cluster",
            new AmethystClusterBlock(7, 3, FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(1.5F, 1.5F).sounds(BlockSoundGroup.AMETHYST_CLUSTER).nonOpaque()));
    public static final Block XEN_CRYSTAL_BLOCK = registerBlock("xen_crystal_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(1.5F, 1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block MOON_ROCK = registerBlock("moon_rock",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(3.0F, 9.0F)));
    public static final Block MOON_ROCK_COAL_ORE = registerBlock("moon_rock_coal_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(3.0F, 9.0F)));
    public static final Block MOON_ROCK_IRON_ORE = registerBlock("moon_rock_iron_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(3.0F, 9.0F)));
    public static final Block MOON_ROCK_LUNAR_CALLAINUS_ORE = registerBlock("moon_rock_lunar_callainus_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(3.0F, 9.0F)));

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DEEPSLATE_GRAY).requiresTool().strength(6.0F, 12.0F).sounds(BlockSoundGroup.METAL)));

    public static final Block NETHER_SULFUR_ORE = registerBlock("nether_sulfur_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block SULFUR_BLOCK = registerBlock("sulfur_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(3.0F, 3.0F)));

    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(3.0F, 3.0F)));
    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(3.0F, 3.0F)));
    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(3.0F, 3.0F)));

    public static final Block DEEPSLATE_URANIUM_ORE = registerIrradiatedBlock("deepslate_uranium_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RAW_URANIUM_BLOCK = registerIrradiatedBlock("raw_uranium_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GREEN).requiresTool().strength(3.0F, 3.0F)));
    public static final Block URANIUM_BLOCK = registerIrradiatedBlock("uranium_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GREEN).requiresTool().strength(3.0F, 3.0F)));

    public static final Block DEEPSLATE_FOSSIL = registerBlock("deepslate_fossil",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block HELIORITE_ORE = registerBlock("heliorite_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.MAGENTA).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block HELIORITE_COMB_BLOCK = registerBlock("heliorite_comb_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.MAGENTA).requiresTool().strength(16.0F, 1200.0F)));
    public static final Block HELIORITE_BLOCK = registerBlock("heliorite_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.MAGENTA).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block END_STONE_ENDURIUM_ORE = registerBlock("end_stone_endurium_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).requiresTool().strength(16.0F, 1200.0F)));
    public static final Block RAW_ENDURIUM_BLOCK = registerBlock("raw_endurium_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).requiresTool().strength(16.0F, 1200.0F)));
    public static final Block ENDURIUM_BLOCK = registerBlock("endurium_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block PALLADIUM_ORE = registerBlock("palladium_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RAW_PALLADIUM_BLOCK = registerBlock("raw_palladium_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(16.0F, 1200.0F)));
    public static final Block PALLADIUM_BLOCK = registerBlock("palladium_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block JURASSOLINE_ORE = registerBlock("jurassoline_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block JURASSOLINE_CRYSTAL_BLOCK = registerBlock("jurassoline_crystal_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block JURASSOLINE_BLOCK = registerBlock("jurassoline_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block CINNABAR_ORE = registerBlock("cinnabar_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CINNABAR_CRYSTAL_BLOCK = registerBlock("cinnabar_crystal_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CINNABAR_BLOCK = registerBlock("cinnabar_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block NEBULAR_ORE = registerBlock("nebular_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block RAW_NEBULAR_BLOCK = registerBlock("raw_nebular_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).requiresTool().strength(16.0F, 1200.0F)));
    public static final Block NEBULAR_BLOCK = registerBlock("nebular_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).requiresTool().strength(16.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block MITHRIL_ORE = registerUncommonBlock("mithril_ore",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE_GRAY).requiresTool().strength(-1.0F, 3600000.0F)));
    public static final Block RAW_MITHRIL_BLOCK = registerUncommonBlock("raw_mithril_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE_GRAY).requiresTool().strength(10.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));
    public static final Block MITHRIL_BLOCK = registerUncommonBlock("mithril_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE_GRAY).requiresTool().strength(10.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block MITHRIL_ANVIL = registerUncommonBlock("mithril_anvil",
            new MithrilAnvilBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE_GRAY).requiresTool().strength(10.0F, 1200.0F).sounds(BlockSoundGroup.ANVIL)));

    public static final Block WOODEN_STEIN = registerWoodenSteinBlock("wooden_stein",
            new WoodenSteinBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block WOODEN_WATER_STEIN = registerDrinkableWoodenSteinBlock("wooden_water_stein",
            new WoodenSteinBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block WOODEN_APPLE_JUICE_STEIN = registerDrinkableWoodenSteinBlock("wooden_apple_juice_stein",
            new WoodenSteinBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block WOODEN_ORANGE_JUICE_STEIN = registerDrinkableWoodenSteinBlock("wooden_orange_juice_stein",
            new WoodenSteinBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block WOODEN_BEER_STEIN = registerBeerSteinBlock("wooden_beer_stein",
            new WoodenSteinBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block WOODEN_MILK_STEIN = registerDrinkableWoodenSteinBlock("wooden_milk_stein",
            new WoodenSteinBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block WOODEN_CHOCOLATE_MILKSHAKE_STEIN = registerDrinkableWoodenSteinBlock("wooden_chocolate_milkshake_stein",
            new WoodenSteinBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block WOODEN_STRAWBERRY_MILKSHAKE_STEIN = registerDrinkableWoodenSteinBlock("wooden_strawberry_milkshake_stein",
            new WoodenSteinBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block WOODEN_ORANGE_MILKSHAKE_STEIN = registerDrinkableWoodenSteinBlock("wooden_orange_milkshake_stein",
            new WoodenSteinBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block HOT_WOODEN_MILK_STEIN = registerDrinkableWoodenSteinBlock("hot_wooden_milk_stein",
            new WoodenSteinBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block WOODEN_HOT_CHOCOLATE_STEIN = registerDrinkableWoodenSteinBlock("wooden_hot_chocolate_stein",
            new WoodenSteinBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));

    public static final Block GLOBUS_CRUCIGER = registerBlock("globus_cruciger",
            new GlobusCrucigerBlock(FabricBlockSettings.create().mapColor(MapColor.GOLD).strength(2.0F, 2.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block ZOMBIE_PLUSHIE = registerBlock("zombie_plushie",
            new HumanPlushieBlock(FabricBlockSettings.create().strength(0.8F, 0.8F).sounds(BlockSoundGroup.WOOL).nonOpaque()));
    public static final Block PLAYER_PLUSHIE = registerBlock("player_plushie",
            new PlayerPlushieBlock(FabricBlockSettings.create().strength(0.8F, 0.8F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block GARBAGE_CAN = registerBlock("garbage_can",
            new GarbageCanBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(5.0F, 1200.0F).nonOpaque()));

    public static final Block RADIO = registerBlock("radio",
            new RadioBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(2.0F, 2.0F).nonOpaque()));
    public static final Block RADIO_ON = registerBlockWithoutItem("radio_on",
            new RadioBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(2.0F, 2.0F).nonOpaque().luminance(7)));
    public static final Block TELEVISION = registerBlock("television",
            new TelevisionBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).requiresTool().strength(2.0F, 2.0F)));
    public static final Block TELEVISION_ON = registerBlockWithoutItem("television_on",
            new TelevisionBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).requiresTool().strength(2.0F, 2.0F).luminance(10)));
    public static final Block COMPUTER = registerBlock("computer",
            new ComputerBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(2.0F, 2.0F)));
    public static final Block COMPUTER_ON = registerBlockWithoutItem("computer_on",
            new ComputerBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(2.0F, 2.0F).luminance(10)));

    public static final Block INTERDIMENSIONAL_RECEIVER = registerBlock("interdimensional_receiver",
            new InterdimensionalReceiverBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 2.0F)));

    public static final Block OXYGEN_COLLECTOR = registerBlock("oxygen_collector",
            new OxygenCollectorBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 2.0F)));

    public static final Block MINING_ELEVATOR_CONTROLLER = registerBlock("mining_elevator_controller",
            new ElevatorControllerBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(5.0F, 1200.0F).luminance(15).nonOpaque()));
    public static final Block MINING_ELEVATOR_BASE = registerBlock("mining_elevator_base",
            new ElevatorBaseBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(5.0F, 1200.0F).nonOpaque()));
    public static final Block WOODEN_ELEVATOR_CONTROLLER = registerBlock("wooden_elevator_controller",
            new ElevatorControllerBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(5.0F, 1200.0F).luminance(15)));
    public static final Block WOODEN_ELEVATOR_BASE = registerBlock("wooden_elevator_base",
            new ElevatorBaseBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(5.0F, 1200.0F)));
    public static final Block QUARTZ_ELEVATOR_CONTROLLER = registerBlock("quartz_elevator_controller",
            new ElevatorControllerBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(5.0F, 1200.0F).luminance(15)));
    public static final Block QUARTZ_ELEVATOR_BASE = registerBlock("quartz_elevator_base",
            new ElevatorBaseBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).requiresTool().strength(5.0F, 1200.0F)));
    public static final Block GLASS_ELEVATOR_CONTROLLER = registerBlock("glass_elevator_controller",
            new ElevatorControllerBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(5.0F, 1200.0F).luminance(15).nonOpaque()));
    public static final Block GLASS_ELEVATOR_BASE = registerBlock("glass_elevator_base",
            new ElevatorBaseBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).requiresTool().strength(5.0F, 1200.0F).nonOpaque()));

    public static final Block TREX_HEAD = registerBlock("t-rex_head",
            new TRexHeadBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(1.0F, 1.0F).nonOpaque()));
    public static final Block GREEN_TREX_HEAD = registerBlock("green_t-rex_head",
            new TRexHeadBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(1.0F, 1.0F).nonOpaque()));
    public static final Block GRAY_TREX_HEAD = registerBlock("gray_t-rex_head",
            new TRexHeadBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(1.0F, 1.0F).nonOpaque()));

    public static final Block SCULK_TREX_HEAD = registerBlock("sculk_t-rex_head",
            new TRexHeadBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(1.0F, 1.0F).nonOpaque()));
    public static final Block INFECTED_TREX_HEAD = registerBlock("infected_t-rex_head",
            new TRexHeadBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(1.0F, 1.0F).nonOpaque()));
    public static final Block SICKENED_TREX_HEAD = registerBlock("sickened_t-rex_head",
            new TRexHeadBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(1.0F, 1.0F).nonOpaque()));

    public static final Block ROSE = registerBlock("rose",
            new FlowerBlock(StatusEffects.REGENERATION, 10, FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.GRASS).noCollision().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ROSE = Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, "potted_rose"),
            new FlowerPotBlock(ROSE, FabricBlockSettings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block EDELWEISS = registerBlock("edelweiss",
            new FlowerBlock(StatusEffects.REGENERATION, 10, FabricBlockSettings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.GRASS).noCollision().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_EDELWEISS = Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, "potted_edelweiss"),
            new FlowerPotBlock(EDELWEISS, FabricBlockSettings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GINKGO_SAPLING = registerBlock("ginkgo_sapling",
            new SaplingBlock(new GinkgoSaplingGenerator(), FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).noCollision().strength(0F, 0F).sounds(BlockSoundGroup.GRASS).nonOpaque().ticksRandomly()));
    public static final Block POTTED_GINKGO_SAPLING = Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, "potted_ginkgo_sapling"),
            new FlowerPotBlock(GINKGO_SAPLING, FabricBlockSettings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GINKGO_LEAVES = registerBlock("ginkgo_leaves",
            new LeavesBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(0.2F, 0.2F).sounds(BlockSoundGroup.CHERRY_LEAVES).nonOpaque()));

    public static final Block GINKGO_LOG = registerBlock("ginkgo_log",
            new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GINKGO_WOOD = registerBlock("ginkgo_wood",
            new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_GINKGO_LOG = registerBlock("stripped_ginkgo_log",
            new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_GINKGO_WOOD = registerBlock("stripped_ginkgo_wood",
            new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 2.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block GINKGO_PLANKS = registerBlock("ginkgo_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block GINKGO_STAIRS = registerBlock("ginkgo_stairs",
            new StairsBlock(ModBlocks.GINKGO_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GINKGO_SLAB = registerBlock("ginkgo_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GINKGO_BUTTON = registerBlock("ginkgo_button",
            new ButtonBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(0.5F, 0.5F).sounds(BlockSoundGroup.WOOD).collidable(false), BlockSetType.OAK, 30, true));
    public static final Block GINKGO_PRESSURE_PLATE = registerBlock("ginkgo_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(0.5F, 0.5F).collidable(false).sounds(BlockSoundGroup.WOOD), BlockSetType.OAK));
    public static final Block GINKGO_FENCE = registerBlock("ginkgo_fence",
            new FenceBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GINKGO_FENCE_GATE = registerBlock("ginkgo_fence_gate",
            new FenceGateBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK));
    public static final Block GINKGO_DOOR = registerBlock("ginkgo_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.OAK));
    public static final Block GINKGO_TRAPDOOR = registerBlock("ginkgo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.OAK));

    public static final Identifier GINKGO_SIGN_TEXTURE = new Identifier(TLOTD.MOD_ID, "entity/signs/ginkgo");
    public static final Identifier GINKGO_HANGING_SIGN_TEXTURE = new Identifier(TLOTD.MOD_ID, "entity/signs/hanging/ginkgo");
    public static final Identifier GINKGO_HANGING_GUI_SIGN_TEXTURE = new Identifier(TLOTD.MOD_ID, "textures/gui/hanging_signs/ginkgo");

    public static final Block STANDING_GINKGO_SIGN = Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, "ginkgo_standing_sign"),
            new TerraformSignBlock(GINKGO_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_GINKGO_SIGN = Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, "ginkgo_wall_sign"),
            new TerraformWallSignBlock(GINKGO_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_GINKGO_SIGN = Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, "ginkgo_hanging_sign"),
            new TerraformHangingSignBlock(GINKGO_HANGING_SIGN_TEXTURE, GINKGO_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_GINKGO_SIGN = Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, "ginkgo_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(GINKGO_HANGING_SIGN_TEXTURE, GINKGO_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final BlockFamily GINKGO_FAMILY = BlockFamilies.register(ModBlocks.GINKGO_PLANKS)
            .sign(ModBlocks.STANDING_GINKGO_SIGN, ModBlocks.HANGING_GINKGO_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block GLASS_DOOR = registerBlock("glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE).strength(0.3F, 0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque(), BlockSetType.OAK));
    public static final Block GLASS_TRAPDOOR = registerBlock("glass_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE).strength(0.3F, 0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque(), BlockSetType.OAK));

    public static final Block ARCHAEOLOGY_TABLE = registerBlock("archaeology_table",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block FANCY_OAK_PLANKS = registerBlock("fancy_oak_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_OAK_STAIRS = registerBlock("fancy_oak_stairs",
            new StairsBlock(ModBlocks.FANCY_OAK_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_OAK_SLAB = registerBlock("fancy_oak_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_OAK_TRAPDOOR = registerBlock("fancy_oak_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.OAK));

    public static final Block FANCY_SPRUCE_PLANKS = registerBlock("fancy_spruce_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.SPRUCE_BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_SPRUCE_STAIRS = registerBlock("fancy_spruce_stairs",
            new StairsBlock(ModBlocks.FANCY_SPRUCE_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.SPRUCE_BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_SPRUCE_SLAB = registerBlock("fancy_spruce_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.SPRUCE_BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_SPRUCE_TRAPDOOR = registerBlock("fancy_spruce_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.SPRUCE_BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.SPRUCE));

    public static final Block FANCY_BIRCH_PLANKS = registerBlock("fancy_birch_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_BIRCH_STAIRS = registerBlock("fancy_birch_stairs",
            new StairsBlock(ModBlocks.FANCY_BIRCH_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_BIRCH_SLAB = registerBlock("fancy_birch_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_BIRCH_TRAPDOOR = registerBlock("fancy_birch_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.BIRCH));

    public static final Block FANCY_JUNGLE_PLANKS = registerBlock("fancy_jungle_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_JUNGLE_STAIRS = registerBlock("fancy_jungle_stairs",
            new StairsBlock(ModBlocks.FANCY_JUNGLE_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_JUNGLE_SLAB = registerBlock("fancy_jungle_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_JUNGLE_TRAPDOOR = registerBlock("fancy_jungle_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.JUNGLE));

    public static final Block FANCY_ACACIA_PLANKS = registerBlock("fancy_acacia_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_ACACIA_STAIRS = registerBlock("fancy_acacia_stairs",
            new StairsBlock(ModBlocks.FANCY_ACACIA_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_ACACIA_SLAB = registerBlock("fancy_acacia_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_ACACIA_TRAPDOOR = registerBlock("fancy_acacia_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));

    public static final Block FANCY_DARK_OAK_PLANKS = registerBlock("fancy_dark_oak_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_DARK_OAK_STAIRS = registerBlock("fancy_dark_oak_stairs",
            new StairsBlock(ModBlocks.FANCY_DARK_OAK_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_DARK_OAK_SLAB = registerBlock("fancy_dark_oak_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_DARK_OAK_TRAPDOOR = registerBlock("fancy_dark_oak_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.DARK_OAK));

    public static final Block FANCY_MANGROVE_PLANKS = registerBlock("fancy_mangrove_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_RED).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_MANGROVE_STAIRS = registerBlock("fancy_mangrove_stairs",
            new StairsBlock(ModBlocks.FANCY_MANGROVE_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.DARK_RED).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_MANGROVE_SLAB = registerBlock("fancy_mangrove_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_RED).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_MANGROVE_TRAPDOOR = registerBlock("fancy_mangrove_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_RED).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.MANGROVE));

    public static final Block FANCY_CHERRY_PLANKS = registerBlock("fancy_cherry_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PINK).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_CHERRY_STAIRS = registerBlock("fancy_cherry_stairs",
            new StairsBlock(ModBlocks.FANCY_CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.PINK).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_CHERRY_SLAB = registerBlock("fancy_cherry_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.PINK).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_CHERRY_TRAPDOOR = registerBlock("fancy_cherry_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.PINK).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.CHERRY));

    public static final Block FANCY_PALE_OAK_PLANKS = registerBlock("fancy_pale_oak_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_PALE_OAK_STAIRS = registerBlock("fancy_pale_oak_stairs",
            new StairsBlock(ModBlocks.FANCY_PALE_OAK_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_PALE_OAK_SLAB = registerBlock("fancy_pale_oak_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_PALE_OAK_TRAPDOOR = registerBlock("fancy_pale_oak_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.OAK));

    public static final Block FANCY_BAMBOO_PLANKS = registerBlock("fancy_bamboo_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.LIME).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_BAMBOO_STAIRS = registerBlock("fancy_bamboo_stairs",
            new StairsBlock(ModBlocks.FANCY_BAMBOO_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.LIME).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_BAMBOO_SLAB = registerBlock("fancy_bamboo_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.LIME).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_BAMBOO_TRAPDOOR = registerBlock("fancy_bamboo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.LIME).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.BAMBOO));

    public static final Block FANCY_CRIMSON_PLANKS = registerBlock("fancy_crimson_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_CRIMSON_STAIRS = registerBlock("fancy_crimson_stairs",
            new StairsBlock(ModBlocks.FANCY_CRIMSON_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.DULL_RED).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_CRIMSON_SLAB = registerBlock("fancy_crimson_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_CRIMSON_TRAPDOOR = registerBlock("fancy_crimson_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_RED).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.CRIMSON));

    public static final Block FANCY_WARPED_PLANKS = registerBlock("fancy_warped_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.CYAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_WARPED_STAIRS = registerBlock("fancy_warped_stairs",
            new StairsBlock(ModBlocks.FANCY_WARPED_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.CYAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_WARPED_SLAB = registerBlock("fancy_warped_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.CYAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_WARPED_TRAPDOOR = registerBlock("fancy_warped_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.CYAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.WARPED));

    public static final Block FANCY_GINKGO_PLANKS = registerBlock("fancy_ginkgo_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_GINKGO_STAIRS = registerBlock("fancy_ginkgo_stairs",
            new StairsBlock(ModBlocks.FANCY_GINKGO_PLANKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_GINKGO_SLAB = registerBlock("fancy_ginkgo_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FANCY_GINKGO_TRAPDOOR = registerBlock("fancy_ginkgo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), BlockSetType.OAK));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, name), block);
    }

    private static Block registerUncommonBlock(String name, Block block) {
        registerUncommonBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, name), block);
    }

    private static Block registerWoodenSteinBlock(String name, Block block) {
        registerWoodenSteinBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, name), block);
    }

    private static Block registerDrinkableWoodenSteinBlock(String name, Block block) {
        registerDrinkableWoodenSteinBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, name), block);
    }

    private static Block registerBeerSteinBlock(String name, Block block) {
        registerBeerSteinBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, name), block);
    }

    private static Block registerIrradiatedBlock(String name, Block block) {
        registerIrradiatedBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(TLOTD.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TLOTD.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Item registerUncommonBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TLOTD.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    }

    private static Item registerWoodenSteinBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TLOTD.MOD_ID, name),
                new WoodenSteinBlockItem(block, new FabricItemSettings().maxCount(16)));
    }

    private static Item registerDrinkableWoodenSteinBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TLOTD.MOD_ID, name),
                new DrinkableWoodenSteinBlockItem(block, new FabricItemSettings().food(ModFoodComponents.WOODEN_LIQUID_STEIN).maxCount(16)));
    }

    private static Item registerBeerSteinBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TLOTD.MOD_ID, name),
                new DrinkableWoodenSteinBlockItem(block, new FabricItemSettings().food(ModFoodComponents.WOODEN_LIQUID_STEIN).maxCount(16).recipeRemainder(WOODEN_STEIN.asItem())));
    }

    private static Item registerIrradiatedBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TLOTD.MOD_ID, name),
                new IrradiatedBlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TLOTD.LOGGER.info("Registering ModBlocks for " + TLOTD.MOD_ID);
    }
}
