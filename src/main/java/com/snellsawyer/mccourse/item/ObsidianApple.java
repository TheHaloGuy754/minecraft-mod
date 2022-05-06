package com.snellsawyer.mccourse.item;

import com.snellsawyer.mccourse.McCourse;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class    ObsidianApple extends Item
{
    public ObsidianApple()
    {
        super(new Properties().group(McCourse.COURSE_TAB)
                .food(new Food.Builder().hunger(5)
                        .saturation(1.5f)
                        .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 3000, 1), 1f)
                        .effect(() -> new EffectInstance(Effects.ABSORPTION, 3000, 1), 1f)
                        .effect(() -> new EffectInstance(Effects.REGENERATION, 300, 1), 1f)
                        .effect(() -> new EffectInstance(Effects.STRENGTH, 3000, 3), 1f)
                        .effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 3000, 5), 1f)
                        .effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 1, 5), 1f)
                        .build()));
    }
}
