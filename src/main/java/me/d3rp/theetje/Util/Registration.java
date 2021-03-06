package me.d3rp.theetje.Util;

import me.d3rp.theetje.Setup.ModItems;
import me.d3rp.theetje.Setup.ModBlocks;
import me.d3rp.theetje.Theetje;
import me.d3rp.theetje.World.gen.OreGeneration;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Theetje.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Theetje.MOD_ID);


    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        ModBlocks.Register();
        ModItems.Register();

    }
}
