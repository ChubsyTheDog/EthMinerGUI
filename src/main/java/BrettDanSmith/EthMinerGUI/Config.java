package BrettDanSmith.EthMinerGUI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Config {

	public Config() throws FileNotFoundException {
		load();
	}

	private static Map<String, Object> options = new HashMap<String, Object>();
	private static String configFile = "./config.cfg";

	public static void save() {
		saveConfig(configFile);
	}

	public static void load() throws FileNotFoundException {
		loadConfig(configFile);
	}

	private static void loadConfig(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		if (!file.exists())
			throw new FileNotFoundException(fileName);
	}

	private static void saveConfig(String fileName) {
		File file = new File(fileName);
	}

	public static Object get(String key) {
		return options.get(key);
	}

	public static Object getOrDefault(String key, Object defaultValue) {
		Object obj = options.getOrDefault(key, defaultValue);
		put(key, obj);
		return obj;
	}

	public static void put(String key, Object value) {
		options.put(key, value);
	}

}
