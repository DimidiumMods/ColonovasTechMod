package net.colonova.colonovastechmod.data;

import net.colonova.colonovastechmod.handler.registry.ItemRegistry;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider
{
    public RecipeGenerator(DataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(ItemRegistry.ALUMINIUM_BLOCK.get())
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ItemRegistry.ALUMINIUM_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ALUMINIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.COPPER_BLOCK.get())
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ItemRegistry.COPPER_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.COPPER_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.IRIDIUM_BLOCK.get())
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ItemRegistry.IRIDIUM_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.IRIDIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.LEAD_BLOCK.get())
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ItemRegistry.LEAD_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.LEAD_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.NICKEL_BLOCK.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.NICKEL_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.NICKEL_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.PLATINUM_BLOCK.get())
                .pattern("ppp")
                .pattern("ppp")
                .pattern("ppp")
                .define('p', ItemRegistry.PLATINUM_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.PLATINUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.SILVER_BLOCK.get())
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ItemRegistry.SILVER_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.SILVER_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.TIN_BLOCK.get())
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ItemRegistry.TIN_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.URANIUM_BLOCK.get())
                .pattern("uuu")
                .pattern("uuu")
                .pattern("uuu")
                .define('u', ItemRegistry.URANIUM_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.URANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.ALUMINIUM_GEAR.get())
                .pattern(" a ")
                .pattern("a a")
                .pattern(" a ")
                .define('a', ItemRegistry.ALUMINIUM_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ALUMINIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.COPPER_GEAR.get())
                .pattern(" c ")
                .pattern("c c")
                .pattern(" c ")
                .define('c', ItemRegistry.COPPER_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.COPPER_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.IRIDIUM_GEAR.get())
                .pattern(" i ")
                .pattern("i i")
                .pattern(" i ")
                .define('i', ItemRegistry.IRIDIUM_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.IRIDIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.LEAD_GEAR.get())
                .pattern(" l ")
                .pattern("l l")
                .pattern(" l ")
                .define('l', ItemRegistry.LEAD_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.LEAD_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.NICKEL_GEAR.get())
                .pattern(" n ")
                .pattern("n n")
                .pattern(" n ")
                .define('n', ItemRegistry.NICKEL_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.NICKEL_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.PLATINUM_GEAR.get())
                .pattern(" p ")
                .pattern("p p")
                .pattern(" p ")
                .define('p', ItemRegistry.PLATINUM_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.PLATINUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.SILVER_GEAR.get())
                .pattern(" s ")
                .pattern("s s")
                .pattern(" s ")
                .define('s', ItemRegistry.SILVER_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.SILVER_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.TIN_GEAR.get())
                .pattern(" t ")
                .pattern("t t")
                .pattern(" t ")
                .define('t', ItemRegistry.TIN_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("tin", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.URANIUM_GEAR.get())
                .pattern(" u ")
                .pattern("u u")
                .pattern(" u ")
                .define('u', ItemRegistry.URANIUM_INGOT.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.URANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.ALUMINIUM_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.ALUMINIUM_NUGGET.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ALUMINIUM_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.COPPER_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.COPPER_NUGGET.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.COPPER_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.IRIDIUM_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.IRIDIUM_NUGGET.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.IRIDIUM_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.LEAD_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.LEAD_NUGGET.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.LEAD_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.NICKEL_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.NICKEL_NUGGET.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.NICKEL_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.PLATINUM_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.PLATINUM_NUGGET.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.PLATINUM_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.SILVER_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.SILVER_NUGGET.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.SILVER_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.TIN_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.TIN_NUGGET.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.TIN_NUGGET.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ItemRegistry.URANIUM_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ItemRegistry.URANIUM_NUGGET.get())
                .group("colonovastechmod")
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.URANIUM_NUGGET.get()))
                .save(consumer);


        ShapelessRecipeBuilder.shapeless(ItemRegistry.ALUMINIUM_NUGGET.get(), 9)
                .requires(ItemRegistry.ALUMINIUM_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ALUMINIUM_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ItemRegistry.COPPER_NUGGET.get(), 9)
                .requires(ItemRegistry.COPPER_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.COPPER_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ItemRegistry.IRIDIUM_NUGGET.get(), 9)
                .requires(ItemRegistry.IRIDIUM_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.IRIDIUM_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ItemRegistry.LEAD_NUGGET.get(), 9)
                .requires(ItemRegistry.LEAD_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.LEAD_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ItemRegistry.NICKEL_NUGGET.get(), 9)
                .requires(ItemRegistry.NICKEL_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.NICKEL_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ItemRegistry.PLATINUM_NUGGET.get(), 9)
                .requires(ItemRegistry.PLATINUM_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.PLATINUM_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ItemRegistry.SILVER_NUGGET.get(), 9)
                .requires(ItemRegistry.SILVER_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.SILVER_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ItemRegistry.TIN_NUGGET.get(), 9)
                .requires(ItemRegistry.TIN_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.TIN_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ItemRegistry.URANIUM_NUGGET.get(), 9)
                .requires(ItemRegistry.URANIUM_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.URANIUM_NUGGET.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ItemRegistry.ALUMINIUM_INGOT.get(), 9)
                .requires(ItemRegistry.ALUMINIUM_BLOCK.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.ALUMINIUM_INGOT.get()))
                .save(consumer, "colonovastechmod:" + "aluminium_block_to_ingot");

        ShapelessRecipeBuilder.shapeless(ItemRegistry.COPPER_INGOT.get(), 9)
                .requires(ItemRegistry.COPPER_INGOT.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.COPPER_INGOT.get()))
                .save(consumer, "colonovastechmod:" + "copper_block_to_ingot");

        ShapelessRecipeBuilder.shapeless(ItemRegistry.IRIDIUM_INGOT.get(), 9)
                .requires(ItemRegistry.IRIDIUM_BLOCK.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.IRIDIUM_INGOT.get()))
                .save(consumer, "colonovastechmod:" + "iridium_block_to_ingot");

        ShapelessRecipeBuilder.shapeless(ItemRegistry.LEAD_INGOT.get(), 9)
                .requires(ItemRegistry.LEAD_BLOCK.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.LEAD_INGOT.get()))
                .save(consumer, "colonovastechmod:" + "lead_block_to_ingot");

        ShapelessRecipeBuilder.shapeless(ItemRegistry.NICKEL_INGOT.get(), 9)
                .requires(ItemRegistry.NICKEL_BLOCK.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.NICKEL_INGOT.get()))
                .save(consumer, "colonovastechmod:" + "nickel_block_to_ingot");

        ShapelessRecipeBuilder.shapeless(ItemRegistry.PLATINUM_INGOT.get(), 9)
                .requires(ItemRegistry.PLATINUM_BLOCK.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.PLATINUM_INGOT.get()))
                .save(consumer, "colonovastechmod:" + "platinum_block_to_ingot");

        ShapelessRecipeBuilder.shapeless(ItemRegistry.SILVER_INGOT.get(), 9)
                .requires(ItemRegistry.SILVER_BLOCK.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.SILVER_INGOT.get()))
                .save(consumer, "colonovastechmod:" + "silver_block_to_ingot");

        ShapelessRecipeBuilder.shapeless(ItemRegistry.TIN_INGOT.get(), 9)
                .requires(ItemRegistry.TIN_BLOCK.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.TIN_INGOT.get()))
                .save(consumer, "colonovastechmod:" + "tin_block_to_ingot");

        ShapelessRecipeBuilder.shapeless(ItemRegistry.URANIUM_INGOT.get(), 9)
                .requires(ItemRegistry.URANIUM_BLOCK.get())
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistry.URANIUM_INGOT.get()))
                .save(consumer, "colonovastechmod:" + "uranium_block_to_ingot");

        /* Smelting */

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.ALUMINIUM_ORE.get()), ItemRegistry.ALUMINIUM_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.ALUMINIUM_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "aluminium_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.COPPER_ORE.get()), ItemRegistry.COPPER_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.COPPER_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "copper_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.IRIDIUM_ORE.get()), ItemRegistry.IRIDIUM_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.IRIDIUM_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "iridium_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.LEAD_ORE.get()), ItemRegistry.LEAD_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.LEAD_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "lead_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.NICKEL_ORE.get()), ItemRegistry.NICKEL_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.NICKEL_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "nickel_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.PLATINUM_ORE.get()), ItemRegistry.PLATINUM_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.PLATINUM_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "platinum_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.SILVER_ORE.get()), ItemRegistry.SILVER_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.SILVER_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "silver_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.TIN_ORE.get()), ItemRegistry.TIN_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.TIN_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "tin_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.URANIUM_ORE.get()), ItemRegistry.URANIUM_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.URANIUM_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "uranium_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.DEEP_SLATE_ALUMINIUM_ORE.get()), ItemRegistry.ALUMINIUM_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.DEEP_SLATE_ALUMINIUM_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "deepslate_aluminium_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.DEEP_SLATE_COPPER_ORE.get()), ItemRegistry.COPPER_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.DEEP_SLATE_COPPER_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "deepslate_copper_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.DEEP_SLATE_IRIDIUM_ORE.get()), ItemRegistry.IRIDIUM_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.DEEP_SLATE_IRIDIUM_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "deepslate_iridium_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.DEEP_SLATE_LEAD_ORE.get()), ItemRegistry.LEAD_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.DEEP_SLATE_LEAD_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "deepslate_lead_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.DEEP_SLATE_NICKEL_ORE.get()), ItemRegistry.NICKEL_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.DEEP_SLATE_NICKEL_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "deepslate_nickel_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.DEEP_SLATE_PLATINUM_ORE.get()), ItemRegistry.PLATINUM_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.DEEP_SLATE_PLATINUM_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "deepslate_platinum_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.DEEP_SLATE_SILVER_ORE.get()), ItemRegistry.SILVER_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.DEEP_SLATE_SILVER_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "deepslate_silver_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.DEEP_SLATE_TIN_ORE.get()), ItemRegistry.TIN_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.DEEP_SLATE_TIN_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "deepslate_tin_ingot_smelted");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.DEEP_SLATE_URANIUM_ORE.get()), ItemRegistry.URANIUM_INGOT.get(), 1.0F, 100)
                .unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegistry.DEEP_SLATE_URANIUM_ORE.get()).build()))
                .save(consumer, "colonovastechmod:" + "deepslate_uranium_ingot_smelted");
    }
}
