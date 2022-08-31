package me.cockrochi.cockrochihcore.EventListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class HitAnimal implements Listener {
    @EventHandler
    public void onHitEntity(EntityDamageByEntityEvent e) {
        Entity en = e.getDamager();
        Entity hr = e.getEntity();
        Player p = ((Player) en);
        double h = p.getHealth();
        if (hr instanceof Animals){
            e.setCancelled(true);
            p.sendMessage(ChatColor.RED + "STOP HARMING ANIMALS");
            if (h > 2){
                p.setHealth(h - 2);
            } else {
                p.setHealth(0.0);
            }
        }

    }
}
