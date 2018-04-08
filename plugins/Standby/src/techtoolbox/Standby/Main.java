package techtoolbox.Standby;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import techtoolbox.Standby.Commands.Server;
public class Main extends JavaPlugin {
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Define variables
	public static Main plugin;
	
	//Define String Lists
	public static List<String> InternalName = new ArrayList<String>();
	public static List<String> Name = new ArrayList<String>();
	public static List<String> IP = new ArrayList<String>();
	public static List<String> Port = new ArrayList<String>();
	public static List<String> StartupPath = new ArrayList<String>();
	public static List<String> ShutdownPath = new ArrayList<String>();
	
	// GUI Lists
	public static List<String> sectionname = new ArrayList<String>();
	public static List<String> ItemID = new ArrayList<String>();
	public static List<String> SlotID = new ArrayList<String>();
	public static List<String> ItemName = new ArrayList<String>();
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void onEnable() {
		
		// Define plugin
		plugin = this;
		
		// Register Commands
		getCommand("server").setExecutor(new Server());
		
		// Check for/load configuration
		File file = new File(getDataFolder(), "config.yml");
		if (!file.exists()) {
		    getLogger().info("Created configuration.");
		    saveDefaultConfig();
		} else {
		    getLogger().info("Loaded Configuration.");
		}
		
		// Put server names into string list
	    for(String key : Main.plugin.getConfig().getConfigurationSection("servers").getKeys(false)) {
	    	Name.add(Main.plugin.getConfig().getString("servers." + key + ".name"));
	    }
	    
		// Convert server names to lowercase (internal name)
	    for (int i = 0; i < Name.size(); i++) {
	    	String temp = Name.get(i).toLowerCase();
	    	InternalName.add(temp);
	    }
	    
	    // Put server IPs into string list
	    for(String key : Main.plugin.getConfig().getConfigurationSection("servers").getKeys(false)) {
	    	IP.add(Main.plugin.getConfig().getString("servers." + key + ".IP"));
	    }
	    
	    // Put server ports into string list
	    for(String key : Main.plugin.getConfig().getConfigurationSection("servers").getKeys(false)) {
	    	Port.add(Main.plugin.getConfig().getString("servers." + key + ".port"));
	    }
	    
	    // Put Server Startup Script Paths into String List
	    for(String key : Main.plugin.getConfig().getConfigurationSection("servers").getKeys(false)) {
	    	StartupPath.add(Main.plugin.getConfig().getString("servers." + key + ".startup"));
	    }
	    
	    // Put Server Shutdown Script Paths into String List
	    for(String key : Main.plugin.getConfig().getConfigurationSection("servers").getKeys(false)) {
	    	ShutdownPath.add(Main.plugin.getConfig().getString("servers." + key + ".shutdown"));
	    }
	    
	    

	    ///////// GUI ////////////////////////////////////////////////////////////////////////////
	    // Parse Icon ID
	    for(String key : Main.plugin.getConfig().getConfigurationSection("gui").getKeys(false)) {
	    	ItemID.add(Main.plugin.getConfig().getString("gui." + key + ".id"));
	    }

	    
		 // Parse section name
	    for(String key : Main.plugin.getConfig().getConfigurationSection("gui").getKeys(false)) {
	    	System.out.println(key);
	    	sectionname.add(key);
	    	System.out.println("sectionname: " + sectionname.get(0));
	    }


	    
	
	  // Parse Slot Number
		for(String key : Main.plugin.getConfig().getConfigurationSection("gui").getKeys(false)) {
		    SlotID.add(Main.plugin.getConfig().getString("gui." + key + ".slot"));
	    }
		  // Parse Slot Number
			for(String key : Main.plugin.getConfig().getConfigurationSection("gui").getKeys(false)) {
			    ItemName.add(Main.plugin.getConfig().getString("gui." + key + ".name"));
		    }
	}
	

	public void onDisable() {
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
    // Checks whether server is online or offline and return boolean
    public static boolean isOnline(String ipandport)
    {
        String[] addr = ipandport.split(":");
        try
        {
            Socket s = new Socket();
            s.connect(new InetSocketAddress(addr[0], Integer.parseInt(addr[1])));
        //    Bukkit.getServer().broadcastMessage(addr[0] + ":" + addr[1]);
            s.close();
            return true;
        }
        catch (NumberFormatException e)
        {
            //e.printStackTrace();
        }
        catch (UnknownHostException e)
        {
            //e.printStackTrace();
        }
        catch (IOException e)
        {   
            //e.printStackTrace();
        }
        return false;
    }  
    
    //////////////////////////////////////////////////////////////////////////////////////////////////
    
    // Executes startup command if server is down
    public static void executeCommand(String command, final CommandSender sender)
    {
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
            	//sender.sendMessage(ChatColor.translateAlternateColorCodes('&', serverBootingMessage));
            if (output.toString().isEmpty())
            {
            }
            else
            {
            }
          }
          catch (IOException|InterruptedException e)
          {
        	  //sender.sendMessage(ChatColor.translateAlternateColorCodes('&', bootingErrorMessage));
          }
        }
      };
      t.start();
    }
}
