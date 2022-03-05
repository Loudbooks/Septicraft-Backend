package me.loudsnow.mcplug;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
/*
public class BankerSetup extends JavaPlugin {
    public static void main(String[] args) {
        HashMap<String, Integer> username = new HashMap<>();

        username.put()
    }
}
*/

public class BankerSetup implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory inv = Bukkit.createInventory(null, 9, "Bank");

            ItemStack withdraw = new ItemStack(Material.CHEST_MINECART);
            ItemMeta meta = withdraw.getItemMeta();
            meta.setDisplayName(ChatColor.BOLD + "Withdraw Coins");
            withdraw.setItemMeta(meta);

            ItemStack deposit = new ItemStack(Material.HOPPER_MINECART);
            ItemMeta meta1 = deposit.getItemMeta();
            meta1.setDisplayName(ChatColor.BOLD + "Deposit Coins");



            inv.setItem(2, withdraw);
            inv.setItem(6, deposit);

            p.openInventory(inv);
            return true;

        }
        return false;
    }
}
