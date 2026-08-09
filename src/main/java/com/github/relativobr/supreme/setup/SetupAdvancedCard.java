package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.tech.TechGenerator;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.mobtech.AdvancedCard;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SetupAdvancedCard {

  public static void setup(Supreme plugin) {

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SOLDER_INGOT, SlimefunItems.SOLDER_INGOT.asQuantity(1),
        SlimefunItems.SOLDER_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BILLON_INGOT, SlimefunItems.BILLON_INGOT.asQuantity(1),
        SlimefunItems.BILLON_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BRONZE_INGOT, SlimefunItems.BRONZE_INGOT.asQuantity(1),
        SlimefunItems.BRONZE_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BRASS_INGOT, SlimefunItems.BRASS_INGOT.asQuantity(1), SlimefunItems.BRASS_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SULFATE, SlimefunItems.SULFATE.asQuantity(1), SlimefunItems.SULFATE.asQuantity(1));

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_CARBON, SlimefunItems.CARBON.asQuantity(1), SlimefunItems.CARBON.asQuantity(1));

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SILICON, SlimefunItems.SILICON.asQuantity(1), SlimefunItems.SILICON.asQuantity(1));

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_STEEL, SlimefunItems.STEEL_INGOT.asQuantity(1), SlimefunItems.STEEL_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_NICKEL, SlimefunItems.NICKEL_INGOT.asQuantity(1), SlimefunItems.NICKEL_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT.asQuantity(1),
        SlimefunItems.DURALUMIN_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_FERROSILICON, SlimefunItems.FERROSILICON.asQuantity(1),
        SlimefunItems.FERROSILICON.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_DAMASCUS, SlimefunItems.DAMASCUS_STEEL_INGOT.asQuantity(1),
        SlimefunItems.DAMASCUS_STEEL_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_COBALT, SlimefunItems.COBALT_INGOT.asQuantity(1), SlimefunItems.COBALT_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_ALUMINUM_BRONZE_INGOT, SlimefunItems.ALUMINUM_BRONZE_INGOT.asQuantity(1),
        SlimefunItems.ALUMINUM_BRONZE_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_ALUMINUM_BRASS_INGOT, SlimefunItems.ALUMINUM_BRASS_INGOT.asQuantity(1),
        SlimefunItems.ALUMINUM_BRASS_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_CORINTHIAN_BRONZE_INGOT, SlimefunItems.CORINTHIAN_BRONZE_INGOT.asQuantity(1),
        SlimefunItems.CORINTHIAN_BRONZE_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_GOLD24K, SlimefunItems.GOLD_24K.asQuantity(1), SlimefunItems.GOLD_24K.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_CARBON_PRESS, SlimefunItems.COMPRESSED_CARBON.asQuantity(1),
        SlimefunItems.COMPRESSED_CARBON.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1),
        SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_EMERALD.asQuantity(1),
        SlimefunItems.SYNTHETIC_EMERALD.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_BATTERY, SlimefunItems.BATTERY.asQuantity(1), SlimefunItems.BATTERY.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_MAGNET, SlimefunItems.MAGNET.asQuantity(1), SlimefunItems.MAGNET.asQuantity(1));

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET.asQuantity(1),
        SlimefunItems.PLASTIC_SHEET.asQuantity(1));

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_HARDENED_METAL_INGOT, SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1),
        SupremeComponents.TITANIUM_PLATE.asQuantity(1), SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1));

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_REDSTONE_ALLOY, SlimefunItems.REDSTONE_ALLOY.asQuantity(1),
        SupremeComponents.TITANIUM_PLATE.asQuantity(1), SlimefunItems.REDSTONE_ALLOY.asQuantity(1));

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_ELECTRO_MAGNET, SlimefunItems.ELECTRO_MAGNET.asQuantity(1),
        SupremeComponents.IRIDIUM_PLATE.asQuantity(1), SlimefunItems.ELECTRO_MAGNET.asQuantity(1));

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_MOTOR.asQuantity(1),
        SupremeComponents.AURUM_PLATE.asQuantity(1), SlimefunItems.ELECTRIC_MOTOR.asQuantity(1));

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_HEATING_COIL, SlimefunItems.HEATING_COIL.asQuantity(1),
        SupremeComponents.AURUM_PLATE.asQuantity(1), SlimefunItems.HEATING_COIL.asQuantity(1));

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_DIAMOND.asQuantity(1),
        SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1), SlimefunItems.SYNTHETIC_DIAMOND.asQuantity(1));

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_CARBONADO, SlimefunItems.CARBONADO.asQuantity(1),
        SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1), SlimefunItems.CARBONADO.asQuantity(1));

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT.asQuantity(1),
        SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1), SlimefunItems.REINFORCED_ALLOY_INGOT.asQuantity(1));

  }
}
