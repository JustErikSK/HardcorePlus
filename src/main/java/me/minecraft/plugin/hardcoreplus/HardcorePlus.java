package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class HardcorePlus extends JavaPlugin {

    public void onEnable() {
        if (!this.getServer().isHardcore()) {
            Bukkit.broadcastMessage(ChatColor.YELLOW + "To use HardcorePlus plugin please enable hardcore in server.properties and restart your server.");
            this.getServer().getPluginManager().disablePlugin(this);
        } else {
            Bukkit.broadcastMessage(ChatColor.GREEN + this.getName() + " >> Plugin has been enabled!");
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
        }
    }

    public void onDisable() {
        Bukkit.broadcastMessage(ChatColor.RED + this.getName() + " >> Plugin has been disabled!");
    }
}
