package me.loudsnow.mcplug.npcs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

public class NPC6 implements Listener {
    @EventHandler
    public void onNpcClick(PlayerInteractEntityEvent event) {
        Player p = (Player) event.getPlayer();
        if (event.getHand() == EquipmentSlot.HAND) {
            Entity entity = event.getRightClicked();
            String uuid = entity.getUniqueId().toString();
            if (uuid.equals("9ce81ce2-4527-2081-b2a8-e8034f382bd6")) {
                p.sendMessage("" + ChatColor.GRAY + ChatColor.BOLD + "[Guard] I'm keeping my eye on you");

            }

        }


    }
}

// dm on discord to text me