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
        // Hardcore is no longer needed to be enabled to use this plugin, this feature will be brought back via datapack for both singleplayer and multiplayer.

        // Plugin startup message.
        Bukkit.broadcastMessage(ChatColor.GREEN + this.getName() + " >> Plugin has been enabled!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "CONSOLE ONLY : " + this.getName() + " >> Plugin has been enabled!");
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

        // Scheduler for random effects
            getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    for (Player player : getServer().getOnlinePlayers()) {
                        Random random = new Random();
                        int number = random.nextInt(10);
                        long time = player.getWorld().getTime();

                        // If game time is at 6000 ticks, one of these noon effects will be applied to all players.
                        // 5 effects are good and other 5 are bad.
                        // Good effects have duration of 1200 ticks (1 minute) and amplifier of 1.
                        // Bad effects have duration of 300 ticks (15 seconds) and amplifier of 0.
                        if (time == 6000) {
                            if (number == 0) { // 0 = Regeneration
                                player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1200, 1));
                            } else if (number == 1) { // 1 = Slow Digging
                                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 300, 0));
                            } else if (number == 2) { // 2 = Speed
                                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 1));
                            } else if (number == 3) { // 3 = Poison
                                player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 300, 0));
                            } else if (number == 4) { // 4 = Fire Resistance
                                player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1200, 1));
                            } else if (number == 5) { // 5 = Unluck
                                player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 300, 0));
                            } else if (number == 6) { // 6 = Damage Resistance
                                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 1));
                            } else if (number == 7) { // 7 = Weakness
                                player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 300, 0));
                            } else if (number == 8) { // 8 = Jump Boost
                                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1200, 1));
                            } else { // 9 = Levitation
                                player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 300, 0));
                            }
                        }
                        // If game time is at 18000 ticks, one of these midnight effects will be applied to all players.
                        // 5 effects are good and other 5 are bad.
                        // Good effects have duration of 360 ticks (18 seconds) and amplifier of 0.
                        // Bad effects have duration of 600 ticks (30 seconds) and amplifier of 0.
                        else if (time == 18000) {
                            if (number == 0) { // 0 = Darkness
                                player.addPotionEffect(new PotionEffect(PotionEffectType.DARKNESS, 600, 0));
                            } else if (number == 1) { // 1 = Saturation
                                player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 360, 0));
                            } else if (number == 2) { // 2 = Nausea
                                player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 0));
                            } else if (number == 3) { // 3 = Fast Digging
                                player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 360, 0));
                            } else if (number == 4) { // 4 = Wither
                                player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 0));
                            } else if (number == 5) { // 5 = Health Boost
                                player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 360, 0));
                            } else if (number == 6) { // 6 = Blindness
                                player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 0));
                            } else if (number == 7) { // 7 = Strength
                                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 360, 0));
                            } else if (number == 8) { // 8 = Slow Digging
                                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 600, 0));
                            } else { // 9 = Night Vision
                                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 360, 0));
                            }
                        }
                    }
                }
            }, 0L, 1L);
        }
    //}

    public void onDisable() {
        // Plugin shutdown message.
        Bukkit.broadcastMessage(ChatColor.RED + this.getName() + " >> Plugin has been disabled!");
        Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "To enable HardcorePlus again, please use PluginManager.");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "CONSOLE ONLY : " + this.getName() + " >> Plugin has been disabled!");
    }
}
