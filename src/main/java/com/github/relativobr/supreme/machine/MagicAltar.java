package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.generic.machine.GenericMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
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
public class MagicAltar extends GenericMachine {

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE = new SupremeItemStack("SUPREME_MAGIC_ALTAR_I",
      Material.SMOKER, "&bMagic Altar", "", "&fCraft Rune and Magical Items", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      UtilEnergy.energyPowerPerSecond(20), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE = new ItemStack[]{SlimefunItems.ANCIENT_PEDESTAL.asQuantity(1),
      SupremeComponents.SYNTHETIC_RUBY.asQuantity(1), SlimefunItems.ANCIENT_PEDESTAL.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1),
      SlimefunItems.ANCIENT_ALTAR.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1), SlimefunItems.ANCIENT_PEDESTAL.asQuantity(1),
      SupremeComponents.INDUCTOR_MACHINE.asQuantity(1), SlimefunItems.ANCIENT_PEDESTAL.asQuantity(1)};

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_II = new SupremeItemStack("SUPREME_MAGIC_ALTAR_II",
      Material.SMOKER, "&bMagic Altar II", "", "&fAdvanced Craft Rune and Magical Items", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      UtilEnergy.energyPowerPerSecond(100), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE_II = new ItemStack[]{SupremeComponents.THORNERITE.asQuantity(1),
      SupremeCetrus.CETRUS_AQUA.asQuantity(1), SupremeComponents.THORNERITE.asQuantity(1), SupremeCetrus.CETRUS_VENTUS.asQuantity(1),
      MagicAltar.MAGIC_ALTAR_MACHINE.asQuantity(1), SupremeCetrus.CETRUS_LUX.asQuantity(1), SupremeComponents.THORNERITE.asQuantity(1),
      SupremeCetrus.CETRUS_IGNIS.asQuantity(1), SupremeComponents.THORNERITE.asQuantity(1)};

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_III = new SupremeItemStack("SUPREME_MAGIC_ALTAR_III",
      Material.SMOKER, "&bMagic Altar III", "", "&fAdvanced Craft Rune and Magical Items", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      UtilEnergy.energyPowerPerSecond(300), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE.asQuantity(1),
      SupremeAttribute.getMagic().asQuantity(1), SupremeComponents.THORNERITE.asQuantity(1), SupremeComponents.SUPREME.asQuantity(1),
      MagicAltar.MAGIC_ALTAR_MACHINE_II, SupremeComponents.SUPREME.asQuantity(1), SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1),
      SupremeCetrus.CETRUS_LUMIUM.asQuantity(1), SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1)};
	
	public static final AbstractItemRecipe RECIPE_RUNE_AIR = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.FEATHER), SlimefunItems.MAGIC_LUMP_1.asQuantity(1), new ItemStack(Material.FEATHER),
					new ItemStack(Material.GHAST_TEAR), SlimefunItems.BLANK_RUNE.asQuantity(1), new ItemStack(Material.GHAST_TEAR),
					new ItemStack(Material.FEATHER), SlimefunItems.MAGIC_LUMP_1.asQuantity(1), new ItemStack(Material.FEATHER)},
			SlimefunItems.AIR_RUNE.asQuantity(4));
	public static final AbstractItemRecipe RECIPE_RUNE_EARTH = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.DIRT), SlimefunItems.MAGIC_LUMP_1.asQuantity(1), new ItemStack(Material.STONE),
					new ItemStack(Material.OBSIDIAN), SlimefunItems.BLANK_RUNE.asQuantity(1), new ItemStack(Material.OBSIDIAN),
					new ItemStack(Material.STONE), SlimefunItems.MAGIC_LUMP_1.asQuantity(1), new ItemStack(Material.DIRT)},
			SlimefunItems.EARTH_RUNE.asQuantity(4));
	public static final AbstractItemRecipe RECIPE_RUNE_FIRE = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.FIRE_CHARGE), SlimefunItems.MAGIC_LUMP_2.asQuantity(1), new ItemStack(Material.FIRE_CHARGE),
					new ItemStack(Material.BLAZE_POWDER), SlimefunItems.EARTH_RUNE.asQuantity(1), new ItemStack(Material.FLINT_AND_STEEL),
					new ItemStack(Material.FIRE_CHARGE), SlimefunItems.MAGIC_LUMP_2.asQuantity(1), new ItemStack(Material.FIRE_CHARGE)},
			SlimefunItems.FIRE_RUNE.asQuantity(4));
	public static final AbstractItemRecipe RECIPE_RUNE_WATER = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.SALMON), SlimefunItems.MAGIC_LUMP_2.asQuantity(1), new ItemStack(Material.WATER_BUCKET),
					new ItemStack(Material.SAND), SlimefunItems.BLANK_RUNE.asQuantity(1), new ItemStack(Material.SAND),
					new ItemStack(Material.WATER_BUCKET), SlimefunItems.MAGIC_LUMP_2.asQuantity(1), new ItemStack(Material.COD)},
			SlimefunItems.WATER_RUNE.asQuantity(4));
	public static final AbstractItemRecipe RECIPE_RUNE_ENDER = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.ENDER_PEARL), SlimefunItems.ENDER_LUMP_3.asQuantity(1), new ItemStack(Material.ENDER_PEARL),
					new ItemStack(Material.ENDER_EYE), SlimefunItems.BLANK_RUNE.asQuantity(1), new ItemStack(Material.ENDER_EYE),
					new ItemStack(Material.ENDER_PEARL), SlimefunItems.ENDER_LUMP_3.asQuantity(1), new ItemStack(Material.ENDER_PEARL)},
			SlimefunItems.ENDER_RUNE.asQuantity(6));
	public static final AbstractItemRecipe RECIPE_RUNE_LIGHTNING = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.IRON_INGOT), SlimefunItems.MAGIC_LUMP_3.asQuantity(1), new ItemStack(Material.IRON_INGOT),
					SlimefunItems.AIR_RUNE.asQuantity(1), new ItemStack(Material.PHANTOM_MEMBRANE), SlimefunItems.WATER_RUNE.asQuantity(1),
					new ItemStack(Material.IRON_INGOT), SlimefunItems.MAGIC_LUMP_3.asQuantity(1), new ItemStack(Material.IRON_INGOT)},
			SlimefunItems.LIGHTNING_RUNE.asQuantity(4));
	public static final AbstractItemRecipe RECIPE_RUNE_RAINBOW = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.RED_DYE), SlimefunItems.MAGIC_LUMP_3.asQuantity(1), new ItemStack(Material.CYAN_DYE),
					new ItemStack(Material.WHITE_WOOL), SlimefunItems.ENDER_RUNE.asQuantity(1), new ItemStack(Material.WHITE_WOOL),
					new ItemStack(Material.YELLOW_DYE), SlimefunItems.ENDER_LUMP_3.asQuantity(1), new ItemStack(Material.MAGENTA_DYE)},
			SlimefunItems.RAINBOW_RUNE.asQuantity(1));
	public static final AbstractItemRecipe RECIPE_RUNE_SOULBOUND = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_3.asQuantity(1), SlimefunItems.ESSENCE_OF_AFTERLIFE.asQuantity(1), SlimefunItems.MAGIC_LUMP_3.asQuantity(1),
					SlimefunItems.ENDER_LUMP_3.asQuantity(1), SlimefunItems.ENDER_RUNE.asQuantity(1), SlimefunItems.ENDER_LUMP_3.asQuantity(1),
					SlimefunItems.MAGIC_LUMP_3.asQuantity(1), SlimefunItems.ESSENCE_OF_AFTERLIFE.asQuantity(1), SlimefunItems.MAGIC_LUMP_3.asQuantity(1)},
			SlimefunItems.SOULBOUND_RUNE.asQuantity(1));
	public static final AbstractItemRecipe RECIPE_RUNE_ENCHANTMENT = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_3.asQuantity(1), SlimefunItems.MAGICAL_GLASS.asQuantity(1), SlimefunItems.MAGIC_LUMP_3.asQuantity(1),
					SlimefunItems.MAGICAL_GLASS.asQuantity(1), SlimefunItems.LIGHTNING_RUNE.asQuantity(1), SlimefunItems.MAGICAL_GLASS.asQuantity(1),
					SlimefunItems.MAGIC_LUMP_3.asQuantity(1), SlimefunItems.MAGICAL_GLASS.asQuantity(1), SlimefunItems.MAGIC_LUMP_3.asQuantity(1)},
			SlimefunItems.ENCHANTMENT_RUNE.asQuantity(1));
	public static final AbstractItemRecipe RECIPE_RUNE_VILLAGERS = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_3.asQuantity(1), SlimefunItems.MAGICAL_GLASS.asQuantity(1), new ItemStack(Material.CRYING_OBSIDIAN),
					SlimefunItems.STRANGE_NETHER_GOO.asQuantity(1), SlimefunItems.FIRE_RUNE.asQuantity(1), SlimefunItems.STRANGE_NETHER_GOO.asQuantity(1),
					new ItemStack(Material.CRYING_OBSIDIAN), SlimefunItems.MAGICAL_GLASS.asQuantity(1), SlimefunItems.MAGIC_LUMP_3.asQuantity(1)},
			SlimefunItems.VILLAGER_RUNE.asQuantity(3));
	public static final AbstractItemRecipe RECIPE_BLANK_RUNE = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.STONE), SlimefunItems.MAGIC_LUMP_1.asQuantity(1), new ItemStack(Material.STONE),
					SlimefunItems.MAGIC_LUMP_1.asQuantity(1), new ItemStack(Material.OBSIDIAN), SlimefunItems.MAGIC_LUMP_1.asQuantity(1),
					new ItemStack(Material.STONE), SlimefunItems.MAGIC_LUMP_1.asQuantity(1), new ItemStack(Material.STONE)},
			SlimefunItems.BLANK_RUNE.asQuantity(1));
	public static final AbstractItemRecipe RECIPE_ESSENCE_OF_AFTERLIFE = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.ENDER_LUMP_3.asQuantity(1), SlimefunItems.AIR_RUNE.asQuantity(1), SlimefunItems.ENDER_LUMP_3.asQuantity(1),
					SlimefunItems.EARTH_RUNE.asQuantity(1), SlimefunItems.NECROTIC_SKULL.asQuantity(1), SlimefunItems.FIRE_RUNE.asQuantity(1),
					SlimefunItems.ENDER_LUMP_3.asQuantity(1), SlimefunItems.WATER_RUNE.asQuantity(1), SlimefunItems.ENDER_LUMP_3.asQuantity(1)},
			SlimefunItems.ESSENCE_OF_AFTERLIFE.asQuantity(1));
	public static final AbstractItemRecipe RECIPE_LAVA_CRYSTAL = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_1.asQuantity(1), new ItemStack(Material.BLAZE_POWDER), SlimefunItems.MAGIC_LUMP_1.asQuantity(1),
					new ItemStack(Material.BLAZE_POWDER), SlimefunItems.FIRE_RUNE.asQuantity(1), new ItemStack(Material.BLAZE_POWDER),
					SlimefunItems.MAGIC_LUMP_1.asQuantity(1), new ItemStack(Material.BLAZE_POWDER), SlimefunItems.MAGIC_LUMP_1.asQuantity(1)},
			SlimefunItems.LAVA_CRYSTAL.asQuantity(1));
	public static final AbstractItemRecipe RECIPE_MAGICAL_GLASS = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_2.asQuantity(1), SlimefunItems.GOLD_DUST.asQuantity(1), SlimefunItems.MAGIC_LUMP_2.asQuantity(1),
					new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.GLASS_PANE), new ItemStack(Material.EXPERIENCE_BOTTLE),
					SlimefunItems.MAGIC_LUMP_2.asQuantity(1), new ItemStack(Material.EXPERIENCE_BOTTLE), SlimefunItems.MAGIC_LUMP_2.asQuantity(1)},
			SlimefunItems.MAGICAL_GLASS.asQuantity(1));
	public static final AbstractItemRecipe RECIPE_COMMON_TALISMAN = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_2.asQuantity(1), SlimefunItems.GOLD_8K.asQuantity(1), SlimefunItems.MAGIC_LUMP_2.asQuantity(1),
					null, new ItemStack(Material.EMERALD), null,
					SlimefunItems.MAGIC_LUMP_2.asQuantity(1), SlimefunItems.GOLD_8K.asQuantity(1), SlimefunItems.MAGIC_LUMP_2.asQuantity(1)},
			SlimefunItems.COMMON_TALISMAN.asQuantity(1));
	public static final AbstractItemRecipe RECIPE_MAGICAL_BOOK_COVER = new AbstractItemRecipe(
			new ItemStack[]{null, SlimefunItems.MAGIC_LUMP_2.asQuantity(1), null,
					SlimefunItems.MAGIC_LUMP_2.asQuantity(1), new ItemStack(Material.BOOK), SlimefunItems.MAGIC_LUMP_2.asQuantity(1),
					null, SlimefunItems.MAGIC_LUMP_2.asQuantity(1), null},
			SlimefunItems.MAGICAL_BOOK_COVER.asQuantity(1));
	public static final AbstractItemRecipe RECIPE_POWER_CRYSTAL = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.REDSTONE), SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1), new ItemStack(Material.REDSTONE),
					SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1), SlimefunItems.SYNTHETIC_DIAMOND.asQuantity(1), SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1),
					new ItemStack(Material.REDSTONE), SlimefunItems.SYNTHETIC_SAPPHIRE.asQuantity(1), new ItemStack(Material.REDSTONE)},
			SlimefunItems.POWER_CRYSTAL.asQuantity(1));
	public static final AbstractItemRecipe RECIPE_ELYTRA_SCALE = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.ENDER_LUMP_3.asQuantity(1), SlimefunItems.AIR_RUNE.asQuantity(1), SlimefunItems.ENDER_LUMP_3.asQuantity(1),
					new ItemStack(Material.PHANTOM_MEMBRANE), new ItemStack(Material.FEATHER), new ItemStack(Material.PHANTOM_MEMBRANE),
					SlimefunItems.ENDER_LUMP_3.asQuantity(1), SlimefunItems.AIR_RUNE.asQuantity(1), SlimefunItems.ENDER_LUMP_3.asQuantity(1)},
			SlimefunItems.ELYTRA_SCALE.asQuantity(1));
	public static final AbstractItemRecipe RECIPE_ELITROS = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.ELYTRA_SCALE.asQuantity(1), SlimefunItems.AIR_RUNE.asQuantity(1), SlimefunItems.ELYTRA_SCALE.asQuantity(1),
					SlimefunItems.AIR_RUNE.asQuantity(1), new ItemStack(Material.LEATHER_CHESTPLATE), SlimefunItems.AIR_RUNE.asQuantity(1),
					SlimefunItems.ELYTRA_SCALE.asQuantity(1), SlimefunItems.AIR_RUNE.asQuantity(1), SlimefunItems.ELYTRA_SCALE.asQuantity(1)},
			new ItemStack(Material.ELYTRA, 1));
	public static final AbstractItemRecipe RECIPE_INFUSED_ELYTRA = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.FLASK_OF_KNOWLEDGE.asQuantity(1), SlimefunItems.ELYTRA_SCALE.asQuantity(1), SlimefunItems.FLASK_OF_KNOWLEDGE.asQuantity(1),
					SlimefunItems.FLASK_OF_KNOWLEDGE.asQuantity(1), new ItemStack(Material.ELYTRA), SlimefunItems.FLASK_OF_KNOWLEDGE.asQuantity(1),
					SlimefunItems.FLASK_OF_KNOWLEDGE.asQuantity(1), SlimefunItems.ELYTRA_SCALE.asQuantity(1), SlimefunItems.FLASK_OF_KNOWLEDGE.asQuantity(1)},
			SlimefunItems.INFUSED_ELYTRA.asQuantity(1));
	
  public MagicAltar(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_RUNE_AIR);
    list.add(RECIPE_RUNE_EARTH);
    list.add(RECIPE_RUNE_FIRE);
    list.add(RECIPE_RUNE_WATER);
    list.add(RECIPE_RUNE_ENDER);
    list.add(RECIPE_RUNE_LIGHTNING);
    list.add(RECIPE_RUNE_RAINBOW);
    list.add(RECIPE_RUNE_SOULBOUND);
    list.add(RECIPE_RUNE_ENCHANTMENT);
    list.add(RECIPE_RUNE_VILLAGERS);
    list.add(RECIPE_BLANK_RUNE);
    list.add(RECIPE_ESSENCE_OF_AFTERLIFE);
    list.add(RECIPE_LAVA_CRYSTAL);
    list.add(RECIPE_MAGICAL_GLASS);
    list.add(RECIPE_COMMON_TALISMAN);
    list.add(RECIPE_MAGICAL_BOOK_COVER);
    list.add(RECIPE_POWER_CRYSTAL);
    list.add(RECIPE_ELYTRA_SCALE);
    list.add(RECIPE_ELITROS);
    list.add(RECIPE_INFUSED_ELYTRA);
    return list;
  }

}
