package com.nestedvariables.dev.abbg.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.nestedvariables.dev.abbg.inventories.PunishGUI;

public class Punish implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			Bukkit.getConsoleSender().sendMessage(
					ChatColor.translateAlternateColorCodes('&', "&cInvalid command user, try again in-game!"));
		}

		else {
			Player player = (Player) sender;
			 PunishGUI.openPunishGUI(player);
		}
		return true;

	}
}