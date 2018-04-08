package techtoolbox.OxylAssets.Listeners;


import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PlayerCommandPreProcess implements Listener {

	@EventHandler
	public void playerCommandPreProcess(PlayerCommandPreprocessEvent event) {
	if (!(event.getPlayer().hasPermission("oxyl.admin"))) {
				// Fake Plugins List (/plugins or /pl)
				if (event.getMessage().equalsIgnoreCase("/plugins")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&a&l!&8&l) &aPlugins: &7&oOxylAssets, ProtocolLib"));
					return;
				}
				else if (event.getMessage().equalsIgnoreCase("/pl")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&a&l!&8&l) &aPlugins: &7&oOxylAssets, ProtocolLib"));
					return;		
				}
				
				// No OP Permissions (/op or /deop)
				else if (event.getMessage().equalsIgnoreCase("/op")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
				else if (event.getMessage().equalsIgnoreCase("/deop")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
				
				// No Version Command (/version, /about, /ver, or /icanhasbukkit)
				else if (event.getMessage().equalsIgnoreCase("/version")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
				else if (event.getMessage().equalsIgnoreCase("/ver")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
				else if (event.getMessage().equalsIgnoreCase("/icanhasbukkit")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
				else if (event.getMessage().equalsIgnoreCase("/about")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
				
				// No Me Command (/me)
				else if (event.getMessage().equalsIgnoreCase("/me")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
				
				// No trigger Command (/trigger)
				else if (event.getMessage().equalsIgnoreCase("/trigger")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
				
				// No tps Command (/tps)
				else if (event.getMessage().equalsIgnoreCase("/tps")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
				
				// No reload, stop, or restart command (/stop, /restart, /reload)
				else if (event.getMessage().equalsIgnoreCase("/stop")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
				else if (event.getMessage().equalsIgnoreCase("/restart")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
				else if (event.getMessage().equalsIgnoreCase("/reload")) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cCommand not recognized."));
					return;	
				}
		}
	}
}
