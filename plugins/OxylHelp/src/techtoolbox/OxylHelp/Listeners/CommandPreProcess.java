package techtoolbox.OxylHelp.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import techtoolbox.OxylHelp.Main;

public class CommandPreProcess  implements Listener {
	
	@EventHandler
	public void playerCommandPreProcess(PlayerCommandPreprocessEvent event) {
		
		// Custom Help Override
		if (event.getMessage().contains("/help")) {
			Main.openBook(Main.book("Oxyl Guide", "Oxyl Staff", Main.pages), event.getPlayer());
			event.setCancelled(true);		
			return;
		}
	}
}