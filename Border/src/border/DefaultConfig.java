package border;
import org.bukkit.configuration.file.FileConfiguration;
 
public class DefaultConfig {
	private FileConfiguration cfg;
	DefaultConfig(FileConfiguration file)
	{
		cfg = file;
	}
	
	private void createConfig() {
		cfg.addDefault("radiusX", -1);
		cfg.addDefault("radiusY", -1);
		cfg.addDefault("damagePerSecond", 2);
		cfg.addDefault("immunityTime", 600);
	}
	
}
