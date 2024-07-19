package me.minecraft.plugin.hardcoreplus;

import java.util.Objects;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class ArmoredHostileMobs implements Listener {
// Add more mobs
    @EventHandler
    public void onMobSpawn(CreatureSpawnEvent event) {
        LivingEntity entity = event.getEntity();
        ItemStack bow = new ItemStack(Material.BOW);
        ItemStack gold_sword = new ItemStack(Material.GOLDEN_SWORD);
        ItemStack dia_sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemStack iron_sword = new ItemStack(Material.IRON_SWORD);
        ItemStack dia_axe = new ItemStack(Material.DIAMOND_AXE);
        ItemStack crossbow = new ItemStack(Material.CROSSBOW);
        Random random = new Random();

        if (entity instanceof Monster) {
            if (entity.getType() == EntityType.SKELETON) {
                bow.addEnchantment(Enchantment.POWER, 5);
                bow.addEnchantment(Enchantment.FLAME, 1);
                bow.addEnchantment(Enchantment.PUNCH, 2);

                (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(bow);
                entity.getEquipment().setBoots(new ItemStack(Material.IRON_BOOTS));
                entity.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
                entity.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
                entity.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
            }
            else if (entity.getType() == EntityType.ZOMBIE) {
                gold_sword.addEnchantment(Enchantment.SHARPNESS, 4);
                gold_sword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                gold_sword.addEnchantment(Enchantment.KNOCKBACK, 2);

                (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(gold_sword);
                entity.getEquipment().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
                entity.getEquipment().setLeggings(new ItemStack(Material.GOLDEN_LEGGINGS));
                entity.getEquipment().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
                entity.getEquipment().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
            }
            else if (entity.getType() == EntityType.WITHER_SKELETON) {
                dia_sword.addEnchantment(Enchantment.SHARPNESS, 3);
                dia_sword.addEnchantment(Enchantment.FIRE_ASPECT, 1);
                dia_sword.addEnchantment(Enchantment.KNOCKBACK, 2);

                (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(dia_sword);
                ItemStack iron_helm = new ItemStack(Material.IRON_HELMET);
                iron_helm.addEnchantment(Enchantment.PROTECTION, 3);
                iron_helm.addEnchantment(Enchantment.PROJECTILE_PROTECTION, 3);
                entity.getEquipment().setHelmet(new ItemStack(iron_helm));
            }
            else if (entity.getType() == EntityType.CREEPER) {
                Creeper creeper = (Creeper)entity;
                creeper.setPowered(true);
            }
            else if (entity.getType() == EntityType.ZOMBIE_VILLAGER) {
                iron_sword.addEnchantment(Enchantment.SHARPNESS, 5);
                iron_sword.addEnchantment(Enchantment.KNOCKBACK, 5);

                (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(iron_sword);
            }
            else if (entity.getType() == EntityType.VINDICATOR) {
                dia_axe.addEnchantment(Enchantment.FIRE_ASPECT, 2);

                (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(dia_axe);
            }
            else if (entity.getType() == EntityType.ZOMBIFIED_PIGLIN) {
                (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(dia_sword);
            }
            else if (entity.getType() == EntityType.PIGLIN) {
                int number = random.nextInt(100);
                if (number < 50) {
                    gold_sword.addEnchantment(Enchantment.SHARPNESS, 3);

                    (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(gold_sword);
                } else {
                    crossbow.addEnchantment(Enchantment.POWER, 2);
                    crossbow.addEnchantment(Enchantment.FLAME, 1);

                    (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(crossbow);
                }
            }
            else if (entity.getType() == EntityType.PIGLIN_BRUTE) {
                dia_axe.addEnchantment(Enchantment.KNOCKBACK, 5);
                dia_axe.addEnchantment(Enchantment.FIRE_ASPECT, 2);

                (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(dia_axe);
            }
        }
    }
}
