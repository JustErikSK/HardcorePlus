package me.minecraft.plugin.hardcoreplus;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

public class HarderLoot implements Listener {

    @EventHandler
    public void onRareMobKill(EntityDeathEvent event) {
        LivingEntity entity = event.getEntity();
        Random random = new Random();
        if (entity.getType() == EntityType.WITHER || entity.getType() == EntityType.DROWNED ||
                entity.getType() == EntityType.EVOKER || entity.getType() == EntityType.PHANTOM ||
                entity.getType() == EntityType.WITHER_SKELETON) {
            int number = random.nextInt(11);
            if (number >= 5) {
                event.getDrops().clear();
            }
        }
    }
}