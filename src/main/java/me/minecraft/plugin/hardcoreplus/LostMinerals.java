package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Random;

public class LostMinerals implements Listener {

    @EventHandler
    public void onBlockDestroy(BlockBreakEvent event) {
        Material block = event.getBlock().getType();
        Random random = new Random();
        if (block == Material.DIAMOND_ORE || block == Material.DEEPSLATE_DIAMOND_ORE ||
                block == Material.EMERALD_ORE || block == Material.DEEPSLATE_EMERALD_ORE ||
                block == Material.IRON_ORE || block == Material.DEEPSLATE_IRON_ORE ||
                block == Material.GOLD_ORE || block == Material.DEEPSLATE_GOLD_ORE ||
                block == Material.LAPIS_ORE || block == Material.DEEPSLATE_LAPIS_ORE ||
                block == Material.COAL_ORE || block == Material.DEEPSLATE_COAL_ORE ||
                block == Material.REDSTONE_ORE || block == Material.DEEPSLATE_REDSTONE_ORE ||
                block == Material.COPPER_ORE || block == Material.DEEPSLATE_COPPER_ORE ||
                block == Material.NETHER_QUARTZ_ORE || block == Material.NETHER_GOLD_ORE) {
            int number = random.nextInt(11);
            if (number >= 8) {
                event.setDropItems(false);
            }
        }
    }
}
