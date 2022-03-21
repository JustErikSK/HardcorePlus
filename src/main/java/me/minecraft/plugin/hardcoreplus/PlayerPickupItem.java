package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.Listener;

public class PlayerPickupItem implements Listener {

    @EventHandler
    public void onPlayerPickUp(PlayerPickupItemEvent event) {
        Player p = event.getPlayer();
        ItemStack item = event.getItem().getItemStack();
        Material itemType = item.getType();
        if (itemType == Material.WITHER_SKELETON_SKULL) {
            p.playEffect(p.getLocation(), Effect.GHAST_SHRIEK, null);
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 60, 0), true);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 1), true);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 60, 1), true);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 60, 1), true);
            p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 60, 1), true);
        } else if (itemType == Material.CAKE) {
            for (int i = 0; i < 4; i++) {
                p.playEffect(p.getLocation(), Effect.BREWING_STAND_BREW, null);
            }
            p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 150, 2), true);
        } else if (itemType == Material.BEE_NEST) {
            for (int i = 0; i < 5; i++) {
                p.playEffect(p.getLocation().add(0,1,0), Effect.ELECTRIC_SPARK, null);
                p.playEffect(p.getLocation(), Effect.CHORUS_FLOWER_GROW, null);
            }
            p.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 40, 2), true);
        } else if (itemType == Material.BELL) {
            p.playEffect(p.getLocation(), Effect.ANVIL_LAND, null);
        } else if (itemType == Material.DRAGON_EGG) {
            p.playEffect(p.getLocation(), Effect.ENDERDRAGON_GROWL, null);
            p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 3), true);
        } else if (itemType == Material.DRAGON_HEAD) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.ENDERDRAGON_SHOOT, null);
            p.playEffect(p.getLocation(), Effect.END_GATEWAY_SPAWN, null);
        } else if (itemType == Material.SPORE_BLOSSOM) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.COPPER_WAX_ON, null);
        } else if (itemType == Material.WITHER_ROSE) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 80, 0), true);
        } else if (itemType == Material.SHROOMLIGHT) {
            p.playEffect(p.getLocation(), Effect.CLICK2, null);
        } else if (itemType == Material.AMETHYST_SHARD) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.COPPER_WAX_OFF, null);
        } else if (itemType == Material.TNT) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.MOBSPAWNER_FLAMES, null);
            p.playEffect(p.getLocation(), Effect.GHAST_SHRIEK, null);
        }
    }
}
