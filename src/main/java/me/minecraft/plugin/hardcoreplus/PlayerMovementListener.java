package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.entity.Entity;

public class PlayerMovementListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player p = event.getPlayer();
        Block b = p.getLocation().getBlock().getRelative(BlockFace.DOWN);
        int yAbovePlayer = 1;
        if (b.getType() == Material.CALCITE) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.BLACKSTONE) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.RED_SAND) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.BEACON) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.RAW_IRON_BLOCK) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.NETHERITE_BLOCK) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.CHISELED_POLISHED_BLACKSTONE) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.SMOOTH_BASALT) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.WARPED_STEM) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.CRIMSON_STEM) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.TUFF) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.COARSE_DIRT) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        } else if (b.getType() == Material.BEDROCK) {
            Entity tnt = p.getWorld().spawnEntity(p.getLocation().add(0, yAbovePlayer, 0), EntityType.PRIMED_TNT);
        }
    }
}
