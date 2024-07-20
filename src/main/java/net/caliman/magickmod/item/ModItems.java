package net.caliman.magickmod.item;

import net.caliman.magickmod.MagickMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagickMod.MOD_ID);

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICK_TAB)));

    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICK_TAB)));

    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICK_TAB)));

    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICK_TAB)));

    public static final RegistryObject<Item> MAGICK_DUST = ITEMS.register("magick_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICK_TAB)));

    public static final RegistryObject<Item> MAGICK_SHARD = ITEMS.register("magick_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICK_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
