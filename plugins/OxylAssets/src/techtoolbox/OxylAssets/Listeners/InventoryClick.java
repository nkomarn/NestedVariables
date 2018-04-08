package techtoolbox.OxylAssets.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import net.md_5.bungee.api.ChatColor;

public class InventoryClick implements Listener {
	
	@EventHandler
	public void inventoryClickEvent(InventoryClickEvent event)
	{
		Inventory inventory = event.getInventory();
		String inventoryName = inventory.getName();
		
		if (inventoryName.equals("Locations")) {
			event.setCancelled(true);
			int slot = event.getSlot();
			if (slot == 10) {
				Player player = (Player) event.getWhoClicked();
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mvtp " + event.getWhoClicked().getName() + " world");
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + event.getWhoClicked().getName() + " -320 42 53 -90.2 0.5");
				player.closeInventory();
				return;
			}
			else if (slot == 11) {
				Player player = (Player) event.getWhoClicked();
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mvtp " + event.getWhoClicked().getName() + " Tutorial");
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + event.getWhoClicked().getName() + " 551.143 19 1479.922 89.5 -1.6");
				player.closeInventory();
				return;
			}
			else if (slot == 12) {
				Player player = (Player) event.getWhoClicked();
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cThe plaza is currently &ounder contruction &cand is thus unavailable at this time."));
				player.closeInventory();
				return;
			}
			else if (slot == 14) {
				Player player = (Player) event.getWhoClicked();
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cThe arena is currently &ounder contruction &cand is thus unavailable at this time."));
				player.closeInventory();
				return;
			}
			else if (slot == 15) {
				Player player = (Player) event.getWhoClicked();
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mv tp " + event.getWhoClicked().getName() + " Tutorial");
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + event.getWhoClicked().getName() + " 218.290 6 1592.510 -125.7 -7.2");
				player.closeInventory();
				return;
			}
			else if (slot == 16) {
				Player player = (Player) event.getWhoClicked();
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mv tp " + event.getWhoClicked().getName() + " Tutorial");
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + event.getWhoClicked().getName() + " -554 4 1944 -125.7 -7.2");
				player.closeInventory();
				return;
			}
			else {
				Player player = (Player) event.getWhoClicked();
				player.closeInventory();
				return;
			}
		}
		else {
			
		}
	}
}
