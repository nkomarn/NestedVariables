package com.nestedvariables.information.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.nestedvariables.information.Main;

public class Facebook implements CommandExecutor{
	
	//String FacebookPrefix = Main.plugin.getConfig().getString("Prefix.Facebook");
	//Boolean FacebookEnabled = Main.plugin.getConfig().getBoolean("Enabled.Facebook");
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[&9&lFacebook&7] &rTits"));
		}
		return true;
	}

}
