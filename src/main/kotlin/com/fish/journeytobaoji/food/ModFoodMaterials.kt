package com.fish.journeytobaoji.food

import com.fish.journeytobaoji.util.FoodsUtils
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack


class ModFoodMaterials {
    val FoodsUtils = FoodsUtils()

    val JTBFoodMaterials_GROUP: ItemGroup = FabricItemGroup.builder()
        .icon({ ItemStack(TutorialItems.CUSTOM_ITEM) })
        .displayName(Text.translatable("itemGroup.tutorial.test_group"))
        .entries({ context, entries ->
            entries.add(TutorialItems.CUSTOM_ITEM)
        })
        .build()

    val DOUGH = FoodsUtils.register("dough", JTBFoodMaterials_GROUP)
}