package techtoolbox.OxylAssets.Commands;

import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_12_R1.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.inventory.ItemStack;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.server.v1_12_R1.NBTTagCompound;
import net.minecraft.server.v1_12_R1.NBTTagList;
import net.minecraft.server.v1_12_R1.NBTTagString;
import net.minecraft.server.v1_12_R1.PacketDataSerializer;
import net.minecraft.server.v1_12_R1.PacketPlayOutCustomPayload;

public class Help implements Listener {

	// Define Help Book Contents
	public static String[] pages = {"§6§lOxyl Skyblock\n§8Getting Started\n\n§rWelcome to the wonderful world of Skyblock! You're on a mission to survive on a tiny island in the middle of nowhere. Literally.\n\nThe next few pages will guide you through creating an island.",
	    		"§6§lOxyl Skyblock\n§8Creating an Island\n\n§rLet's get you a place to stay. Type §6§o/is §0in chat to create an island. You can pick from 1 of 5 island types. Each of them is based on difficulty and harder ones give you less to start off with.",
	    		"§6§lOxyl Skyblock\n§8Control Panel\n\n§0To access a menu with options for your island, type §6§o/is§0. Let's go through all of the items in the menu.\n\n§l1. Teleport: §0Clicking this item will teleport you onto your island.\n§l2. Shop: §0Clicking this",
	    		"§ritem will take you to the shop.\n§l3. Auction House:\n§0Takes you to the Auction House (player shop).\n§l4. Island Settings: §0Allows you to change permissions on your island (we'll talk about this later on).\n§l5. View level: §0Displays your island level.",
	    		"§l6. Biome: §0Allows you to change the biome of your island.\n§l7. Challenges:\n§0Displays challenges you can do to raise island level (we'll also discuss this later on).\n§l8. Set home: §0Sets the location you will be teleported to when you click 'Teleport'.",
	    		"§l9. Reset Island:\n§0Allows you to completely delete your island and start from scratch. Items in your inventory will also be removed.",
	    		"§6§lOxyl Skyblock\n§8Island Level\n\n§0When you add onto your island, your island level increases. Basically, your island level is the rank of your island compared to everyone else. You can improve your island level by adding expensive blocks, such as iron blocks",
	    		"§0or just expanding your island in general. Different blocks/items contribute different amounts to your island level. Your goal is to be the best! You can view islands with the heighest levels by typing §6§o/is top§0 or view your own with §6§o/is level§0.",
	    		"§6§lOxyl Skyblock\n§8Challenges\n\n§0You can complete challenges to recieve rewards and increase your island level. To view challenges, type\n§6§o/is §0and click 'Challenges'. There are different challenge levels, so once you complete all available challenges,",
	    		"§0you will unlock more challenges on the next level. They get harder as the levels increase. Can you keep up? Probably.",
	    		"§6§lOxyl Skyblock\n§8Using Shop\n\n§0We have a shop in which you can buy and sell all sorts of items. To view it, type\n§6§o/shop §0in chat. Click on a category to see items within it. Left-click an item to buy it or right-click to sell items just like it.",
	    		"§6§lOxyl Skyblock\n§8Using Auction House\n\n§0If you can't find something you want in shop, you can look for it in the Auction House. You can view it by typing §6§o/ah §0in chat. If you see something you want, click to purchase it. If you would like to sell",
	    		"§0something on the Auction House, hold the item you want to sell in your hand and type §6§o/ah sell §0followed by the amount you would like to sell the item for. Your item will be listed for 2 days. If nobody buys your item within that time period, the item will show up",
	    		"§0in the expired section of the Auction House (lower left corner). You can click the expired item to get it back.",
	    		"§6§lOxyl Skyblock\n§8Island Settings\n\n§0You can control what other players can and cannot do on your island by changing island settings. Access island settings by typing §6§o/is §0in chat, then clicking 'Island Settings'. You can click each item to either allow or",
	    		"§0disallow an action to be done on your island. These settings only apply to visitors.",
	    		"§6§lOxyl Skyblock\n§8Visitors\n\n§0You can allow other players to visit your island by creating a welcome sign. Here's what you put on the sign:\n\n       §a[WELCOME]\n   §0You can put any\n    §0message here.",
	    		"§0People can get to your island by typing §6§o/is warps §0and clicking on your face or typing §6§o/is warp [YOUR NAME]§0 to get to your island directly. They will spawn in the location of the sign, so make the area safe. If you want to kick someone off your island,",
	    		"§0type §6§o/is expel [PERSON'S NAME] §0in chat to kick them off.",
	    		"§6§lOxyl Skyblock\n§8Creating Teams\n\n§0You don't have to be alone on your adventures. You can invite a player to join you by typing §6§o/is invite [PLAYER'S NAME]§0 in chat. They can either accept or reject your invitation. If you are the leader of the",
	    		"§0island (creator of island), you can use the command §6§o/is kick [PLAYER'S NAME] §0to remove a member from your team. If you don't wish to be the leader anymore, you can transfer the position to another player by typing §6§o/is makeleader [PLAYER'S NAME]§0.",
	    		"§6§lOxyl Skyblock\n§8Managing Coops\n\n§0If you want someone to help with your island but not be a part of your team, you can coop(erate) with them. To give a player access to your island, type §6§o/is coop [PLAYER'S NAME]§0. They will be notified and have the option to",
	    		"§0accept or reject your offer. If you want to remove a coop player from your island, use §6§o/is expel [PLAYER'S NAME]§0.",
	    		"§6§lOxyl Skyblock\n§8by tech and iChilly\n\n§0You should now be ready to conquer the world of Skyblock! If you need further help, feel free to ask a staff member! Good luck with your journey!\n\n§0To access this guide, type §6§o/help§0 in chat."};
	
	 // Opens book created by function below
	 public static void openBook(ItemStack book, Player p) {
	    int slot = p.getInventory().getHeldItemSlot();
	    ItemStack old = p.getInventory().getItem(slot);
	    p.getInventory().setItem(slot, book);

	    ByteBuf buf = Unpooled.buffer(256);
	    buf.setByte(0, (byte)0);
	    buf.writerIndex(1);

	    PacketPlayOutCustomPayload packet = new PacketPlayOutCustomPayload("MC|BOpen", new PacketDataSerializer(buf));
	    ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
	    p.getInventory().setItem(slot, old);
	}
	    
	// Creates a book from String[] pages
	public static ItemStack book(String title, String author, String... pages) {
	    ItemStack is = new ItemStack(Material.WRITTEN_BOOK, 1);
	    net.minecraft.server.v1_12_R1.ItemStack nmsis = CraftItemStack.asNMSCopy(is);
	    NBTTagCompound bd = new NBTTagCompound();
	    bd.setString("title", title);
	    bd.setString("author", author);
	    NBTTagList bp = new NBTTagList();
	    for(String text : pages) {
	       bp.add(new NBTTagString(text));
	    }
	    bd.set("pages", bp);
	    nmsis.setTag(bd);
	    is = CraftItemStack.asBukkitCopy(nmsis);
	    return is;
	}
	 
	 
	// Since help is already a command, override it with listener
	@EventHandler
	public void playerCommandPreProcess(PlayerCommandPreprocessEvent event) {
		
		// Custom Help Override
		if (event.getMessage().contains("/help")) {
			openBook(book("Oxyl Guide", "Oxyl Staff", pages), event.getPlayer());
			event.setCancelled(true);		
			return;
		}
	}
	
}
