package me.PimpDuck.ArrowsPlus;

import java.util.logging.Logger;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ArrowsPlus extends JavaPlugin {
    private BowEnchants BowEnchants = new BowEnchants(this);

    Logger log = Logger.getLogger("Minecraft");

    public void onEnable() {
        this.log.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        this.log.info("[ArrowsPlus] is now enabled!");
        this.log.info("[ArrowsPlus] Copyright 2013 PimpDuck All rights reserved.");
        this.log.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this.BowEnchants, (Plugin)this);
        getCommand("arrowsplus").setExecutor(this.BowEnchants);
    }

    public void onDisable() {
        this.log.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        this.log.info("[ArrowsPlus] is now disabled!");
        this.log.info("[ArrowsPlus] Copyright 2013 PimpDuck All rights reserved.");
        this.log.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
