package com.nestedvariables.information.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.nestedvariables.information.Main;

public class Twitter implements CommandExecutor{
	

//	String TwitterPrefix = Main.plugin.getConfig().getString("Prefix.Twitter");
//	Boolean TwitterEnabled = Main.plugin.getConfig().getBoolean("Enabled.Twitter");
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[&b&lTwitter&7] &rTits"));
		}
		return true;
	}

}

