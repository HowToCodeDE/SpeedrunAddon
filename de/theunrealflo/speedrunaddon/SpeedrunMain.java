package de.theunrealflo.speedrunaddon;

import org.bukkit.plugin.java.JavaPlugin;

public class SpeedrunMain extends JavaPlugin {

    @Override
    public void onEnable() {
    	getLogger().info("SpeedrunAddon has been enabled!");
    	getServer().getPluginManager().registerEvents(new EventListeners(), this);
    }

    @Override
    public void onDisable() {
    	getLogger().info("SpeedrunAddon has been disabled!");
    }
}
