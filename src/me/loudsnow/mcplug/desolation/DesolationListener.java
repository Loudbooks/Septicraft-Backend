package me.loudsnow.mcplug.desolation;


import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
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
            meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,100.0);
            List<String> lore = new ArrayList<>();
            lore.add("Everything is destroyed...");
            lore.add("            -???");
            p.getInventory().addItem(desolation);
            return true;
           //wut is this red sqaure here at line 23 it shows the color it means nothing okay i gtg ty for halp it should work thank u
            // i hve no idea how to make the ability work xD k il work on it
            // ok ill send it to u trmw wait dont leave yet i need to get this code over to my e
            // ditor I alr know what you want
            // add mining fatigue
            // for slower attack speed
            // Can you add it to the pull request ill try
            // just copy paste into github? yea i think or or you can reupload 1 sec
        }
    return false;
    }
}
