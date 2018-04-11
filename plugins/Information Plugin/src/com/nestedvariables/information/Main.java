package com.nestedvariables.information;

import org.bukkit.plugin.java.JavaPlugin;

import com.nestedvariables.information.commands.*;

public class Main extends JavaPlugin{
	
	public void onEnable(){
		System.out.println("I'M UP! What I miss. ");
		getCommand("discord").setExecutor(new Discord());
		getCommand("twitter").setExecutor(new Twitter());
		getCommand("info").setExecutor(new Info());
		getCommand("facebook").setExecutor(new Facebook());
		getCommand("instagram").setExecutor(new Instagram());
		getCommand("snapchat").setExecutor(new Snapchat());
		getCommand("kyle").setExecutor(new Kyle());
		getCommand("twitboi").setExecutor(new Twit());
		plugin = this;
	}
	
	public void onDisable() {
		System.out.println("Night Night!");
	}
	
	public static Main plugin;

}