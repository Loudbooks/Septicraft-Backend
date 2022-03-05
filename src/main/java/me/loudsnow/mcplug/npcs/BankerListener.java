package me.loudsnow.mcplug.npcs;

import org.bukkit.Material;
import org.bukkit.block.EnderChest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class BankerListener implements Listener {
    @EventHandler
    public void onBankerOpen (InventoryDragEvent event) {
        final Player player = (Player) event.getWhoClicked();

        if(event.getInventory().equals(player.getEnderChest())){
            if (!event.getCursor().hasItemMeta()) {
                event.setCancelled(true);
            }

        }

    }
}
