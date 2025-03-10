package net.tlotd.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.tlotd.TLOTD;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> MARBLE_PLACED_KEY = registerKey("marble_fossil_placed");
    public static final RegistryKey<PlacedFeature> LIMESTONE_PLACED_KEY = registerKey("limestone_placed");
    public static final RegistryKey<PlacedFeature> RED_DEEPSLATE_PLACED_KEY = registerKey("red_deepslate_placed");

    public static final RegistryKey<PlacedFeature> NETHER_SULFUR_ORE_PLACED_KEY = registerKey("nether_sulfur_ore_placed");

    public static final RegistryKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_URANIUM_ORE_PLACED_KEY = registerKey("deepslate_uranium_ore_placed");

    public static final RegistryKey<PlacedFeature> DEEPSLATE_FOSSIL_PLACED_KEY = registerKey("deepslate_fossil_placed");
    public static final RegistryKey<PlacedFeature> HELIORITE_ORE_PLACED_KEY = registerKey("heliorite_ore_placed");
    public static final RegistryKey<PlacedFeature> PALLADIUM_ORE_PLACED_KEY = registerKey("palladium_ore_placed");
    public static final RegistryKey<PlacedFeature> JURASSOLINE_ORE_PLACED_KEY = registerKey("jurassoline_ore_placed");
    public static final RegistryKey<PlacedFeature> CINNABAR_ORE_PLACED_KEY = registerKey("cinnabar_ore_placed");
    public static final RegistryKey<PlacedFeature> NEBULAR_ORE_PLACED_KEY = registerKey("nebular_ore_placed");

    public static final RegistryKey<PlacedFeature> MITHRIL_ORE_PLACED_KEY = registerKey("mithril_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(context, NETHER_SULFUR_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_SULFUR_ORE_KEY), ModOrePlacement.modifiersWithCount(8, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));

        register(context, MARBLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MARBLE_KEY), ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(320))));
        register(context, LIMESTONE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LIMESTONE_KEY), ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(320))));
        register(context, RED_DEEPSLATE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_DEEPSLATE_KEY), ModOrePlacement.modifiersWithCount(8, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(0))));

        register(context, LEAD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LEAD_ORE_KEY), ModOrePlacement.modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, DEEPSLATE_URANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_URANIUM_ORE_KEY), ModOrePlacement.modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(0))));

        register(context, DEEPSLATE_FOSSIL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_FOSSIL_KEY), ModOrePlacement.modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(0))));
        register(context, HELIORITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HELIORITE_ORE_KEY), ModOrePlacement.modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(0))));
        register(context, JURASSOLINE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JURASSOLINE_ORE_KEY), ModOrePlacement.modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(0))));
        register(context, PALLADIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PALLADIUM_ORE_KEY), ModOrePlacement.modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(0))));
        register(context, CINNABAR_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CINNABAR_ORE_KEY), ModOrePlacement.modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(0))));
        register(context, NEBULAR_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NEBULAR_ORE_KEY), ModOrePlacement.modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(0))));
        register(context, MITHRIL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MITHRIL_ORE_KEY), ModOrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(128))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TLOTD.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}