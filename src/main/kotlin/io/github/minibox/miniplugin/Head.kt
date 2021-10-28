package io.github.minibox.miniplugin

import net.kyori.adventure.text.Component
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.SkullMeta
import java.util.*


class Head : Listener {
    @EventHandler
    fun dropHead(event: PlayerDeathEvent) {
        val per: Int = Random().nextInt(8)

        if (per != 0) return

        val player: Player = event.entity

        val skull = ItemStack(Material.PLAYER_HEAD, 1)
        val meta = skull.itemMeta as SkullMeta

        meta.owningPlayer = player
        skull.itemMeta = meta

        player.world.dropItem(player.location, skull)

        Bukkit.broadcast(Component.text("" + ChatColor.RED + "${player.name}님의 목이 날라갔습니다!"))
    }
}