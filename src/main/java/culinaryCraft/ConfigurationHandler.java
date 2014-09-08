package culinaryCraft;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		try{
			config.load();
			
			boolean cake = config.get(config.CATEGORY_GENERAL, "Cake?", true).getBoolean();
		}
		catch (Exception e){
		}
		finally{
			config.save();
			System.out.println("Config Saved!");
		}
	}
}
