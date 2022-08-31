package me.cockrochi.cockrochihcore.EventListeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
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
        Block b = p.getTargetBlock(null, 4);
        Material m = b.getType();

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
