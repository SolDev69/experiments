package com.example.mixin.client;

import net.minecraft.client.gui.screen.world.CreateWorldScreen;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(CreateWorldScreen.class)
public class ExampleClientMixin {
	private boolean alwaysShowExperiments(boolean original)
	{
		return true;
	}
}