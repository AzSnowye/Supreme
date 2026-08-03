package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.RegisterItem.registerCoreFabricator;

import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.resource.core.SupremeCoreColor;
import com.github.relativobr.supreme.resource.core.SupremeCoreDeath;
import com.github.relativobr.supreme.resource.core.SupremeCoreLife;
import com.github.relativobr.supreme.resource.core.SupremeCoreNature;

public class SetupResourceCore {

  public static void setup(Supreme sup) {

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_STONE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_STONE));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_GRANITE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRANITE));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_DIORITE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_DIORITE));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_ANDESITE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ANDESITE));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_GRAVEL.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRAVEL));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_SAND.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SAND));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_ENDSTONE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ENDSTONE));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_CLAY.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_CLAY));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_SNOW.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SNOW));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_PORKCHOP.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_PORKCHOP));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_BEEF.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_BEEF));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_MUTTON.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_MUTTON));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_CHICKEN.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_CHICKEN));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_SALMON.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SALMON));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_COD.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_COD));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_STRING.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_STRING));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_SPIDER_EYE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SPIDER_EYE));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_TEAR.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_TEAR));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_POTATO.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_POTATO));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_APPLE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_APPLE));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_BEETROOT.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_BEETROOT));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_WHEAT.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_WHEAT));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_SUGAR_CANE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SUGAR_CANE));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_SWEET_BERRIES.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SWEET_BERRIES));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_MELON.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_MELON));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_CARROT.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_CARROT));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_PUMPKIN.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_PUMPKIN));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_RED.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_RED));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_YELLOW.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_YELLOW));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_PURPLE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PURPLE));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_BLUE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLUE));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_BLACK.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLACK));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_GREEN.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GREEN));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_PINK.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PINK));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_GRAY.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GRAY));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_CYAN.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_CYAN));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_OAK_LOG.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_OAK_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_SPRUCE_LOG.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_SPRUCE_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_BIRCH_LOG.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_BIRCH_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_JUNGLE_LOG.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_JUNGLE_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_ACACIA_LOG.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_ACACIA_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_DARK_OAK_LOG.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_DARK_OAK_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_CRIMSON_STEM.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_CRIMSON_STEM));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_WARPED_STEM.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WARPED_STEM));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_WITHER_ROSE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WITHER_ROSE));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_COAL.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_COAL));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_IRON.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_IRON));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_GOLD.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_GOLD));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_REDSTONE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_REDSTONE));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_LAPIS.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_LAPIS));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_DIAMOND));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_EMERALD.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_EMERALD));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_QUARTZ.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_QUARTZ));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_NETHERITE.asQuantity(1),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_NETHERITE));

  }

}
