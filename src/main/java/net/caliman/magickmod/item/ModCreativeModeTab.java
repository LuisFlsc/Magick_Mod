package net.caliman.magickmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAGICK_TAB = new CreativeModeTab("magicktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MAGICK_DUST.get());
        }
    };

}
