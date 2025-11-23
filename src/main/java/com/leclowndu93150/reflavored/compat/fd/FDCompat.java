//package com.leclowndu93150.reflavored.compat.fd;
//
//import com.leclowndu93150.reflavored.RedwoodForest;
//import net.minecraft.world.item.BlockItem;
//import net.minecraft.world.level.block.SoundType;
//import net.minecraft.world.level.block.state.BlockBehaviour;
//import net.neoforged.bus.api.IEventBus;
//import net.neoforged.neoforge.registries.DeferredBlock;
//import net.neoforged.neoforge.registries.DeferredItem;
//import net.neoforged.neoforge.registries.DeferredRegister;
//import vectorwing.farmersdelight.common.block.CabinetBlock;
//
//public final class FDCompat {
//    private FDCompat() {}
//
//    public static final DeferredRegister.Blocks BLOCKS =
//            DeferredRegister.createBlocks(RedwoodForest.MODID);
//    public static final DeferredRegister.Items ITEMS =
//            DeferredRegister.createItems(RedwoodForest.MODID);
//
//    public static final DeferredBlock<CabinetBlock> REDWOOD_CABINET =
//            BLOCKS.register("redwood_cabinet",
//                    () -> new CabinetBlock(BlockBehaviour.Properties.of()
//                            .strength(2.5F)
//                            .sound(SoundType.WOOD)));
//
//    public static final DeferredItem<BlockItem> REDWOOD_CABINET_ITEM =
//            ITEMS.registerSimpleBlockItem("redwood_cabinet", REDWOOD_CABINET);
//
//    public static void init(IEventBus modBus) {
//        BLOCKS.register(modBus);
//        ITEMS.register(modBus);
//    }
//}
