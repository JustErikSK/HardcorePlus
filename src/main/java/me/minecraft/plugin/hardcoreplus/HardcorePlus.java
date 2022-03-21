package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public final class HardcorePlus extends JavaPlugin {

    @Override
    public void onEnable() {

        // Plugin startup logic
        Bukkit.broadcastMessage(ChatColor.GREEN + "Enabled " + this.getName());
        getServer().getPluginManager().registerEvents(new PlayerMovementListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerPickupItem(), this);
        getServer().getPluginManager().registerEvents(new ArmoredHostileMobs(), this);
        getServer().getPluginManager().registerEvents(new LostMinerals(), this);
        getServer().getPluginManager().registerEvents(new PlayerDisableSleep(), this);
        getServer().getPluginManager().registerEvents(new DisableMilkDrinking(), this);
        getServer().getPluginManager().registerEvents(new LifeDiamonds(), this);
        getServer().getPluginManager().registerEvents(new LessPassiveMobLoot(), this);
        getServer().getPluginManager().registerEvents(new MobBlocks(), this);
    }

    @Override
    public void onDisable() {

        // Plugin shutdown logic
        Bukkit.broadcastMessage(ChatColor.RED + "Disabled " + this.getName());
    }

}