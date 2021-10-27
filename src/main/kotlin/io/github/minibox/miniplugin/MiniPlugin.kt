package io.github.minibox.miniplugin

import org.bukkit.plugin.java.JavaPlugin

class MiniPlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("Hello, World!")
    }

    override fun onDisable() {
        logger.info("Bye, World!")
    }
}