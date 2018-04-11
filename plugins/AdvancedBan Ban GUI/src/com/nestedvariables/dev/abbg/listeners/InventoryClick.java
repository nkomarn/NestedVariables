package com.nestedvariables.dev.abbg.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import com.nestedvariables.dev.abbg.inventories.PlayerGUI;
import com.nestedvariables.dev.abbg.inventories.Reasons2GUI;
import com.nestedvariables.dev.abbg.inventories.ReasonsGUI;
import com.nestedvariables.dev.abbg.inventories.TimeGUI;

public class InventoryClick implements Listener {

	public static Integer duration;
	public static String playerName;
	public static String operator;
	public static String type;
	public static String reason;
	public static String command;
	public static String start;
	public static String end;
	public static String reason2;
	public static String search;

	@EventHandler
	public void inventoryClickEvent(InventoryClickEvent event) {
		Inventory inventory = event.getInventory();
		String inventoryName = inventory.getName();

		if (inventoryName.equals("Punishments")) {
			event.setCancelled(true);
			int slot = event.getSlot();
			if (slot == 1) {
				Player player = (Player) event.getWhoClicked();
				type = " ";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				PlayerGUI.openPlayerGUI(player);
				return;
			} else if (slot == 3) {
				Player player = (Player) event.getWhoClicked();
				type = "/warn ";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				PlayerGUI.openPlayerGUI(player);
				return;
			} else if (slot == 5) {
				Player player = (Player) event.getWhoClicked();
				type = "/mute ";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				PlayerGUI.openPlayerGUI(player);
				return;
			} else if (slot == 7) {
				Player player = (Player) event.getWhoClicked();
				type = "/kick ";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				PlayerGUI.openPlayerGUI(player);
				return;
			} else if (slot == 11) {
				Player player = (Player) event.getWhoClicked();
				event.setCancelled(true);
				player.closeInventory();
				PlayerGUI.openPlayerGUI(player);
				return;
			} else if (slot == 13) {
				Player player = (Player) event.getWhoClicked();
				command = "/history ";
				event.setCancelled(true);
				player.closeInventory();
				PlayerGUI.openPlayerGUI(player);
				return;
			} else if (slot == 15) {
				Player player = (Player) event.getWhoClicked();
				event.setCancelled(true);
				player.closeInventory();
				PlayerGUI.openPlayerGUI(player);
				return;
			} else {
			}
		} else {

		}
		if (inventoryName.equals("Players")) {
			event.setCancelled(true);
			int slot = event.getSlot();
			if (slot == 1) {
				Player player = (Player) event.getWhoClicked();
				type = " ";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 3) {
				Player player = (Player) event.getWhoClicked();
				type = "/warn ";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 5) {
				Player player = (Player) event.getWhoClicked();
				type = "/mute ";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 7) {
				Player player = (Player) event.getWhoClicked();
				type = "/kick ";
				operator = event.getWhoClicked().getName();
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 11) {
				Player player = (Player) event.getWhoClicked();
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 13) {
				Player player = (Player) event.getWhoClicked();
				command = "/history ";
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 15) {
				Player player = (Player) event.getWhoClicked();
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 45) {
				Player player = (Player) event.getWhoClicked();
				event.setCancelled(true);
				player.closeInventory();
				return;
			} else if (slot == 49) {
				Player player = (Player) event.getWhoClicked();
				event.setCancelled(true);
				player.closeInventory();
				return;
			} else if (slot == 53) {
				Player player = (Player) event.getWhoClicked();
				event.setCancelled(true);
				player.closeInventory();
				return;
			} else {
			}
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
				Time.openTimeGUI(player);
				return;
			} else if (slot == 4) {
				Player player = (Player) event.getWhoClicked();
				reason = "Advertising - ";
				event.setCancelled(true);
				player.closeInventory();
				Time.openTimeGUI(player);
				return;
			} else if (slot == 6) {
				Player player = (Player) event.getWhoClicked();
				reason = "Inappropriate Skin - ";
				event.setCancelled(true);
				player.closeInventory();
				Time.openTimeGUI(player);
				return;
			} else if (slot == 8) {
				Player player = (Player) event.getWhoClicked();
				reason = "Inappropriate Username - ";
				event.setCancelled(true);
				player.closeInventory();
				Time.openTimeGUI(player);
				return;
			} else if (slot == 10) {
				Player player = (Player) event.getWhoClicked();
				reason = "Inappropriate Cape - ";
				event.setCancelled(true);
				player.closeInventory();
				Time.openTimeGUI(player);
				return;
			} else if (slot == 12) {
				Player player = (Player) event.getWhoClicked();
				reason = "Disrespecting Staff - ";
				event.setCancelled(true);
				player.closeInventory();
				Time.openTimeGUI(player);
				return;
			} else if (slot == 14) {
				Player player = (Player) event.getWhoClicked();
				reason = "Spamming - ";
				event.setCancelled(true);
				player.closeInventory();
				Time.openTimeGUI(player);
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
					reason2 = "Jesus - ";
					event.setCancelled(true);
					player.closeInventory();
					TimeGUI.openTimeGUI(player);
					return;
				} if (inventoryName.equals("Duration of Punishment")) {
					event.setCancelled(true);
					int slot3 = event.getSlot();
					if (slot3 == 1) {
						Player player = (Player) event.getWhoClicked();
						type = " ";
						operator = event.getWhoClicked().getName();
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 3) {
						Player player = (Player) event.getWhoClicked();
						type = "/warn ";
						operator = event.getWhoClicked().getName();
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 5) {
						Player player = (Player) event.getWhoClicked();
						type = "/mute ";
						operator = event.getWhoClicked().getName();
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 7) {
						Player player = (Player) event.getWhoClicked();
						type = "/kick ";
						operator = event.getWhoClicked().getName();
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 11) {
						Player player = (Player) event.getWhoClicked();
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 13) {
						Player player = (Player) event.getWhoClicked();
						command = "/history ";
						event.setCancelled(true);
						player.closeInventory();
						PlayerGUI.openPlayerGUI(player);
						return;
					} else if (slot3 == 15) {
						Player player = (Player) event.getWhoClicked();
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