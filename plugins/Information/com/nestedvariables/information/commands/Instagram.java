package com.nestedvariables.information.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Instagram implements CommandExecutor{
	
	String InstagramPrefix = getConfig().getString("Prefix.Instagram");
	Boolean InstagramEnabled = getConfig().getBoolean("Enabled.Instagram");
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes("&", InstagramPrefix));
		}
	}

}
