package com.snellsawyer.mccourse.item;

import com.snellsawyer.mccourse.McCourse;
import com.snellsawyer.mccourse.util.Registration;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems
{
    public static final RegistryObject<Item> OBSIDIAN_INGOT =
            Registration.ITEMS.register("obsidian_ingot",
        () -> new Item(new Item.Properties().group(McCourse.COURSE_TAB)));

    public static final RegistryObject<Item> OBSIDIAN_APPLE =
            Registration.ITEMS.register("obsidian_apple",
                    () -> new ObsidianApple());



    /* TOOLS */

    public static final RegistryObject<Item> OBSIDIAN_SWORD =
            Registration.ITEMS.register("obsidian_sword",
                    () -> new SwordItem(ModItemTier.OBSIDIAN, 7, -2.25f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .group(McCourse.COURSE_TAB)));

    public static final RegistryObject<Item> OBSIDIAN_AXE =
            Registration.ITEMS.register("obsidian_axe",
                    () -> new AxeItem(ModItemTier.OBSIDIAN, 6f, 0f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.AXE,4)
                                    .group(McCourse.COURSE_TAB)));

    public static final RegistryObject<Item> OBSIDIAN_PICKAXE =
            Registration.ITEMS.register("obsidian_pickaxe",
                    () -> new PickaxeItem(ModItemTier.OBSIDIAN, 2, 0f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.PICKAXE,4)
                                    .group(McCourse.COURSE_TAB)));

    public static final RegistryObject<Item> OBSIDIAN_SHOVEL =
            Registration.ITEMS.register("obsidian_shovel",
                    () -> new ShovelItem(ModItemTier.OBSIDIAN, 0f, 0f,
                            new Item.Properties()
                                    .defaultMaxDamage(600)
                                    .addToolType(ToolType.SHOVEL,4)
                                    .group(McCourse.COURSE_TAB)));

    public static final RegistryObject<Item> OBSIDIAN_HOE =
            Registration.ITEMS.register("obsidian_hoe",
                    () -> new HoeItem(ModItemTier.OBSIDIAN, 0, 0f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.HOE,4)
                                    .group(McCourse.COURSE_TAB)));



    public static void register() { }

    public enum ModItemTier implements IItemTier
    {


        OBSIDIAN(2,200,2.5f,0f,15,
            Ingredient.fromStacks(new ItemStack(ModItems.OBSIDIAN_INGOT.get())));
        private final int harvestlevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Ingredient repairMaterial;

        ModItemTier(int harvestlevel, int maxUses, float efficiency, float attackDamage, int enchantability, Ingredient repairMaterial) {
            this.harvestlevel = harvestlevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = repairMaterial;
        }

        @Override
        public int getMaxUses() {
            return harvestlevel;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return harvestlevel;
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }
    }
}
