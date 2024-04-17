package fr.mynosci.mytools.commands;

import fr.mynosci.mytools.Mytools;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BlockinfoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        Block block = p.getTargetBlock(null, 4);
        Material type = block.getType();
        if(Mytools.getLang().equals("en")) {
            p.sendMessage("§eBlock information:\n§dName of block: §5" + type + "\n§dMetadata of block: §5" + block.getBlockData());
        }
        if(Mytools.getLang().equals("fr")){
            p.sendMessage("§eInformation du bloc:\n§dNom du bloc: §5" + type + "\n§dMétadonnées du block: §5" + block.getBlockData());
        }
        if(Mytools.getLang().equals("de")){
            p.sendMessage("§eInformation des Blocks: \n§dName des Blocks: §5" + type + "\n§dMetadaten von Blocks: §5" + block.getBlockData());
        }
        isRedstoneBlock(p);
        return true;
    }

    public static void isRedstoneBlock(Player p) {
        Material type = p.getTargetBlock(null, 4).getType();
        Boolean result = false;
        if (type == Material.REDSTONE || type == Material.REDSTONE_BLOCK || type == Material.REDSTONE_LAMP || type == Material.REDSTONE_TORCH) {
            if(Mytools.getLang().equals("en")) {
                p.sendMessage("§dPower state: §5" + p.getLocation().getBlock().getBlockPower());
            }
            if(Mytools.getLang().equals("fr")){
                p.sendMessage("§dEtat d'activation:" + "§5" + p.getLocation().getBlock().getBlockPower());
            }
            if(Mytools.getLang().equals("de")){
                p.sendMessage("§dAktivierungszustand: §5" + p.getLocation().getBlock().getBlockPower());
            }
            result = true;
        }
    }
}

