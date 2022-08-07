package net.griffon.dde.item;

import net.griffon.dde.DeepDarkExpansion;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DeepDarkExpansion.MOD_ID);

    public static final RegistryObject<Item> SCULKITE = ITEMS.register("sculkite",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> RAW_SCULKITE = ITEMS.register("raw_sculkite",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
