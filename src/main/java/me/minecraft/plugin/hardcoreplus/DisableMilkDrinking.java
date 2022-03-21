package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

public class DisableMilkDrinking implements Listener {

    @EventHandler
    public void onMilkDrinking(PlayerItemConsumeEvent event) {
        ItemStack consumed = event.getItem();
        if (consumed.getType().equals(Material.MILK_BUCKET)) {
            event.setCancelled(true);
        }
    }
}
