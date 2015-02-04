package com.neveagleson.ecocraft.core.fluids;

import com.neveagleson.ecocraft.core.blocks.BaseFluidBlock;
import com.neveagleson.ecocraft.core.items.BaseBucket;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by NevEagleson on 4/02/2015
 */
public class BucketHandler
{
    private Map<Block,Item> buckets = new HashMap<Block,Item>();

    private static final int FLUID_SOURCE = 0;

    public static BucketHandler instance = new BucketHandler();

    private BucketHandler()
    {
        if(instance != null) throw new IllegalArgumentException();
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static void registerBucket(Block fluid, Item bucket)
    {
        instance.buckets.put(fluid,bucket);
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onBucketFill(FillBucketEvent event)
    {
        ItemStack result = fillCustomBucket(event.world, event.target);
        if(result == null) return;
        event.result = result;
        event.setResult(Event.Result.ALLOW);
    }

    private ItemStack fillCustomBucket(World world, MovingObjectPosition pos)
    {
        Block block = world.getBlock(pos.blockX,pos.blockY,pos.blockZ);
        Item bucket = buckets.get(block);
        if(bucket != null && world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == FLUID_SOURCE)
        {
            world.setBlockToAir(pos.blockX, pos.blockY, pos.blockZ);
            return new ItemStack(bucket);
        }
        return null;
    }

}
