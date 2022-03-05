package me.loudsnow.mcplug;

import me.loudsnow.mcplug.cancelevents.*;
import me.loudsnow.mcplug.desolation.DesolationCommand;
import me.loudsnow.mcplug.meteorslam.MeteorSlamCommand;
import me.loudsnow.mcplug.meteorslam.MeteorSlamListener;
import me.loudsnow.mcplug.npcs.*;
import me.loudsnow.mcplug.shadowleap.ShadowleapCommand;
import me.loudsnow.mcplug.shadowleap.ShadowleapListener;
import me.loudsnow.mcplug.windstep.WindstepCommand;
import me.loudsnow.mcplug.windstep.WindstepListener;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Main extends JavaPlugin {
    public static File file;
    public static Main instance;
    public static Map<String, Integer> bank = new HashMap<String, Integer>();
    public static HashMap<String, Integer> cd = new HashMap<>();
    public static HashMap<String, Integer> cd1 = new HashMap<>();
    public static HashMap<String, Integer> cd2 = new HashMap<>();
    public static HashMap<String, Integer> hitground = new HashMap<>();
    public static HashMap<String, Integer> cd3 = new HashMap<>();
    public static HashMap<String, Integer> boolea = new HashMap<>();




    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new CancelPortal(), this);
        getServer().getPluginManager().registerEvents(new DeathEvent(), this);
        getServer().getPluginManager().registerEvents(new PigKillTest(), this);
        // getServer().getPluginManager().registerEvents(new ArmorStandCancel(), this);
        getServer().getPluginManager().registerEvents(new CancelBreakEvent(), this);
        getServer().getPluginManager().registerEvents(new CancelPlaceEvent(), this);
        getServer().getPluginManager().registerEvents(new NPC1(), this);
        getServer().getPluginManager().registerEvents(new NPC2(), this);
        getServer().getPluginManager().registerEvents(new NPC3(), this);
        getServer().getPluginManager().registerEvents(new NPC4(), this);
        getServer().getPluginManager().registerEvents(new NPC5(), this);
        getServer().getPluginManager().registerEvents(new TraderSpawn(), this);
        getServer().getPluginManager().registerEvents(new NPC6(), this);
        this.getCommand("getwindstep").setExecutor(new WindstepCommand());
        getServer().getPluginManager().registerEvents(new WindstepListener(), this);
        getServer().getPluginManager().registerEvents(new CancelDropEvent(), this);
        getServer().getPluginManager().registerEvents(new CancelFallDamage(), this);
        this.getCommand("getmeteorslam").setExecutor(new MeteorSlamCommand());
        this.getCommand("getshadowleap").setExecutor(new ShadowleapCommand());
        this.getCommand("getdesolation").setExecutor(new DesolationCommand());
        getServer().getPluginManager().registerEvents(new MeteorSlamListener(), this);
        getServer().getPluginManager().registerEvents(new CancelBedEnter(), this);
        getServer().getPluginManager().registerEvents(new ShadowleapListener(), this);
        getServer().getPluginManager().registerEvents(new TrainingDummy(), this);







        // HashMaps.bank = loadHashMap("bank");

        ConsoleCommandSender console = getServer().getConsoleSender();
        System.out.println(bank.get("Loudbook"));


    }

    @Override
    public void onDisable() {
        // saveHashMap(HashMaps.bank, ("bank"));

        }



}














    /*
    public void restoreBank() {
        this.getConfig().getConfigurationSection("data").getKeys(false).forEach(key ->{
            @SuppressWarnings("unchecked")
            Integer[] amount = ((List<Integer>) this.getConfig().get("data." + key)).toArray(new Integer[0]);
            bank.put(key, amount);
        });

    }


}


    public static void saveHashMap(HashMap<String, Integer> hm, String hashName) {
        file = new File(Main.instance.getDataFolder(), hashName + ".yml");
        System.out.println(Main.instance.getDataFolder().toString());

        if (!file.exists()){
            try {
                file.createNewFile();
                System.out.println("3");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("4");
            }
        }


        YamlConfiguration customFile = YamlConfiguration.loadConfiguration(file);
        // For every KEY the HashMap has...
        for (Object key : hm.keySet()) {
            // Use the YamlConfiguration to be able to read the new file as a .yml
            // and set it as needed, so that each player has their own file.
            // Each "player" file will have all of their stats such as XP
            // MaxHP, their level, coins, etc.
            customFile.set(hashName + "."+key, hm.get(key));

        }
        try {
            customFile.save(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



    public static HashMap<String, Integer> loadHashMap(String hashName) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        file = new File(Main.instance.getDataFolder(), hashName + ".yml");

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("3");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("4");
            }
        }

        YamlConfiguration customFile = YamlConfiguration.loadConfiguration(file);
        for (String key : customFile.getConfigurationSection(hashName).getKeys(true)) {
            // Load the config from the file, and apply it to the hashmaps needed.
            hm.put(key, (int) customFile.get(hashName + "." + key));
        }
        return hm;
    }

}
*/