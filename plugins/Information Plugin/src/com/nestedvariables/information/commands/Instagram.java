package com.nestedvariables.information.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.nestedvariables.information.Main;

public class Instagram implements CommandExecutor{
	
//	String InstagramPrefix = Main.plugin.getConfig().getString("Prefix.Instagram");
//	Boolean InstagramEnabled = Main.plugin.getConfig().getBoolean("Enabled.Instagram");
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[&d&lInstagram&7] &rTits"));
		}
		return true;
	}

}
