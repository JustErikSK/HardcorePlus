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

        // If player destroys Obsidian, there is a 5% chance for a Phantom to spawn.
        if (block == Material.OBSIDIAN) {
            number = random.nextInt(100);
            if (number > 95) {
                this.spawnPhantom(loc);
            }
        }
        // If player destroys Dripstone Block or Pointed Dripstone, there is a 8% chance for a Silverfish to spawn.
        else if (block == Material.DRIPSTONE_BLOCK || block == Material.POINTED_DRIPSTONE) {
            number = random.nextInt(100);
            if (number > 92) {
                this.spawnSilverfish(loc);
            }
        }
        // If player destroys Andesite, there is a 3% chance for a Vex to spawn.
        else if (block == Material.ANDESITE) {
            number = random.nextInt(100);
            if (number > 97) {
                this.spawnVex(loc);
            }
        }
        // If player destroys Ancient Debris, there is a 40% chance for a Wither Skeleton to spawn.
        else if (block == Material.ANCIENT_DEBRIS) {
            number = random.nextInt(100);
            if (number > 60) {
                this.spawnWitherSkeleton(loc);
            }
        }
        // If player destroys Big Dripleaf, there is a 70% chance for a Cod to spawn.
        else if (block == Material.BIG_DRIPLEAF) {
            number = random.nextInt(100);
            if (number > 30) {
                this.spawnCod(loc);
            }
        }
        // If player destroys Cactus, there is a 10% chance for a Husk to spawn.
        else if (block == Material.CACTUS) {
            number = random.nextInt(100);
            if (number > 90) {
                this.spawnHusk(loc);
            }
        }
        // If player destroys Ender Chest, an Endermite will spawn.
        else if (block == Material.ENDER_CHEST) {
            this.spawnEndermite(loc);
        }
        // If player destroys Gold Ore or Deepslate Gold Ore, there is a 5% chance for a Piglin Brute to spawn.
        else if (block == Material.GOLD_ORE || block == Material.DEEPSLATE_GOLD_ORE) {
            number = random.nextInt(100);
            if (number > 95) {
                this.spawnPiglinBrute(loc);
            }
        }
        // If player destroys Lily Pad, there is a 2% chance for a Squid to spawn.
        else if (block == Material.LILY_PAD) {
            number = random.nextInt(100);
            if (number > 98) {
                this.spawnSquid(loc);
            }
        }
        // If player destroys Nether Brick, Nether Brick Fence, Nether Brick Slab or Nether Brick Stairs, there is an 25% chance for a Zoglin to spawn.
        else if (block == Material.NETHER_BRICK || block == Material.NETHER_BRICK_FENCE || block == Material.NETHER_BRICK_SLAB || block == Material.NETHER_BRICK_STAIRS) {
            number = random.nextInt(100);
            if (number > 75) {
                this.spawnZoglin(loc);
            }
        }
        // If player destroys Sea Pickle, a Pufferfish will spawn.
        else if (block == Material.SEA_PICKLE) {
            this.spawnPufferfish(loc);
        }
        // If player destroys Soul Sand, there is a 5% chance for a Ghast to spawn.
        else if (block == Material.SOUL_SAND) {
            number = random.nextInt(100);
            if (number > 95) {
                this.spawnGhast(loc);
            }
        }
        // If player destroys Poppy, there is a 2% chance for a Bee to spawn.
        else if (block == Material.POPPY) {
            number = random.nextInt(100);
            if (number > 98) {
                this.spawnBee(loc);
            }
        }
        // If player destroys Pumpkin, there is a 3% chance for an Iron Golem to spawn.
        else if  (block == Material.PUMPKIN) {
            number = random.nextInt(100);
            if (number > 97) {
                this.spawnIronGolem(loc);
            }
        }
        // If player destroys Slime Block, there is a 2% chance for a Slime to spawn.
        else if (block == Material.SLIME_BLOCK) {
            number = random.nextInt(100);
            if (number > 98) {
                this.spawnSlime(loc);
            }
        }
        // If player destroys Sponge or Wet Sponge, there is a 5% chance for an Elder Guardian to spawn.
        else if (block == Material.SPONGE || block == Material.WET_SPONGE) {
            number = random.nextInt(100);
            if (number > 95) {
                this.spawnElderGuardian(loc);
            }
        }
        // If player destroys Yellow, White, Red, Blue or Purple Bed, there is a 30% chance for a Vindicator to spawn.
        else if (block == Material.YELLOW_BED || block == Material.WHITE_BED || block == Material.RED_BED || block == Material.BLUE_BED || block == Material.PURPLE_BED) {
            number = random.nextInt(100);
            if (number > 70) {
                this.spawnVindicator(loc);
            }
        }
        // If player destroys Spore Blossom, there is a 3% chance for a Tropical Fish to spawn.
        else if (block == Material.SPORE_BLOSSOM) {
            number = random.nextInt(100);
            if (number > 97) {
                this.spawnTropicalFish(loc);
            }
        }
        // If player destroys Soul Soil, there is a 15% chance for a Blaze to spawn.
        else if (block == Material.SOUL_SOIL) {
            number = random.nextInt(100);
            if (number > 85) {
                this.spawnBlaze(loc);
            }
        }
    }

    // Phantom spawn
    private void spawnPhantom(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.PHANTOM);
    }
    // Cod spawn
    private void spawnCod(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.COD);
    }
    // Bee spawn
    private void spawnBee(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.BEE);
    }
    // Iron Golem spawn
    private void spawnIronGolem(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.IRON_GOLEM);
    }
    // Silverfish spawn
    private void spawnSilverfish(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.SILVERFISH);
    }
    // Vex spawn
    private void spawnVex(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.VEX);
    }
    // Endermite spawn
    private void spawnEndermite(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.ENDERMITE);
    }
    // Piglin Brute spawn
    private void spawnPiglinBrute(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.PIGLIN_BRUTE);
    }
    // Squid spawn
    private void spawnSquid(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.SQUID);
    }
    // Zoglin spawn
    private void spawnZoglin(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.ZOGLIN);
    }
    // Elder Guardian spawn
    private void spawnElderGuardian(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.ELDER_GUARDIAN);
    }
    // Ghast spawn
    private void spawnGhast(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.GHAST);
    }
    // Husk spawn
    private void spawnHusk(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.HUSK);
    }
    // Slime spawn
    private void spawnSlime(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.SLIME);
    }
    // Wither Skeleton spawn
    private void spawnWitherSkeleton(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.WITHER_SKELETON);
    }
    // Pufferfish spawn
    private void spawnPufferfish(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.PUFFERFISH);
    }
    // Vindicator spawn
    private void spawnVindicator(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.VINDICATOR);
    }
    // Tropical Fish spawn
    private void spawnTropicalFish(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.TROPICAL_FISH);
    }
    // Blaze spawn
    private void spawnBlaze(Location loc) {
        (Objects.requireNonNull(loc.getWorld())).spawnEntity(loc, EntityType.BLAZE);
    }
}