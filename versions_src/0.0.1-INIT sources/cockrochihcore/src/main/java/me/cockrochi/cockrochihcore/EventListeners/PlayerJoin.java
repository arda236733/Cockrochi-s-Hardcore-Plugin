package me.cockrochi.cockrochihcore.EventListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener{

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + p.getDisplayName() + ChatColor.YELLOW + " has joined the server!");
        p.sendMessage(ChatColor.RED + "You are gonna have a bad time");
        p.sendTitle(ChatColor.GREEN + "A plugin by cockrochi",ChatColor.LIGHT_PURPLE + "v0.0.1-INIT", 10 , 100, 20);
    }
}
