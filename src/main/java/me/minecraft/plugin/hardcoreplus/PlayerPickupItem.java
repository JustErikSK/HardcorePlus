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
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 60, 0));
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 1));
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 60, 1));
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 60, 1));
            p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 60, 1));
        } else if (itemType == Material.CAKE) {
            for (int i = 0; i < 4; i++) {
                p.playEffect(p.getLocation(), Effect.BREWING_STAND_BREW, null);
            }
            p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 150, 2));
        } else if (itemType == Material.BEE_NEST) {
            for (int i = 0; i < 5; i++) {
                p.playEffect(p.getLocation().add(0,1,0), Effect.ELECTRIC_SPARK, null);
                p.playEffect(p.getLocation(), Effect.CHORUS_FLOWER_GROW, null);
            }
            p.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 40, 2));
        } else if (itemType == Material.BELL) {
            p.playEffect(p.getLocation(), Effect.ANVIL_LAND, null);
        } else if (itemType == Material.DRAGON_EGG) {
            p.playEffect(p.getLocation(), Effect.ENDERDRAGON_GROWL, null);
            p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 3));
        } else if (itemType == Material.DRAGON_HEAD) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.ENDERDRAGON_SHOOT, null);
            p.playEffect(p.getLocation(), Effect.END_GATEWAY_SPAWN, null);
        } else if (itemType == Material.SPORE_BLOSSOM) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.COPPER_WAX_ON, null);
        } else if (itemType == Material.WITHER_ROSE) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 80, 0));
        } else if (itemType == Material.SHROOMLIGHT) {
            p.playEffect(p.getLocation(), Effect.CLICK2, null);
        } else if (itemType == Material.AMETHYST_SHARD) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.COPPER_WAX_OFF, null);
        } else if (itemType == Material.TNT) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.MOBSPAWNER_FLAMES, null);
            p.playEffect(p.getLocation(), Effect.GHAST_SHRIEK, null);
        } else if (itemType == Material.AXOLOTL_BUCKET) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.OXIDISED_COPPER_SCRAPE, null);
        } else if (itemType == Material.BAMBOO) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.BOOK_PAGE_TURN, null);
        } else if (itemType == Material.BONE) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.CHORUS_FLOWER_DEATH, null);
        } else if (itemType == Material.REDSTONE_TORCH) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.EXTINGUISH, null);
        } else if (itemType == Material.CREEPER_HEAD) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.GHAST_SHOOT, null);
        } else if (itemType == Material.DIAMOND) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.PORTAL_TRAVEL, null);
        } else if (itemType == Material.GHAST_TEAR) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.GHAST_SHRIEK, null);
        } else if (itemType == Material.HONEY_BOTTLE) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.CHORUS_FLOWER_GROW, null);
        } else if (itemType == Material.LAVA_BUCKET) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.MOBSPAWNER_FLAMES, null);
        } else if (itemType == Material.MELON_SLICE) {
            p.playEffect(p.getLocation().add(0,1,0), Effect.ZOMBIE_CONVERTED_VILLAGER, null);
        }
    }
}
