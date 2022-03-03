package me.loudsnow.mcplug.desolation;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
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
import java.util.ArrayList;
import java.util.List;

public class DesolationCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {

            Player p = (Player) sender;
            ItemStack desolation = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta meta = desolation.getItemMeta();
            meta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "Desolation");
            meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,100);
            meta.addEnchant(Enchantment.SWEEPING_EDGE , 3,false);
            meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ENCHANTS,ItemFlag.HIDE_POTION_EFFECTS);
            meta.isUnbreakable();
                if(p.getItemInHand() != null){
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING,1000000000, 2));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,10000,1));
                }
            List<String> lore = new ArrayList<>();
            lore.add("Everything is destroyed...");
            lore.add("            -???");
            meta.setLore(lore);
            p.getInventory().addItem(desolation);
            return true;
        }
    return false;
    }
}

