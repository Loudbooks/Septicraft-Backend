package me.loudsnow.mcplug;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class PigKillTest implements Listener {
    @EventHandler
    public void onPigKill(EntityDeathEvent event){
        if (event.getEntityType().equals(EntityType.PIG)){
            event.getDrops().clear();
            Entity entity1 = event.getEntity();
            entity1.getWorld().dropItemNaturally(entity1.getLocation(), new ItemStack(Material.PORKCHOP, 2));



        }
    }
}
