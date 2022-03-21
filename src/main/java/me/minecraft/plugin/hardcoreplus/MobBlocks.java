package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Objects;
import java.util.Random;

public class MobBlocks implements Listener {

    @EventHandler
    public void onBlockDestroy(BlockBreakEvent event) {
        Material block = event.getBlock().getType();
        Random random = new Random();
        Player player = event.getPlayer();
        Location loc = player.getLocation();
        int number15;
        if (block == Material.OBSIDIAN) {
            number15 = random.nextInt(20);
            if (number15 >= 16) {
                this.spawnCreature1(loc);
            }
        }
        if (block == Material.DRIPSTONE_BLOCK) {
            number15 = random.nextInt(20);
            if (number15 >= 16) {
                this.spawnCreature2(loc);
            }
        }
        if (block == Material.DIORITE) {
            number15 = random.nextInt(16);
            if (number15 >= 13) {
                this.spawnCreature3(loc);
            }
        }
        if (block == Material.IRON_ORE || block == Material.DEEPSLATE_IRON_ORE) {
            number15 = random.nextInt(20);
            if (number15 >= 16) {
                this.spawnCreature4(loc);
            }
        }
        if (block == Material.ANCIENT_DEBRIS) {
            number15 = random.nextInt(40);
            if (number15 >= 35) {
                this.spawnCreature5(loc);
            }
        }
        if (block == Material.AMETHYST_CLUSTER) {
            number15 = random.nextInt(8);
            if (number15 >= 4) {
                this.spawnCreature6(loc);
            }
        }
        if (block == Material.BIG_DRIPLEAF) {
            number15 = random.nextInt(7);
            if (number15 >= 3) {
                this.spawnCreature7(loc);
            }
        }
        if (block == Material.CACTUS) {
            number15 = random.nextInt(5);
            if (number15 >= 3) {
                this.spawnCreature8(loc);
            }
        }
        if (block == Material.ENDER_CHEST) {
            number15 = random.nextInt(2);
            if (number15 > 0) {
                this.spawnCreature9(loc);
            }
        }
        if (block == Material.GOLD_ORE || block == Material.DEEPSLATE_GOLD_ORE) {
            number15 = random.nextInt(12);
            if (number15 >= 11) {
                this.spawnCreature10(loc);
            }
        }
        if (block == Material.LILY_PAD) {
            number15 = random.nextInt(4);
            if (number15 >= 2) {
                this.spawnCreature11(loc);
            }
        }
        if (block == Material.NETHER_BRICK || block == Material.NETHER_BRICK_FENCE || block == Material.NETHER_BRICK_SLAB || block == Material.NETHER_BRICK_STAIRS) {
            number15 = random.nextInt(11);
            if (number15 >= 10) {
                this.spawnCreature12(loc);
            }
        }
        if (block == Material.SHROOMLIGHT) {
            number15 = random.nextInt(6);
            if (number15 >= 4) {
                this.spawnCreature13(loc);
            }
        }
        if (block == Material.SEA_PICKLE) {
            number15 = random.nextInt(2);
            if (number15 > 0) {
                this.spawnCreature14(loc);
            }
        }
        if (block == Material.SOUL_SAND || block == Material.SOUL_SOIL) {
            number15 = random.nextInt(17);
            if (number15 >= 14) {
                this.spawnCreature15(loc);
            }
        }
    }
    private void spawnCreature1(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.PHANTOM);
    }
    private void spawnCreature2(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.SILVERFISH);
    }
    private void spawnCreature3(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.VEX);
    }
    private void spawnCreature4(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.DROWNED);
    }
    private void spawnCreature5(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.WITHER);
    }
    private void spawnCreature6(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.BAT);
    }
    private void spawnCreature7(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.CAVE_SPIDER);
    }
    private void spawnCreature8(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.CHICKEN);
    }
    private void spawnCreature9(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.EVOKER);
    }
    private void spawnCreature10(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.PIGLIN_BRUTE);
    }
    private void spawnCreature11(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.SQUID);
    }
    private void spawnCreature12(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.ZOGLIN);
    }
    private void spawnCreature13(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.ZOMBIE_HORSE);
    }
    private void spawnCreature14(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.GUARDIAN);
    }
    private void spawnCreature15(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.GHAST);
    }
}