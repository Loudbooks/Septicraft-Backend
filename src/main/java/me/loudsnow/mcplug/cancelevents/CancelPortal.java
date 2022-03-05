package me.loudsnow.mcplug.cancelevents;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.PortalCreateEvent;

public class CancelPortal implements Listener {
    @EventHandler
    public void onPortalCreate(PortalCreateEvent event){
        event.setCancelled(true);


    }
}
