package me.loudsnow.mcplug.cancelevents;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;

public class CancelItemFrame implements Listener {
    @EventHandler
    public void onItemFrame(HangingBreakByEntityEvent event){
        Player p = (Player) event.getEntity();
        if (p.getDisplayName().equals("RGolden")) {

        } else {
            event.setCancelled(true);
        }
    }
}
