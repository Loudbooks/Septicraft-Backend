package me.loudsnow.mcplug.windstep;

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

public class WindstepCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            ItemStack windstep = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta meta1 = (LeatherArmorMeta) windstep.getItemMeta();
            meta1.setDisplayName("" + ChatColor.WHITE + ChatColor.BOLD + "Windstep");
            meta1.setColor(Color.WHITE);
            ArrayList<String> lore = new ArrayList();
            lore.add("5 Second Cooldown");
            lore.add("" + ChatColor.YELLOW + ChatColor.BOLD + "Use CROUCH to activate warp ability.");
            lore.add("" + ChatColor.YELLOW + "Launches you forward.");
            meta1.setLore(lore);
            meta1.setUnbreakable(true);
            windstep.setItemMeta(meta1);
            p.getInventory().addItem(windstep);


        }
        return true;
    }
}
