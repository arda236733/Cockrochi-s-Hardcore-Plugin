package me.cockrochi.cockrochihcore.EventListeners;

import me.cockrochi.cockrochihcore.Cockrochihcore;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath implements Listener {


    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        Player p = e.getEntity();
        e.setDeathMessage(ChatColor.BLUE + "" + ChatColor.BOLD + p.getDisplayName() + ChatColor.YELLOW + " has been slaughtered.");

    }
}
