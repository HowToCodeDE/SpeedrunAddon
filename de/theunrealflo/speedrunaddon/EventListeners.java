package de.theunrealflo.speedrunaddon;

import org.bukkit.Bukkit;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import me.ddquin.*;


public class EventListeners implements Listener {
	public StopwatchMain stopwatchMain = (StopwatchMain)Bukkit.getPluginManager().getPlugin("Stopwatch");
	public boolean isRunning = false;
	
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
		if (!isRunning) {
			stopwatchMain.startStopwatch();
			isRunning = true;
		}
    }
	
	
	@EventHandler
    public void onEnderDragonDeath(EntityDeathEvent e)
	{
    	if(e.getEntity() instanceof EnderDragon){
            // do whatever
            stopwatchMain.pauseStopwatch(null);
        }
    }
}
