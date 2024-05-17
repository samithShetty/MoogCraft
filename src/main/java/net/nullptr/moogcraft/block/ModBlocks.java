package net.nullptr.moogcraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlimeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nullptr.moogcraft.MoogCraft;

public class ModBlocks {
    public static final Block MOOGNIUM_BLOCK = registerBlock("moognium_block", new SlimeBlock(AbstractBlock.Settings.create()));
    
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MoogCraft.MOD_ID, name), block);     
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MoogCraft.MOD_ID, name), new BlockItem(block, new Item.Settings()));     
    }

    public static void registerModBlocks() {
        MoogCraft.LOGGER.info("Registering Blocks for: " + MoogCraft.MOD_ID);
    }
}
