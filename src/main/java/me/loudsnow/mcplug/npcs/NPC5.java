package me.loudsnow.mcplug.npcs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

public class NPC5 implements Listener {
    @EventHandler
    public void onNpc5Click(PlayerInteractEntityEvent event) {
        Player p = (Player) event.getPlayer();
        if (event.getHand() == EquipmentSlot.HAND) {
            Entity entity = event.getRightClicked();
            String uuid = entity.getUniqueId().toString();
            Bukkit.broadcastMessage(uuid);
            if (uuid.equals("44bfafe8-d20a-2b0b-b4a0-4329933087ed")) {
                p.sendMessage("" + ChatColor.RED + ChatColor.BOLD + "Coming soon!");


            }

        }


    }
}
