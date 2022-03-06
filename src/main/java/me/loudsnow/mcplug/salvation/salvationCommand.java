package me.loudsnow.mcplug.salvation;

import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.EquipmentSlot;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class salvationCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {

            Player p = (Player) sender;
            ItemStack salvation = new ItemStack(Material.GOLD_INGOT, 1);
            ItemMeta meta = salvation.getItemMeta();
            meta.setDisplayName("" + ChatColor.GOLD +"Salvation");
            if(p.getEquipment().getItemInOffHand() != null && p.getEquipment().getItemInOffHand().getItemMeta().getDisplayName().equals("" + ChatColor.GOLD +"Salvation")) {
                meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "generic.armorValue", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND));
                meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "generic.healthValue", 5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND));
            }
            meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            meta.isUnbreakable();
            List<String> lore = new ArrayList<>();
            lore.add("" + ChatColor.GOLD + ChatColor.BOLD +"A chalice forged by the angels.It is said");
            lore.add("" + ChatColor.GOLD + ChatColor.BOLD +"to have incredible healing powers.");
            lore.add("" + ChatColor.YELLOW +"Use in offhand it gain buffs!");
            meta.setLore(lore);
            p.getInventory().addItem(salvation);
            return true;
        }
        return false;
    }
}
