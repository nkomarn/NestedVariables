package com.nestedvariables.dev.abbg.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ReportGUI implements Listener {
	
	public static void openReportGUI(Player player) {
		
		//Create Inventory
		Inventory Report = Bukkit.createInventory(null, 9, "Report a Bug/Player");
		
		//Create Bug Item
		ItemStack bugItem = new ItemStack(Material.MONSTER_EGG, 1, (short) 55);
		ItemMeta bugItemMeta = bugItem.getItemMeta();
		bugItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lReport a Bug."));
		bugItem.setItemMeta(bugItemMeta);
		
		//Create Player Item
		ItemStack playerItem = new ItemStack(Material.BEDROCK, 1, (short) 0);
		ItemMeta playerItemMeta = playerItem.getItemMeta();
		playerItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lReport a Player"));
		playerItem.setItemMeta(playerItemMeta);
		
		//Set Item Locations
		Report.setItem(2, bugItem);
		Report.setItem(6, playerItem);
		
		
		player.openInventory(Report);
	}

}
