package com.nestedvariables.dev.abbg;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.nestedvariables.dev.abbg.commands.Punish;
import com.nestedvariables.dev.abbg.listeners.InventoryClick;
import com.nestedvariables.dev.abbg.listeners.InventoryDrag;

public class Main extends JavaPlugin {

	private Connection connection;
	public String host = getConfig().getString("Database Information.Hostname");
	public String database = getConfig().getString("Database Information.Database");
	public String username = getConfig().getString("Database Information.Username");
	public String password = getConfig().getString("Database Information.Password");
	public Integer port = getConfig().getInt("Database Information.Port");

	public void onEnable() {
		File file = new File(getDataFolder(), "config.yml");
		if (!file.exists()) {
			saveDefaultConfig();
		}
		
		dbSetup();

		if ((getServer().getPluginManager().getPlugin("AdvancedBan") != null)) {
			getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				public void run() {
					if (getServer().getPluginManager().getPlugin("AdvancedBan").isEnabled()) {
						System.out.println("[AdvancedBanGUI] AdvancedBan found, enabling!");
					}
				}
			}, 30L);
		} else

		{
			System.out.println("[AdvancedBanGUI] AdvancedBan was not found, disabling!");
			System.out.println("[AdvancedBanGUI] Please install AdvancedBan.");
		}

		getCommand("punish").setExecutor(new Punish());
		getServer().getPluginManager().registerEvents(new InventoryClick(), this);
		getServer().getPluginManager().registerEvents(new InventoryDrag(), this);
	}

	public void dbSetup() {
		try {

			synchronized (this) {
				if (getConnection() != null && !getConnection().isClosed()) {
					return;
				}
				Class.forName("com.mysql.jdbc.Driver");
				setConnection( DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database, this.username, this.password));
				
				
			Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aMySQL Connected!!"));
				
			}

		} catch (SQLException e) {
			Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cMySQL Login Parameters Rejected! Please review your configuration file."));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void onDisable() {
		System.out.println("Goodbye");

	}
}