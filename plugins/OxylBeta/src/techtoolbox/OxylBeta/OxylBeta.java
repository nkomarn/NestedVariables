package techtoolbox.OxylBeta;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

import techtoolbox.OxylBeta.Commands.List;
import techtoolbox.OxylBeta.Commands.Message;
import techtoolbox.OxylBeta.Listeners.PlayerJoin;

public class OxylBeta extends JavaPlugin {

	@Override
	public void onEnable() {
		// Register Join Message Listener
		getServer().getPluginManager().registerEvent(Event.Type.PLAYER_LOGIN, new PlayerJoin(), Event.Priority.Highest, this);	
		getCommand("list").setExecutor(new List());
		getCommand("msg").setExecutor(new Message());
	}
	
	@Override
	public void onDisable() {
	
	}
}
