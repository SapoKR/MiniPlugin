package io.github.minibox.miniplugin

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class MiniPlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("Hello, World!")

        Bukkit.getPluginManager().registerEvents(Head(), this)
        Bukkit.getPluginManager().registerEvents(InvSave(), this)
    }

    override fun onDisable() {
        logger.info("Bye, World!")
    }
}