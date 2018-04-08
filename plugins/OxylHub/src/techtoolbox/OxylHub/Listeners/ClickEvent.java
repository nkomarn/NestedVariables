package techtoolbox.OxylHub.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import net.md_5.bungee.api.ChatColor;
import techtoolbox.OxylHub.OxylHub;

public class ClickEvent implements Listener {

	public static boolean serverBooting;
	
	// GUI Click Event
    @EventHandler
	public void inventoryClickEvent(InventoryClickEvent event)
	{
		Inventory inventory = event.getInventory();
		String inventoryName = inventory.getName();
		
		if (inventoryName.equals("Locations")) {
			event.setCancelled(true);
			int slot = event.getSlot();
			
			// Skyblock Server
			if (slot == 15) {
				Player player = (Player) event.getWhoClicked();
				
				// Check if server is online; if not, run Skyblock.sh
				if (OxylHub.isOnline("127.0.0.1:25567")) {
		    		System.out.println("Skyblock up, connecting player to server.");
		    		
		    		// Send player to Skyblock
		    		ByteArrayDataOutput out = ByteStreams.newDataOutput();
		    		out.writeUTF("Connect");
		    		out.writeUTF("skyblock");
		    		
		    		player.sendPluginMessage(OxylHub.plugin, "BungeeCord", out.toByteArray());
		    	}
		    	else {
		    		if (serverBooting == false) {
		    			serverBooting = true;
			    		System.out.println("Skyblock down, starting server.");
			    		OxylHub.executeCommand("sh /root/Skyblock.sh", player);
			    		
			    		// Delay code by 10 seconds
			            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(OxylHub.plugin, new Runnable() {
			                @Override
			                public void run() {
			                	
			                	// Allow Skyblock to be clicked
			                	serverBooting = false;
			                	
			                	// Send player to Skyblock
			                	player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&a&l!&8&l) &aConnecting to Skyblock."));
			                	ByteArrayDataOutput out = ByteStreams.newDataOutput();
					    		out.writeUTF("Connect");
					    		out.writeUTF("skyblock");
					    		
					    		player.sendPluginMessage(OxylHub.plugin, "BungeeCord", out.toByteArray());
			                }
			            }, 200); // 10 seconds delay (200 Ticks)
		    		}
		    		else if (serverBooting == true) {
		    			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cServer already booting, you will be connected soon."));
		    		}
		    	}
				player.closeInventory();
				return;
			}
			
			
			// Anarchy Server
			else if (slot == 11) {
				Player player = (Player) event.getWhoClicked();
				
				// Check if server is online; if not, run Anarchy.sh
				if (OxylHub.isOnline("127.0.0.1:25568")) {
		    		System.out.println("Anarchy up, connecting player to server.");
		    		
		    		// Send player to Anarchy
		    		ByteArrayDataOutput out = ByteStreams.newDataOutput();
		    		out.writeUTF("Connect");
		    		out.writeUTF("anarchy");
		    		
		    		player.sendPluginMessage(OxylHub.plugin, "BungeeCord", out.toByteArray());
		    	}
		    	else {
		    		if (serverBooting == false) {
		    			
		    			// Disallow anarchy to be clicked
		    			serverBooting = true;
		    			
			    		System.out.println("Anarchy down, starting server.");
			    		OxylHub.executeCommand("sh /root/Anarchy.sh", player);
			    		
			    		// Delay code by 10 seconds
			            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(OxylHub.plugin, new Runnable() {
			                @Override
			                public void run() {
			                	
			                	// Allow Anarchy to be clicked
			                	serverBooting = false;
			                	
			                	// Send player to Anarchy
			                	player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&a&l!&8&l) &aConnecting to Anarchy."));
			                	ByteArrayDataOutput out = ByteStreams.newDataOutput();
					    		out.writeUTF("Connect");
					    		out.writeUTF("anarchy");
					    		
					    		player.sendPluginMessage(OxylHub.plugin, "BungeeCord", out.toByteArray());
			                }
			            }, 200); // 10 seconds delay (200 Ticks)
		    		}
		    		else if (serverBooting == true) {
		    			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&c&l!&8&l) &cServer already booting, you will be connected soon."));
		    		}
		    	}
				player.closeInventory();
				return;
			}
			else {
				// Do nothing
			}
		}
	}
}
