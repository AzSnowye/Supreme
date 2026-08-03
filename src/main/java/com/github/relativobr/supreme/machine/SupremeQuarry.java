package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.magical.SupremeCore;
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
public class SupremeQuarry {


  public static final SlimefunItemStack STONE_QUARRY = new SupremeItemStack("SUPREME_STONE_QUARRY",
      "139ac257f4e04adc6ab3e46fd3b28749e866faa9ce6a1d6d526e0e3864d9222", "&eStone Quarry", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_STONE_QUARRY = new ItemStack[]{SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1),
      SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1), SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1), new ItemStack(Material.DIAMOND_PICKAXE),
      SlimefunItems.PROGRAMMABLE_ANDROID_MINER.asQuantity(1), new ItemStack(Material.DIAMOND_PICKAXE),
      SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1), SlimefunItems.COAL_GENERATOR.asQuantity(1), SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1)};

  public static final SlimefunItemStack COAL_QUARRY = new SupremeItemStack("SUPREME_COAL_QUARRY",
      "579ee734b739c0d19546d5b4b049c01a055506cc00b0cfcbf177883d2c814c04", "&eCoal Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_COAL_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_IGNIS.asQuantity(1),
      SupremeComponents.ALLOY_PLATINUM.asQuantity(1), SupremeCetrus.CETRUS_IGNIS.asQuantity(1), new ItemStack(Material.DIAMOND_PICKAXE),
      SupremeQuarry.STONE_QUARRY.asQuantity(1), new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.COAL_GENERATOR.asQuantity(1),
      SlimefunItems.GEO_MINER.asQuantity(1), SlimefunItems.LARGE_CAPACITOR.asQuantity(1)};

  public static final SlimefunItemStack IRON_QUARRY = new SupremeItemStack("SUPREME_IRON_QUARRY",
      "f8eecae423359d3f5efd1063a9a7bcfaa43839d75d3b223c808df7961dd173d0", "&eIron Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_IRON_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_VENTUS.asQuantity(1),
      SupremeComponents.ALLOY_IRIDIUM.asQuantity(1), SupremeCetrus.CETRUS_VENTUS.asQuantity(1), SupremeComponents.STAINLESS_MACHINE.asQuantity(1),
      SupremeQuarry.COAL_QUARRY.asQuantity(1), SupremeComponents.STAINLESS_MACHINE.asQuantity(1), SlimefunItems.ELECTRO_MAGNET.asQuantity(1),
      SlimefunItems.IRON_GOLEM_ASSEMBLER.asQuantity(1), SlimefunItems.ELECTRO_MAGNET.asQuantity(1)};

  public static final SlimefunItemStack GOLD_QUARRY = new SupremeItemStack("SUPREME_GOLD_QUARRY",
      "6c07d48fd8764bc8d01a10cc6426578862090d9e856f3a8dd7f974a7521efc43", "&eGold Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_GOLD_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUX.asQuantity(1),
      SupremeComponents.ALLOY_AURUM.asQuantity(1), SupremeCetrus.CETRUS_LUX.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1),
      SupremeQuarry.IRON_QUARRY.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1), SlimefunItems.ELECTRO_MAGNET.asQuantity(1),
      SlimefunItems.ELECTRIC_SMELTERY.asQuantity(1), SlimefunItems.ELECTRO_MAGNET.asQuantity(1)};

  public static final SlimefunItemStack DIAMOND_QUARRY = new SupremeItemStack("SUPREME_DIAMOND_QUARRY",
      "666070ce03a545ee4d263bcf27f36338d249d7cb7a2376f92c1673ae134e04b6", "&eDiamond Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_DIAMOND_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_AQUA.asQuantity(1),
      SupremeComponents.ALLOY_TITANIUM.asQuantity(1), SupremeCetrus.CETRUS_AQUA.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1),
      SupremeQuarry.GOLD_QUARRY.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1), SlimefunItems.ELECTRIC_MOTOR.asQuantity(1),
      SlimefunItems.HEATED_PRESSURE_CHAMBER.asQuantity(1), SlimefunItems.ELECTRIC_MOTOR.asQuantity(1)};

  public static final SlimefunItemStack THORNIUM_QUARRY = new SupremeItemStack("SUPREME_THORNIUM_QUARRY",
      "6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0", "&eThornium Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_THORNIUM_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUMIUM.asQuantity(1),
      SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1), SupremeCetrus.CETRUS_LUMIUM.asQuantity(1), SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1),
      SupremeQuarry.DIAMOND_QUARRY.asQuantity(1), SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1), SlimefunItems.ELECTRIC_MOTOR.asQuantity(1),
      SlimefunItems.WITHER_ASSEMBLER.asQuantity(1), SlimefunItems.ELECTRIC_MOTOR.asQuantity(1)};

  public static final SlimefunItemStack SUPREME_NUGGETS_QUARRY = new SupremeItemStack("SUPREME_SUPREME_NUGGETS_QUARRY",
      "ec7007d16abcfac9c6830c74d37cfd439a26373457d91452c1a96b8e04a6d", "&eNuggets of Supreme Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_SUPREME_NUGGETS_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUMIUM.asQuantity(1),
      SupremeComponents.THORNERITE.asQuantity(1), SupremeCetrus.CETRUS_LUMIUM.asQuantity(1), SupremeCore.CORE_OF_NATURE.asQuantity(1),
      SupremeQuarry.THORNIUM_QUARRY.asQuantity(1), SupremeCore.CORE_OF_BLOCK.asQuantity(1), SupremeCore.CORE_OF_LIFE.asQuantity(1), SlimefunItems.NUCLEAR_REACTOR.asQuantity(1),
      SupremeCore.CORE_OF_DEATH.asQuantity(1)};

}
