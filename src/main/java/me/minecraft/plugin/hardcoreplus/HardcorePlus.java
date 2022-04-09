package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Calendar;

public final class HardcorePlus extends JavaPlugin {

    public void onEnable() {
        if (!this.getServer().isHardcore()) {
            Bukkit.broadcastMessage(ChatColor.YELLOW + "To use HardcorePlus plugin please enable hardcore in server.properties and restart your server.");
            Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "CONSOLE ONLY : To use HardcorePlus plugin please enable hardcore in server.properties and restart your server.");
            this.getServer().getPluginManager().disablePlugin(this);
        } else {
            Bukkit.broadcastMessage(ChatColor.GREEN + this.getName() + " >> Plugin has been enabled!");
            Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "CONSOLE ONLY : " + this.getName() + " >> Plugin has been enabled!");
            this.getServer().getPluginManager().registerEvents(new PlayerMovementListener(), this);
            this.getServer().getPluginManager().registerEvents(new PlayerPickupItem(), this);
            this.getServer().getPluginManager().registerEvents(new ArmoredHostileMobs(), this);
            this.getServer().getPluginManager().registerEvents(new LostMinerals(), this);
            this.getServer().getPluginManager().registerEvents(new PlayerDisableSleep(), this);
            this.getServer().getPluginManager().registerEvents(new DisableMilkDrinking(), this);
            this.getServer().getPluginManager().registerEvents(new LifeDiamonds(), this);
            this.getServer().getPluginManager().registerEvents(new LessPassiveMobLoot(), this);
            this.getServer().getPluginManager().registerEvents(new MobBlocks(), this);
            this.getServer().getPluginManager().registerEvents(new DisableEating(), this);
            this.getServer().getPluginManager().registerEvents(new HarderLoot(), this);

            getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    for (Player player : getServer().getOnlinePlayers()) {
                        long time = player.getWorld().getTime();
                        if (time == 6000) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 160, 0));
                            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 160, 0));
                        } else if (time == 18000) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 200, 0));
                            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 280, 0));
                        } else {
                        }
                    }
                }
            }, 0L, 1L);
        }
    }

    public void onDisable() {
        Bukkit.broadcastMessage(ChatColor.RED + this.getName() + " >> Plugin has been disabled!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "CONSOLE ONLY : " + this.getName() + " >> Plugin has been disabled!");
    }
}
