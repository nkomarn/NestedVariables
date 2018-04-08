package techtoolbox.Standby.Inventories;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import techtoolbox.Standby.Main;

public class ServersGUI {

public static void openWarpsGUI(Player player) {
		
	
		// Create Inventory
		Inventory Servers = Bukkit.createInventory(null, 27, "Servers");
		
		for (int i = 0; i < Main.ItemID.size(); i++) {
			
			for(String key : Main.plugin.getConfig().getConfigurationSection("gui").getKeys(false)) {
			   // ItemName.add(Main.plugin.getConfig().getString("gui." + key + ".name"));
		    }
			
			ItemStack bottle = Main.plugin.getConfig().getItemStack("bottle");
			
			// Place Icon
			//Servers.setItem(SlotID, itemStackName);
		}
		
		// Open Inventory
		player.openInventory(Servers);
	}
}
