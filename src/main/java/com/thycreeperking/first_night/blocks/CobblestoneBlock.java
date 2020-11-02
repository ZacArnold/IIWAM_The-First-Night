package com.thycreeperking.first_night.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CobblestoneBlock extends Block {

    //Block Properties
    public CobblestoneBlock() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(2.0f, 30.0f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
