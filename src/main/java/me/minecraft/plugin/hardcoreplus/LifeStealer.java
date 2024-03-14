package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import java.util.Random;

public class LifeStealer implements Listener {

    @EventHandler
    public void onLifeStealer(BlockBreakEvent event) {
        Material block = event.getBlock().getType();
        Random random = new Random();
        Player player = event.getPlayer();

        if (block == Material.DIRT) {
            int number = random.nextInt(100);
            if (number > 50) {

            }
        }
    }
}
