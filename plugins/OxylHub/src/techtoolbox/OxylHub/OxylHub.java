package techtoolbox.OxylHub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import techtoolbox.OxylHub.Commands.Servers;
import techtoolbox.OxylHub.Commands.survivalserver;
import techtoolbox.OxylHub.Listeners.ClickEvent;
import techtoolbox.OxylHub.Listeners.DragEvent;

public class OxylHub extends JavaPlugin implements Listener {
	
	///////////////////////////////////////////////////////////////////////////////////////
	
	// Define plugin
	public static OxylHub plugin;
	
	public void onEnable() {
		
		// Define plugin
		plugin = this;
		
		// Set server booting to off
		ClickEvent.serverBooting = false;
		
		// Register Commands
		getCommand("servers").setExecutor(new Servers());
		getCommand("asshole").setExecutor(new survivalserver());
		
		//Register Listeners
		getServer().getPluginManager().registerEvents(new DragEvent(), this);	
		getServer().getPluginManager().registerEvents(new ClickEvent(), this);	
		
		// Register Bungee Channel (for switching servers)
		this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
	}
	
	public void onDisable() {
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////
	
    // Checks whether server is online or offline and return variable
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
    
    ///////////////////////////////////////////////////////////////////////////////////////
    
    // Executes startup command if server is down
    public static void executeCommand(String command, final CommandSender sender)
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
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l(&a&l!&8&l) &aServer booting, you will be connected soon."));
            if (output.toString().isEmpty())
            {
            }
            else
            {
            }
          }
          catch (IOException|InterruptedException e)
          {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&8&l(&c&l!&8&l) &cAn error occured while booting server" + ": " + e.getMessage() + ". Notify a staff member about this issue."));
          }
        }
      };
      t.start();
    }
}
