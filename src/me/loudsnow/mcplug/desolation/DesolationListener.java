package me.loudsnow.mcplug.desolation;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.entity.Damageable;
import org.bukkit.event.EventHandler;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import static me.loudsnow.mcplug.Main.cd3;

public class DesolationListener implements Listener {
    @EventHandler
    public void onDesolationAttack(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) {
            if (p.getItemInHand() != null && p.getItemInHand().getItemMeta().getDisplayName().equals("" + ChatColor.RED + ChatColor.BOLD + "Desolation")) {

                if (cd3.containsKey(p.getUniqueId().toString())) {
                    p.sendMessage("" + ChatColor.RED + ChatColor.BOLD + "This object is on cooldown!");
                    cd3.remove(p.getUniqueId().toString());
                } else {
                    Location location = p.getLocation();
                    World world = p.getWorld();
                    world.spawnParticle(Particle.LANDING_LAVA, location, 10, 1, 1, 1, 1);
                    Double damage = p.getLastDamage() / 10;
                    p.damage(damage);
                }
            }
        }
    }
}

