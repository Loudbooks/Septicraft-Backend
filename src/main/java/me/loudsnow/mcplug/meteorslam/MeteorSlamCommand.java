package me.loudsnow.mcplug.meteorslam;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;

public class MeteorSlamCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            ItemStack meteorslam = new ItemStack(Material.IRON_SWORD);
            ItemMeta meta1 =  meteorslam.getItemMeta();
            meta1.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Meteor Slam");
            ArrayList<String> lore = new ArrayList();
            lore.add("15 Second Cooldown");
            lore.add("" + ChatColor.YELLOW + ChatColor.BOLD + "Right click to activate Ground Slam!");
            lore.add("" + ChatColor.YELLOW + "Launches you up and slams you on the floor dealing area damage.");
            meta1.setLore(lore);
            meta1.setUnbreakable(true);
            meteorslam.setItemMeta(meta1);
            p.getInventory().addItem(meteorslam);

        }
        return true;
    }
}
