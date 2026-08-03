package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.RegisterItem.registerMagicalFabricator;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.magical.SupremeCore;

public class SetupSupremeCore {

  public static void setup(Supreme sup) {

    registerMagicalFabricator(SupremeCore.CORE_OF_BLOCK.asQuantity(1), SupremeCore.RECIPE_CORE_OF_BLOCK);

    registerMagicalFabricator(SupremeCore.CORE_OF_DEATH.asQuantity(1), SupremeCore.RECIPE_CORE_OF_DEATH);

    registerMagicalFabricator(SupremeCore.CORE_OF_LIFE.asQuantity(1), SupremeCore.RECIPE_CORE_OF_LIFE);

    registerMagicalFabricator(SupremeCore.CORE_OF_COLOR.asQuantity(1), SupremeCore.RECIPE_CORE_OF_COLOR);

    registerMagicalFabricator(SupremeCore.CORE_OF_NATURE.asQuantity(1), SupremeCore.RECIPE_CORE_OF_NATURE);

    registerMagicalFabricator(SupremeCore.CORE_OF_ALLOY.asQuantity(1), SupremeCore.RECIPE_CORE_OF_ALLOY);
  }
}
