package de.clearinv.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.clearinv.command.ClearCommand;

public class ClearInventory extends JavaPlugin {
	
	private static ClearInventory plugin;
	
	public void onEnable() {
		
		getCommand("clear").setExecutor(new ClearCommand());
		
	}
	
	public static ClearInventory getplugin() {
		return plugin;
	}

}
