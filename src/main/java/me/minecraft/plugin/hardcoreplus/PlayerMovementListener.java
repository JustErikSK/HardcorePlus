package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin;

public class PlayerMovementListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player p = event.getPlayer();
        Block b = p.getLocation().getBlock().getRelative(BlockFace.DOWN);
        int yAbovePlayer = 1;

        if (b.getType() == Material.CALCITE || b.getType() == Material.BLACKSTONE || b.getType() == Material.RED_SAND ||
            b.getType() == Material.BEACON || b.getType() == Material.RAW_IRON_BLOCK || b.getType() == Material.NETHERITE_BLOCK ||
            b.getType() == Material.CHISELED_POLISHED_BLACKSTONE || b.getType() == Material.SMOOTH_BASALT || b.getType() == Material.WARPED_STEM ||
            b.getType() == Material.CRIMSON_STEM || b.getType() == Material.TUFF || b.getType() == Material.COARSE_DIRT ||
            b.getType() == Material.BEDROCK || b.getType() == Material.DIRT_PATH || b.getType() == Material.TNT) {

            TNTPrimed tnt = p.getWorld().spawn(p.getLocation().add(0,yAbovePlayer,0), TNTPrimed.class);
            tnt.setFuseTicks(80);
        }
    }
}
