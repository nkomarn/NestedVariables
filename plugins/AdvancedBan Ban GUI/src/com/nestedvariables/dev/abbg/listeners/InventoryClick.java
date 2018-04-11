package com.nestedvariables.dev.abbg.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import com.nestedvariables.dev.abbg.inventories.PlayerGUI;
import com.nestedvariables.dev.abbg.inventories.ReasonsGUI;

public class InventoryClick implements Listener {

	public static Integer duration;
	public static String playerName;
	public static String operator;
	public static String type;
	public static String reason;
	public static String command;
	public static String start;
	public static String end;

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
				Player player = (Player);
				player.closeInventory();
				return;
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
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 2) {
				Player player = (Player) event.getWhoClicked();
				reason = "Griefing - ";
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 4) {
				Player player = (Player) event.getWhoClicked();
				reason = "Advertising - ";
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 6) {
				Player player = (Player) event.getWhoClicked();
				reason = "Inappropriate Skin - ";
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 8) {
				Player player = (Player) event.getWhoClicked();
				reason = "Inappropriate Username - ";
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 10) {
				Player player = (Player) event.getWhoClicked();
				reason = "Inappropriate Cape - ";
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 12) {
				Player player = (Player) event.getWhoClicked();
				reason = "Disrespecting Staff - ";
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			} else if (slot == 14) {
				Player player = (Player) event.getWhoClicked();
				reason = "Spamming - ";
				event.setCancelled(true);
				player.closeInventory();
				ReasonsGUI.openReasonsGUI(player);
				return;
			}
			
			else {
			}
		}
	}
}