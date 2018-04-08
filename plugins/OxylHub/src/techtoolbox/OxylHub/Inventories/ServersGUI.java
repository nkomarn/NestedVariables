package techtoolbox.OxylHub.Inventories;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ServersGUI implements Listener {

	public static void showServers(Player player) {
		// Create Inventory
		Inventory Servers = Bukkit.createInventory(null, 27, "Locations");
				
		// Create Orange Placeholder
		ItemStack OrangePlaceholder = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)1);
		ItemMeta OrangePlaceholderMeta = OrangePlaceholder.getItemMeta();
		OrangePlaceholderMeta.setDisplayName(" ");
		OrangePlaceholder.setItemMeta(OrangePlaceholderMeta);
		
		// Create Red Placeholder
		ItemStack RedPlaceholder = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
		ItemMeta RedPlaceholderMeta = RedPlaceholder.getItemMeta();
		RedPlaceholderMeta.setDisplayName(" ");
		RedPlaceholder.setItemMeta(RedPlaceholderMeta);
		
		// Create Anarchy Icon
		ItemStack Anarchy = new ItemStack(Material.DIRT, 1, (short)1);
		ItemMeta AnarchyMeta = Anarchy.getItemMeta();
		AnarchyMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lAnarchy"));
		Anarchy.setItemMeta(AnarchyMeta);
		
		// Create Skyblock Icon
		ItemStack Skyblock = new ItemStack(Material.GRASS, 1, (short)0);
		ItemMeta SkyblockMeta = Skyblock.getItemMeta();
		SkyblockMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&lSkyblock"));
		Skyblock.setItemMeta(SkyblockMeta);
		
		// Create Beta Icon
		ItemStack Beta = new ItemStack(Material.CHEST, 1, (short)1);
		ItemMeta BetaMeta = Beta.getItemMeta();
		BetaMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&d&lBeta 1.7.3"));
		String lore1 = ChatColor.translateAlternateColorCodes('&', "&8Want to play classic");
		String lore2 = ChatColor.translateAlternateColorCodes('&', "&8Minecraft? Join us at");
		String lore3 = ChatColor.translateAlternateColorCodes('&', "&8&oplay.oxyl.tk:25575 &8using");
		String lore4 = ChatColor.translateAlternateColorCodes('&', "&8Minecraft Beta 1.7.3!");
		BetaMeta.setLore(Arrays.asList(lore1, lore2, lore3, lore4));
		Beta.setItemMeta(BetaMeta);
		
		// Set Placeholder Locations
		Servers.setItem(0, RedPlaceholder);
		Servers.setItem(1, OrangePlaceholder);
		Servers.setItem(2, RedPlaceholder);
		Servers.setItem(3, OrangePlaceholder);
		Servers.setItem(4, RedPlaceholder);
		Servers.setItem(5, OrangePlaceholder);
		Servers.setItem(6, RedPlaceholder);
		Servers.setItem(7, OrangePlaceholder);
		Servers.setItem(8, RedPlaceholder);
		Servers.setItem(9, OrangePlaceholder);
		Servers.setItem(17, OrangePlaceholder);
		Servers.setItem(18, RedPlaceholder);
		Servers.setItem(19, OrangePlaceholder);
		Servers.setItem(20, RedPlaceholder);
		Servers.setItem(21, OrangePlaceholder);
		Servers.setItem(22, RedPlaceholder);
		Servers.setItem(23, OrangePlaceholder);
		Servers.setItem(24, RedPlaceholder);
		Servers.setItem(25, OrangePlaceholder);
		Servers.setItem(26, RedPlaceholder);
		
		// Place Icons
		Servers.setItem(11, Anarchy);
		Servers.setItem(13, Beta);
		Servers.setItem(15, Skyblock);
		
		// Open Inventory
		player.openInventory(Servers);
	}
}
