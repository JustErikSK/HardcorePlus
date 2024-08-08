package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Random;

public class Teleporting implements Listener {

    @EventHandler // Chance to teleport the player a few blocks in any direction if specific block is mined
    public void onTeleport(BlockBreakEvent event) {
        Material block = event.getBlock().getType();
        Random random = new Random();
        Player player = event.getPlayer();

        if (block == Material.DIRT) {

            double currentX = player.getLocation().getX();
            double currentY = player.getLocation().getY();
            double currentZ = player.getLocation().getZ();
            World world = player.getWorld();

            int number = random.nextInt(100);
            if (number < 4) {
                double newX = currentX + 2;
                double newY = currentY + 2;
                double newZ = currentZ + 2;
                Location newLoc = new Location(world, newX, newY, newZ);
                player.teleport(newLoc);
            }
        }
    }
}
