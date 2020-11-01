package com.thycreeperking.first_night.items;

import com.thycreeperking.first_night.first_night;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(first_night.FIRST_NIGHT_TAB));
    }
}
