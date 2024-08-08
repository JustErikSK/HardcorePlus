package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.util.Random;

public final class HardcorePlus extends JavaPlugin {

    public void onEnable() {
        // Hardcore is no longer needed to be enabled to use this plugin

        // Plugin startup message.
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + " HardcorePlus >> Plugin has been enabled!");
        // Class Handler
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
        this.getServer().getPluginManager().registerEvents(new LifeStealer(), this);
        this.getServer().getPluginManager().registerEvents(new Teleporting(), this);

        // Scheduler for random effects
            getServer().getScheduler().scheduleSyncRepeatingTask(this, () -> {
                for (Player player : getServer().getOnlinePlayers()) {
                    Random random = new Random();
                    int number = random.nextInt(4);
                    long time = player.getWorld().getTime();

                    // If the game time is at 6000 ticks, one of these effects will be applied to all players.
                    // Good effects have a duration of 200 ticks (10 seconds) or 500 ticks (25 seconds) and amplifier of 0.
                    if (time == 6000) {
                        if (number == 0) { // RANDOM NUMBER 0 = MINING FATIGUE
                            player.addPotionEffect(new PotionEffect(PotionEffectType.MINING_FATIGUE, 500, 0));
                        } else if (number == 1) { // RANDOM NUMBER 1 = POISON
                            player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 0));
                        } else if (number == 2) { // RANDOM NUMBER 2 = WEAKNESS
                            player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 500, 0));
                        } else { // RANDOM NUMBER 3 = LEVITATION
                            player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 200, 0));
                        }
                    }
                    // If the game time is at 18000 ticks, one of these effects will be applied to all players.
                    // Bad effects have duration of 300 ticks (15 seconds) or 600 ticks (30 seconds) and amplifier of 0.
                    else if (time == 18000) {
                        if (number == 0) { // RANDOM NUMBER 0 = DARKNESS
                            player.addPotionEffect(new PotionEffect(PotionEffectType.DARKNESS, 600, 0));
                        } else if (number == 1) { // RANDOM NUMBER 1 = NAUSEA
                            player.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 300, 0));
                        } else if (number == 2) { // RANDOM NUMBER 2 = WITHER
                            player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 300, 0));
                        } else { // RANDOM NUMBER 3 = BLINDNESS
                            player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 0));
                        }
                    }
                }
            }, 0L, 1L);
        }
    //}

    public void onDisable() {
        // Plugin shutdown message.
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + " HardcorePlus >> Plugin has been disabled!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "To enable HardcorePlus again, please use PluginManager or restart the server.");
    }
}
