package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.RegisterItem.registerEnhancedCraft;
import static com.github.relativobr.supreme.util.RegisterItem.registerMagicalFabricator;
import static com.github.relativobr.supreme.util.RegisterItem.registerNullRecipe;
import static com.github.relativobr.supreme.util.RegisterItem.registerSmeltery;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.SupremeComponents;

public class SetupSupremeComponents {

  public static void setup(Supreme sup) {

    registerSmeltery(SupremeComponents.ALLOY_ZIRCONIUM.asQuantity(1), SupremeComponents.RECIPE_ALLOY_ZIRCONIUM);

    registerSmeltery(SupremeComponents.ALLOY_TITANIUM.asQuantity(1), SupremeComponents.RECIPE_ALLOY_TITANIUM);

    registerSmeltery(SupremeComponents.ALLOY_IRIDIUM.asQuantity(1), SupremeComponents.RECIPE_ALLOY_IRIDIUM);

    registerSmeltery(SupremeComponents.ALLOY_AURUM.asQuantity(1), SupremeComponents.RECIPE_ALLOY_AURUM);

    registerSmeltery(SupremeComponents.ALLOY_MANGANESE.asQuantity(1), SupremeComponents.RECIPE_ALLOY_MANGANESE);

    registerSmeltery(SupremeComponents.ALLOY_PLATINUM.asQuantity(1), SupremeComponents.RECIPE_ALLOY_PLATINUM);

    registerSmeltery(SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1), SupremeComponents.RECIPE_ALLOY_ADAMANTIUM);

    registerEnhancedCraft(SupremeComponents.ZIRCONIUM_PLATE.asQuantity(1), SupremeComponents.RECIPE_ZIRCONIUM_PLATE);

    registerEnhancedCraft(SupremeComponents.TITANIUM_PLATE.asQuantity(1), SupremeComponents.RECIPE_TITANIUM_PLATE);

    registerEnhancedCraft(SupremeComponents.IRIDIUM_PLATE.asQuantity(1), SupremeComponents.RECIPE_IRIDIUM_PLATE);

    registerEnhancedCraft(SupremeComponents.AURUM_PLATE.asQuantity(1), SupremeComponents.RECIPE_AURUM_PLATE);

    registerEnhancedCraft(SupremeComponents.MANGANESE_PLATE.asQuantity(1), SupremeComponents.RECIPE_MANGANESE_PLATE);

    registerEnhancedCraft(SupremeComponents.PLATINUM_PLATE.asQuantity(1), SupremeComponents.RECIPE_PLATINUM_PLATE);

    registerEnhancedCraft(SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1), SupremeComponents.RECIPE_ADAMANTIUM_PLATE);

    registerEnhancedCraft(SupremeComponents.SYNTHETIC_AMETHYST.asQuantity(1), SupremeComponents.RECIPE_SYNTHETIC_AMETHYST);

    registerEnhancedCraft(SupremeComponents.SYNTHETIC_RUBY.asQuantity(1), SupremeComponents.RECIPE_SYNTHETIC_RUBY);

    registerNullRecipe(SupremeComponents.THORNIUM_BIT.asQuantity(1), SupremeComponents.RECIPE_THORNIUM_BIT);

    registerEnhancedCraft(SupremeComponents.THORNIUM_DUST.asQuantity(1), SupremeComponents.RECIPE_THORNIUM_DUST);

    registerEnhancedCraft(SupremeComponents.THORNIUM_INGOT.asQuantity(1), SupremeComponents.RECIPE_THORNIUM_INGOT);

    registerEnhancedCraft(SupremeComponents.THORNIUM_BIT_SYNTHETIC.asQuantity(1), SupremeComponents.RECIPE_THORNIUM_BIT_SYNTHETIC);

    registerEnhancedCraft(SupremeComponents.THORNIUM_DUST_SYNTHETIC.asQuantity(1), SupremeComponents.RECIPE_THORNIUM_DUST_SYNTHETIC);

    registerEnhancedCraft(SupremeComponents.THORNIUM_INGOT_SYNTHETIC.asQuantity(1),
        SupremeComponents.RECIPE_THORNIUM_INGOT_SYNTHETIC);

    registerEnhancedCraft(SupremeComponents.THORNIUM_CARBONADO.asQuantity(1), SupremeComponents.RECIPE_THORNIUM_CARBONADO);

    registerEnhancedCraft(SupremeComponents.THORNIUM_ENERGIZED.asQuantity(1), SupremeComponents.RECIPE_THORNIUM_ENERGIZED);

    registerSmeltery(SupremeComponents.THORNERITE.asQuantity(1), SupremeComponents.RECIPE_THORNERITE);

    registerNullRecipe(SupremeComponents.SUPREME_NUGGET.asQuantity(1), SupremeComponents.RECIPE_SUPREME_NUGGET);

    registerMagicalFabricator(SupremeComponents.SUPREME.asQuantity(1), SupremeComponents.RECIPE_SUPREME);

    registerEnhancedCraft(SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1), SupremeComponents.RECIPE_INDUCTIVE_MACHINE);

    registerEnhancedCraft(SupremeComponents.INDUCTOR_MACHINE.asQuantity(1), SupremeComponents.RECIPE_INDUCTOR_MACHINE);

    registerEnhancedCraft(SupremeComponents.RUSTLESS_MACHINE.asQuantity(1), SupremeComponents.RECIPE_RUSTLESS_MACHINE);

    registerEnhancedCraft(SupremeComponents.STAINLESS_MACHINE.asQuantity(1), SupremeComponents.RECIPE_STAINLESS_MACHINE);

    registerEnhancedCraft(SupremeComponents.CARRIAGE_MACHINE.asQuantity(1), SupremeComponents.RECIPE_CARRIAGE_MACHINE);

    registerEnhancedCraft(SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1), SupremeComponents.RECIPE_CONVEYANCE_MACHINE);

    registerEnhancedCraft(SupremeComponents.PETRIFIER_MACHINE.asQuantity(1), SupremeComponents.RECIPE_PETRIFIER_MACHINE);

    registerEnhancedCraft(SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1), SupremeComponents.RECIPE_CRYSTALLIZER_MACHINE);

    registerMagicalFabricator(SupremeComponents.BLEND_MACHINE.asQuantity(1), SupremeComponents.RECIPE_BLEND_MACHINE);

    SetupSupremeCore.setup(sup);

    SetupMagicalComponents.setup(sup);

    SetupTechComponents.setup(sup);
  }

}
