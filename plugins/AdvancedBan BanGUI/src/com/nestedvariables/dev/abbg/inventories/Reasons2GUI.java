package com.nestedvariables.dev.abbg.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Reasons2GUI  implements Listener {
	
	
	public static void openReasons2GUI(Player player) {
		
		//Create Inventory
		Inventory Reasons2 = Bukkit.createInventory(null, 27, "Specific Punishment Reasons");
		
		//Create Killaura Item
		ItemStack killAuraItem = new ItemStack(Material.DIAMOND_SWORD, 1, (short) 0);
		ItemMeta killAuraItemMeta = killAuraItem.getItemMeta();
	    killAuraItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lKillaura"));
		killAuraItem.setItemMeta(killAuraItemMeta);
		
		//Create Reach Item
		ItemStack reachItem = new ItemStack(Material.PISTON_EXTENSION, 1, (short) 0);
		ItemMeta reachItemMeta = reachItem.getItemMeta();
		reachItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9&lReach"));
		reachItem.setItemMeta(reachItemMeta);
		
		//Create Speed Item
		ItemStack speedItem = new ItemStack(Material.BEACON, 1, (short) 0);
		ItemMeta speedItemMeta = speedItem.getItemMeta();
		speedItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lSpeed"));
		speedItem.setItemMeta(speedItemMeta);
		
		//Create Fly Item
		ItemStack flyItem = new ItemStack(Material.FEATHER, 1, (short) 0);
		ItemMeta flyItemMeta = flyItem.getItemMeta();
		flyItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&f&lFly"));
		flyItem.setItemMeta(flyItemMeta);
		
		//Create Scaffold Item
		ItemStack buildItem = new ItemStack(Material.COBBLESTONE, 1, (short) 0);
		ItemMeta buildItemMeta = buildItem.getItemMeta();
		buildItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7&lScaffold"));
		buildItem.setItemMeta(buildItemMeta);
		
		//Create Free-cam Item
		ItemStack camItem = new ItemStack(Material.COMPASS, 1, (short) 0);
		ItemMeta camItemMeta = camItem.getItemMeta();
		camItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&d&lFree-cam"));
		camItem.setItemMeta(camItemMeta);

		//Create X-ray Item
		ItemStack xrayItem = new ItemStack(Material.DIAMOND_ORE, 1, (short) 0);
		ItemMeta xrayItemMeta = xrayItem.getItemMeta();
		xrayItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8&lX-ray"));
		xrayItem.setItemMeta(xrayItemMeta);
		
		//Create Jesus Item
		ItemStack jesusItem = new ItemStack(Material.GLASS, 1, (short) 0);
		ItemMeta jesusItemMeta = jesusItem.getItemMeta();
		jesusItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lJesus"));
		jesusItem.setItemMeta(jesusItemMeta);
		
		//Create Chest-ESP Item
		ItemStack espCItem = new ItemStack(Material.CHEST, 1, (short) 0);
		ItemMeta espCItemMeta = espCItem.getItemMeta();
		espCItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&lChest-ESP"));
		espCItem.setItemMeta(espCItemMeta);
		
		//Create Player-ESP Item
		ItemStack espPItem = new ItemStack(Material.ARMOR_STAND, 1, (short) 0);
		ItemMeta espPItemMeta = espPItem.getItemMeta();
		espPItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3&lPlayer-ESP"));
		espPItem.setItemMeta(espPItemMeta);
		
		//Create Fast-Bow Item
		ItemStack fastBowItem = new ItemStack(Material.BOW, 1, (short) 0);
		ItemMeta fastBowItemMeta = fastBowItem.getItemMeta();
		fastBowItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&lFast-Bow"));
		fastBowItem.setItemMeta(fastBowItemMeta);
		
		//Create AntiKB Item
		ItemStack antiKBItem = new ItemStack(Material.SLIME_BALL, 1, (short) 0 );
		ItemMeta antiKBItemMeta = antiKBItem.getItemMeta();
		antiKBItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lAnti-Knockback"));
		antiKBItem.setItemMeta(antiKBItemMeta);
		
		//Create 
		
		//Set Item Locations
		Reasons2.setItem(1, killAuraItem);
		Reasons2.setItem(3, reachItem);
		Reasons2.setItem(5, speedItem);
		Reasons2.setItem(7, flyItem);
		Reasons2.setItem(9, buildItem);
		Reasons2.setItem(11, camItem);
		Reasons2.setItem(13, xrayItem);
		Reasons2.setItem(15, jesusItem);
		Reasons2.setItem(17, espCItem);
		Reasons2.setItem(19, espPItem);
		Reasons2.setItem(21, antiKBItem);
		
		//Open Inventory
		player.openInventory(Reasons2);
		
		
	}

}
