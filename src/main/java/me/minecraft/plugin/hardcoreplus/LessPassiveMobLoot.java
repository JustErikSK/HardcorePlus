package me.minecraft.plugin.hardcoreplus;

import java.util.Random;
import org.bukkit.entity.Animals;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class LessPassiveMobLoot implements Listener {
    public LessPassiveMobLoot() {
    }

    @EventHandler
    public void onMobKill(EntityDeathEvent event) {
        LivingEntity entity = event.getEntity();
        Random random = new Random();
        if (entity instanceof Animals && (entity.getType() == EntityType.COW || entity.getType() == EntityType.MOOSHROOM ||
                entity.getType() == EntityType.SHEEP || entity.getType() == EntityType.CHICKEN || entity.getType() == EntityType.PIG ||
                entity.getType() == EntityType.COD || entity.getType() == EntityType.SALMON || entity.getType() == EntityType.RABBIT ||
                entity.getType() == EntityType.SQUID || entity.getType() == EntityType.GLOW_SQUID || entity.getType() == EntityType.DONKEY ||
                entity.getType() == EntityType.HORSE || entity.getType() == EntityType.MULE || entity.getType() == EntityType.LLAMA)) {
            int number = random.nextInt(100);
            if (number > 70) {
                event.getDrops().clear();
            }
        }
    }
}
