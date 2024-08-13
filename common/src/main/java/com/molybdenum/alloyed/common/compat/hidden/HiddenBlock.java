package com.molybdenum.alloyed.common.compat.hidden;

import org.lwjgl.system.NonnullDefault;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class HiddenBlock extends Block {

    public HiddenBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    @NonnullDefault
    public void fillItemCategory(CreativeModeTab pTab, NonNullList<ItemStack> pItems) {
        // Don't add the item to any item category - therefore making it hidden.
    }
}
