package com.github.okocraft.virtualvillagers;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class VirtualVillagers extends JavaPlugin {

    private static VirtualVillagers instance;

    @Override
    public void onEnable() {
        getLogger().info(getName() + " have been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info(getName() + " have been disabled!");
    }

    public static VirtualVillagers getInstance() {
        if (instance == null) {
            Plugin plugin = Bukkit.getPluginManager().getPlugin("VirtualVillagers");
            if (plugin == null || !(plugin instanceof VirtualVillagers)) {
                throw new IllegalStateException("VirtualVillagers plugin is not loaded.");
            }

            instance = (VirtualVillagers) plugin;
        }

        return instance;
    }
}
