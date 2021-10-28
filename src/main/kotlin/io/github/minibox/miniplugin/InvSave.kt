package io.github.minibox.miniplugin

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.inventory.ItemStack

class InvSave : Listener {
    @EventHandler
    fun dropHead(event: PlayerDeathEvent) {
        var dropCount = 0

        event.drops.shuffle()
        val drops = event.drops as MutableList

        val iterator = drops.iterator()
        while (iterator.hasNext()) {
            val item: ItemStack = iterator.next()

            if (dropCount >= drops.size / 2) break

            iterator.remove()
            event.itemsToKeep.add(item)
            dropCount += 1
        }
    }
}