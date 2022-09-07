package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

public class DisableEating implements Listener {

    @EventHandler
    public void onFoodEating(PlayerItemConsumeEvent event) {
        ItemStack consumed = event.getItem();
        if (consumed.getType().equals(Material.GOLDEN_APPLE) || consumed.getType().equals(Material.BREAD) ||
                consumed.getType().equals(Material.COOKED_BEEF) || consumed.getType().equals(Material.COOKED_CHICKEN) ||
                consumed.getType().equals(Material.COOKED_COD) || consumed.getType().equals(Material.COOKED_MUTTON) ||
                consumed.getType().equals(Material.COOKED_PORKCHOP) || consumed.getType().equals(Material.COOKED_RABBIT) ||
                consumed.getType().equals(Material.COOKED_SALMON) || consumed.getType().equals(Material.BAKED_POTATO) ||
                consumed.getType().equals(Material.GOLDEN_CARROT) || consumed.getType().equals(Material.PUMPKIN_PIE)) {
            event.setCancelled(true);
        }
    }
}