package techtoolbox.OxylBeta.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class List implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (Bukkit.getServer().getOnlinePlayers().length == 0) {
				player.sendMessage("§8(§a!§8) §aThere are no players online.");
			}
			else if (Bukkit.getServer().getOnlinePlayers().length == 1) {
				player.sendMessage("§8(§a!§8) §aThere is " + Bukkit.getServer().getOnlinePlayers().length + " player online.");
			}
			else if (Bukkit.getServer().getOnlinePlayers().length > 1 ) {
				player.sendMessage("§8(§a!§8) §aThere are " + Bukkit.getServer().getOnlinePlayers().length + " players online.");
			}
		}
		else {
			sender.sendMessage("There are "  + Bukkit.getServer().getOnlinePlayers().length + " player online.");
		}
		return true;
	}

}
