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
		Inventory Time = Bukkit.createInventory(null, 18, "Duration of Punishment");
		
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
		
		//Create 1 Month Item
		ItemStack monthItem = new ItemStack(Material.RECORD_4, 1, (short) 0);
		ItemMeta monthItemMeta = monthItem.getItemMeta();
		monthItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&d&l1 Month Punishment"));
		monthItem.setItemMeta(monthItemMeta);
		
		//Create 2 Month Item
		ItemStack twoMonthItem = new ItemStack(Material.RECORD_5, 1, (short) 0);
		ItemMeta twoMonthItemMeta = twoMonthItem.getItemMeta();
		twoMonthItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l2 Month Punishment"));
		twoMonthItem.setItemMeta(twoMonthItemMeta);
		
		//Create 3 Month Item
		ItemStack threeMonthItem = new ItemStack(Material.RECORD_6, 1, (short) 0);
		ItemMeta threeMonthItemMeta = threeMonthItem.getItemMeta();
		threeMonthItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3&l3 Month Punishment"));
		threeMonthItem.setItemMeta(threeMonthItemMeta);
		
		//Create 6 Month Item
		ItemStack sixMonthItem = new ItemStack(Material.RECORD_7, 1, (short) 0);
		ItemMeta sixMonthItemMeta = sixMonthItem.getItemMeta();
		sixMonthItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&l6 Month Punishment"));
		sixMonthItem.setItemMeta(sixMonthItemMeta);
		
		//Create 9 Month Item
		ItemStack nineMonthItem = new ItemStack(Material.RECORD_8, 1, (short) 0);
		ItemMeta nineMonthItemMeta = nineMonthItem.getItemMeta();
		nineMonthItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9&l9 Month Punishment"));
		nineMonthItem.setItemMeta(nineMonthItemMeta);
		
		//Create Perm Item
		ItemStack permItem = new ItemStack(Material.BEDROCK, 1, (short) 0);
		ItemMeta permItemMeta = permItem.getItemMeta();
		permItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lPermanant Punishment"));
		permItem.setItemMeta(permItemMeta);
		
		//Set Item Locations
		Time.setItem(0, hourItem);
		Time.setItem(2, dayItem);
		Time.setItem(4, weekItem);
		Time.setItem(6, monthItem);
		Time.setItem(8, twoMonthItem);
		Time.setItem(10, threeMonthItem);
		Time.setItem(12,  sixMonthItem);
		Time.setItem(14, nineMonthItem);
		Time.setItem(16, permItem);
		
		//Open Inventory
		player.openInventory(Time);
		
		
	}

}
