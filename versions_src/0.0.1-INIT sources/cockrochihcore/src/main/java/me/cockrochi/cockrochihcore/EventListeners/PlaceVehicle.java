package me.cockrochi.cockrochihcore.EventListeners;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleCreateEvent;

public class PlaceVehicle implements Listener {

    @EventHandler
    public void onSpawnVehicle(VehicleCreateEvent e){
        e.setCancelled(true);
        Location l = e.getVehicle().getLocation();
        for(int i = 0;i < 5;i++){
            e.getVehicle().getWorld().spawnEntity(l, EntityType.PILLAGER);
            e.getVehicle().getWorld().setThundering(true);

        }
    }
}
