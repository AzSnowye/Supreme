package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.generic.machine.SimpleItemWithLargeContainerMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class ForgeIngot extends SimpleItemWithLargeContainerMachine {

  public static final SlimefunItemStack FORGE_INGOT_MACHINE = new SupremeItemStack("SUPREME_FORGE_INGOT_I",
      Material.BLAST_FURNACE, "&bForge Ingot", "", "&fThis machine allows you to", "&fforge ingot resources.", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE = new ItemStack[]{SupremeComponents.RUSTLESS_MACHINE.item(),
      new ItemStack(Material.BLAST_FURNACE), SupremeComponents.RUSTLESS_MACHINE.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SupremeComponents.PETRIFIER_MACHINE.item(), SupremeComponents.INDUCTIVE_MACHINE.item(), SlimefunItems.ELECTRIC_INGOT_FACTORY_3.item(),
      SlimefunItems.ELECTRIC_SMELTERY_2.item(), SlimefunItems.CARBON_PRESS_3.item()};

  public static final SlimefunItemStack FORGE_INGOT_MACHINE_II = new SupremeItemStack("SUPREME_FORGE_INGOT_II",
      Material.BLAST_FURNACE, "&bForge Ingot II", "", "&fThis machine allows you to", "&fforge ingot resources.", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      LoreBuilder.powerBuffer(5000), LoreBuilder.powerPerSecond(100), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE_II = new ItemStack[]{SupremeComponents.CONVEYANCE_MACHINE.item(),
      SupremeCetrus.CETRUS_IGNIS.item(), SupremeComponents.CONVEYANCE_MACHINE.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      ForgeIngot.FORGE_INGOT_MACHINE.item(), SupremeComponents.INDUCTOR_MACHINE.item(), SupremeComponents.THORNERITE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.THORNERITE.item()};

  public static final SlimefunItemStack FORGE_INGOT_MACHINE_III = new SupremeItemStack("SUPREME_FORGE_INGOT_III",
      Material.BLAST_FURNACE, "&bForge Ingot III", "", "&fThis machine allows you to", "&fforge ingot resources.", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      LoreBuilder.powerBuffer(15000), LoreBuilder.powerPerSecond(300), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE.item(),
      SupremeAttribute.getBomb().item(), SupremeComponents.THORNERITE.item(), SupremeComponents.SUPREME.item(),
      ForgeIngot.FORGE_INGOT_MACHINE_II.item(), SupremeComponents.SUPREME.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};

  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_LEAD = new AbstractItemRecipe(
      SlimefunItems.LEAD_DUST.asQuantity(32), SlimefunItems.LEAD_INGOT.asQuantity(32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_ALUMINUM = new AbstractItemRecipe(
      SlimefunItems.ALUMINUM_DUST.asQuantity(32), SlimefunItems.ALUMINUM_INGOT.asQuantity(32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_SILVER = new AbstractItemRecipe(
      SlimefunItems.SILVER_DUST.asQuantity(32), SlimefunItems.SILVER_INGOT.asQuantity(32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_COPPER = new AbstractItemRecipe(
      SlimefunItems.COPPER_DUST.asQuantity(32), SlimefunItems.COPPER_INGOT.asQuantity(32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_MAGNESIUM = new AbstractItemRecipe(
      SlimefunItems.MAGNESIUM_DUST.asQuantity(32),
      SlimefunItems.MAGNESIUM_INGOT.asQuantity(32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_IRON = new AbstractItemRecipe(
      SlimefunItems.IRON_DUST.asQuantity(32), new ItemStack(Material.IRON_INGOT, 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_TIN = new AbstractItemRecipe(
      SlimefunItems.TIN_DUST.asQuantity(32), SlimefunItems.TIN_INGOT.asQuantity(32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_ZINC = new AbstractItemRecipe(
      SlimefunItems.ZINC_DUST.asQuantity(32), SlimefunItems.ZINC_INGOT.asQuantity(32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_4K = new AbstractItemRecipe(
      SlimefunItems.GOLD_DUST.asQuantity(32), SlimefunItems.GOLD_4K.asQuantity(32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_6K = new AbstractItemRecipe(
      SlimefunItems.GOLD_4K.asQuantity(32), SlimefunItems.GOLD_6K.asQuantity(32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_8K = new AbstractItemRecipe(
      SlimefunItems.GOLD_6K.asQuantity(32), SlimefunItems.GOLD_8K.asQuantity(32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_10K = new AbstractItemRecipe(
      SlimefunItems.GOLD_8K.asQuantity(32), SlimefunItems.GOLD_10K.asQuantity(30));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_12K = new AbstractItemRecipe(
      SlimefunItems.GOLD_10K.asQuantity(32), SlimefunItems.GOLD_12K.asQuantity(28));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_14K = new AbstractItemRecipe(
      SlimefunItems.GOLD_12K.asQuantity(32), SlimefunItems.GOLD_14K.asQuantity(26));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_16K = new AbstractItemRecipe(
      SlimefunItems.GOLD_14K.asQuantity(32), SlimefunItems.GOLD_16K.asQuantity(24));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_18K = new AbstractItemRecipe(
      SlimefunItems.GOLD_16K.asQuantity(32), SlimefunItems.GOLD_18K.asQuantity(22));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_20K = new AbstractItemRecipe(
      SlimefunItems.GOLD_18K.asQuantity(32), SlimefunItems.GOLD_20K.asQuantity(20));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_22K = new AbstractItemRecipe(
      SlimefunItems.GOLD_20K.asQuantity(32), SlimefunItems.GOLD_22K.asQuantity(18));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_24K = new AbstractItemRecipe(
      SlimefunItems.GOLD_22K.asQuantity(32), SlimefunItems.GOLD_24K.asQuantity(16));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_COBALT_INGOT = new AbstractItemRecipe(
      SlimefunItems.NICKEL_INGOT.asQuantity(32), SlimefunItems.COBALT_INGOT.asQuantity(16));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_DAMASCUS_STEEL_INGOT = new AbstractItemRecipe(
      SlimefunItems.STEEL_INGOT.asQuantity(32),
      SlimefunItems.DAMASCUS_STEEL_INGOT.asQuantity(16));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_SILICON = new AbstractItemRecipe(
      new ItemStack(Material.QUARTZ_BLOCK, 32), SlimefunItems.SILICON.asQuantity(32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_FERROSILICON = new AbstractItemRecipe(
      SlimefunItems.SILICON.asQuantity(32), SlimefunItems.FERROSILICON.asQuantity(16));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_SULFATE = new AbstractItemRecipe(
      new ItemStack(Material.NETHERRACK, 64), SlimefunItems.SULFATE.asQuantity(8));

  public ForgeIngot(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_FORGE_INGOT_LEAD);
    list.add(RECIPE_FORGE_INGOT_ALUMINUM);
    list.add(RECIPE_FORGE_INGOT_SILVER);
    list.add(RECIPE_FORGE_INGOT_COPPER);
    list.add(RECIPE_FORGE_INGOT_MAGNESIUM);
    list.add(RECIPE_FORGE_INGOT_IRON);
    list.add(RECIPE_FORGE_INGOT_TIN);
    list.add(RECIPE_FORGE_INGOT_ZINC);
    list.add(RECIPE_FORGE_INGOT_GOLD_4K);
    list.add(RECIPE_FORGE_INGOT_GOLD_6K);
    list.add(RECIPE_FORGE_INGOT_GOLD_8K);
    list.add(RECIPE_FORGE_INGOT_GOLD_10K);
    list.add(RECIPE_FORGE_INGOT_GOLD_12K);
    list.add(RECIPE_FORGE_INGOT_GOLD_14K);
    list.add(RECIPE_FORGE_INGOT_GOLD_16K);
    list.add(RECIPE_FORGE_INGOT_GOLD_18K);
    list.add(RECIPE_FORGE_INGOT_GOLD_20K);
    list.add(RECIPE_FORGE_INGOT_GOLD_22K);
    list.add(RECIPE_FORGE_INGOT_GOLD_24K);
    list.add(RECIPE_FORGE_INGOT_COBALT_INGOT);
    list.add(RECIPE_FORGE_INGOT_DAMASCUS_STEEL_INGOT);
    list.add(RECIPE_FORGE_INGOT_SILICON);
    list.add(RECIPE_FORGE_INGOT_FERROSILICON);
    list.add(RECIPE_FORGE_INGOT_SULFATE);
    return list;
  }

}
