package me.loudsnow.mcplug.desolation;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.EquipmentSlot;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DesolationCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {

            Player p = (Player) sender;
            ItemStack desolation = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta meta = desolation.getItemMeta();
            meta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "Desolation");
            meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(),  "generic.attackSpeed", 50, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
            // no error
            // eeee
            meta.addEnchant(Enchantment.SWEEPING_EDGE , 3,false);
            meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ENCHANTS,ItemFlag.HIDE_POTION_EFFECTS);
            meta.isUnbreakable();
            if(p.getItemInHand() != null && p.getItemInHand().getItemMeta().getDisplayName().equals("" + ChatColor.RED + ChatColor.BOLD + "Desolation")) {
                meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(),  "generic.attackSpeed", 20, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
                // do i have full perms
                // i think so yeah
                // can you make a new class in this folder named DesolationListener
                // yes
            }
            List<String> lore = new ArrayList<>();
            lore.add("This sword is powerful,but my research says it's");
            lore.add("an imperfect form. I wonder...");
            lore.add("     -The Adventurer");
            meta.setLore(lore);
            p.getInventory().addItem(desolation);
            return true;

        }
        return false;
    }
}

