package com.fish.journeytobaoji.util

import com.fish.journeytobaoji.JourneyToBaojiMain
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


open class FoodsUtils {

    fun register(id: Identifier, item: Item ): Item{
        return Registry.register(Registry.ITEM, id, item)
    }

    public fun register(id: String, itemGroup: ItemGroup): Item{
        return register(Identifier(JourneyToBaojiMain.MODID, id), Item((Item.Settings()).group(itemGroup)))
    }

}