package me.loudsnow.mcplug;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class TraderSpawn implements Listener {
    @EventHandler
    public void traderSpawn(CreatureSpawnEvent e) {
        if (e.getEntity().getType() == EntityType.WANDERING_TRADER) {
            e.setCancelled(true);
        }
    }
}
