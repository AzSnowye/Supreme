package com.github.relativobr.supreme.resource;

import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeComponents {

  public static final SlimefunItemStack SUPREME_NUGGET = new SupremeItemStack("SUPREME_SUPREME_NUGGET",
      "cffc977cc7e10e564a09638a53bbc4c54c9c8dac7450ba3dfa3c9099d94f5", "&aNugget Supreme", "",
      "&7From the Quarry Nugget Supreme", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_SUPREME_NUGGET = {null, null, null, null, null, null, null, null, null};

  public static final SlimefunItemStack SUPREME = new SupremeItemStack("SUPREME_SUPREME",
      "c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d", "&aSupreme", "", "&7The Supreme", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_SUPREME = {SupremeComponents.SUPREME_NUGGET.asQuantity(1), SupremeComponents.SUPREME_NUGGET.asQuantity(1),
      SupremeComponents.SUPREME_NUGGET.asQuantity(1), SupremeComponents.SUPREME_NUGGET.asQuantity(1), SupremeComponents.SUPREME_NUGGET.asQuantity(1),
      SupremeComponents.SUPREME_NUGGET.asQuantity(1), SupremeComponents.SUPREME_NUGGET.asQuantity(1), SupremeComponents.SUPREME_NUGGET.asQuantity(1),
      SupremeComponents.SUPREME_NUGGET.asQuantity(1)};

  public static final SlimefunItemStack THORNIUM_BIT = new SupremeItemStack("SUPREME_THORNIUM_BIT",
      Material.IRON_NUGGET, "&aThornium Bit", "", "&7From the Quarry Thornium", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_BIT = {null, null, null, null, null, null, null, null, null};

  public static final SlimefunItemStack THORNIUM_DUST = new SupremeItemStack("SUPREME_THORNIUM_DUST",
      Material.GUNPOWDER, "&aThornium Dust", "", "&7From the Thornium Bit", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_DUST = {SupremeComponents.THORNIUM_BIT.asQuantity(1),
      SupremeComponents.THORNIUM_BIT.asQuantity(1), SupremeComponents.THORNIUM_BIT.asQuantity(1), SupremeComponents.THORNIUM_BIT.asQuantity(1),
      SupremeComponents.THORNIUM_BIT.asQuantity(1), SupremeComponents.THORNIUM_BIT.asQuantity(1), SupremeComponents.THORNIUM_BIT.asQuantity(1),
      SupremeComponents.THORNIUM_BIT.asQuantity(1), SupremeComponents.THORNIUM_BIT.asQuantity(1)};

  public static final SlimefunItemStack THORNIUM_INGOT = new SupremeItemStack("SUPREME_THORNIUM_INGOT",
      Material.IRON_INGOT, "&aThornium Ingot", "", "&7From the Thornium Dust", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_INGOT = {SupremeComponents.THORNIUM_DUST.asQuantity(1),
      SupremeComponents.THORNIUM_DUST.asQuantity(1), SupremeComponents.THORNIUM_DUST.asQuantity(1), SupremeComponents.THORNIUM_DUST.asQuantity(1),
      SupremeComponents.THORNIUM_DUST.asQuantity(1), SupremeComponents.THORNIUM_DUST.asQuantity(1), SupremeComponents.THORNIUM_DUST.asQuantity(1),
      SupremeComponents.THORNIUM_DUST.asQuantity(1), SupremeComponents.THORNIUM_DUST.asQuantity(1)};

  public static final SlimefunItemStack THORNIUM_BIT_SYNTHETIC = new SupremeItemStack("SUPREME_THORNIUM_BIT_SYNTHETIC",
      Material.GOLD_NUGGET, "&aThornium Bit Synthetic", "", "&7From the Thornium Bit", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_BIT_SYNTHETIC = {SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1),
      SlimefunItems.DAMASCUS_STEEL_INGOT.asQuantity(1), SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1), SlimefunItems.DAMASCUS_STEEL_INGOT.asQuantity(1),
      SupremeComponents.THORNIUM_BIT.asQuantity(1), SlimefunItems.DAMASCUS_STEEL_INGOT.asQuantity(1), SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1),
      SlimefunItems.DAMASCUS_STEEL_INGOT.asQuantity(1), SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1)};

  public static final SlimefunItemStack THORNIUM_DUST_SYNTHETIC = new SupremeItemStack(
      "SUPREME_THORNIUM_DUST_SYNTHETIC", Material.GLOWSTONE_DUST, "&aThornium Dust Synthetic", "",
      "&7From the Thornium Dust", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_DUST_SYNTHETIC = {SlimefunItems.SYNTHETIC_EMERALD.asQuantity(1),
      SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1), SlimefunItems.SYNTHETIC_EMERALD.asQuantity(1), SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1),
      SupremeComponents.THORNIUM_DUST.asQuantity(1), SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1), SlimefunItems.SYNTHETIC_EMERALD.asQuantity(1),
      SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1), SlimefunItems.SYNTHETIC_EMERALD.asQuantity(1)};

  public static final SlimefunItemStack THORNIUM_INGOT_SYNTHETIC = new SupremeItemStack(
      "SUPREME_THORNIUM_INGOT_SYNTHETIC", Material.GOLD_INGOT, "&aThornium Ingot Synthetic", "",
      "&7From the Thornium Ingot", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_INGOT_SYNTHETIC = {SlimefunItems.SYNTHETIC_DIAMOND.asQuantity(1),
      SlimefunItems.STEEL_PLATE.asQuantity(1), SlimefunItems.SYNTHETIC_DIAMOND.asQuantity(1), SlimefunItems.STEEL_PLATE.asQuantity(1),
      SupremeComponents.THORNIUM_INGOT.asQuantity(1), SlimefunItems.STEEL_PLATE.asQuantity(1), SlimefunItems.SYNTHETIC_DIAMOND.asQuantity(1),
      SlimefunItems.STEEL_PLATE.asQuantity(1), SlimefunItems.SYNTHETIC_DIAMOND.asQuantity(1)};

  public static final SlimefunItemStack THORNIUM_CARBONADO = new SupremeItemStack("SUPREME_THORNIUM_CARBONADO",
      Material.NETHERITE_INGOT, "&aThornium Carbonado", "", "&7From the Thornium Ingot", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_CARBONADO = {SlimefunItems.CARBONADO.asQuantity(1), SlimefunItems.REINFORCED_PLATE.asQuantity(1),
      SlimefunItems.CARBONADO.asQuantity(1), SlimefunItems.REINFORCED_PLATE.asQuantity(1), SupremeComponents.THORNIUM_INGOT.asQuantity(1),
      SlimefunItems.REINFORCED_PLATE.asQuantity(1), SlimefunItems.CARBONADO.asQuantity(1), SlimefunItems.REINFORCED_PLATE.asQuantity(1), SlimefunItems.CARBONADO.asQuantity(1)};

  public static final SlimefunItemStack THORNIUM_ENERGIZED = new SupremeItemStack("SUPREME_THORNIUM_ENERGIZED",
      Material.NETHERITE_INGOT, "&aThornium Energized", "", "&7From the Thornium Ingot", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_ENERGIZED = {SlimefunItems.BLISTERING_INGOT_3.asQuantity(1),
      SlimefunItems.REDSTONE_ALLOY.asQuantity(1), SlimefunItems.BLISTERING_INGOT_3.asQuantity(1), SlimefunItems.REDSTONE_ALLOY.asQuantity(1),
      SupremeComponents.THORNIUM_CARBONADO.asQuantity(1), SlimefunItems.REDSTONE_ALLOY.asQuantity(1), SlimefunItems.BLISTERING_INGOT_3.asQuantity(1),
      SlimefunItems.REDSTONE_ALLOY.asQuantity(1), SlimefunItems.BLISTERING_INGOT_3.asQuantity(1)};

  public static final SlimefunItemStack ALLOY_ZIRCONIUM = new SupremeItemStack("SUPREME_ALLOY_ZIRCONIUM",
      Material.IRON_INGOT, "&aAlloy Zirconium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_ZIRCONIUM = {SlimefunItems.ZINC_DUST.asQuantity(1), SlimefunItems.SOLDER_INGOT.asQuantity(1),
      SlimefunItems.ZINC_INGOT.asQuantity(1), null, null, null, null, null, null};

  public static final SlimefunItemStack ZIRCONIUM_PLATE = new SupremeItemStack("SUPREME_ZIRCONIUM_PLATE",
      Material.IRON_BLOCK, "&aZirconium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ZIRCONIUM_PLATE = {SupremeComponents.ALLOY_ZIRCONIUM.asQuantity(1),
      SupremeComponents.ALLOY_ZIRCONIUM.asQuantity(1), SupremeComponents.ALLOY_ZIRCONIUM.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_DIORITE.asQuantity(1),
      SupremeCoreBlock.RESOURCE_CORE_DIORITE.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_DIORITE.asQuantity(1), SupremeComponents.ALLOY_ZIRCONIUM.asQuantity(1),
      SupremeComponents.ALLOY_ZIRCONIUM.asQuantity(1), SupremeComponents.ALLOY_ZIRCONIUM.asQuantity(1)};

  public static final SlimefunItemStack ALLOY_TITANIUM = new SupremeItemStack("SUPREME_ALLOY_TITANIUM",
      Material.IRON_INGOT, "&aAlloy Titanium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_TITANIUM = {SlimefunItems.TIN_DUST.asQuantity(1), SlimefunItems.DAMASCUS_STEEL_INGOT.asQuantity(1),
      SlimefunItems.TIN_INGOT.asQuantity(1), null, null, null, null, null, null};

  public static final SlimefunItemStack TITANIUM_PLATE = new SupremeItemStack("SUPREME_TITANIUM_PLATE",
      Material.IRON_BLOCK, "&aTitanium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_TITANIUM_PLATE = {SupremeComponents.ALLOY_TITANIUM.asQuantity(1),
      SupremeComponents.ALLOY_TITANIUM.asQuantity(1), SupremeComponents.ALLOY_TITANIUM.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_ANDESITE.asQuantity(1),
      SupremeCoreBlock.RESOURCE_CORE_ANDESITE.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_ANDESITE.asQuantity(1),
      SupremeComponents.ALLOY_TITANIUM.asQuantity(1), SupremeComponents.ALLOY_TITANIUM.asQuantity(1), SupremeComponents.ALLOY_TITANIUM.asQuantity(1)};

  public static final SlimefunItemStack ALLOY_IRIDIUM = new SupremeItemStack("SUPREME_ALLOY_IRIDIUM",
      Material.IRON_INGOT, "&aAlloy Iridium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_IRIDIUM = {SlimefunItems.SILVER_DUST.asQuantity(1), SlimefunItems.BILLON_INGOT.asQuantity(1),
      SlimefunItems.SILVER_INGOT.asQuantity(1), null, null, null, null, null, null};

  public static final SlimefunItemStack IRIDIUM_PLATE = new SupremeItemStack("SUPREME_IRIDIUM_PLATE",
      Material.IRON_BLOCK, "&aIridium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_IRIDIUM_PLATE = {SupremeComponents.ALLOY_IRIDIUM.asQuantity(1),
      SupremeComponents.ALLOY_IRIDIUM.asQuantity(1), SupremeComponents.ALLOY_IRIDIUM.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_GRAVEL.asQuantity(1),
      SupremeCoreBlock.RESOURCE_CORE_GRAVEL.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_GRAVEL.asQuantity(1), SupremeComponents.ALLOY_IRIDIUM.asQuantity(1),
      SupremeComponents.ALLOY_IRIDIUM.asQuantity(1), SupremeComponents.ALLOY_IRIDIUM.asQuantity(1)};

  public static final SlimefunItemStack ALLOY_AURUM = new SupremeItemStack("SUPREME_ALLOY_AURUM", Material.GOLD_INGOT,
      "&aAlloy Aurum", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_AURUM = {SlimefunItems.GOLD_DUST.asQuantity(1), SlimefunItems.COBALT_INGOT.asQuantity(1),
      SlimefunItems.GOLD_24K.asQuantity(1), null, null, null, null, null, null};

  public static final SlimefunItemStack AURUM_PLATE = new SupremeItemStack("SUPREME_AURUM_PLATE", Material.GOLD_BLOCK,
      "&aAurum Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_AURUM_PLATE = {SupremeComponents.ALLOY_AURUM.asQuantity(1), SupremeComponents.ALLOY_AURUM.asQuantity(1),
      SupremeComponents.ALLOY_AURUM.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_SAND.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_SAND.asQuantity(1),
      SupremeCoreBlock.RESOURCE_CORE_SAND.asQuantity(1), SupremeComponents.ALLOY_AURUM.asQuantity(1), SupremeComponents.ALLOY_AURUM.asQuantity(1),
      SupremeComponents.ALLOY_AURUM.asQuantity(1)};

  public static final SlimefunItemStack ALLOY_MANGANESE = new SupremeItemStack("SUPREME_ALLOY_MANGANESE",
      Material.GOLD_INGOT, "&aAlloy Manganese", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_MANGANESE = {SlimefunItems.MAGNESIUM_DUST.asQuantity(1), SlimefunItems.DURALUMIN_INGOT.asQuantity(1),
      SlimefunItems.MAGNESIUM_INGOT.asQuantity(1), null, null, null, null, null, null};

  public static final SlimefunItemStack MANGANESE_PLATE = new SupremeItemStack("SUPREME_MANGANESE_PLATE",
      Material.GOLD_BLOCK, "&aManganese Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_MANGANESE_PLATE = {SupremeComponents.ALLOY_MANGANESE.asQuantity(1),
      SupremeComponents.ALLOY_MANGANESE.asQuantity(1), SupremeComponents.ALLOY_MANGANESE.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_GRANITE.asQuantity(1),
      SupremeCoreBlock.RESOURCE_CORE_GRANITE.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_GRANITE.asQuantity(1), SupremeComponents.ALLOY_MANGANESE.asQuantity(1),
      SupremeComponents.ALLOY_MANGANESE.asQuantity(1), SupremeComponents.ALLOY_MANGANESE.asQuantity(1)};

  public static final SlimefunItemStack ALLOY_PLATINUM = new SupremeItemStack("SUPREME_ALLOY_PLATINUM",
      Material.GOLD_INGOT, "&aAlloy Platinum", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_PLATINUM = {SlimefunItems.LEAD_DUST.asQuantity(1), SlimefunItems.BRASS_INGOT.asQuantity(1),
      SlimefunItems.LEAD_INGOT.asQuantity(1), null, null, null, null, null, null};

  public static final SlimefunItemStack PLATINUM_PLATE = new SupremeItemStack("SUPREME_PLATINUM_PLATE",
      Material.GOLD_BLOCK, "&aPlatinum Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_PLATINUM_PLATE = {SupremeComponents.ALLOY_PLATINUM.asQuantity(1),
      SupremeComponents.ALLOY_PLATINUM.asQuantity(1), SupremeComponents.ALLOY_PLATINUM.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_CLAY.asQuantity(1),
      SupremeCoreBlock.RESOURCE_CORE_CLAY.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_CLAY.asQuantity(1), SupremeComponents.ALLOY_PLATINUM.asQuantity(1),
      SupremeComponents.ALLOY_PLATINUM.asQuantity(1), SupremeComponents.ALLOY_PLATINUM.asQuantity(1)};

  public static final SlimefunItemStack ALLOY_ADAMANTIUM = new SupremeItemStack("SUPREME_ALLOY_ADAMANTIUM",
      Material.NETHERITE_INGOT, "&aAlloy Adamantium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_ADAMANTIUM = {SlimefunItems.ALUMINUM_DUST.asQuantity(1),
      SlimefunItems.REINFORCED_ALLOY_INGOT.asQuantity(1), SlimefunItems.ALUMINUM_INGOT.asQuantity(1), null, null, null, null, null, null};

  public static final SlimefunItemStack ADAMANTIUM_PLATE = new SupremeItemStack("SUPREME_ADAMANTIUM_PLATE",
      Material.NETHERITE_BLOCK, "&aAdamantium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ADAMANTIUM_PLATE = {SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1),
      SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1), SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_STONE.asQuantity(1),
      SupremeCoreBlock.RESOURCE_CORE_STONE.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_STONE.asQuantity(1), SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1),
      SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1), SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1)};

  public static final SlimefunItemStack SYNTHETIC_AMETHYST = new SupremeItemStack("SUPREME_SYNTHETIC_AMETHYST",
      Material.PURPLE_DYE, "&aSynthetic Amethyst", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_SYNTHETIC_AMETHYST = {SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1),
      SlimefunItems.MAGIC_LUMP_3.asQuantity(1), SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1), SlimefunItems.MAGIC_LUMP_3.asQuantity(1),
      new ItemStack(Material.AMETHYST_SHARD), SlimefunItems.MAGIC_LUMP_3.asQuantity(1), SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1),
      SlimefunItems.MAGIC_LUMP_3.asQuantity(1), SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1)};

  public static final SlimefunItemStack SYNTHETIC_RUBY = new SupremeItemStack("SUPREME_SYNTHETIC_RUBY",
      Material.PINK_DYE, "&aSynthetic Ruby", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_SYNTHETIC_RUBY = {SlimefunItems.SYNTHETIC_EMERALD.asQuantity(1),
      SlimefunItems.SYNTHETIC_DIAMOND.asQuantity(1), SlimefunItems.SYNTHETIC_EMERALD.asQuantity(1), SlimefunItems.SYNTHETIC_DIAMOND.asQuantity(1),
      SupremeComponents.SYNTHETIC_AMETHYST.asQuantity(1), SlimefunItems.SYNTHETIC_DIAMOND.asQuantity(1), SlimefunItems.SYNTHETIC_EMERALD.asQuantity(1),
      SlimefunItems.SYNTHETIC_DIAMOND.asQuantity(1), SlimefunItems.SYNTHETIC_EMERALD.asQuantity(1)};

  public static final SlimefunItemStack THORNERITE = new SupremeItemStack("SUPREME_THORNERITE",
      Material.NETHERITE_INGOT, "&aThornerite", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNERITE = {SupremeComponents.THORNIUM_INGOT.asQuantity(1),
      SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1), SupremeComponents.ALLOY_IRIDIUM.asQuantity(1), SupremeComponents.ALLOY_PLATINUM.asQuantity(1),
      SupremeComponents.ALLOY_TITANIUM.asQuantity(1), SupremeComponents.ALLOY_ZIRCONIUM.asQuantity(1), null, null, null};

  public static final SlimefunItemStack INDUCTIVE_MACHINE = new SupremeItemStack("SUPREME_INDUCTIVE_MACHINE",
      Material.DEAD_FIRE_CORAL_BLOCK, "&aInductive Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_INDUCTIVE_MACHINE = {SlimefunItems.REDSTONE_ALLOY.asQuantity(1),
      SupremeComponents.ALLOY_PLATINUM.asQuantity(1), SlimefunItems.REDSTONE_ALLOY.asQuantity(1), SupremeComponents.ALLOY_IRIDIUM.asQuantity(1),
      SlimefunItems.ELECTRO_MAGNET.asQuantity(1), SupremeComponents.ALLOY_IRIDIUM.asQuantity(1), SlimefunItems.REDSTONE_ALLOY.asQuantity(1),
      SupremeComponents.ALLOY_PLATINUM.asQuantity(1), SlimefunItems.REDSTONE_ALLOY.asQuantity(1)};

  public static final SlimefunItemStack INDUCTOR_MACHINE = new SupremeItemStack("SUPREME_INDUCTOR_MACHINE",
      Material.FIRE_CORAL_BLOCK, "&aInductor Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_INDUCTOR_MACHINE = {SlimefunItems.REDSTONE_ALLOY.asQuantity(1),
      SupremeComponents.PLATINUM_PLATE.asQuantity(1), SlimefunItems.REDSTONE_ALLOY.asQuantity(1), SupremeComponents.IRIDIUM_PLATE.asQuantity(1),
      SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1), SupremeComponents.IRIDIUM_PLATE.asQuantity(1), SlimefunItems.REDSTONE_ALLOY.asQuantity(1),
      SupremeComponents.PLATINUM_PLATE.asQuantity(1), SlimefunItems.REDSTONE_ALLOY.asQuantity(1)};

  public static final SlimefunItemStack RUSTLESS_MACHINE = new SupremeItemStack("SUPREME_RUSTLESS_MACHINE",
      Material.DEAD_BRAIN_CORAL_BLOCK, "&aRustless Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_RUSTLESS_MACHINE = {SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1),
      SupremeComponents.ALLOY_ZIRCONIUM.asQuantity(1), SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1), SupremeComponents.ALLOY_MANGANESE.asQuantity(1),
      SlimefunItems.ELECTRO_MAGNET.asQuantity(1), SupremeComponents.ALLOY_MANGANESE.asQuantity(1), SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1),
      SupremeComponents.ALLOY_ZIRCONIUM.asQuantity(1), SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1)};

  public static final SlimefunItemStack STAINLESS_MACHINE = new SupremeItemStack("SUPREME_STAINLESS_MACHINE",
      Material.BRAIN_CORAL_BLOCK, "&aStainless Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_STAINLESS_MACHINE = {SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1),
      SupremeComponents.ZIRCONIUM_PLATE.asQuantity(1), SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1), SupremeComponents.MANGANESE_PLATE.asQuantity(1),
      SupremeComponents.RUSTLESS_MACHINE.asQuantity(1), SupremeComponents.MANGANESE_PLATE.asQuantity(1), SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1),
      SupremeComponents.ZIRCONIUM_PLATE.asQuantity(1), SlimefunItems.HARDENED_METAL_INGOT.asQuantity(1)};

  public static final SlimefunItemStack CARRIAGE_MACHINE = new SupremeItemStack("SUPREME_CARRIAGE_MACHINE",
      Material.DEAD_HORN_CORAL_BLOCK, "&aCarriage Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_CARRIAGE_MACHINE = {SlimefunItems.GILDED_IRON.asQuantity(1), SupremeComponents.ALLOY_AURUM.asQuantity(1),
      SlimefunItems.GILDED_IRON.asQuantity(1), SupremeComponents.ALLOY_TITANIUM.asQuantity(1), SlimefunItems.ELECTRO_MAGNET.asQuantity(1),
      SupremeComponents.ALLOY_TITANIUM.asQuantity(1), SlimefunItems.GILDED_IRON.asQuantity(1), SupremeComponents.ALLOY_AURUM.asQuantity(1),
      SlimefunItems.GILDED_IRON.asQuantity(1)};

  public static final SlimefunItemStack CONVEYANCE_MACHINE = new SupremeItemStack("SUPREME_CONVEYANCE_MACHINE",
      Material.HORN_CORAL_BLOCK, "&aConveyance Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_CONVEYANCE_MACHINE = {SlimefunItems.GILDED_IRON.asQuantity(1), SupremeComponents.AURUM_PLATE.asQuantity(1),
      SlimefunItems.GILDED_IRON.asQuantity(1), SupremeComponents.TITANIUM_PLATE.asQuantity(1), SupremeComponents.CARRIAGE_MACHINE.asQuantity(1),
      SupremeComponents.TITANIUM_PLATE.asQuantity(1), SlimefunItems.GILDED_IRON.asQuantity(1), SupremeComponents.AURUM_PLATE.asQuantity(1),
      SlimefunItems.GILDED_IRON.asQuantity(1)};

  public static final SlimefunItemStack PETRIFIER_MACHINE = new SupremeItemStack("SUPREME_PETRIFIER_MACHINE",
      Material.DEAD_TUBE_CORAL_BLOCK, "&aPetrifier Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_PETRIFIER_MACHINE = {SupremeCoreAlloy.RESOURCE_CORE_COAL.asQuantity(1),
      SupremeComponents.RUSTLESS_MACHINE.asQuantity(1), SupremeCoreAlloy.RESOURCE_CORE_COAL.asQuantity(1), SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1),
      SupremeComponents.CARRIAGE_MACHINE.asQuantity(1), SupremeComponents.ALLOY_ADAMANTIUM.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_STONE.asQuantity(1),
      SupremeComponents.INDUCTIVE_MACHINE.asQuantity(1), SupremeCoreBlock.RESOURCE_CORE_STONE.asQuantity(1)};

  public static final SlimefunItemStack CRYSTALLIZER_MACHINE = new SupremeItemStack("SUPREME_CRYSTALLIZER_MACHINE",
      Material.TUBE_CORAL_BLOCK, "&aCrystallizer Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_CRYSTALLIZER_MACHINE = {SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.asQuantity(1),
      STAINLESS_MACHINE.asQuantity(1), SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.asQuantity(1), SupremeComponents.SYNTHETIC_RUBY.asQuantity(1),
      SupremeComponents.PETRIFIER_MACHINE.asQuantity(1), SupremeComponents.SYNTHETIC_RUBY.asQuantity(1), SupremeCoreAlloy.RESOURCE_CORE_EMERALD.asQuantity(1),
      SupremeComponents.INDUCTOR_MACHINE.asQuantity(1), SupremeCoreAlloy.RESOURCE_CORE_EMERALD.asQuantity(1)};

  public static final SlimefunItemStack BLEND_MACHINE = new SupremeItemStack("SUPREME_BLEND_MACHINE",
      Material.BUBBLE_CORAL_BLOCK, "&aBlend Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_BLEND_MACHINE = {SupremeComponents.INDUCTOR_MACHINE.asQuantity(1),
      SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1),
      SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1), SupremeCoreAlloy.RESOURCE_CORE_EMERALD.asQuantity(1),
      SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1),
      SupremeCoreAlloy.RESOURCE_CORE_NETHERITE.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack CENTER_CARD_SIMPLE = new SupremeItemStack("SUPREME_CENTER_CARD_SIMPLE",
      Material.MUSIC_DISC_11, "&aBasic Component for Card", "", "&fComponent for Machine to produce items", "",
      "&3Supreme Component");
  public static final ItemStack[] RECIPE_CENTER_CARD_SIMPLE = new ItemStack[]{SlimefunItems.BASIC_CIRCUIT_BOARD.asQuantity(1),
      SlimefunItems.ELECTRO_MAGNET.asQuantity(1), SlimefunItems.BASIC_CIRCUIT_BOARD.asQuantity(1), SlimefunItems.ADVANCED_CIRCUIT_BOARD.asQuantity(1),
      SupremeComponents.SYNTHETIC_AMETHYST.asQuantity(1), SlimefunItems.ADVANCED_CIRCUIT_BOARD.asQuantity(1), SlimefunItems.BASIC_CIRCUIT_BOARD.asQuantity(1),
      SlimefunItems.ELECTRO_MAGNET.asQuantity(1), SlimefunItems.BASIC_CIRCUIT_BOARD.asQuantity(1)};

  public static final SlimefunItemStack CENTER_CARD_ADVANCED = new SupremeItemStack("SUPREME_CENTER_CARD_ADVANCED",
      Material.MUSIC_DISC_PIGSTEP, "&aAdvanced Component for Card", "", "&fComponent for Machine to produce items", "",
      "&3Supreme Component");
  public static final ItemStack[] RECIPE_CENTER_CARD_ADVANCED = new ItemStack[]{SlimefunItems.ADVANCED_CIRCUIT_BOARD.asQuantity(1),
      SupremeComponents.CENTER_CARD_SIMPLE.asQuantity(1), SlimefunItems.ADVANCED_CIRCUIT_BOARD.asQuantity(1), SupremeComponents.CENTER_CARD_SIMPLE.asQuantity(1),
      SupremeComponents.SYNTHETIC_RUBY.asQuantity(1), SupremeComponents.CENTER_CARD_SIMPLE.asQuantity(1), SlimefunItems.HEATING_COIL.asQuantity(1),
      SupremeComponents.CENTER_CARD_SIMPLE.asQuantity(1), SlimefunItems.HEATING_COIL.asQuantity(1)};

  public static final SlimefunItemStack CENTER_CARD_ULTIMATE = new SupremeItemStack("SUPREME_CENTER_CARD_ULTIMATE",
      Material.MUSIC_DISC_MALL, "&aUltimate Component for Card", "", "&fComponent for Machine to produce items", "",
      "&3Supreme Component");
  public static final ItemStack[] RECIPE_CENTER_CARD_ULTIMATE = new ItemStack[]{SupremeComponents.SYNTHETIC_RUBY.asQuantity(1),
      SupremeComponents.CENTER_CARD_ADVANCED.asQuantity(1), SupremeComponents.SYNTHETIC_RUBY.asQuantity(1), SupremeComponents.CENTER_CARD_ADVANCED.asQuantity(1),
      SupremeComponents.PETRIFIER_MACHINE.asQuantity(1), SupremeComponents.CENTER_CARD_ADVANCED.asQuantity(1), SlimefunItems.REINFORCED_PLATE.asQuantity(1),
      SupremeComponents.CENTER_CARD_ADVANCED.asQuantity(1), SlimefunItems.REINFORCED_PLATE.asQuantity(1)};

  public static final SlimefunItemStack DUST_NETHERITE = new SupremeItemStack("SUPREME_DUST_NETHERITE",
      Material.MELON_SEEDS, "&aNetherite Dust", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_DUST_NETHERITE = new ItemStack[]{new ItemStack(Material.NETHERITE_INGOT), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack DUST_GLOW_INK = new SupremeItemStack("SUPREME_DUST_GLOW_INK",
      Material.PUMPKIN_SEEDS, "&aGlow Ink Dust", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_DUST_GLOW_INK = new ItemStack[]{new ItemStack(Material.GLOW_INK_SAC), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack DUST_AMETHYST = new SupremeItemStack("SUPREME_DUST_AMETHYST",
      Material.BEETROOT_SEEDS, "&aAmethyst Dust", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_DUST_AMETHYST = new ItemStack[]{new ItemStack(Material.AMETHYST_SHARD), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack EMPTY_MOBTECH = new SupremeItemStack("SUPREME_EMPTY_MOBTECH",
      Material.FIRE_CHARGE, "&aEmpty MobTech", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_EMPTY_MOBTECH = new ItemStack[]{SlimefunItems.MAGIC_LUMP_2.asQuantity(1),
      SlimefunItems.STONE_CHUNK.asQuantity(1), SlimefunItems.ENDER_LUMP_2.asQuantity(1), null, null, null, null, null, null};

  public static final SlimefunItemStack GENE_BERSERK = new SupremeItemStack("SUPREME_GENE_BERSERK", Material.FIRE_CORAL,
      "&aBerserk Gene", "", "&3Supreme Component");

  public static final SlimefunItemStack GENE_INTELLIGENCE = new SupremeItemStack("SUPREME_GENE_INTELLIGENCE",
      Material.TUBE_CORAL, "&fIntelligence Gene", "", "&3Supreme Component");

  public static final SlimefunItemStack GENE_LUCK = new SupremeItemStack("SUPREME_GENE_LUCK", Material.HORN_CORAL,
      "&aLuck Gene", "", "&3Supreme Component");

}
