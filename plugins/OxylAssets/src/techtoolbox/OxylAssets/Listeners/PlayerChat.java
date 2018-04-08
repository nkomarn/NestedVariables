package techtoolbox.OxylAssets.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener {
	
	@EventHandler
    public void chatFormat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		event.setFormat(ChatColor.DARK_GRAY + player.getDisplayName() + ": " + ChatColor.WHITE + event.getMessage());
	}
}
