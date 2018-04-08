package techtoolbox.OxylBeta.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
	
	public void onJoin(PlayerJoinEvent event) {
		Bukkit.getServer().broadcastMessage(event.getPlayer().getName() + " joined!");
	}
}
