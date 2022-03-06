package me.loudsnow.mcplug.desolation;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


import static me.loudsnow.mcplug.Main.*;

public class DesolationAbilityListener implements Listener {
    @EventHandler
    public void onDesolationRightClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (p.getItemInHand().getItemMeta() != null && p.getItemInHand().getItemMeta().getDisplayName().equals("" + ChatColor.RED + ChatColor.BOLD + "Desolation")) {
                if (cd6.containsKey(p.getUniqueId().toString())) {
                    p.sendMessage(ChatColor.RED + "This object is on cooldown!");
                } else {
                    cd6.put(p.getUniqueId().toString(), 0);
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 0, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 200, 0, false));
                    boolean desolationdmg = true;
                    p.sendMessage(ChatColor.GREEN + "Activated Desolation!");


                    Bukkit.getScheduler().runTaskLater(instance, new Runnable() {
                        @Override
                        public void run() {
                            cd6.remove(p.getUniqueId().toString());
                            boolean desolationdmg = false;
                            p.sendMessage(ChatColor.GREEN + "Desolation is no longer on cooldown!");
                        }
                    }, 500);
                }
            }
        }
    }
}