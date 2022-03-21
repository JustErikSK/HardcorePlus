package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Objects;
import java.util.Random;

public class MobBlocks implements Listener {

    @EventHandler
    public void onBlockDestroy(BlockBreakEvent event) {
        Material block = event.getBlock().getType();
        Random random = new Random();
        Player player = event.getPlayer();
        Location loc = player.getLocation();
        int number15;
        if (block == Material.OBSIDIAN) {
            number15 = random.nextInt(20);
            if (number15 >= 16) {
                this.spawnCreature1(loc);
            }
        }
        if (block == Material.DRIPSTONE_BLOCK) {
            number15 = random.nextInt(20);
            if (number15 >= 16) {
                this.spawnCreature2(loc);
            }
        }
        if (block == Material.DIORITE) {
            number15 = random.nextInt(16);
            if (number15 >= 13) {
                this.spawnCreature3(loc);
            }
        }
        if (block == Material.IRON_ORE || block == Material.DEEPSLATE_IRON_ORE) {
            number15 = random.nextInt(20);
            if (number15 >= 16) {
                this.spawnCreature4(loc);
            }
        }
        if (block == Material.ANCIENT_DEBRIS) {
            number15 = random.nextInt(40);
            if (number15 >= 35) {
                this.spawnCreature5(loc);
            }
        }
    }
    private void spawnCreature1(Location loc) {
        ((World) Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.PHANTOM);
    }
    private void spawnCreature2(Location loc) {
        ((World)Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.SILVERFISH);
    }
    private void spawnCreature3(Location loc) {
        ((World)Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.VEX);
    }
    private void spawnCreature4(Location loc) {
        ((World)Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.DROWNED);
    }
    private void spawnCreature5(Location loc) {
        ((World)Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.WITHER);
    }
}