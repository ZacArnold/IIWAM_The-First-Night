package com.thycreeperking.first_night.blocks;

import com.thycreeperking.first_night.first_night;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(first_night.FIRST_NIGHT_TAB));
    }
}
