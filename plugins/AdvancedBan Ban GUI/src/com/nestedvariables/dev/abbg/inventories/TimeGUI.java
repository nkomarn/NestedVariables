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
		
		//Create 1 Hour Item
		ItemStack hourItem = new ItemStack(Material.GREEN_RECORD, 1, (short) 0);
		ItemMeta hourItemMeta = hourItem.getItemMeta();
		hourItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&l1 Hour Punishment"));
		hourItem.setItemMeta(hourItemMeta);
		
		//Create 1 Day Item
		ItemStack dayItem = new ItemStack(Material.GOLD_RECORD, 1, (short) 0);
		ItemMeta dayItemMeta = dayItem.getItemMeta();
		dayItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&l1 Day Punishment"));
		dayItem.setItemMeta(dayItemMeta);
		
		//Create 1 Week Item
		ItemStack weekItem = new ItemStack(Material.RECORD_3, 1, (short) 0);
		ItemMeta weekItemMeta = weekItem.getItemMeta();
		weekItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&l1 Week Punishment"));
		weekItem.setItemMeta(weekItemMeta);
		
		
		
		//Set Item Locations
		Time.setItem(1, hourItem);
		Time.setItem(3, dayItem);
		Time.setItem(5, weekItem);
		
		//Open Inventory
		player.openInventory(Time);
		
		
	}

}
