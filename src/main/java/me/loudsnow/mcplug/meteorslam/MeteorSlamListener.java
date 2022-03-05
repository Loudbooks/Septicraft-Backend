package me.loudsnow.mcplug.meteorslam;

import me.loudsnow.mcplug.Main;
import org.bukkit.*;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Vector;

import java.util.List;

import static me.loudsnow.mcplug.Main.*;

public class MeteorSlamListener implements Listener {
    @EventHandler
    public void onPlayerRightClick(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        if (event.getHand() == EquipmentSlot.HAND) {
            if (event.getPlayer().isOnGround()) {
                if (p.getItemInHand() != null && p.getItemInHand().getItemMeta() != null && p.getItemInHand().getItemMeta().getDisplayName().equals("" + ChatColor.GOLD + ChatColor.BOLD + "Meteor Slam")) {
                    if (cd1.containsKey(p.getUniqueId().toString())) {
                        p.sendMessage(ChatColor.RED + "This object is on cooldown!");
                    } else {
                        p.setVelocity(new Vector(0, 2, 0));
                        hitground.remove(p.getUniqueId().toString());
                        cd1.put(p.getUniqueId().toString(), 0);
                        new BukkitRunnable() {
                            private int counter = 300;
                            @Override
                            public void run() {

                                if (hitground.containsKey(p.getUniqueId().toString())) {
                                    hitground.remove(p.getUniqueId().toString());
                                    this.cancel();
                                }
                                if (p.isOnGround()) {
                                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 100));
                                    // p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 0));
                                    Location location = p.getLocation();
                                    World world = p.getWorld();
                                    List<Entity> nearby = p.getNearbyEntities(4, 4, 4);
                                    for (Entity tmp : nearby)
                                        if (tmp instanceof Damageable)
                                            ((Damageable) tmp).damage(25);
                                    world.spawnParticle(Particle.EXPLOSION_LARGE, location, 10, 1, 1, 1, 1);
                                    hitground.put(p.getUniqueId().toString(), 1);
                                this.counter--;
                                }
                            }
                        }.runTaskTimer(instance, 10L, 0L);
                        Bukkit.getScheduler().runTaskLater(instance, new Runnable() {
                            @Override
                            public void run() {
                                cd1.remove(p.getUniqueId().toString());
                                p.sendMessage(ChatColor.GREEN + "Meteor Slam is no longer on cooldown!");
                            }
                        }, 300);
                    }
                }
            }
        }
    }
}
