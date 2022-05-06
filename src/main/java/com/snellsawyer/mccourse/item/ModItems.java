package com.snellsawyer.mccourse.item;

import com.snellsawyer.mccourse.McCourse;
import com.snellsawyer.mccourse.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems
{
    public static final RegistryObject<Item> OBSIDIAN_INGOT =
            Registration.ITEMS.register("obsidian_ingot",
        () -> new Item(new Item.Properties().group(McCourse.COURSE_TAB)));

    public static final RegistryObject<Item> OBSIDIAN_APPLE =
            Registration.ITEMS.register("obsidian_apple",
                    () -> new ObsidianApple());

    public static void register() { }
}
