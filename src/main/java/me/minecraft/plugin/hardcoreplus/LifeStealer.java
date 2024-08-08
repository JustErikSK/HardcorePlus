package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Objects;
import java.util.Random;

public class LifeStealer implements Listener {

    @EventHandler // Life stealing from blocks - in testing
    public void onLifeStealer(BlockBreakEvent event) {
        Material block = event.getBlock().getType();
        Random random = new Random();
        Player player = event.getPlayer();

        if (block == Material.DIRT) {

            double currentHealth = player.getHealth();
            double maxHealth = Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).getBaseValue();

            int number = random.nextInt(100);
            if (number > 50 && currentHealth >= 4 && maxHealth >= 4) {
                double newMaxHealth = maxHealth - 2;
                Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(newMaxHealth);
                player.setHealth(newMaxHealth);
            }
            else if (number < 50 && maxHealth <= 38) {
                double newMaxHealth = maxHealth + 2;
                Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(newMaxHealth);
                player.setHealth(newMaxHealth);
            }
        }
    }
    @EventHandler // Life stealing from passive mobs - in testing (player attribute not working yet)
    public void onMobLifeStealer(EntityDeathEvent event) {
        LivingEntity entity = event.getEntity();
        EntityType ent = event.getEntity().getType();
        Random random = new Random();

        double currentHealth = player.getHealth();
        double maxHealth = Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).getBaseValue();

        if (entity instanceof Player) {
            if (ent == EntityType.COW) {
                int number = random.nextInt(100);
                if (number > 50 && currentHealth >= 4 && maxHealth >= 4) {
                    double newMaxHealth = maxHealth - 2;
                    Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(newMaxHealth);
                    player.setHealth(newMaxHealth);
                }
                else if (number < 50 && maxHealth <= 38) {
                    double newMaxHealth = maxHealth + 2;
                    Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(newMaxHealth);
                    player.setHealth(newMaxHealth);
                }
            }
        }
    }
}
