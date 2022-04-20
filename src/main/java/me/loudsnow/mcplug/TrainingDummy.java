package me.loudsnow.mcplug;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

import static me.loudsnow.mcplug.Main.*;


public class TrainingDummy implements Listener {
    Boolean used = false;

    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        Entity entity = e.getEntity();
        String uuid = entity.getUniqueId().toString();

        if (uuid.toString().equals("fc00e200-5434-2ebc-9754-db5e9e10c8e2")) {
            List<Entity> nearby = entity.getNearbyEntities(1, 1, 1);
            for (Entity tmp : nearby)
                if (tmp instanceof Damageable)
                    if (tmp instanceof Player) {

                    } else {
                        tmp.remove();
                    }
            e.setCancelled(true);

            Entity damaged = e.getEntity();
            double damage = e.getFinalDamage();
            int damageround = (int) Math.round(damage);
            World world = e.getEntity().getWorld();
            ArmorStand armorstand = (ArmorStand) world.spawnEntity(entity.getLocation(), EntityType.ARMOR_STAND);
            armorstand.setVisible(false);
            armorstand.setCustomNameVisible(true);
            armorstand.setCustomName("" + ChatColor.RED + ChatColor.BOLD + damageround + " damage!");


            Bukkit.getScheduler().runTaskLater(instance, new Runnable() {
                @Override
                public void run() {
                    armorstand.remove();


                }
            }, 40);


        }
    }
}
