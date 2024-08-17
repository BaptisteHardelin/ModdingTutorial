package fr.babaprog.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static fr.babaprog.tutorialmod.TutorialMod.MOD_ID;

public class ModItems {

    // Tell to Minecraft make shure that these exist in the game
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite", () -> new Item(new Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite", () -> new Item(new Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
