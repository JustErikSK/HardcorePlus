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
        if (entity.getType() == EntityType.WITHER ||
            entity.getType() == EntityType.DROWNED ||
            entity.getType() == EntityType.EVOKER ||
            entity.getType() == EntityType.PHANTOM ||
            entity.getType() == EntityType.WITHER_SKELETON ||
            entity.getType() == EntityType.SHULKER ||
            entity.getType() == EntityType.CREEPER ||
            entity.getType() == EntityType.SKELETON ||
            entity.getType() == EntityType.BLAZE ||
            entity.getType() == EntityType.ELDER_GUARDIAN ||
            entity.getType() == EntityType.VINDICATOR ||
            entity.getType() == EntityType.WITCH ||
            entity.getType() == EntityType.SLIME){

            int number = random.nextInt(100);
            if (number > 60) {
                event.getDrops().clear();
            }
        }
    }
}