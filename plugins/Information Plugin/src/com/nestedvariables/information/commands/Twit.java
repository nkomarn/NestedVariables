package com.nestedvariables.information.commands;

import org.bukkit.command.CommandExecutor;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Twit implements CommandExecutor{
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[&c&lT&6&ly&e&ll&a&le&b&lr&7] &rI am retard."));
		}
		return true;
	}


}
