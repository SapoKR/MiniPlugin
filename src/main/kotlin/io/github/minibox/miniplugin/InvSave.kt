package io.github.minibox.miniplugin

import org.bukkit.Material
import org.bukkit.block.Chest
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.inventory.ItemStack
import java.util.*

class InvSave : Listener {
    @EventHandler
    fun dropHead(event: PlayerDeathEvent) {
        event.drops.shuffle()
        val drops = event.drops as MutableList

        val iterator = drops.iterator()
        while (iterator.hasNext()) {
            val item: ItemStack = iterator.next()

            if (Random().nextBoolean()) continue

            iterator.remove()
            event.itemsToKeep.add(item)

        }
    }
}