package de.mete74_ay.tangerines.Creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;

import de.mete74_ay.tangerines.Tangerines;
import de.mete74_ay.tangerines.item.ModItems;
import de.mete74_ay.tangerines.block.ModBlocks;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab TANGERINES_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Tangerines.MOD_ID, "tangerine_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TANGERINE))
                    .title(Component.translatable("creativemodetab.tangerines.tangerines_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.TANGERINE);
                        output.accept(ModItems.CUT_TANGERINE);
                        output.accept(ModBlocks.TANGE_LOG);
                        output.accept(ModBlocks.TANGE_PLANKS);


                    }).build());


    public static void registerModCreativeModeTabs() {
        Tangerines.LOGGER.info("Registering Creative Mode Tabs for " + Tangerines.MOD_ID);
    }
}