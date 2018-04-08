package techtoolbox.OxylHubHelper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class OxylHubHelper extends JavaPlugin implements Listener {

	String serverName = getConfig().getString("Server");
	
	public void onEnable() {
		
		// Start player check timer
		playerCheck();
		
		// Config File
				File file = new File(getDataFolder(), "config.yml");
				if (!file.exists()) {
				    getLogger().info("config.yml not found, creating!");
				    saveDefaultConfig();
				} else {
				    getLogger().info("config.yml found, loading!");
				}
	}
	
	public void onDisable() {
		
	}
	
	public void playerCheck() {
		int sec = 600;
		getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
		        @Override
		        public void run() {
		           if (getServer().getOnlinePlayers().size() == 0) {
		        	   System.out.println("There are no players online. Shutting down server.");
		        	   executeCommand("sh /root/stop" + serverName + ".sh");
		           }
		           else {
		        	   System.out.println("There are players online. Keeping server alive.");
		           }
		        }
		    }, 20L * sec, 20L * sec);
	}
	
	// Executes startup command if server is down
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
