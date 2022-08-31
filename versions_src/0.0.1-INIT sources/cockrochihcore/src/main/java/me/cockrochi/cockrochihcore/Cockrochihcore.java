package me.cockrochi.cockrochihcore;

import me.cockrochi.cockrochihcore.Commands.DiamondChanceCommand;
import me.cockrochi.cockrochihcore.Commands.FeedCommand;
import me.cockrochi.cockrochihcore.EventListeners.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Cockrochihcore extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("Plugin enabled");
        getServer().getPluginManager().registerEvents(new LookAtLog(),this);
        getServer().getPluginManager().registerEvents(new StepOnGrassEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(),this);
        getServer().getPluginManager().registerEvents(new PlayerQuit(),this);
        getServer().getPluginManager().registerEvents(new PlayerDeath(), this);
        getServer().getPluginManager().registerEvents(new HitAnimal(),this);
        getServer().getPluginManager().registerEvents(new PlaceVehicle(),this);
        Objects.requireNonNull(getCommand("feed")).setExecutor(new FeedCommand());
        Objects.requireNonNull(getCommand("diamondchance")).setExecutor(new DiamondChanceCommand());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        System.out.println("Plugin disabled");
        // Plugin shutdown logic
    }
}
