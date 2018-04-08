package techtoolbox.OxylAssets.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;

public class InventoryDrag implements Listener {
	
	@EventHandler
	public void inventoryDragEvent(InventoryDragEvent event)
	{
		Inventory inventory = event.getInventory();
		String inventoryName = inventory.getName();
		
		if (inventoryName.equals("Locations")) {
			event.setCancelled(true);
			return;
		}
	}
}
