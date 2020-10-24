package com.atom.exampleFabricAttempt1;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class exampleFabricAttempt1 implements ModInitializer {
	public static final Item BUFFERED_DIAMOND = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("efa", "buffereddiamond"), BUFFERED_DIAMOND);
	}
}
