package com.nestedvar.dev.Nucleus;

import org.bukkit.plugin.java.JavaPlugin;

import com.nestedvar.dev.Nucleus.commands.*;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		//Startup Message
		System.out.println("(!) Nucleus (!) Gathering Nuetrons and Protons!");
		//Commands
		getCommand("afk").setExecutor(new AFK());
		getCommand("back").setExecutor(new Back());
		getCommand("balance").setExecutor(new Balance());
		getCommand("book").setExecutor(new Book());
		getCommand("break").setExecutor(new Break());
		getCommand("broadcast").setExecutor(new Broadcast());
		getCommand("bigtree").setExecutor(new Bigtree());
		getCommand("burn").setExecutor(new Burn());
		getCommand("clearinventory").setExecutor(new ClearInventory());
		getCommand("createkit").setExecutor(new Createkit());
		getCommand("delhome").setExecutor(new DelHome());
		getCommand("fly").setExecutor(new Fly());
		getCommand("gamemode").setExecutor(new Gamemode());
		getCommand("item").setExecutor(new Item());
		getCommand("mail").setExecutor(new Mail());
		getCommand("ping").setExecutor(new Ping());
		getCommand("tpa").setExecutor(new Tpa());
		getCommand("tpahere").setExecutor(new Tpahere());

		
	}
	
	public void onDisable() {
		//Shutdown Message
		System.out.println("(!) Nucleus (!) Fissioning!");
	}

}
