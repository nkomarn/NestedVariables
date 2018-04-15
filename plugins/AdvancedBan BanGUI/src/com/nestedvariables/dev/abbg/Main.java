package com.nestedvariables.dev.abbg;

import org.bukkit.plugin.java.JavaPlugin;

import com.nestedvariables.dev.abbg.commands.Punish;
import com.nestedvariables.dev.abbg.listeners.InventoryClick;
import com.nestedvariables.dev.abbg.listeners.InventoryDrag;

public class Main extends JavaPlugin {

	public void onEnable() {
		if((getServer().getPluginManager().getPlugin("AdvancedBan") != null)){
            getServer().getScheduler().scheduleSyncDelayedTask(this,new Runnable(){
                public void run(){
                    if(getServer().getPluginManager().getPlugin("AdvancedBan").isEnabled())
                    {
                        System.out.println("[AdvancedBanGUI] AdvancedBan found, enabling!");
                    }
                }
            }, 30L);
        }
		else {
			System.out.println("[AdvancedBanGUI] AdvancedBan was not found, disabling!");
			System.out.println("[AdvancedBanGUI] Please install AdvancedBan.");
		}
		getCommand("punish").setExecutor(new Punish());
		getServer().getPluginManager().registerEvents(new InventoryClick(), this); 
		getServer().getPluginManager().registerEvents(new InventoryDrag(), this); 
    }

	public void onDisable() {
		System.out.println("Goodbye");
	}
}
