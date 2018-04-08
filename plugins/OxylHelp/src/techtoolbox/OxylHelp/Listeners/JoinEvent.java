package techtoolbox.OxylHelp.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event)
	{
		Player player = event.getPlayer();
	  	// Hasn't Played before
		 // Send title to player
		  if (player.hasPlayedBefore()) {
		    player.sendTitle(ChatColor.translateAlternateColorCodes('&', "&f&l&6&lOxyl Skyblock&f&l"), ChatColor.translateAlternateColorCodes('&', "&aWelcome back!"));
		  } else {
			
			// New Players
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&a&l!&8&l) &aWelcome to Oxyl Skyblock! Run &o/help&r&a to see all commands."));
		    player.sendTitle(ChatColor.translateAlternateColorCodes('&', "&f&l &6&lOxyl Skyblock&f&l"), ChatColor.translateAlternateColorCodes('&', "&aRun &a&o/help&a to get started!"));
		  }
	}
	
}
