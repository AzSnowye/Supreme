package com.github.relativobr.supreme.generators;

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
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeCapacitor {

  public static final SlimefunItemStack AURUM_CAPACITOR = new SupremeItemStack("SUPREME_AURUM_CAPACITOR",
      "db2b1c052e84a4ad245a4d1ca5b10bd7f5249af0ca373f99174ce7990e597836", false,
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR), UtilEnergy.energyCapacity(Supreme.getSupremePowerSection().getCapacitorAurumCapacity()));
  public static final ItemStack[] MACHINE_AURUM_CAPACITOR = new ItemStack[]{SupremeComponents.AURUM_PLATE.asQuantity(1),
      SlimefunItems.ENERGIZED_CAPACITOR.asQuantity(1), SupremeComponents.AURUM_PLATE.asQuantity(1), SupremeComponents.AURUM_PLATE.asQuantity(1),
      SupremeCoreAlloy.RESOURCE_CORE_IRON.asQuantity(1), SupremeComponents.AURUM_PLATE.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1),
      SlimefunItems.ENERGIZED_CAPACITOR.asQuantity(1), SupremeComponents.INDUCTOR_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack TITANIUM_CAPACITOR = new SupremeItemStack("SUPREME_TITANIUM_CAPACITOR",
      "b30ad864b265ab178a03e27fc249a1e32941e007486febd0059e4e3b76c11958", false,
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR), UtilEnergy.energyCapacity(Supreme.getSupremePowerSection().getCapacitorTitaniumCapacity()));
  public static final ItemStack[] MACHINE_TITANIUM_CAPACITOR = new ItemStack[]{SupremeComponents.TITANIUM_PLATE.asQuantity(1),
      AURUM_CAPACITOR.asQuantity(1), SupremeComponents.TITANIUM_PLATE.asQuantity(1), SupremeComponents.TITANIUM_PLATE.asQuantity(1),
      SupremeCoreAlloy.RESOURCE_CORE_REDSTONE.asQuantity(1), SupremeComponents.TITANIUM_PLATE.asQuantity(1), SupremeComponents.STAINLESS_MACHINE.asQuantity(1),
      AURUM_CAPACITOR.asQuantity(1), SupremeComponents.STAINLESS_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack ADAMANTIUM_CAPACITOR = new SupremeItemStack("SUPREME_ADAMANTIUM_CAPACITOR",
      "9ac52419b99025828c89fa825945e6948e45bb5a22e4425a59e9096e4c1ac38", false,
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR), UtilEnergy.energyCapacity(Supreme.getSupremePowerSection().getCapacitorAdamantiumCapacity()));
  public static final ItemStack[] MACHINE_ADAMANTIUM_CAPACITOR = new ItemStack[]{SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1),
      TITANIUM_CAPACITOR.asQuantity(1), SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1), SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1),
      SupremeCoreAlloy.RESOURCE_CORE_EMERALD.asQuantity(1), SupremeComponents.ADAMANTIUM_PLATE.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1),
      TITANIUM_CAPACITOR.asQuantity(1), SupremeComponents.CONVEYANCE_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack THORNIUM_CAPACITOR = new SupremeItemStack("SUPREME_THORNIUM_CAPACITOR",
      "9aab01a5d9512e3175bf3af2edbfd59419dc5662605c42c91730e711254efcc4", false,
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR), UtilEnergy.energyCapacity(Supreme.getSupremePowerSection().getCapacitorThorniumCapacity()));
  public static final ItemStack[] MACHINE_THORNIUM_CAPACITOR = new ItemStack[]{SupremeComponents.THORNIUM_ENERGIZED.asQuantity(1),
      ADAMANTIUM_CAPACITOR.asQuantity(1), SupremeComponents.THORNIUM_ENERGIZED.asQuantity(1), SupremeComponents.THORNIUM_ENERGIZED.asQuantity(1),
      SupremeCetrus.CETRUS_LUMIUM.asQuantity(1), SupremeComponents.THORNIUM_ENERGIZED.asQuantity(1), SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1),
      ADAMANTIUM_CAPACITOR.asQuantity(1), SupremeComponents.CRYSTALLIZER_MACHINE.asQuantity(1)};

  public static final SlimefunItemStack SUPREME_CAPACITOR = new SupremeItemStack("SUPREME_SUPREME_CAPACITOR",
      "77400ea19dbd84f75c39ad6823ac4ef786f39f48fc6f84602366ac29b837422", false,
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR), UtilEnergy.energyCapacity(null));
  public static final ItemStack[] MACHINE_SUPREME_CAPACITOR = new ItemStack[]{SupremeComponents.SUPREME.asQuantity(1),
      THORNIUM_CAPACITOR.asQuantity(1), SupremeComponents.SUPREME.asQuantity(1), SupremeComponents.SUPREME.asQuantity(1), SupremeCetrus.CETRUS_LUMIUM.asQuantity(1),
      SupremeComponents.SUPREME.asQuantity(1), SupremeComponents.THORNERITE.asQuantity(1), THORNIUM_CAPACITOR.asQuantity(1), SupremeComponents.THORNERITE.asQuantity(1)};
}
