package net.toasterkit.vongolaringmod.item;

import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.toasterkit.vongolaringmod.VongolaRingMod;
import net.toasterkit.vongolaringmod.item.custom.FuelItem;
import net.toasterkit.vongolaringmod.item.custom.MetalDetectorItem;
import net.toasterkit.vongolaringmod.item.custom.SkyRingItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VongolaRingMod.MODID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(),400));

    public static final RegistryObject<Item> VONGOLA_SKY_RING = ITEMS.register("sky_vongola_ring",
            () -> new FlintAndSteelItem(new Item.Properties().durability(100)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
