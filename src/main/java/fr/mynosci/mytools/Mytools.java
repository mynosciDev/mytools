package fr.mynosci.mytools;

import fr.mynosci.mytools.commands.ItemInfoCommand;
import fr.mynosci.mytools.commands.LocationInfoCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mytools extends JavaPlugin {

    /**
     * Mytools Developpement
     * @author mynosci
     */


    @Override
    public void onEnable() {
        log("Initialisation des commandes");
        getPlugin(Mytools.class).getCommand("iteminfo").setExecutor(new ItemInfoCommand());
        getPlugin(Mytools.class).getCommand("locinfo").setExecutor(new LocationInfoCommand());

    }

    @Override
    public void onDisable() {
    }

    public static void log(String message){
        getPlugin(Mytools.class).getLogger().info(message);
    }
}
