package com.github.relativobr.supreme.resource.magical;

import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.resource.core.SupremeCoreColor;
import com.github.relativobr.supreme.resource.core.SupremeCoreDeath;
import com.github.relativobr.supreme.resource.core.SupremeCoreLife;
import com.github.relativobr.supreme.resource.core.SupremeCoreNature;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeCore {

  public static final SlimefunItemStack CORE_OF_LIFE = new SupremeItemStack("SUPREME_CORE_OF_LIFE",
      "faff2eb498e5c6a04484f0c9f785b448479ab213df95ec91176a308a12add70", "&aCore of Life", "",
      "&7This core contains fragments of life", "&7that have been collected by the world.", "",
      "&3Supreme Magical Components");
  public static final ItemStack[] RECIPE_CORE_OF_LIFE = {
      SupremeCoreLife.RESOURCE_CORE_POTATO.asQuantity(64),
      SupremeCoreLife.RESOURCE_CORE_CARROT.asQuantity(64),
      SupremeCoreLife.RESOURCE_CORE_BEETROOT.asQuantity(64),
      SupremeCoreLife.RESOURCE_CORE_WHEAT.asQuantity(64),
      SupremeCoreLife.RESOURCE_CORE_SUGAR_CANE.asQuantity(64),
      SupremeCoreLife.RESOURCE_CORE_SWEET_BERRIES.asQuantity(64),
      SupremeCoreLife.RESOURCE_CORE_MELON.asQuantity(64),
      SupremeCoreLife.RESOURCE_CORE_PUMPKIN.asQuantity(64),
      SupremeCoreLife.RESOURCE_CORE_APPLE.asQuantity(64),};

  public static final SlimefunItemStack CORE_OF_DEATH = new SupremeItemStack("SUPREME_CORE_OF_DEATH",
      "9e95293acbcd4f55faf5947bfc5135038b275a7ab81087341b9ec6e453e839", "&aCore of Death", "",
      "&7This core contains the souls of ", "&7various entities that have gone beyond.", "",
      "&3Supreme Magical Components");
  public static final ItemStack[] RECIPE_CORE_OF_DEATH = {
      SupremeCoreDeath.RESOURCE_CORE_PORKCHOP.asQuantity(64),
      SupremeCoreDeath.RESOURCE_CORE_BEEF.asQuantity(64),
      SupremeCoreDeath.RESOURCE_CORE_MUTTON.asQuantity(64),
      SupremeCoreDeath.RESOURCE_CORE_CHICKEN.asQuantity(64),
      SupremeCoreDeath.RESOURCE_CORE_SALMON.asQuantity(64),
      SupremeCoreDeath.RESOURCE_CORE_COD.asQuantity(64),
      SupremeCoreDeath.RESOURCE_CORE_STRING.asQuantity(64),
      SupremeCoreDeath.RESOURCE_CORE_SPIDER_EYE.asQuantity(64),
      SupremeCoreDeath.RESOURCE_CORE_TEAR.asQuantity(64)};

  public static final SlimefunItemStack CORE_OF_COLOR = new SupremeItemStack("SUPREME_CORE_OF_COLOR",
      "163bcaf6d2679d8d7d9bf6a474a48a77a8e91747a1084c09256ebc86cb74811", "&aCore of Color", "",
      "&7This core contains several colors", "&7that have been collected around the world.", "",
      "&3Supreme Magical Components");
  public static final ItemStack[] RECIPE_CORE_OF_COLOR = {SupremeCoreColor.RESOURCE_CORE_RED.asQuantity(64),
      SupremeCoreColor.RESOURCE_CORE_YELLOW.asQuantity(64),
      SupremeCoreColor.RESOURCE_CORE_PURPLE.asQuantity(64),
      SupremeCoreColor.RESOURCE_CORE_BLUE.asQuantity(64),
      SupremeCoreColor.RESOURCE_CORE_BLACK.asQuantity(64),
      SupremeCoreColor.RESOURCE_CORE_GREEN.asQuantity(64),
      SupremeCoreColor.RESOURCE_CORE_PINK.asQuantity(64),
      SupremeCoreColor.RESOURCE_CORE_GRAY.asQuantity(64),
      SupremeCoreColor.RESOURCE_CORE_CYAN.asQuantity(64)};

  public static final SlimefunItemStack CORE_OF_BLOCK = new SupremeItemStack("SUPREME_CORE_OF_BLOCK",
      "14d844fee24d5f27ddb669438528d83b684d901b75a6889fe7488dfc4cf7a1c", "&aCore of Block", "",
      "&7This core contains several blocks", "&7that have been collected around the world.", "",
      "&3Supreme Magical Components");
  public static final ItemStack[] RECIPE_CORE_OF_BLOCK = {
      SupremeCoreBlock.RESOURCE_CORE_STONE.asQuantity(64),
      SupremeCoreBlock.RESOURCE_CORE_GRANITE.asQuantity(64),
      SupremeCoreBlock.RESOURCE_CORE_DIORITE.asQuantity(64),
      SupremeCoreBlock.RESOURCE_CORE_ANDESITE.asQuantity(64),
      SupremeCoreBlock.RESOURCE_CORE_GRAVEL.asQuantity(64),
      SupremeCoreBlock.RESOURCE_CORE_SAND.asQuantity(64),
      SupremeCoreBlock.RESOURCE_CORE_ENDSTONE.asQuantity(64),
      SupremeCoreBlock.RESOURCE_CORE_CLAY.asQuantity(64),
      SupremeCoreBlock.RESOURCE_CORE_SNOW.asQuantity(64)};

  public static final SlimefunItemStack CORE_OF_NATURE = new SupremeItemStack("SUPREME_CORE_OF_NATURE",
      "32fa8f38c7b22096619c3a6d6498b405530e48d5d4f91e2aacea578844d5c67", "&aCore of Nature", "",
      "&7This core contains several natural", "&7that have been collected around the world.", "",
      "&3Supreme Magical Components");
  public static final ItemStack[] RECIPE_CORE_OF_NATURE = {
      SupremeCoreNature.RESOURCE_CORE_OAK_LOG.asQuantity(64),
      SupremeCoreNature.RESOURCE_CORE_SPRUCE_LOG.asQuantity(64),
      SupremeCoreNature.RESOURCE_CORE_BIRCH_LOG.asQuantity(64),
      SupremeCoreNature.RESOURCE_CORE_JUNGLE_LOG.asQuantity(64),
      SupremeCoreNature.RESOURCE_CORE_WITHER_ROSE.asQuantity(64),
      SupremeCoreNature.RESOURCE_CORE_ACACIA_LOG.asQuantity(64),
      SupremeCoreNature.RESOURCE_CORE_DARK_OAK_LOG.asQuantity(64),
      SupremeCoreNature.RESOURCE_CORE_CRIMSON_STEM.asQuantity(64),
      SupremeCoreNature.RESOURCE_CORE_WARPED_STEM.asQuantity(64)};

  public static final SlimefunItemStack CORE_OF_ALLOY = new SupremeItemStack("SUPREME_CORE_OF_ALLOY",
      "cbfb41f866e7e8e593659986c9d6e88cd37677b3f7bd44253e5871e66d1d424", "&aCore of Alloy", "",
      "&7This core contains several ores", "&7that have been collected around the world.", "",
      "&3Supreme Magical Components");
  public static final ItemStack[] RECIPE_CORE_OF_ALLOY = {
      SupremeCoreAlloy.RESOURCE_CORE_COAL.asQuantity(64),
      SupremeCoreAlloy.RESOURCE_CORE_IRON.asQuantity(64),
      SupremeCoreAlloy.RESOURCE_CORE_GOLD.asQuantity(64),
      SupremeCoreAlloy.RESOURCE_CORE_LAPIS.asQuantity(64),
      SupremeCoreAlloy.RESOURCE_CORE_REDSTONE.asQuantity(64),
      SupremeCoreAlloy.RESOURCE_CORE_QUARTZ.asQuantity(64),
      SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.asQuantity(64),
      SupremeCoreAlloy.RESOURCE_CORE_EMERALD.asQuantity(64),
      SupremeCoreAlloy.RESOURCE_CORE_NETHERITE.asQuantity(64)};
}
