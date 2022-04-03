package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RandomEffects implements Listener {

    @EventHandler
    public void onDayNightCycle(WorldEvent event) {
        World world = event.getWorld();
        long time = world.getTime();
        if (time == 18000) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 200, 0));
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 400, 0));
            }
        }
        if (time == 6000) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 0));
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 0));
            }
        }
    }
}
