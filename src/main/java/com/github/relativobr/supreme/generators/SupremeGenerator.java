package com.github.relativobr.supreme.generators;

import static com.github.relativobr.supreme.util.ItemUtil.getValueGeneratorsWithLimit;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeGenerator {

  public static final SlimefunItemStack BASIC_IGNIS_GENERATOR = new SupremeItemStack("SUPREME_BASIC_IGNIS_GENERATOR",
      Material.ORANGE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicIgnisBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicIgnisEnergy())));
  public static final ItemStack[] RECIPE_BASIC_IGNIS_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_AURUM.asQuantity(1),
      SupremeCoreAlloy.RESOURCE_CORE_REDSTONE.asQuantity(1), SupremeComponents.ALLOY_AURUM.asQuantity(1), SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1),
      SlimefunItems.COAL_GENERATOR_2.asQuantity(1), SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1), SupremeComponents.CARRIAGE_MACHINE.asQuantity(1),
      SlimefunItems.STAFF_FIRE.asQuantity(1), SupremeComponents.CARRIAGE_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack IGNIS_GENERATOR = new SupremeItemStack("SUPREME_IGNIS_GENERATOR",
      Material.ORANGE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorIgnisBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorIgnisEnergy())));
  public static final ItemStack[] RECIPE_IGNIS_GENERATOR = new ItemStack[]{SupremeComponents.AURUM_PLATE.asQuantity(1),
      SupremeCetrus.CETRUS_IGNIS.asQuantity(1), SupremeComponents.AURUM_PLATE.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1),
      SupremeGenerator.BASIC_IGNIS_GENERATOR.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1),
      SlimefunItems.STAFF_FIRE.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack BASIC_VENTUS_GENERATOR = new SupremeItemStack("SUPREME_BASIC_VENTUS_GENERATOR",
      Material.LIGHT_BLUE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicVentusBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicVentusEnergy())));
  public static final ItemStack[] RECIPE_BASIC_VENTUS_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_IRIDIUM.asQuantity(1),
      SupremeCoreAlloy.RESOURCE_CORE_LAPIS.asQuantity(1), SupremeComponents.ALLOY_IRIDIUM.asQuantity(1), SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1),
      SlimefunItems.BIO_REACTOR.asQuantity(1), SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1), SupremeComponents.CARRIAGE_MACHINE.asQuantity(1),
      SlimefunItems.STAFF_WIND.asQuantity(1), SupremeComponents.CARRIAGE_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack VENTUS_GENERATOR = new SupremeItemStack("SUPREME_VENTUS_GENERATOR",
      Material.LIGHT_BLUE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorVentusBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorVentusEnergy())));
  public static final ItemStack[] RECIPE_VENTUS_GENERATOR = new ItemStack[]{SupremeComponents.IRIDIUM_PLATE.asQuantity(1),
      SupremeCetrus.CETRUS_VENTUS.asQuantity(1), SupremeComponents.IRIDIUM_PLATE.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1),
      SupremeGenerator.BASIC_VENTUS_GENERATOR.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1),
      SlimefunItems.STAFF_WIND.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack BASIC_AQUA_GENERATOR = new SupremeItemStack("SUPREME_BASIC_AQUA_GENERATOR",
      Material.BLUE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicAquaBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicAquaEnergy())));
  public static final ItemStack[] RECIPE_BASIC_AQUA_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_MANGANESE.asQuantity(1),
      SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.asQuantity(1), SupremeComponents.ALLOY_MANGANESE.asQuantity(1), SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1),
      SlimefunItems.MAGNESIUM_GENERATOR.asQuantity(1), SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1), SupremeComponents.CARRIAGE_MACHINE.asQuantity(1),
      SlimefunItems.STAFF_WATER.asQuantity(1), SupremeComponents.CARRIAGE_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack AQUA_GENERATOR = new SupremeItemStack("SUPREME_AQUA_GENERATOR",
      Material.BLUE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorAquaBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorAquaEnergy())), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_AQUA_GENERATOR = new ItemStack[]{SupremeComponents.MANGANESE_PLATE.asQuantity(1),
      SupremeCetrus.CETRUS_AQUA.asQuantity(1), SupremeComponents.MANGANESE_PLATE.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1),
      SupremeGenerator.BASIC_AQUA_GENERATOR.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1),
      SlimefunItems.STAFF_WATER.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack BASIC_LUX_GENERATOR = new SupremeItemStack("SUPREME_BASIC_LUX_GENERATOR",
      Material.WHITE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLuxBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLuxEnergy())));
  public static final ItemStack[] RECIPE_BASIC_LUX_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_TITANIUM.asQuantity(1),
      SupremeCoreAlloy.RESOURCE_CORE_QUARTZ.asQuantity(1), SupremeComponents.TITANIUM_PLATE.asQuantity(1), SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1),
      SlimefunItems.SOLAR_GENERATOR_4.asQuantity(1), SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1), SupremeComponents.CARRIAGE_MACHINE.asQuantity(1),
      SlimefunItems.STAFF_STORM.asQuantity(1), SupremeComponents.CARRIAGE_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack LUX_GENERATOR = new SupremeItemStack("SUPREME_LUX_GENERATOR",
      Material.WHITE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLuxBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLuxEnergy())));
  public static final ItemStack[] RECIPE_LUX_GENERATOR = new ItemStack[]{SupremeComponents.TITANIUM_PLATE.asQuantity(1),
      SupremeCetrus.CETRUS_LUX.asQuantity(1), SupremeComponents.TITANIUM_PLATE.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1),
      SupremeGenerator.BASIC_LUX_GENERATOR.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1),
      SlimefunItems.STAFF_STORM.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack BASIC_LUMIUM_GENERATOR = new SupremeItemStack("SUPREME_BASIC_LUMIUM_GENERATOR",
      Material.BROWN_CONCRETE, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLumiumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLumiumEnergy())));
  public static final ItemStack[] RECIPE_BASIC_LUMIUM_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1),
      SupremeCoreAlloy.RESOURCE_CORE_NETHERITE.asQuantity(1), SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1), SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1),
      SlimefunItems.LAVA_GENERATOR_2.asQuantity(1), SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1), SupremeComponents.PETRIFIER_MACHINE.asQuantity(1),
      SlimefunItems.GEO_MINER.asQuantity(1), SupremeComponents.PETRIFIER_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack LUMIUM_GENERATOR = new SupremeItemStack("SUPREME_LUMIUM_GENERATOR",
      Material.BROWN_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLumiumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLumiumEnergy())));
  public static final ItemStack[] RECIPE_LUMIUM_GENERATOR = new ItemStack[]{SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1),
      SupremeCetrus.CETRUS_LUMIUM.asQuantity(1), SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1),
      SupremeGenerator.BASIC_LUMIUM_GENERATOR.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1),
      SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1), SlimefunItems.GEO_MINER.asQuantity(1), SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack THORNIUM_GENERATOR = new SupremeItemStack("SUPREME_THORNIUM_GENERATOR",
      Material.BLACK_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorThorniumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorThorniumEnergy())));
  public static final ItemStack[] RECIPE_THORNIUM_GENERATOR = new ItemStack[]{SupremeComponents.THORNIUM_ENERGIZED.asQuantity(1),
      SupremeGenerator.IGNIS_GENERATOR.asQuantity(1), SupremeComponents.THORNIUM_ENERGIZED.asQuantity(1), SupremeComponents.THORNIUM_ENERGIZED.asQuantity(1),
      SupremeGenerator.AQUA_GENERATOR.asQuantity(1), SupremeComponents.THORNIUM_ENERGIZED.asQuantity(1), SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1),
      SupremeGenerator.VENTUS_GENERATOR.asQuantity(1), SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack SUPREME_GENERATOR = new SupremeItemStack("SUPREME_SUPREME_GENERATOR",
      Material.PURPLE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorSupremeBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorSupremeEnergy())));
  public static final ItemStack[] RECIPE_SUPREME_GENERATOR = new ItemStack[]{SupremeComponents.SUPREME.asQuantity(1),
      SupremeGenerator.LUX_GENERATOR.asQuantity(1), SupremeComponents.SUPREME.asQuantity(1), SupremeComponents.SUPREME.asQuantity(1),
      SupremeGenerator.LUMIUM_GENERATOR.asQuantity(1), SupremeComponents.SUPREME.asQuantity(1), SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1),
      SupremeGenerator.THORNIUM_GENERATOR.asQuantity(1), SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1)};

}
