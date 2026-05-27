package de.mete74_ay.tangerines.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import de.mete74_ay.tangerines.Tangerines;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item TANGERINE = registerItem("tangerine", Item::new);
    public static final Item CUT_TANGERINE = registerItem("cut_tangerine", Item::new);



    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Tangerines.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Tangerines.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Tangerines.LOGGER.info("Registering Mod Items for " + Tangerines.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(TANGERINE);
            output.accept(CUT_TANGERINE);
        });
    }
}