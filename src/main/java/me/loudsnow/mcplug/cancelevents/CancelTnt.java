package me.loudsnow.mcplug.cancelevents;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class CancelTnt implements Listener {
    @EventHandler
    public void onTntBlowUp(EntityExplodeEvent event){
        event.setCancelled(true);
        
    }
}
