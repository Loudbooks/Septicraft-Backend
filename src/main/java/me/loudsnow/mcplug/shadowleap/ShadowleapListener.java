package me.loudsnow.mcplug.shadowleap;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import static me.loudsnow.mcplug.Main.*;

public class ShadowleapListener implements Listener {
    @EventHandler
    public void onPlayerCrouch(PlayerToggleSneakEvent event){
        Player p = event.getPlayer();
        if (p.isSneaking()){
            if (p.getInventory().getBoots() != null){
                if (event.getPlayer().isOnGround()) {
                    if (p.getInventory().getBoots().getItemMeta().getDisplayName().equals("" + ChatColor.GRAY + ChatColor.BOLD + "Shadowleap")) {

                        if (cd2.containsKey(p.getUniqueId().toString())){
                            p.sendMessage(ChatColor.RED + "This object is on cooldown!");


                        } else {
                            p.setVelocity(new Vector(0, 0, 0));
                            Vector dir = p.getLocation().getDirection();
                            p.setVelocity(dir.multiply(2.5));

                            cd2.put(p.getUniqueId().toString(), 0);
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 60, 1));
                            World world = p.getWorld();
                            Location location = p.getLocation();
                            world.spawnParticle(Particle.CLOUD, location, 20, 0.2, 0.2, 0.2, 0.2);


                            Bukkit.getScheduler().scheduleSyncRepeatingTask(instance, new Runnable() {
                                @Override
                                public void run() {
                                    cd2.remove(p.getUniqueId().toString());
                                    p.sendMessage(ChatColor.GREEN + "Shadowleap is no longer on cooldown!");


                                }
                            }, 60, -1);

                        }
                    }
                }
            }
        }
    }

//Loud what is this code for? teleport boots when crouch it launches you
}
