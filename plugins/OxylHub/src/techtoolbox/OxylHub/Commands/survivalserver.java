package techtoolbox.OxylHub.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import techtoolbox.OxylHub.OxylHub;

public class survivalserver implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		
		Player player = (Player) sender;
		
		// Send player to Skyblock
		ByteArrayDataOutput out = ByteStreams.newDataOutput();
		out.writeUTF("Connect");
		out.writeUTF("survival");
		
		player.sendPluginMessage(OxylHub.plugin, "BungeeCord", out.toByteArray());
		
		return true;
	}

}
