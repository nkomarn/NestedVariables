package techtoolbox.OxylAssets.Inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Warps implements Listener {

	public static void openWarpsGUI(Player player) {
		
		// Create Inventory
		Inventory Warps = Bukkit.createInventory(null, 27, "Locations");
		
		// Create Red Placeholder
		ItemStack MagentaPlaceholder = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)2);
		ItemMeta MagentaPlaceholderMeta = MagentaPlaceholder.getItemMeta();
		MagentaPlaceholderMeta.setDisplayName(" ");
		MagentaPlaceholder.setItemMeta(MagentaPlaceholderMeta);
		
		// Create Red Placeholder
		ItemStack PinkPlaceholder = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)6);
		ItemMeta PinkPlaceholderMeta = PinkPlaceholder.getItemMeta();
		PinkPlaceholderMeta.setDisplayName(" ");
		PinkPlaceholder.setItemMeta(PinkPlaceholderMeta);
		
		// Create Crate Icon
		ItemStack Crate = new ItemStack(Material.CHEST, 1);
		ItemMeta CrateMeta = Crate.getItemMeta();
		CrateMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&lCrate"));
		Crate.setItemMeta(CrateMeta);
		
		// Create Mine Icon
		ItemStack Mine = new ItemStack(Material.IRON_ORE, 1);
		ItemMeta MineMeta = Mine.getItemMeta();
		MineMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&lMine"));
		Mine.setItemMeta(MineMeta);
		
		// Create Plaza Icon
		ItemStack Plaza = new ItemStack(Material.BEACON, 1);
		ItemMeta PlazaMeta = Plaza.getItemMeta();
		PlazaMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&d&lPlaza"));
		Plaza.setItemMeta(PlazaMeta);
		
		// Create Spectate Icon
		ItemStack Spectate = new ItemStack(Material.EYE_OF_ENDER, 1);
		ItemMeta SpectateMeta = Spectate.getItemMeta();
		SpectateMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lSpectate"));
		Spectate.setItemMeta(SpectateMeta);

		// Create DP Icon
		ItemStack DP = new ItemStack(Material.DRAGONS_BREATH, 1);
		ItemMeta DPMeta = DP.getItemMeta();
		DPMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&d&lDrop Party"));
		DP.setItemMeta(DPMeta);
		
		// Create Pacer Icon
		ItemStack Pacer = new ItemStack(Material.FEATHER, 1);
		ItemMeta PacerMeta = Pacer.getItemMeta();
		PacerMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&lPacer"));
		Pacer.setItemMeta(PacerMeta);
		
		// Set Placeholder Locations
		Warps.setItem(0, MagentaPlaceholder);
		Warps.setItem(1, PinkPlaceholder);
		Warps.setItem(2, MagentaPlaceholder);
		Warps.setItem(3, PinkPlaceholder);
		Warps.setItem(4, MagentaPlaceholder);
		Warps.setItem(5, PinkPlaceholder);
		Warps.setItem(6, MagentaPlaceholder);
		Warps.setItem(7, PinkPlaceholder);
		Warps.setItem(8, MagentaPlaceholder);
		Warps.setItem(9, PinkPlaceholder);
		Warps.setItem(13, PinkPlaceholder);
		Warps.setItem(17, PinkPlaceholder);
		Warps.setItem(18, MagentaPlaceholder);
		Warps.setItem(19, PinkPlaceholder);
		Warps.setItem(20, MagentaPlaceholder);
		Warps.setItem(21, PinkPlaceholder);
		Warps.setItem(22, MagentaPlaceholder);
		Warps.setItem(23, PinkPlaceholder);
		Warps.setItem(24, MagentaPlaceholder);
		Warps.setItem(25, PinkPlaceholder);
		Warps.setItem(26, MagentaPlaceholder);
		
		// Set Item Locations
		Warps.setItem(10, Crate);
		Warps.setItem(11, Mine);
		Warps.setItem(12, Plaza);
		Warps.setItem(14, Spectate);
		Warps.setItem(15, DP);
		Warps.setItem(16, Pacer);
		
		// Open Inventory
		player.openInventory(Warps);
	}
}
