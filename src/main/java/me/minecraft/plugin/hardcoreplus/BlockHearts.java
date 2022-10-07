package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import java.util.Random;

public class BlockHearts implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Material block = event.getBlock().getType();
        Random random = new Random();
        Player player = event.getPlayer();
        int health = 2;

        // obsidian is just for now as a testing block
        if (block == Material.OBSIDIAN) {
            int number = random.nextInt(20);

            // if player has less than 18 hp (9 hearts), 1 heart will be added
            // random number has to be 17 or more (up to 19)
            if (number >= 17 && player.getMaxHealth() <= 18) {
                player.setMaxHealth(player.getMaxHealth() + health);

            // if player has more than 6 hp (3 hearts), 1 heart will be removed
            // random number has to be 8 or less (up to 0)
            } else if (number <= 8 && player.getMaxHealth() >= 6) {
                player.setMaxHealth(player.getMaxHealth() - health);
            }
            // setMaxHealth and getMaxHealth is deprecated, will replace it with player attributes in the future update.
        }
    }
}
