package fr.mynosci.mytools.commands;

import fr.mynosci.mytools.Mytools;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class LocationInfoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if(Mytools.getLang().equals("en")) {
            p.sendMessage("§eWorld: §6" + p.getWorld().getName() + "\n§eLocation of player: §6" + p.getLocation() + "\n§eLocation of targeted block: §6" + p.getTargetBlock(null, 4).getLocation());
        }
        if(Mytools.getLang().equals("fr")){
            p.sendMessage("§eMonde: §6" + p.getWorld().getName() + "\n§eEmplacement du joueur: §6" + p.getLocation() + "\n§eEmplacement du bloc ciblé: §6" + p.getTargetBlock(null, 4).getLocation());
        }
        if(Mytools.getLang().equals("de")){
            p.sendMessage("§eWelt: §6" + p.getWorld().getName() + "\n§eStandort des Spielers: §6" + p.getLocation() + "\n§eStandort des Zielblocks: §6" + p.getTargetBlock(null, 4).getLocation());
        }
        return false;
    }
}
