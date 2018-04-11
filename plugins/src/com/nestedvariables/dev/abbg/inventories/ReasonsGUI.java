package com.nestedvariables.dev.abbg.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ReasonsGUI implements Listener {
	
	
	public static void openReasonsGUI(Player player) {
		
		//Create Inventory
		Inventory Reasons = Bukkit.createInventory(null, 18, "General Punishment Reasons");
		
		//Create Hacking Item
		ItemStack hackItem = new ItemStack(Material.BEDROCK, 1, (short) 0);
		ItemMeta hackItemMeta = hackItem.getItemMeta();
		hackItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lHacking"));
		hackItem.setItemMeta(hackItemMeta);
		
		//Create Griefing Item
		ItemStack griefItem = new ItemStack(Material.DIAMOND_SPADE, 1, (short) 0);
		ItemMeta griefItemMeta = griefItem.getItemMeta();
		griefItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9&lGriefing"));
		griefItem.setItemMeta(griefItemMeta);
		
		//Create Advertising Item
		ItemStack advertItem = new ItemStack(Material.EMPTY_MAP, 1, (short) 0);
		ItemMeta advertItemMeta = advertItem.getItemMeta();
		advertItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lAdvertising"));
		advertItem.setItemMeta(advertItemMeta);
		
		//Create Skin Item
		ItemStack skinItem = new ItemStack(Material.ARMOR_STAND, 1, (short) 0);
		ItemMeta skinItemMeta = skinItem.getItemMeta();
		skinItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7&lInappropriate Skin"));
		skinItem.setItemMeta(skinItemMeta);
		
		//Create Name Item
		ItemStack nameItem = new ItemStack(Material.NAME_TAG, 1, (short) 0);
		ItemMeta nameItemMeta = nameItem.getItemMeta();
		nameItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&f&lInappropriate Username"));
		nameItem.setItemMeta(nameItemMeta);
		
		//Create Disrespect Item
		ItemStack disrespectItem = new ItemStack(Material.EYE_OF_ENDER, 1, (short) 0);
		ItemMeta disrespectItemMeta = disrespectItem.getItemMeta();
		disrespectItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lStaff Disrespect"));
		disrespectItem.setItemMeta(disrespectItemMeta);
		
		//Create Cape Item
		ItemStack capeItem = new ItemStack(Material.BANNER, 1, (short) 0);
		ItemMeta capeItemMeta = capeItem.getItemMeta();
		capeItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&"));
		capeItem.setItemMeta(capeItemMeta);
		
		//Create Spam Item
		ItemStack spamItem = new ItemStack(Material.BOOK_AND_QUILL, 1, (short) 0);
		ItemMeta spamItemMeta = capeItem.getItemMeta();
		spamItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&"));
		
		//Set Item Locations
		Reasons.setItem(0, hackItem);
		Reasons.setItem(2, griefItem);
		Reasons.setItem(4, advertItem);
		Reasons.setItem(6, skinItem);
		Reasons.setItem(8, nameItem);
		Reasons.setItem(10,  capeItem);
		Reasons.setItem(12, disrespectItem);
		
		//Open Inventory
		player.openInventory(Reasons);
		
		
	}

}
