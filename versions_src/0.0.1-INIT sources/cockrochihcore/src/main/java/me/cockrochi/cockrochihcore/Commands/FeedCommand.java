package me.cockrochi.cockrochihcore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class FeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("feed")){
            Random rn = new Random();
            int res = rn.nextInt(2);

            if(res == 1){
                if(sender instanceof Player) {
                    Player p = ((Player) sender);
                    int hu = p.getFoodLevel();
                    if (hu <= 16) {
                        p.setFoodLevel(hu + 4);
                        p.sendMessage(ChatColor.GREEN + "Om nom nom!");
                    }else{
                        p.sendMessage(ChatColor.RED + "Too full to be fed");
                    }
                }
                }else {
                if (sender instanceof Player){
                    Player p = ((Player) sender);
                    p.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 1000, 1));
                    p.sendMessage(ChatColor.RED + "OH NO THE FOOD WAS POISONED");
                }
            }

        }
        return true;
    }
}
