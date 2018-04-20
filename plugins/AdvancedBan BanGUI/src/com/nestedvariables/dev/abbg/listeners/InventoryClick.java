package com.nestedvariables.dev.abbg.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

//import com.nestedvariables.dev.abbg.inventories.AppealsGUI;
//import com.nestedvariables.dev.abbg.inventories.HistoryGUI;
import com.nestedvariables.dev.abbg.inventories.PlayerGUI;
import com.nestedvariables.dev.abbg.inventories.Reasons2GUI;
import com.nestedvariables.dev.abbg.inventories.ReasonsGUI;
import com.nestedvariables.dev.abbg.inventories.TimeGUI;

public class InventoryClick implements Listener {

	public static Integer duration;
	public static Integer durationInvis; // Integer for Internal use only.
	public static String playerName;
	public static String operator;
	public static String type;
	public static String reason;
	public static String command;
	public static String start;
	public static String end;
	public static String reason2;
	public static String search;
	public static String durationText;
	public static String durationTextShort;

	@EventHandler
	public void inventoryClickEvent(InventoryClickEvent event) {
		Inventory inventory = event.getInventory();
		String inventoryName = inventory.getName();

		if (inventoryName.equals("Punishments")) {
			event.setCancelled(true);
			int slot = event.getSlot();
			if (slot == 1) {
				Player player = (Player) event.getWhoClicked();
				type = "tempban";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				
				int i = 0;
				int invSize;

				invSize = Math.min( 54, (Bukkit.getServer().getOnlinePlayers().size()/9+1)*9);
				
				Inventory players = Bukkit.createInventory(null, invSize, "Online players");
				for (Player all : Bukkit.getOnlinePlayers()) {

					ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
					SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
					skullMeta.setOwner(all.getName());
					skullMeta.setDisplayName(all.getName());
					skull.setItemMeta(skullMeta);
					players.setItem(i, skull);
					i++;
				}
				player.openInventory(players);
				ItemStack item = event.getCurrentItem();
				playerName = item.getItemMeta().getDisplayName();
				event.setCancelled(true);
				return;
			} else if (slot == 3) {
				Player player = (Player) event.getWhoClicked();
				type = "warn";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				
				int i = 0;
				int invSize;

				invSize = Math.min( 54, (Bukkit.getServer().getOnlinePlayers().size()/9+1)*9);
				
				Inventory players = Bukkit.createInventory(null, invSize, "Online players");
				for (Player all : Bukkit.getOnlinePlayers()) {

					ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
					SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
					skullMeta.setOwner(all.getName());
					skullMeta.setDisplayName(all.getName());
					skull.setItemMeta(skullMeta);
					players.setItem(i, skull);
					i++;
				}
				player.openInventory(players);
				ItemStack item = event.getCurrentItem();
				playerName = item.getItemMeta().getDisplayName();
				event.setCancelled(true);
				return;
			} else if (slot == 5) {
				Player player = (Player) event.getWhoClicked();
				type = "mute";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				
				int i = 0;
				int invSize;

				invSize = Math.min( 54, (Bukkit.getServer().getOnlinePlayers().size()/9+1)*9);
				
				Inventory players = Bukkit.createInventory(null, invSize, "Online players");
				for (Player all : Bukkit.getOnlinePlayers()) {

					ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
					SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
					skullMeta.setOwner(all.getName());
					skullMeta.setDisplayName(all.getName());
					skull.setItemMeta(skullMeta);
					players.setItem(i, skull);
					i++;
				}
				player.openInventory(players);
				ItemStack item = event.getCurrentItem();
				playerName = item.getItemMeta().getDisplayName();
				event.setCancelled(true);
				return;
			} else if (slot == 7) {
				Player player = (Player) event.getWhoClicked();
				type = "kick";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				
				int i = 0;
				int invSize;

				invSize = Math.min( 54, (Bukkit.getServer().getOnlinePlayers().size()/9+1)*9);
				
				Inventory players = Bukkit.createInventory(null, invSize, "Online players");
				for (Player all : Bukkit.getOnlinePlayers()) {

					ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
					SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
					skullMeta.setOwner(all.getName());
					skullMeta.setDisplayName(all.getName());
					skull.setItemMeta(skullMeta);
					players.setItem(i, skull);
					i++;
				}
				player.openInventory(players);
				ItemStack item = event.getCurrentItem();
				playerName = item.getItemMeta().getDisplayName();
				event.setCancelled(true);
				return;
			} else if (slot == 11) {
				Player player = (Player) event.getWhoClicked();
				event.setCancelled(true);
				player.closeInventory();
				return;
			} else if (slot == 13) {
				Player player = (Player) event.getWhoClicked();
				command = "history";
				event.setCancelled(true);
				player.closeInventory();
				
				int i = 0;
				int invSize;

				invSize = Math.min( 54, (Bukkit.getServer().getOnlinePlayers().size()/9+1)*9);
				
				Inventory players = Bukkit.createInventory(null, invSize, "Online players");
				for (Player all : Bukkit.getOnlinePlayers()) {

					ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
					SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
					skullMeta.setOwner(all.getName());
					skullMeta.setDisplayName(all.getName());
					skull.setItemMeta(skullMeta);
					players.setItem(i, skull);
					i++;
				}
				player.openInventory(players);
				ItemStack item = event.getCurrentItem();
				playerName = item.getItemMeta().getDisplayName();
				event.setCancelled(true);
				return;
			} else if (slot == 15) {
				Player player = (Player) event.getWhoClicked();
				event.setCancelled(true);
				player.closeInventory();
				return;
			} else {
			}
		} else {

		}
		if (inventoryName.equals("Online players")) {
			Player player = (Player) event.getWhoClicked();
		    ItemStack item = event.getCurrentItem();
		         playerName = item.getItemMeta().getDisplayName();
		         player.sendMessage("Variable set to: " + playerName);
		         event.setCancelled(true);
		         player.closeInventory();
		         ReasonsGUI.openReasonsGUI(player);
		         return;
		} else {

		}

		if (inventoryName.equals("General Punishment Reasons")) {
			event.setCancelled(true);
			int slot = event.getSlot();
			if (slot == 0) {
				Player player = (Player) event.getWhoClicked();
				reason = "Hacking - ";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				Reasons2GUI.openReasons2GUI(player);
				return;
			} else if (slot == 2) {
				Player player = (Player) event.getWhoClicked();
				reason = "Griefing - ";
				event.setCancelled(true);
				player.closeInventory();
				TimeGUI.openTimeGUI(player);
				return;
			} else if (slot == 4) {
				Player player = (Player) event.getWhoClicked();
				reason = "Advertising - ";
				event.setCancelled(true);
				player.closeInventory();
				TimeGUI.openTimeGUI(player);
				return;
			} else if (slot == 6) {
				Player player = (Player) event.getWhoClicked();
				reason = "Inappropriate Skin - ";
				event.setCancelled(true);
				player.closeInventory();
				TimeGUI.openTimeGUI(player);
				return;
			} else if (slot == 8) {
				Player player = (Player) event.getWhoClicked();
				reason = "Inappropriate Username - ";
				event.setCancelled(true);
				player.closeInventory();
				TimeGUI.openTimeGUI(player);
				return;
			} else if (slot == 10) {
				Player player = (Player) event.getWhoClicked();
				reason = "Inappropriate Cape - ";
				event.setCancelled(true);
				player.closeInventory();
				TimeGUI.openTimeGUI(player);
				return;
			} else if (slot == 12) {
				Player player = (Player) event.getWhoClicked();
				reason = "Disrespecting Staff - ";
				event.setCancelled(true);
				player.closeInventory();
				TimeGUI.openTimeGUI(player);
				return;
			} else if (slot == 14) {
				Player player = (Player) event.getWhoClicked();
				reason = "Spamming - ";
				event.setCancelled(true);
				player.closeInventory();
				TimeGUI.openTimeGUI(player);
				return;
			} else {

			}

			if (inventoryName.equals("Specific Punishment Reasons")) {
				event.setCancelled(true);
				int slot2 = event.getSlot();
				if (slot2 == 1) {
					Player player = (Player) event.getWhoClicked();
					reason2 = "Killaura - ";
					operator = event.getWhoClicked().getName();
					event.setCancelled(true);
					player.closeInventory();
					TimeGUI.openTimeGUI(player);
					return;
				} else if (slot2 == 3) {
					Player player = (Player) event.getWhoClicked();
					reason2 = "Reach - ";
					event.setCancelled(true);
					player.closeInventory();
					TimeGUI.openTimeGUI(player);
					return;
				} else if (slot2 == 5) {
					Player player = (Player) event.getWhoClicked();
					reason2 = "Speed - ";
					event.setCancelled(true);
					player.closeInventory();
					TimeGUI.openTimeGUI(player);
					return;
				} else if (slot2 == 7) {
					Player player = (Player) event.getWhoClicked();
					reason2 = "Fly - ";
					event.setCancelled(true);
					player.closeInventory();
					TimeGUI.openTimeGUI(player);
					return;
				} else if (slot2 == 9) {
					Player player = (Player) event.getWhoClicked();
					reason2 = "Scaffold - ";
					event.setCancelled(true);
					player.closeInventory();
					TimeGUI.openTimeGUI(player);
					return;
				} else if (slot2 == 11) {
					Player player = (Player) event.getWhoClicked();
					reason2 = "Free-cam - ";
					event.setCancelled(true);
					player.closeInventory();
					TimeGUI.openTimeGUI(player);
					return;
				} else if (slot2 == 13) {
					Player player = (Player) event.getWhoClicked();
					reason2 = "XRay - ";
					event.setCancelled(true);
					player.closeInventory();
					TimeGUI.openTimeGUI(player);
					return;
				} else if (slot2 == 15) {
					Player player = (Player) event.getWhoClicked();
					reason2 = "Jesus - ";
					event.setCancelled(true);
					player.closeInventory();
					TimeGUI.openTimeGUI(player);
					return;
				} else if (slot2 == 17) {
					Player player = (Player) event.getWhoClicked();
					reason2 = "Chest-ESP - ";
					event.setCancelled(true);
					player.closeInventory();
					TimeGUI.openTimeGUI(player);
					return;
				} else if (slot2 == 19) {
					Player player = (Player) event.getWhoClicked();
					reason2 = "Player-ESP - ";
					event.setCancelled(true);
					player.closeInventory();
					TimeGUI.openTimeGUI(player);
					return;
				}
				if (inventoryName.equals("Duration of Punishment")) {
					event.setCancelled(true);
					int slot3 = event.getSlot();
					if (slot3 == 1) {
						Player player = (Player) event.getWhoClicked();
						duration = 1;
						durationText = " Hour";
						durationTextShort = "h";
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 3) {
						Player player = (Player) event.getWhoClicked();
						duration = 1;
						durationText = " Day";
						durationTextShort = "d";
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 5) {
						Player player = (Player) event.getWhoClicked();
						duration = 7;
						durationText = " Day";
						durationTextShort = "d";
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 7) {
						Player player = (Player) event.getWhoClicked();
						duration = 1;
						durationText = " Month";
						durationTextShort = "mo";
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 11) {
						Player player = (Player) event.getWhoClicked();
						duration = 3;
						durationText = " Months";
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 13) {
						Player player = (Player) event.getWhoClicked();
						duration = 6;
						durationText = " Months";
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 15) {
						Player player = (Player) event.getWhoClicked();
						duration = 9;
						durationText = " Months";
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else {
					}
				} else {

				}

			}
		}
	}
}