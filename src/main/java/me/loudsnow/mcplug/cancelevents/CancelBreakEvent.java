package me.loudsnow.mcplug.cancelevents;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class CancelBreakEvent implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event){
        Player player = event.getPlayer();
        if (player.getDisplayName().equals("RGolden")) {
        }
        else if (player.getDisplayName().equals("Loudbook")) {
        }
        else if (player.getDisplayName().equals("FabledLivid")) {
        }
        else if (player.getDisplayName().equals("SnowedSeal")) {
        }
        //else if (player.getDisplayName().equals("Milkshake578")) {
        //}
        else if (player.getDisplayName().equals("lionylev")) {
        }
        else if (player.getDisplayName().equals("_Hyperbeam_")) {
        }
        else if (player.getDisplayName().equals("TK_boi32")) {
        }
        else if (player.getDisplayName().equals("SnowedBear")) {
        }
        else {
            
            event.setCancelled(true);

        }
    }
}
