package techtoolbox.OxylHub.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import techtoolbox.OxylHub.Inventories.ServersGUI;

public class Servers implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			
			// Display server selection GUI
			ServersGUI.showServers(player);
		}
		else {
			sender.sendMessage("Cannot run command from console.");
		}
		return true;
	}

}
