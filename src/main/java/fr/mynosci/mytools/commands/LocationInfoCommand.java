package fr.mynosci.mytools.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LocationInfoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        p.sendMessage("§eWorld: §6" + p.getWorld().getName() + "\n§eLocation of player: §6" + p.getLocation() + "\n§eLocation of targeted block: §6" + p.getLocation().getBlock().getLocation());
        return false;
    }
}
