package techtoolbox.Standby;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class Servers {
	
	private Plugin plugin;
	private File file;
	private YamlConfiguration config;

	public void GenerateList () {
		file = new File(plugin.getDataFolder().getAbsolutePath() + "/servers.yml");
		config = YamlConfiguration.loadConfiguration(file);
	}

	public void ReloadList() {
		try {
			config.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InvalidConfigurationException e) {
			e.printStackTrace();
		}
	}

	public FileConfiguration GetList () {
		return config;
	}
}
