package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.core.SupremeCoreDeath;
import com.github.relativobr.supreme.resource.core.SupremeCoreNature;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class WeaponsThornium {

  public static final SlimefunItemStack THORNIUM_BOW = new SupremeItemStack("SUPREME_BOW_THORNIUM", Material.BOW);
  public static final ItemStack[] RECIPE_THORNIUM_BOW = {null, SupremeComponents.THORNIUM_INGOT.asQuantity(1),
      SupremeCoreDeath.RESOURCE_CORE_STRING.asQuantity(1), SupremeCetrus.CETRUS_LUMIUM.asQuantity(1), null, SupremeCoreDeath.RESOURCE_CORE_STRING.asQuantity(1),
      null, SupremeComponents.THORNIUM_INGOT.asQuantity(1), SupremeCoreDeath.RESOURCE_CORE_STRING.asQuantity(1)};

  public static final SlimefunItemStack THORNIUM_BOW_MAGIC = new SupremeItemStack("SUPREME_BOW_MAGIC", Material.BOW);

  public static final SlimefunItemStack THORNIUM_BOW_RARE = new SupremeItemStack("SUPREME_BOW_RARE", Material.BOW);

  public static final SlimefunItemStack THORNIUM_BOW_EPIC = new SupremeItemStack("SUPREME_BOW_EPIC", Material.BOW);

  public static final SlimefunItemStack THORNIUM_BOW_LEGENDARY = new SupremeItemStack("SUPREME_BOW_LEGENDARY",
      Material.BOW);

  public static final SlimefunItemStack THORNIUM_BOW_SUPREME = new SupremeItemStack("SUPREME_BOW_SUPREME",
      Material.BOW);

  public static final SlimefunItemStack THORNIUM_SHIELD = new SupremeItemStack("SUPREME_SHIELD_THORNIUM",
      Material.SHIELD);
  public static final ItemStack[] RECIPE_THORNIUM_SHIELD = {SupremeCoreNature.RESOURCE_CORE_OAK_LOG.asQuantity(1),
      SupremeComponents.THORNIUM_INGOT.asQuantity(1), SupremeCoreNature.RESOURCE_CORE_OAK_LOG.asQuantity(1),
      SupremeCoreNature.RESOURCE_CORE_OAK_LOG.asQuantity(1), SupremeCetrus.CETRUS_LUX.asQuantity(1), SupremeCoreNature.RESOURCE_CORE_OAK_LOG.asQuantity(1), null,
      SupremeCoreNature.RESOURCE_CORE_OAK_LOG.asQuantity(1), null};

  public static final SlimefunItemStack THORNIUM_SHIELD_MAGIC = new SupremeItemStack("SUPREME_SHIELD_MAGIC",
      Material.SHIELD);

  public static final SlimefunItemStack THORNIUM_SHIELD_RARE = new SupremeItemStack("SUPREME_SHIELD_RARE",
      Material.SHIELD);

  public static final SlimefunItemStack THORNIUM_SHIELD_EPIC = new SupremeItemStack("SUPREME_SHIELD_EPIC",
      Material.SHIELD);

  public static final SlimefunItemStack THORNIUM_SHIELD_LEGENDARY = new SupremeItemStack("SUPREME_SHIELD_LEGENDARY",
      Material.SHIELD);

  public static final SlimefunItemStack THORNIUM_SHIELD_SUPREME = new SupremeItemStack("SUPREME_SHIELD_SUPREME",
      Material.SHIELD);

  public static final SlimefunItemStack THORNIUM_SWORD = new SupremeItemStack("SUPREME_SWORD_THORNIUM",
      Material.NETHERITE_SWORD);
  public static final ItemStack[] RECIPE_THORNIUM_SWORD = {null, SupremeComponents.THORNIUM_INGOT.asQuantity(1), null, null,
      SupremeComponents.THORNIUM_INGOT.asQuantity(1), null, null, SupremeCetrus.CETRUS_LUMIUM.asQuantity(1), null};

  public static final SlimefunItemStack THORNIUM_SWORD_MAGIC = new SupremeItemStack("SUPREME_SWORD_MAGIC",
      Material.NETHERITE_SWORD);

  public static final SlimefunItemStack THORNIUM_SWORD_RARE = new SupremeItemStack("SUPREME_SWORD_RARE",
      Material.NETHERITE_SWORD);

  public static final SlimefunItemStack THORNIUM_SWORD_EPIC = new SupremeItemStack("SUPREME_SWORD_EPIC",
      Material.NETHERITE_SWORD);

  public static final SlimefunItemStack THORNIUM_SWORD_LEGENDARY = new SupremeItemStack("SUPREME_SWORD_LEGENDARY",
      Material.NETHERITE_SWORD);

  public static final SlimefunItemStack THORNIUM_SWORD_SUPREME = new SupremeItemStack("SUPREME_SWORD_SUPREME",
      Material.NETHERITE_SWORD);
}
