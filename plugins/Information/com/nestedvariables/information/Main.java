package me.exzibyte.tutorial;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable(){
		System.out.println("I'M UP! What I miss. ");
		getCommand("discord").setExecutor(new Discord());
		getCommand("twitter").setExecutor(new Twitter());
		getCommand("facebook").setExecutor(new Facebook());
		getCommand("instagram").setExecutor(new Instagram());
		getCommand("info").setExecutor(new Info());
	}
	
	public void onDisable() {
		System.out.println("Night Night!");
	}
	
	public static Main plugin;
        plugin = this;

}
