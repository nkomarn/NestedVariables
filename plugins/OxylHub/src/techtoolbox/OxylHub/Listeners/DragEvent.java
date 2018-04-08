package techtoolbox.OxylHub.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;

public class DragEvent implements Listener {

	// GUI Drag Event
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
