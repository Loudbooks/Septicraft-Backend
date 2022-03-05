package me.loudsnow.mcplug.cancelevents;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class CancelBedEnter implements Listener {
    @EventHandler
    public void onBedEnter(PlayerBedEnterEvent event){
        event.setCancelled(true);
    }
}
