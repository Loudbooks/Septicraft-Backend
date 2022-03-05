package me.loudsnow.mcplug.shadowleap;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;

public class ShadowleapCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            ItemStack shadowleap = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta meta1 = (LeatherArmorMeta) shadowleap.getItemMeta();
            meta1.setDisplayName("" + ChatColor.GRAY + ChatColor.BOLD + "Shadowleap");
            meta1.setColor(Color.GRAY);
            ArrayList<String> lore = new ArrayList();
            lore.add("3 Second Cooldown");
            lore.add("" + ChatColor.YELLOW + ChatColor.BOLD + "Use CROUCH to activate warp ability.");
            lore.add("" + ChatColor.YELLOW + "Launches you forward further than Windstep!");
            meta1.setLore(lore);
            meta1.setUnbreakable(true);
            shadowleap.setItemMeta(meta1);
            p.getInventory().addItem(shadowleap);


        }
        return true;
    }
}
