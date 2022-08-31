package me.cockrochi.cockrochihcore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class DiamondChanceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Random rn = new Random();
        int res = rn.nextInt(11);

        if (command.getName().equalsIgnoreCase("diamondchance")){
            if (sender instanceof Player){
                Player p = ((Player) sender);
                if (res == 1){
                    p.getInventory().addItem(new ItemStack(Material.DIAMOND, 1));
                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "You won the lottery!");

                } else {
                    Location l = p.getLocation();
                    p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Uh oh, you dun fucked up now");
                    p.sendTitle(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Run.", null,20,50,20);
                    for(int i = 0;i < 10;i++){
                        p.getWorld().spawnEntity(l, EntityType.PRIMED_TNT);
                    }
                }
            }
        }
        return true;
    }
}
