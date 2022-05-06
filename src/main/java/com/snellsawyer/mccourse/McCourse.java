package com.snellsawyer.mccourse;

import com.snellsawyer.mccourse.block.ModBlocks;
import com.snellsawyer.mccourse.item.ModItems;
import com.snellsawyer.mccourse.util.Registration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(McCourse.MOD_ID)
public class McCourse<FMLInitializationEvent>
{
    public static final String MOD_ID = "mccourse";


    public static final ItemGroup COURSE_TAB = new ItemGroup("courseTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.OBSIDIAN_INGOT.get());
        }
    };

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public McCourse() {
        Registration.register();
        ModItems.register();
        ModBlocks.register();

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}
