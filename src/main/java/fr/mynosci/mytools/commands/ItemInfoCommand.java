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
        if(hand.getType() == Material.AIR){
            p.sendMessage("§cYou don't have an object in your hand. Code for air: Material.AIR");
        }
        else {
            p.sendMessage("§cInformation about the item you are holding: §a" + hand.getType() + "\n §cItem metadata: §a" + hand.getItemMeta());
        }
        return false;
    }
}
