package com.nestedvariables.information.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.nestedvariables.information.Main;

public class Snapchat implements CommandExecutor {

	String SnapchatPrefix = Main.plugin.getConfig().getString("Prefix.Snapchat");
	Boolean SnapchatEnabled = Main.plugin.getConfig().getBoolean("Enabled.Snapchat");

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', SnapchatPrefix));
		}
		return true;
	}

}
