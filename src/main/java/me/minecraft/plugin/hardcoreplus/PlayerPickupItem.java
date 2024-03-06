package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.Listener;

public class PlayerPickupItem implements Listener {

    @EventHandler
    public void onPlayerPickUp(EntityPickupItemEvent event) {
        LivingEntity entity = event.getEntity();
        ItemStack item = event.getItem().getItemStack();
        Material itemType = item.getType();

        if (entity instanceof Player) { // Check if the entity is player
            if (itemType == Material.WITHER_SKELETON_SKULL) {
                // If WITHER SKELETON SKULL is picked up, player will get BLINDNESS and WITHER effect for 4 seconds.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 80, 0));
                entity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 80, 1));
            }
            else if (itemType == Material.CAKE) {
                // If CAKE is picked up, player will get REGENERATION 1 effect for 2 seconds.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 40, 0));
            }
            else if (itemType == Material.BEE_NEST) {
                // If BEE NEST is picked up, player will get LEVITATION effect for 1 second.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 20, 1));
            }
            else if (itemType == Material.BELL) {
                // If BELL is picked up, player will get SATURATION effect for 2 seconds.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 40, 0));
            }
            else if (itemType == Material.DRAGON_EGG) {
                // If DRAGON EGG is picked up, player will get REGENERATION 2 effect for 2 seconds.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 40, 1));
            }
            else if (itemType == Material.DRAGON_HEAD) {
                // If DRAGON HEAD is picked up, player will get LEVITATION effect for 3 seconds.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 60, 0));
            }
            else if (itemType == Material.WITHER_ROSE) {
                // If WITHER ROSE is picked up, player will get WITHER effect for 1 second.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 0));
            }
            else if (itemType == Material.SHROOMLIGHT) {
                // If SHROOMLIGHT is picked up, player will get GLOWING effect for 3 seconds.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 60, 0));
            }
            else if (itemType == Material.TNT) {
                // If TNT is picked up, player will get INSTANT HARM 2 effect.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 20,1));
            }
            else if (itemType == Material.AXOLOTL_BUCKET) {
                // If AXOLOTL BUCKET is picked up, player will get ABSORPTION effect for 4 seconds.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 80, 0));
            }
            else if (itemType == Material.BLAZE_ROD) {
                // If BLAZE ROD is picked up, player will get FIRE RESISTANCE effect for 1 second.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 20, 0));
            }
            else if (itemType == Material.GHAST_TEAR) {
                // If GHAST TEAR is picked up, player will get SLOWNESS 2 effect for 3 seconds.
                entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 1));
            }
        }
    }
}
