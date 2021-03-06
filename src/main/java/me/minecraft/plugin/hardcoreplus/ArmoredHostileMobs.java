package me.minecraft.plugin.hardcoreplus;

import java.util.Objects;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class ArmoredHostileMobs implements Listener {

    @EventHandler
    public void onMobSpawn(CreatureSpawnEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity instanceof Monster) {
            if (entity.getType() == EntityType.SKELETON) {
                ItemStack bow = new ItemStack(Material.BOW);
                bow.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
                bow.addEnchantment(Enchantment.ARROW_FIRE, 1);
                bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(bow);
                entity.getEquipment().setBoots(new ItemStack(Material.IRON_BOOTS));
                entity.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
                entity.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
                entity.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
            } else if (entity.getType() == EntityType.ZOMBIE) {
                ItemStack gold_sword = new ItemStack(Material.GOLDEN_SWORD);
                gold_sword.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                gold_sword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                gold_sword.addEnchantment(Enchantment.KNOCKBACK, 2);
                (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(gold_sword);
                entity.getEquipment().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
                entity.getEquipment().setLeggings(new ItemStack(Material.GOLDEN_LEGGINGS));
                entity.getEquipment().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
                entity.getEquipment().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
            } else if (entity.getType() == EntityType.WITHER_SKELETON) {
                ItemStack dia_sword = new ItemStack(Material.DIAMOND_SWORD);
                dia_sword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                dia_sword.addEnchantment(Enchantment.FIRE_ASPECT, 1);
                dia_sword.addEnchantment(Enchantment.KNOCKBACK, 2);
                (Objects.requireNonNull(entity.getEquipment())).setItemInMainHand(dia_sword);
                ItemStack iron_helm = new ItemStack(Material.IRON_HELMET);
                iron_helm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                iron_helm.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 3);
                entity.getEquipment().setHelmet(new ItemStack(iron_helm));
            } else if (entity.getType() == EntityType.CREEPER) {
                Creeper creeper = (Creeper)entity;
                creeper.setPowered(true);
            }
        }
    }
}
