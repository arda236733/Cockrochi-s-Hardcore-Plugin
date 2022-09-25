package me.cockrochi.cockrochihcore.EventListeners;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class StepOnGrassEvent implements Listener {

    @EventHandler
    public void onStepOnGrass(PlayerMoveEvent e){
        Player p = e.getPlayer();
        double h = p.getHealth();
        Location l = p.getLocation();
        l.setY(l.getY() - 1);
        Location lc = new Location(p.getWorld(),l.getX(),l.getY(),l.getZ());
        Block b = lc.getBlock();
        Material m = b.getType();
        System.out.println(m);

        if (m == Material.GRASS_BLOCK){
            if (h > 1){
                p.setHealth(h - 1.0);
            } else {
                p.setHealth(0.0);
            }
            p.sendMessage(ChatColor.RED + "STOP TOUCHING GRASS");
        }
    }
}
