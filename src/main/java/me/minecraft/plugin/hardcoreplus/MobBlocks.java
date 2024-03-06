package me.minecraft.plugin.hardcoreplus;

import org.bukkit.Location;
import org.bukkit.Material;
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
        int number;

        // Rework needed so mobs spawned from blocks actually make sense, either they'll have something to do with the block or they'll be random

        // If player destroys Obsidian, there is a 25% chance for a Phantom to spawn.
        if (block == Material.OBSIDIAN) {
            number = random.nextInt(20);
            if (number >= 16) {
                this.spawnPhantom(loc);
            }
        }
        // If player destroys Dripstone Block or Pointed Dripstone, there is a 25% chance for a Silverfish to spawn.
        else if (block == Material.DRIPSTONE_BLOCK || block == Material.POINTED_DRIPSTONE) {
            number = random.nextInt(20);
            if (number >= 16) {
                this.spawnSilverfish(loc);
            }
        }
        // If player destroys Diorite, there is a 25% chance for a Vex to spawn.
        else if (block == Material.DIORITE) {
            number = random.nextInt(20);
            if (number >= 16) {
                this.spawnVex(loc);
            }
        }
        // If player destroys Iron Ore or Deepslate Iron Ore, there is a 25% chance for a Drowned Zombie to spawn.
        else if (block == Material.IRON_ORE || block == Material.DEEPSLATE_IRON_ORE) {
            number = random.nextInt(20);
            if (number >= 16) {
                this.spawnDrownedZombie(loc);
            }
        }
        // If player destroys Ancient Debris, there is a 5% chance for a Wither to spawn.
        else if (block == Material.ANCIENT_DEBRIS) {
            number = random.nextInt(40);
            if (number >= 38) {
                this.spawnWither(loc);
            }
        }
        // If player destroys Amethyst Cluster, there is 62.5% for a Bat to spawn.
        else if (block == Material.AMETHYST_CLUSTER) {
            number = random.nextInt(8);
            if (number >= 4) {
                this.spawnBat(loc);
            }
        }
        // If player destroys Big Dripleaf, there is a ~71.5% chance for a Cave Spider to spawn.
        else if (block == Material.BIG_DRIPLEAF) {
            number = random.nextInt(7);
            if (number >= 3) {
                this.spawnCaveSpider(loc);
            }
        }
        // If player destroys Cactus, there is a 40% chance for a Chicken to spawn.
        else if (block == Material.CACTUS) {
            number = random.nextInt(5);
            if (number >= 3) {
                this.spawnChicken(loc);
            }
        }
        // If player destroys Ender Chest, there is a 100% chance for an Endermite to spawn.
        else if (block == Material.ENDER_CHEST) {
            this.spawnEndermite(loc);
        }
        // If player destroys Gold Ore or Deepslate Gold Ore, there is a ~16.5% chance for a Piglin Brute to spawn.
        else if (block == Material.GOLD_ORE || block == Material.DEEPSLATE_GOLD_ORE) {
            number = random.nextInt(12);
            if (number >= 10) {
                this.spawnPiglinBrute(loc);
            }
        }
        // If player destroys Lily Pad, there is a 75% chance for a Squid to spawn.
        else if (block == Material.LILY_PAD) {
            number = random.nextInt(4);
            if (number >= 2) {
                this.spawnSquid(loc);
            }
        }
        // If player destroys Nether Brick, Nether Brick Fence, Nether Brick Slab or Nether Brick Stairs, there is an ~18% chance for a Zoglin to spawn.
        else if (block == Material.NETHER_BRICK || block == Material.NETHER_BRICK_FENCE || block == Material.NETHER_BRICK_SLAB || block == Material.NETHER_BRICK_STAIRS) {
            number = random.nextInt(11);
            if (number >= 9) {
                this.spawnZoglin(loc);
            }
        }
        // If player destroys Shroomlight, there is a 50% chance for a Zombie Horse to spawn.
        else if (block == Material.SHROOMLIGHT) {
            number = random.nextInt(6);
            if (number >= 4) {
                this.spawnZombieHorse(loc);
            }
        }
        // If player destroys Sea Pickle, there is a 100% chance for a Pufferfish to spawn.
        else if (block == Material.SEA_PICKLE) {
            this.spawnPufferfish(loc);
        }
        // If player destroys Soul Sand, there is a ~23.5% chance for a Ghast to spawn.
        else if (block == Material.SOUL_SAND) {
            number = random.nextInt(17);
            if (number >= 14) {
                this.spawnGhast(loc);
            }
        }
        // If player destroys Poppy, there is a ~23.5% chance for a Magma Cube to spawn.
        else if (block == Material.POPPY) {
            number = random.nextInt(17);
            if (number >= 14) {
                this.spawnMagmaCube(loc);
            }
        }
        // If player destroys Pumpkin, there is a ~23.5% chance for a Spider to spawn.
        else if  (block == Material.PUMPKIN) {
            number = random.nextInt(17);
            if (number >= 14) {
                this.spawnSpider(loc);
            }
        }
        // If player destroys Sand, there is a ~23.5% chance for a Husk to spawn.
        else if (block == Material.SAND) {
            number = random.nextInt(17);
            if (number >= 14) {
                this.spawnHusk(loc);
            }
        }
        // If player destroys Slime Block, there is a ~23.5% chance for a Slime to spawn.
        else if (block == Material.SLIME_BLOCK) {
            number = random.nextInt(17);
            if (number >= 14) {
                this.spawnSlime(loc);
            }
        }
        // If player destroys Wither Rose, there is a ~29.5% chance for a Wither Skeleton to spawn.
        else if (block == Material.WITHER_ROSE) {
            number = random.nextInt(17);
            if (number >= 13) {
                this.spawnWitherSkeleton(loc);
            }
        }
        // If player destroys Sponge or Wet Sponge, there is a 40% chance for a Guardian to spawn.
        else if (block == Material.SPONGE || block == Material.WET_SPONGE) {
            number = random.nextInt(15);
            if (number >= 10) {
                this.spawnGuardian(loc);
            }
        }
        // If player destroys Yellow Bed, there is a 20% chance for a Pillager to spawn.
        else if (block == Material.YELLOW_BED) {
            number = random.nextInt(20);
            if (number >= 17) {
                this.spawnPillager(loc);
            }
        }
        // If player destroys Spore Blossom, there is a ~16.5% chance for a Tropical Fish to spawn.
        else if (block == Material.SPORE_BLOSSOM) {
            number = random.nextInt(12);
            if (number >= 10) {
                this.spawnTropicalFish(loc);
            }
        }
        // If player destroys Soul Soil, there is a ~28.5% chance for a Blaze to spawn.
        else if (block == Material.SOUL_SOIL) {
            number = random.nextInt(14);
            if (number >= 11) {
                this.spawnBlaze(loc);
            }
        }
    }
    // Phantom spawn.
    private void spawnPhantom(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.PHANTOM);
    }
    // Silverfish spawn.
    private void spawnSilverfish(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.SILVERFISH);
    }
    // Vex spawn.
    private void spawnVex(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.VEX);
    }
    // Drowned Zombie spawn.
    private void spawnDrownedZombie(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.DROWNED);
    }
    // Wither spawn.
    private void spawnWither(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.WITHER);
    }
    // Bat spawn.
    private void spawnBat(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.BAT);
    }
    // Cave Spider spawn.
    private void spawnCaveSpider(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.CAVE_SPIDER);
    }
    // Chicken spawn.
    private void spawnChicken(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.CHICKEN);
    }
    // Endermite spawn.
    private void spawnEndermite(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.ENDERMITE);
    }
    // Piglin Brute spawn.
    private void spawnPiglinBrute(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.PIGLIN_BRUTE);
    }
    // Squid spawn.
    private void spawnSquid(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.SQUID);
    }
    // Zoglin spawn.
    private void spawnZoglin(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.ZOGLIN);
    }
    // Zombie Horse spawn.
    private void spawnZombieHorse(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.ZOMBIE_HORSE);
    }
    // Guardian spawn.
    private void spawnGuardian(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.GUARDIAN);
    }
    // Ghast spawn.
    private void spawnGhast(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.GHAST);
    }
    // Magma Cube spawn.
    private void spawnMagmaCube(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.MAGMA_CUBE);
    }
    // Spider spawn.
    private void spawnSpider(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.SPIDER);
    }
    // Husk spawn.
    private void spawnHusk(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.HUSK);
    }
    // Slime spawn.
    private void spawnSlime(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.SLIME);
    }
    // Wither Skeleton spawn.
    private void spawnWitherSkeleton(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.WITHER_SKELETON);
    }
    // Pufferfish spawn.
    private void spawnPufferfish(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.PUFFERFISH);
    }
    // Pillager spawn.
    private void spawnPillager(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.PILLAGER);
    }
    // Tropical Fish spawn.
    private void spawnTropicalFish(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.TROPICAL_FISH);
    }
    // Blaze spawn.
    private void spawnBlaze(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.BLAZE);
    }
}