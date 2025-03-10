package net.tlotd.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.tlotd.block.ModBlocks;
import net.tlotd.item.ModItems;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool marblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE);
        marblePool.stairs(ModBlocks.MARBLE_STAIRS);
        marblePool.slab(ModBlocks.MARBLE_SLAB);
        marblePool.wall(ModBlocks.MARBLE_WALL);
        marblePool.button(ModBlocks.MARBLE_BUTTON);
        marblePool.pressurePlate(ModBlocks.MARBLE_PRESSURE_PLATE);

        BlockStateModelGenerator.BlockTexturePool limestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIMESTONE);
        limestonePool.stairs(ModBlocks.LIMESTONE_STAIRS);
        limestonePool.slab(ModBlocks.LIMESTONE_SLAB);
        limestonePool.wall(ModBlocks.LIMESTONE_WALL);
        limestonePool.button(ModBlocks.LIMESTONE_BUTTON);
        limestonePool.pressurePlate(ModBlocks.LIMESTONE_PRESSURE_PLATE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RICH_DIRT);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_GRAVEL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDY_DEEPSLATE);

        BlockStateModelGenerator.BlockTexturePool redDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_DEEPSLATE);
        redDeepslatePool.stairs(ModBlocks.RED_DEEPSLATE_STAIRS);
        redDeepslatePool.slab(ModBlocks.RED_DEEPSLATE_SLAB);
        redDeepslatePool.wall(ModBlocks.RED_DEEPSLATE_WALL);
        redDeepslatePool.button(ModBlocks.RED_DEEPSLATE_BUTTON);
        redDeepslatePool.pressurePlate(ModBlocks.RED_DEEPSLATE_PRESSURE_PLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_RED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool redDeepslateBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_DEEPSLATE_BRICKS);
        redDeepslateBrickPool.stairs(ModBlocks.RED_DEEPSLATE_BRICK_STAIRS);
        redDeepslateBrickPool.slab(ModBlocks.RED_DEEPSLATE_BRICK_SLAB);
        redDeepslateBrickPool.wall(ModBlocks.RED_DEEPSLATE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_RED_DEEPSLATE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_RED_DEEPSLATE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool cobbledRedDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_RED_DEEPSLATE);
        cobbledRedDeepslatePool.stairs(ModBlocks.COBBLED_RED_DEEPSLATE_STAIRS);
        cobbledRedDeepslatePool.slab(ModBlocks.COBBLED_RED_DEEPSLATE_SLAB);
        cobbledRedDeepslatePool.wall(ModBlocks.COBBLED_RED_DEEPSLATE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_COBBLED_RED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool cobbledRedDeepslateBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_RED_DEEPSLATE_BRICKS);
        cobbledRedDeepslateBrickPool.stairs(ModBlocks.COBBLED_RED_DEEPSLATE_BRICK_STAIRS);
        cobbledRedDeepslateBrickPool.slab(ModBlocks.COBBLED_RED_DEEPSLATE_BRICK_SLAB);
        cobbledRedDeepslateBrickPool.wall(ModBlocks.COBBLED_RED_DEEPSLATE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_COBBLED_RED_DEEPSLATE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_COBBLED_RED_DEEPSLATE_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_DIAMOND_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_SULFUR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_HELIORITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_PALLADIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_JURASSOLINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_CINNABAR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DEEPSLATE_NEBULAR_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.XEN_CRYSTAL_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOON_ROCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOON_ROCK_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOON_ROCK_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOON_ROCK_LUNAR_CALLAINUS_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_SULFUR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SULFUR_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_LEAD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_URANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_FOSSIL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HELIORITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HELIORITE_COMB_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HELIORITE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_ENDURIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ENDURIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDURIUM_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALLADIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PALLADIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALLADIUM_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JURASSOLINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JURASSOLINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JURASSOLINE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CINNABAR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CINNABAR_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CINNABAR_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NEBULAR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_NEBULAR_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NEBULAR_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_MITHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHRIL_BLOCK);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ROSE, ModBlocks.POTTED_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.EDELWEISS, ModBlocks.POTTED_EDELWEISS, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GINKGO_SAPLING, ModBlocks.POTTED_GINKGO_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.GINKGO_LOG).log(ModBlocks.GINKGO_LOG).wood(ModBlocks.GINKGO_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_GINKGO_LOG).log(ModBlocks.STRIPPED_GINKGO_LOG).wood(ModBlocks.STRIPPED_GINKGO_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GINKGO_LEAVES);

        BlockStateModelGenerator.BlockTexturePool ginkgoPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GINKGO_PLANKS);

        ginkgoPool.stairs(ModBlocks.GINKGO_STAIRS);
        ginkgoPool.slab(ModBlocks.GINKGO_SLAB);
        ginkgoPool.button(ModBlocks.GINKGO_BUTTON);
        ginkgoPool.pressurePlate(ModBlocks.GINKGO_PRESSURE_PLATE);
        ginkgoPool.fence(ModBlocks.GINKGO_FENCE);
        ginkgoPool.fenceGate(ModBlocks.GINKGO_FENCE_GATE);
        ginkgoPool.family(ModBlocks.GINKGO_FAMILY);

        blockStateModelGenerator.registerDoor(ModBlocks.GINKGO_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GINKGO_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.GLASS_DOOR);

        BlockStateModelGenerator.BlockTexturePool fancyOakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_OAK_PLANKS);
        fancyOakPool.stairs(ModBlocks.FANCY_OAK_STAIRS);
        fancyOakPool.slab(ModBlocks.FANCY_OAK_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancySprucePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_SPRUCE_PLANKS);
        fancySprucePool.stairs(ModBlocks.FANCY_SPRUCE_STAIRS);
        fancySprucePool.slab(ModBlocks.FANCY_SPRUCE_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancyBirchPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_BIRCH_PLANKS);
        fancyBirchPool.stairs(ModBlocks.FANCY_BIRCH_STAIRS);
        fancyBirchPool.slab(ModBlocks.FANCY_BIRCH_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancyJunglePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_JUNGLE_PLANKS);
        fancyJunglePool.stairs(ModBlocks.FANCY_JUNGLE_STAIRS);
        fancyJunglePool.slab(ModBlocks.FANCY_JUNGLE_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancyAcaciaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_ACACIA_PLANKS);
        fancyAcaciaPool.stairs(ModBlocks.FANCY_ACACIA_STAIRS);
        fancyAcaciaPool.slab(ModBlocks.FANCY_ACACIA_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancyDarkOakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_DARK_OAK_PLANKS);
        fancyDarkOakPool.stairs(ModBlocks.FANCY_DARK_OAK_STAIRS);
        fancyDarkOakPool.slab(ModBlocks.FANCY_DARK_OAK_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancyMangrovePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_MANGROVE_PLANKS);
        fancyMangrovePool.stairs(ModBlocks.FANCY_MANGROVE_STAIRS);
        fancyMangrovePool.slab(ModBlocks.FANCY_MANGROVE_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancyCherryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_CHERRY_PLANKS);
        fancyCherryPool.stairs(ModBlocks.FANCY_CHERRY_STAIRS);
        fancyCherryPool.slab(ModBlocks.FANCY_CHERRY_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancyPaleOakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_PALE_OAK_PLANKS);
        fancyPaleOakPool.stairs(ModBlocks.FANCY_PALE_OAK_STAIRS);
        fancyPaleOakPool.slab(ModBlocks.FANCY_PALE_OAK_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancyBambooPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_BAMBOO_PLANKS);
        fancyBambooPool.stairs(ModBlocks.FANCY_BAMBOO_STAIRS);
        fancyBambooPool.slab(ModBlocks.FANCY_BAMBOO_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancyCrimsonPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_CRIMSON_PLANKS);
        fancyCrimsonPool.stairs(ModBlocks.FANCY_CRIMSON_STAIRS);
        fancyCrimsonPool.slab(ModBlocks.FANCY_CRIMSON_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancyWarpedPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_WARPED_PLANKS);
        fancyWarpedPool.stairs(ModBlocks.FANCY_WARPED_STAIRS);
        fancyWarpedPool.slab(ModBlocks.FANCY_WARPED_SLAB);

        BlockStateModelGenerator.BlockTexturePool fancyGinkgoPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_GINKGO_PLANKS);
        fancyGinkgoPool.stairs(ModBlocks.FANCY_GINKGO_STAIRS);
        fancyGinkgoPool.slab(ModBlocks.FANCY_GINKGO_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.IRRADIATED_ICON, Models.GENERATED);

        itemModelGenerator.register(ModItems.OAK_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRUCE_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIRCH_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUNGLE_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.ACACIA_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_OAK_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGROVE_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.GINKGO_BARK, Models.GENERATED);

        itemModelGenerator.register(ModItems.APPLE_JUICE_BOTTLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.PRESERVES_JAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOAST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_BERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRY_JAM_TOAST, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_BERRY_JAM_TOAST, Models.GENERATED);

        itemModelGenerator.register(ModItems.STRAWBERRY_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE_STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY_JAM_TOAST, Models.GENERATED);

        itemModelGenerator.register(ModItems.ORANGE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_JUICE_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_MARMELADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_MARMELADE_TOAST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPEZI_BOTTLE, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MONOCLE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VICTORIAN_SUIT));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VICTORIAN_PANTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VICTORIAN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PICKELHAUBE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IMPERIAL_GERMAN_UNIFORM_MANTLE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IMPERIAL_GERMAN_UNIFORM_PANTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IMPERIAL_GERMAN_UNIFORM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ASTRONAUT_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SPACE_SUIT_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SPACE_SUIT_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SPACE_SUIT_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CTHONAUT_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DEPTH_SUIT_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DEPTH_SUIT_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DEPTH_SUIT_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SCIENTIST_GLASSES));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HEV_SUIT_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HEV_SUIT_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HEV_SUIT_BOOTS));

        itemModelGenerator.register(ModItems.BLOOD_BOTTLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.STICK_CROSS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STICK_EFFIGY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STICK_FIGURE, Models.GENERATED);

        itemModelGenerator.register(ModItems.EDELWEISS_PETALS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MISTLETOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CURED_MEAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_MEAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.TINTED_GLASS_FLASK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL_FLASK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CURSED_SOUL_FLASK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL_FLASK_OF_THE_ABYSS, Models.GENERATED);

        itemModelGenerator.register(ModItems.GUIDEBOOK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPELL_BOOK, Models.GENERATED);
        itemModelGenerator.register(ModItems.FORBIDDEN_SPELL_BOOK, Models.GENERATED);

        itemModelGenerator.register(ModItems.PLANCHETTE, Models.GENERATED);

        itemModelGenerator.register(ModItems.COPPER_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_FORGING_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.COPPER_WIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.INTEGRATED_CIRCUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CIRCUIT_BOARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CATHODE_RAY_TUBE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADVANCED_CIRCUIT_BOARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIQUID_CRYSTAL_DISPLAY_PANEL, Models.GENERATED);

        itemModelGenerator.register(ModItems.INCOMPLETE_COPPER_WIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.INCOMPLETE_INTEGRATED_CIRCUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.INCOMPLETE_CIRCUIT_BOARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.INCOMPLETE_ADVANCED_CIRCUIT_BOARD, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.XEN_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.METEORITE_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAR_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUNAR_CALLAINUS_LUMP, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_INGREDIENTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_ROD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_TOOL_ROD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FANCY_TOOL_ROD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STEEL_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.FOSSILIZED_BONE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FOSSIL_AND_STEEL, Models.GENERATED);

        itemModelGenerator.register(ModItems.SULFUR, Models.GENERATED);

        itemModelGenerator.register(ModItems.HELIORITE_COMB, Models.GENERATED);
        itemModelGenerator.register(ModItems.HELIORITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.HELIORITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.HELIORITE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HELIORITE_PICKAXE_HEAD, Models.GENERATED);

        itemModelGenerator.register(ModItems.HELIORITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HELIORITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HELIORITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HELIORITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HELIORITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.HELIORITE_SICKLE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HELIORITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HELIORITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HELIORITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HELIORITE_BOOTS));

        itemModelGenerator.register(ModItems.ENDURIUM_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDURIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDURIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDURIUM_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDURIUM_PICKAXE_HEAD, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDURIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDURIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDURIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDURIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDURIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ENDURIUM_SICKLE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDURIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDURIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDURIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDURIUM_BOOTS));

        itemModelGenerator.register(ModItems.RAW_PALLADIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALLADIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALLADIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.PALLADIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PALLADIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PALLADIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PALLADIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PALLADIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PALLADIUM_SICKLE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PALLADIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PALLADIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PALLADIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PALLADIUM_BOOTS));

        itemModelGenerator.register(ModItems.JURASSOLINE_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.JURASSOLINE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.JURASSOLINE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.JURASSOLINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.JURASSOLINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.JURASSOLINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.JURASSOLINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.JURASSOLINE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.JURASSOLINE_SICKLE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JURASSOLINE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JURASSOLINE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JURASSOLINE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JURASSOLINE_BOOTS));

        itemModelGenerator.register(ModItems.CINNABAR_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CINNABAR_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CINNABAR_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.CINNABAR_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CINNABAR_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CINNABAR_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CINNABAR_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CINNABAR_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.CINNABAR_SICKLE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CINNABAR_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CINNABAR_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CINNABAR_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CINNABAR_BOOTS));

        itemModelGenerator.register(ModItems.NEBULAR_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEBULAR_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEBULAR_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.NEBULAR_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NEBULAR_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NEBULAR_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NEBULAR_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NEBULAR_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.NEBULAR_SICKLE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEBULAR_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEBULAR_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEBULAR_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEBULAR_BOOTS));

        itemModelGenerator.register(ModItems.RAW_MITHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.MITHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.MITHRIL_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.MITHRIL_FORGING_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_STAR_CATCHER, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_BOOTS));

        itemModelGenerator.register(ModItems.NARSIL_HANDLE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ASTRAL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASTRAL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.ASTRAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ASTRAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ASTRAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ASTRAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ASTRAL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ASTRAL_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ASTRAL_FORGING_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.HANGING_GINKGO_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.GINKGO_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GINKGO_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.TREX_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.INFECTED_TREX_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.DINOSAUR_HIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DINOSAUR_MEAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_DINOSAUR_MEAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.FLOUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SCHNITZEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCHNITZEL, Models.GENERATED);

        itemModelGenerator.register(ModItems.MAULTASCHE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAULTASCHEN_BROTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUSPICIOUS_MAULTASCHEN_BROTH, Models.GENERATED);

        itemModelGenerator.register(ModItems.BEER_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEER_GOAT_HORN, Models.GENERATED);

        itemModelGenerator.register(ModItems.DRAGON_BANNER_PATTERN, Models.GENERATED);
        itemModelGenerator.register(ModItems.LOTR_BANNER_PATTERN, Models.GENERATED);

        itemModelGenerator.register(ModItems.VHS_CASSETTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_8, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_9, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_NO_SLEEP, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_EBS, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_BROKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.VHS_CASSETTE_KV31, Models.GENERATED);

        itemModelGenerator.register(ModItems.GAME_CARTRIDGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GAME_CARTRIDGE_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.GAME_CARTRIDGE_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.GAME_CARTRIDGE_3, Models.GENERATED);
    }
}
