package fr.mynosci.mytools.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemInfoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender player, Command command, String s, String[] strings) {
        Player p = (Player) player;
        ItemStack hand = p.getInventory().getItemInMainHand();
        if (hand.getType() == Material.AIR) {
            if (fr.mynosci.mytools.Mytools.getLang().equals("en")) {
                p.sendMessage("§cYou don't have an object in your hand. Code for air: Material.AIR");
            }
            if (fr.mynosci.mytools.Mytools.getLang().equals("fr")) {
                p.sendMessage("§cVous n'avez pas d'objet en main. Code pour l'air: Material.AIR");
            }
            if (fr.mynosci.mytools.Mytools.getLang().equals("de")) {
                p.sendMessage("§cSie haben kein Objekt in der Hand. Code für Luft: Material.AIR");
            }
        } else {
            if (fr.mynosci.mytools.Mytools.getLang().equals("en")) {
                p.sendMessage("§cInformation about the item you are holding: §a" + hand.getType() + "\n §cItem metadata: §a" + hand.getItemMeta());
            }
            if (fr.mynosci.mytools.Mytools.getLang().equals("fr")) {
                p.sendMessage("§cInformation sur l'objet que vous tenez: §a" + hand.getType() + "\n §cMétadonnées de l'objet: §a" + hand.getItemMeta());
            }
            if (fr.mynosci.mytools.Mytools.getLang().equals("de")) {
                p.sendMessage("§cInformationen zum von Ihnen gehaltenen Gegenstand: §a" + hand.getType() + "\n §cMetadaten des Gegenstands: §a" + hand.getItemMeta());
            }
            return false;
        }
        return false;
    }
}
