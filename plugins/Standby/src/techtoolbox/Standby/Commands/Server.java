package techtoolbox.Standby.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import techtoolbox.Standby.Main;
import techtoolbox.Standby.Inventories.ServersGUI;

public class Server implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			
			if (args.length < 1) {
				ServersGUI.openWarpsGUI(player);
			}
			else if (Main.InternalName.contains(args[0].toLowerCase())) {
				int index = Main.InternalName.indexOf(args[0].toLowerCase());
				player.sendMessage(Main.Name.get(index));
				player.sendMessage(Main.IP.get(index));
				player.sendMessage(Main.Port.get(index));
				player.sendMessage(Main.StartupPath.get(index));
				player.sendMessage(Main.ShutdownPath.get(index));
			}
		
	}
		return true;
	}
}