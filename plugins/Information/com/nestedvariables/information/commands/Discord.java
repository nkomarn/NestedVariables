package com.nestedvariables.information.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.nestedvariables.information.Main;



public class Discord implements CommandExecutor {
	
	String DiscordPrefix = Main.plugin.getConfig().getString("Prefix.Discord");
	Boolean DiscordEnabled = Main.plugin.getConfig().getBoolean("Enabled.Discord");
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', DiscordPrefix));
		}
	}

}
