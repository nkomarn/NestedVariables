package techtoolbox.OxylAssets.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import techtoolbox.OxylAssets.Main;

public class JoinEvent implements Listener {
	
	String title = Main.plugin.getConfig().getString("title");
	String newPlayer = Main.plugin.getConfig().getString("subtitle.new-player");
	String existingPlayer = Main.plugin.getConfig().getString("subtitle.existing-player");
	boolean titleEnabled = Main.plugin.getConfig().getBoolean("title-enabled");
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event)
	{
	  Player player = event.getPlayer();
	  if (titleEnabled == true) {
		  // Send title to player
		  if (player.hasPlayedBefore()) {
		    player.sendTitle(ChatColor.translateAlternateColorCodes('&', title), ChatColor.translateAlternateColorCodes('&', existingPlayer));
		  } else {
			
			// New Players
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&a&l!&8&l) &aWelcome to Oxyl Skyblock! Run &o/help&r&a to see all commands."));
		    player.sendTitle(ChatColor.translateAlternateColorCodes('&', title), ChatColor.translateAlternateColorCodes('&', newPlayer));
		  }
	  }
	  else {
		  
	  }
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent event) {

	}
}
