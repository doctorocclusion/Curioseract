package zapcloud.curioseract.listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import zapcloud.curioseract.Curioseract;

public class ListenerLogin implements Listener
{
	@EventHandler
	public void onLogin(PlayerLoginEvent event)
	{
		Player player = event.getPlayer();
		
		player.setCanPickupItems(false);
		player.setSleepingIgnored(true);
		player.setAllowFlight(true);
		
		player.teleport(new Location(Curioseract.getTesseractWorld(), 0, 128, 0));
	}
}
