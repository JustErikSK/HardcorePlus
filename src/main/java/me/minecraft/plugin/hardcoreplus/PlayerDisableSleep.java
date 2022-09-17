package me.minecraft.plugin.hardcoreplus;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class PlayerDisableSleep implements Listener {

    @EventHandler
    public void onPlayerSleep(PlayerBedEnterEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();
        long time = world.getTime();
        if (time >= 1 && time <= 24000) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.GRAY + "You're not tired right now!");
        }
    }
}