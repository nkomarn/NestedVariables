package techtoolbox.OxylBeta.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Message implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (args.length < 1) {
				player.sendMessage("§8(§c!§8) §cSpecify a recipient.");
			}
			else if (args.length > 0) {
				//  See if player is online (Will throw NullPointerException if player doesn't exist)
				if (Bukkit.getServer().getPlayer(args[0]) != null) {
					Player recipient =  Bukkit.getServer().getPlayer(args[0]);
					
					// Check is recipient is online
					if (recipient.isOnline()) {
						
						// Combine arguments and send message
						String message = "";
						
					    for(int i = 1; i < args.length; i++){
					         String arg = args[i] + " ";
					         message = message + arg;
					    }
					     
						recipient.sendMessage("§8(§a!§8) §aMessage from " + ((Player) sender).getName() + "§8 » " + message);
					}
					else {
						player.sendMessage("§8(§c!§8) §cRecipient not online.");
					}
				}
				else {
					player.sendMessage("§8(§c!§8) §cRecipient not online.");
				}
				
				/* try {
					Player recipient =  Bukkit.getServer().getPlayer(args[0]);
					
					
					if (recipient.isOnline()) {
						// Combine arguments and send message
						String message = "";
						
					    for(int i = 1; i < args.length; i++){
					         String arg = args[i] + " ";
					         message = message + arg;
					    }
					     
						recipient.sendMessage("§8(§a!§8) §aMessage from " + ((Player) sender).getName() + "§8 » " + message);
					}
					else {
						player.sendMessage("§8(§c!§8) §cRecipient not online.");
					}
			    } catch (NullPointerException e) {   }
				finally {
					player.sendMessage("§8(§c!§8) §cRecipient not online.");
				}
				*/
			}
		}
		else {
			sender.sendMessage("There are "  + Bukkit.getServer().getOnlinePlayers().length + " player online.");
		}
		return true;
	}

}
