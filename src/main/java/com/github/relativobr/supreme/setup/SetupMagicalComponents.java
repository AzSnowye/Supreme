package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.RegisterItem.registerMagicalFabricator;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;

public class SetupMagicalComponents {

  public static void setup(Supreme sup) {

    registerMagicalFabricator(SupremeCetrus.CETRUS_LUMIUM.asQuantity(1), SupremeCetrus.RECIPE_CETRUS_LUMIUM);

    registerMagicalFabricator(SupremeCetrus.CETRUS_LUX.asQuantity(1), SupremeCetrus.RECIPE_CETRUS_LUX);

    registerMagicalFabricator(SupremeCetrus.CETRUS_VENTUS.asQuantity(1), SupremeCetrus.RECIPE_CETRUS_VENTUS);

    registerMagicalFabricator(SupremeCetrus.CETRUS_AQUA.asQuantity(1), SupremeCetrus.RECIPE_CETRUS_AQUA);

    registerMagicalFabricator(SupremeCetrus.CETRUS_IGNIS.asQuantity(1), SupremeCetrus.RECIPE_CETRUS_IGNIS);

    registerMagicalFabricator(SupremeAttribute.getMagic().asQuantity(1), SupremeAttribute.RECIPE_ATTRIBUTE_MAGIC);

    registerMagicalFabricator(SupremeAttribute.getBomb().asQuantity(1), SupremeAttribute.RECIPE_ATTRIBUTE_BOMB);

    registerMagicalFabricator(SupremeAttribute.getFortune().asQuantity(1), SupremeAttribute.RECIPE_ATTRIBUTE_FORTUNE);

    registerMagicalFabricator(SupremeAttribute.getImpetus().asQuantity(1), SupremeAttribute.RECIPE_ATTRIBUTE_IMPETUS);

  }
}
