package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Random;

public class LifeDiamonds implements Listener {
// rework is needed - change to player.maxhealth and write a message in chat or on screen if the player already has 3 hearts as maximum
// chance to lose a half a heart or full heart but also gain
    @EventHandler
    public void onLifeDiamonds(BlockBreakEvent event) {
        Material block = event.getBlock().getType();
        Random random = new Random();
        Player player = event.getPlayer();
        if (block == Material.DIAMOND_ORE || block == Material.DEEPSLATE_DIAMOND_ORE) {
            int number = random.nextInt(100);
            if (number > 80) {
                player.damage(2);
            }
        }
    }
}
