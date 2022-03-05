package me.loudsnow.mcplug.startersword;


import org.bukkit.inventory.ItemFlag;
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

public class starterswordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {

            Player p = (Player) sender;
            ItemStack basicsword = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta meta = basicsword.getItemMeta();
            meta.setDisplayName(ChatColor.GRAY + "Basic Sword");
            meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(),  "generic.attackDamage", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
            meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            meta.isUnbreakable();
            if(p.getItemInHand() != null && p.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Basic Sword");) {
                meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(),  "generic.attackSpeed", 1.8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
            }
            List<String> lore = new ArrayList<>();
            lore.add("It's a solid starter weapon!");
            meta.setLore(lore);
            p.getInventory().addItem(basicsword);
            return true;

        }
        return false;
    }
}
