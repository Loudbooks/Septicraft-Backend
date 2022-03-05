package me.loudsnow.mcplug;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class BankerHash {
    public static void BankerHash(String[] args){

    }

}
class TestHashCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage();
            String uuid = p.getUniqueId().toString();
            HashMap<String, Integer> bank = new HashMap<>();

            bank.put(uuid, 0);
        }
    return true;
    }
}
public class JoinEvent implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        if(!p.hasPlayedBefore()) {
            Bukkit.broadcastMessage("" + ChatColor.GOLD + ChatColor.BOLD + "Welcome to the server " + event.getPlayer().getName() + "! \n" + ChatColor.YELLOW + "Please take a moment to read the rules!");



        }
    }
}
