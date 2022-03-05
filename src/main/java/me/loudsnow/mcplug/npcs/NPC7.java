package me.loudsnow.mcplug.npcs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

public class NPC7 implements Listener {
    @EventHandler
    public void onNpcClick(PlayerInteractEntityEvent event) {
        Player p = (Player) event.getPlayer();
        if (event.getHand() == EquipmentSlot.HAND) {
            Entity entity = event.getRightClicked();
            String uuid = entity.getUniqueId().toString();
            if (uuid.equals("76b8668f-7638-2635-a28d-421202fb5efd")) {
                p.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.BOLD + "I love food, dont you?");
                p.sendMessage(""+ ChatColor.DARK_GREEN + ChatColor.BOLD + "Cake: 50 coins");
            }

        }


    }
}

