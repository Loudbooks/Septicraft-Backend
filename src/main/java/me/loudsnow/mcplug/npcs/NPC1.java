package me.loudsnow.mcplug.npcs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

public class NPC1 implements Listener {
    @EventHandler
    public void onNpcClick(PlayerInteractEntityEvent event) {
        Player p = (Player) event.getPlayer();
        if (event.getHand() == EquipmentSlot.HAND) {
            Entity entity = event.getRightClicked();
            String uuid = entity.getUniqueId().toString();
            if (uuid.equals("14df8b0e-0bd7-27d4-81c6-e59fb8f0b208")) {
                p.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.BOLD + "[Gilbert] Welcome to the Snowy SMP!");
                
            }

        }


    }
}



