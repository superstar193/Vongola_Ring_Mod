package net.toasterkit.vongolaringmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.toasterkit.vongolaringmod.VongolaRingMod;
import net.toasterkit.vongolaringmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VongolaRingMod.MODID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.RAW_SAPPHIRE.get());

                        output.accept(ModItems.METAL_DETECTOR.get());

                        output.accept(ModItems.STRAWBERRY.get());
                        output.accept(ModItems.PINE_CONE.get());

                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        output.accept(ModBlocks.SOUND_BLOCK.get());

                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.END_SAPPHIRE_ORE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> V_Ring_TAB = CREATIVE_MODE_TABS.register("v_ring_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VONGOLA_SKY_RING.get()))
                    .title(Component.translatable("creativetab.v_ring_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.VONGOLA_SKY_RING.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
