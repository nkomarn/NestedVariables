package com.nestedvariables.dev.abbg.inventories;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;



public class PunishGUI implements Listener {
	
	public static void openPunishGUI(Player player) {
		
		//Create Inventory
		Inventory Punish = Bukkit.createInventory(null,  18, "Punishments");
		
		//Create Ban Item
		ItemStack banItem = new ItemStack(Material.BEDROCK, 1, (short) 0);
		ItemMeta banItemMeta = banItem.getItemMeta();
		banItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lBan"));
		banItem.setItemMeta(banItemMeta);
		
		//Create Warning Item
		ItemStack warnItem = new ItemStack(Material.RAW_FISH, 1, (short) 0);
		ItemMeta warnItemMeta = warnItem.getItemMeta();
		warnItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&lWarn"));
		warnItem.setItemMeta(warnItemMeta);
		
		//Create Mute Item
		ItemStack muteItem = new ItemStack(Material.BARRIER, 1, (short) 0);
		ItemMeta muteItemMeta = muteItem.getItemMeta();
		muteItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&d&lMute"));
		muteItem.setItemMeta(muteItemMeta);
		
		//Create Kick Item
		ItemStack kickItem = new ItemStack(Material.DIAMOND_BOOTS, 1, (short) 0);
		ItemMeta kickItemMeta = kickItem.getItemMeta();
		kickItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9&lKick"));
		kickItem.setItemMeta(kickItemMeta);
		
		//Create Reports Item
		ItemStack reportItem = new ItemStack(Material.EMPTY_MAP, 1, (short) 0);
		ItemMeta reportItemMeta = reportItem.getItemMeta();
		reportItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lReports"));
		reportItem.setItemMeta(reportItemMeta);
		
		//Create History Item
		ItemStack historyItem = new ItemStack(Material.BOOK_AND_QUILL, 1, (short) 0);
		ItemMeta historyItemMeta = historyItem.getItemMeta();
		historyItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&lHistory"));
		historyItem.setItemMeta(historyItemMeta);
		
		//Create Appeals Item
		ItemStack appealsItem = new ItemStack(Material.PAPER, 1, (short) 0);
		ItemMeta appealsItemMeta = appealsItem.getItemMeta();
		appealsItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lAppeals"));
		appealsItem.setItemMeta(appealsItemMeta);
		
		//Set Item Locations
		Punish.setItem(1, banItem);
		Punish.setItem(3, warnItem);
		Punish.setItem(5, muteItem);
		Punish.setItem(7, kickItem);
		Punish.setItem(11, reportItem);
		Punish.setItem(13, historyItem);
		Punish.setItem(15, appealsItem);
		
		//Open Inventory
		player.openInventory(Punish);
	}
}
