package fr.mynosci.mytools;

import fr.mynosci.mytools.commands.BlockinfoCommand;
import fr.mynosci.mytools.commands.ItemInfoCommand;
import fr.mynosci.mytools.commands.LocationInfoCommand;
import fr.mynosci.mytools.utils.UpdateChecker;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mytools extends JavaPlugin {

    /**
     * Mytools Developpement
     *
     *
     * @author mynosci
     */

    public static Object getLang(){
        return Mytools.getPlugin(Mytools.class).getConfig().get("lang");
    }


    @Override
    public void onEnable() {
        saveDefaultConfig();
        new UpdateChecker(this, 116226).getVersion(version -> {
                    if(this.getDescription().getVersion().equals(version)) {
                        getLogger().info("no new update");
                    }
                    else{
                        getLogger().info("New update availibe !");
                    }
                });
        log("Initialisation des commandes");
        getPlugin(Mytools.class).getCommand("iteminfo").setExecutor(new ItemInfoCommand());
        getPlugin(Mytools.class).getCommand("locinfo").setExecutor(new LocationInfoCommand());
        getPlugin(Mytools.class).getCommand("blockinfo").setExecutor(new BlockinfoCommand());
    }

    @Override
    public void onDisable() {
    }

    public static void log(String message){
        getPlugin(Mytools.class).getLogger().info(message);
    }
}
