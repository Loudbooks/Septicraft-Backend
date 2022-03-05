package me.loudsnow.mcplug;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static me.loudsnow.mcplug.Main.bank;


/*
    @EventHandler
    public void onPlayerClickInventory(InventoryClickEvent e) {
        if(e.getView().getTitle().equalsIgnoreCase("Bank")) {

            if (e.getCurrentItem().getItemMeta() != null){
                if (e.getCurrentItem().getItemMeta().getDisplayName() != null) {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.BOLD + "Withdraw Coins")) {
                        Player p = (Player) e.getWhoClicked();
                        p.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "Giving 1 Coin!");
                        e.setCancelled(true);
                        Inventory inv = Bukkit.createInventory(null, 9, "Bank");

                        ItemStack with1 = new ItemStack(Material.CHEST_MINECART);
                        ItemMeta meta1 = with1.getItemMeta();
                        meta1.setDisplayName(ChatColor.BOLD + "Withdraw 1 Coin");
                        with1.setItemMeta(meta1);

                        ItemStack with2 = new ItemStack(Material.CHEST_MINECART);
                        ItemMeta meta2 = with2.getItemMeta();
                        meta2.setDisplayName(ChatColor.BOLD + "Withdraw 16 Coins");
                        with2.setItemMeta(meta2);

                        ItemStack with3 = new ItemStack(Material.CHEST_MINECART);
                        ItemMeta meta3 = with3.getItemMeta();
                        meta3.setDisplayName(ChatColor.BOLD + "Withdraw 32 Coins");
                        with3.setItemMeta(meta3);

                        ItemStack with4 = new ItemStack(Material.CHEST_MINECART);
                        ItemMeta meta4 = with4.getItemMeta();
                        meta4.setDisplayName(ChatColor.BOLD + "Withdraw 64 Coins");
                        with4.setItemMeta(meta4);

                        inv.setItem(1, with1);
                        inv.setItem(3, with2);
                        inv.setItem(5, with3);
                        inv.setItem(7, with4);

                        p.openInventory(inv);
                    }
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.BOLD + "Withdraw 1 Coin")) {
                        Player p = (Player) e.getWhoClicked();
                        p.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "Giving 1 coin!");
                        ItemStack sunflower = new ItemStack(Material.SUNFLOWER);
                        p.getInventory().addItem(sunflower);
                        e.setCancelled(true);
                    }


                }
            }

        }

    }

}
class  BankerCoins implements Listener {
    @EventHandler
    public void onPlayerClickInventory(InventoryClickEvent e) {
        if(e.getView().getTitle().equalsIgnoreCase("Bank")) {

            if (e.getCurrentItem().getItemMeta() != null){
                if (e.getCurrentItem().getItemMeta().getDisplayName() != null) {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.BOLD + "Withdraw 1 Coin")) {
                        Player player = (Player) e.getWhoClicked();
                        if (bank.containsKey(player.getUniqueId().toString())) {
                            String playerKey = player.getUniqueId().toString();
                            int num = bank.get(playerKey);
                            if (num >= 1){
                                player.sendMessage("You have enough!");
                                bank.put(playerKey, num --);
                            ItemStack sunflower = new ItemStack(Material.SUNFLOWER);
                            player.getInventory().addItem(sunflower);
                            }

                        } else {
                            player.sendMessage(ChatColor.RED + "ERROR: CANNOT FIND BANK HASH");
                        }

                    }


                }
            }

        }

    }

}
*/
