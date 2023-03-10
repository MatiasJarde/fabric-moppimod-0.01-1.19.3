package net.moppi.moppimod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.moppi.moppimod.block.ModBlocks;
import net.moppi.moppimod.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CITRINE_BLOCK);
        addDrop(ModBlocks.RED_MAPLE_WOOD);
        addDrop(ModBlocks.RED_MAPLE_LOG);
        addDrop(ModBlocks.RED_MAPLE_PLANKS);
        addDrop(ModBlocks.STRIPPED_RED_MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_RED_MAPLE_LOG);
        addDrop(ModBlocks.RED_MAPLE_SAPLING);


        addDrop(ModBlocks.CITRINE_ORE, oreDrops(ModBlocks.CITRINE_ORE, ModItems.RAW_CITRINE));
        addDrop(ModBlocks.DEEPSLATE_CITRINE_ORE, oreDrops(ModBlocks.DEEPSLATE_CITRINE_ORE, ModItems.RAW_CITRINE));
    }
}
