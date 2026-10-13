package net.moreminecraftmusic;

import net.fabricmc.api.ClientModInitializer;

/** Soundtrack resources are played by Minecraft's ordinary music manager. */
public final class MoreMinecraftMusic implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // No custom player, tick handlers, screens, or configuration are needed.
    }
}
