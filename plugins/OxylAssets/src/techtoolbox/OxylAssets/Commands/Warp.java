package techtoolbox.OxylAssets.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import techtoolbox.OxylAssets.Inventories.Warps;

public class Warp implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
	  Player player = (Player)sender;
	  if ((sender instanceof Player))
	  {
	    if (args.length == 0) {
	      Warps.openWarpsGUI(player);
	    } else {
	    	
	    }
	  }
	  else {
	    sender.sendMessage("You must be a player to use this command!");
	  }
	  return true;	
	}
}

