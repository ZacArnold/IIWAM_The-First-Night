package com.thycreeperking.first_night.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CobbBlock extends Block {

    //Block Properties
    public CobbBlock(Properties Properties) {
        super(Block.Properties.create(Material.EARTH)
                .hardnessAndResistance(1.0f, 4.0f)
                .sound(SoundType.GROUND)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL)
        );
    }
}