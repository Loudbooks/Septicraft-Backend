package me.loudsnow.mcplug;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.net.http.WebSocket;

public class DeathEvent implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        String name = event.getEntity().getName();
        event.setKeepInventory(true);
        event.setDeathMessage("" + ChatColor.RED + ChatColor.BOLD + name + " died! Feel bad for them! :(");
    }
}
