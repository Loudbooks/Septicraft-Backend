package me.loudsnow.mcplug.desolation;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.entity.Damageable;
import org.bukkit.event.EventHandler;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class DesolationListener implements Listener {
    @EventHandler
    public void onDesolationAttack(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK){
            if
            Player p = e.getPlayer();
            Location location = p.getLocation();
            World world = p.getWorld();
            world.spawnParticle(Particle.LANDING_LAVA, location, 10, 1, 1, 1, 1);

        }

    }
    // loud do we alr have a text pack for this
    // i can make one rq for a cleaner look ig
    // ok ill send some screenies when im done
    // we also need the right click for this
    // what will that do
    // increase base damage by 10%, increase damage taken by 10% , heal for 5% of damage dealt.
    // so you want to see me die?
    // hard to codei
    // i think we can use the .heal thingy to do the healing, and we can add a line to make a totally new item
    // when right click? like the hypixel atomsplit idk what that isability :>
    // idk if we can do the take more damage part
    // let me check the commands we can do with spigot
    // whats the cd    like 50 secs maybe
    // maybe force reduction of armor by 10% what if they're wearing no armor they automatically
    // take 10% of their hearts are damage in 1 go hm thats an idea
    // i gtg for now ill be back later ty for help

    // this and the new DesoCOmmand? yes k
}
