package techtoolbox.OxylAssets;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import techtoolbox.OxylAssets.Commands.Help;
import techtoolbox.OxylAssets.Commands.Warp;
import techtoolbox.OxylAssets.Listeners.InventoryClick;
import techtoolbox.OxylAssets.Listeners.InventoryDrag;
import techtoolbox.OxylAssets.Listeners.JoinEvent;
import techtoolbox.OxylAssets.Listeners.PlayerChat;
import techtoolbox.OxylAssets.Listeners.PlayerCommandPreProcess;

public class Main extends JavaPlugin implements Listener {

	// Define Variables
	public static Main plugin;
	public String scriptLocation = getConfig().getString("shutdown-script");
	public boolean shutdownEnabled = getConfig().getBoolean("shutdown-enabled");
	
	public void onEnable()
	{
		// Define plugin
		plugin = this;
		
		// Console Message
		System.out.println("Oxyl Assets Initialized");
	  
		// Run player checker for Shutdown Module
		if (shutdownEnabled == true) {
			playerCheck();
		}
		
		// Warp Command
		getCommand("warp").setExecutor(new Warp());
	  	getServer().getPluginManager().registerEvents(this, this);	  
	  
	  	//Register Listeners
	  	getServer().getPluginManager().registerEvents(new Help(), this);
	  	getServer().getPluginManager().registerEvents(new InventoryClick(), this);
	  	getServer().getPluginManager().registerEvents(new InventoryDrag(), this);
	  	getServer().getPluginManager().registerEvents(new JoinEvent(), this);
	  	getServer().getPluginManager().registerEvents(new PlayerCommandPreProcess(), this);
	  	getServer().getPluginManager().registerEvents(new PlayerChat(), this);
	  
	  	// Config File
		File file = new File(getDataFolder(), "config.yml");
		if (!file.exists()) {
		    getLogger().info("config.yml not found, creating!");
		    saveDefaultConfig();
		} else {
		    getLogger().info("config.yml found, loading!");
		}
	}
	
	public void onDisable()
	{
	  System.out.println("Oxyl Assest Unloading");
	}
	
	// Checks every 10 minutes if players are online
	public void playerCheck() {
		int sec = 600;
		getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
		        @Override
		        public void run() {
		           if (getServer().getOnlinePlayers().size() == 0) {
		        	   System.out.println("There are no players online. Shutting down server.");
		        	   executeCommand("sh " + scriptLocation);
		           }
		           else {
		        	   System.out.println("There are players online. Keeping server alive.");
		           }
		        }
		    }, 20L * sec, 20L * sec);
	}
	
	// Executes shutdown command
    public static void executeCommand(String command)
    {
      // final String time = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
      Thread t = new Thread()
      {
        public void run()
        {
          try
          {
            StringBuffer output = new StringBuffer();
            Process p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
              output.append(String.valueOf(line)).append("\n");
            }
            
            if (output.toString().isEmpty())
            {
            }
            else
            {
            }
          }
          catch (IOException|InterruptedException e)
          {
         
          }
        }
      };
      t.start();
    }
}
