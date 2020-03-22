package io.github.jackdebugjava.RealmCraftPlugin;

import org.bukkit.plugin.java.JavaPlugin;
import io.github.jackdebugjava.RealmCraftPlugin.listener;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.Bukkit;

public final class RealmCraftPlugin extends JavaPlugin { //public final SpaxPlayerListener Listener = new SpaxPlayerListener(this);
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new listener(), this);
		getLogger().info("RealmCraftPlugin is enabled. Say something nice to Jack for making it :)"); //startup message
	}

	@Override
	public void onDisable() {
		getLogger().info("RealmCraftPlugin is disabled, goodbye!"); //shutdown message
	}
}