package me.cockrochi.cockrochihcore.EventListeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.List;

public class LookAtLog implements Listener {

    @EventHandler
    public void onLookAtLog(PlayerMoveEvent e ){
        Player p = e.getPlayer();
        double h = p.getHealth();
        List<Block> pLineOfSight = p.getLineOfSight(null, 70);

        for (Block b : pLineOfSight){
            Material m = b.getType();
            System.out.println(pLineOfSight);

            if (m == Material.OAK_LOG){
                if (h > 1){
                    p.setHealth(h - 1.0);
                } else{
                    p.setHealth(0.0);
                }
                p.sendMessage(ChatColor.RED + "STOP LOOKING AT OAK TREES");
            }
        }

    }
}
