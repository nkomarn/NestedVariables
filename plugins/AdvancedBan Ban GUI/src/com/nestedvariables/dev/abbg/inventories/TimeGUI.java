package com.nestedvariables.dev.abbg.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class TimeGUI implements Listener {
	
	
	public static void openTimeGUI(Player player) {
		
		//Create Inventory
		Inventory Time = Bukkit.createInventory(null, 54, "Duration of Punishment");
		
		//Create 1Hour Item
		ItemStack hourItem = new ItemStack(Material.BEDROCK, 1, (short) 0);
		ItemMeta hourItemMeta = hourItem.getItemMeta();
		hourItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&l1 Hour Punishment"));
		hourItem.setItemMeta(hourItemMeta);
		
		
		//Set Item Locations
		Time.setItem(1, hourItem);
		
		//Open Inventory
		player.openInventory(Time);
		
		
	}

}
