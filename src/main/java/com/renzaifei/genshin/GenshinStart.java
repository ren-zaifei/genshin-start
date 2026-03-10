package com.renzaifei.genshin;

import com.renzaifei.genshin.client.OpenBrowser;
import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;

public class GenshinStart implements ClientModInitializer {
	public static final String MOD_ID = "genshin-start";

    @Override
    public void onInitializeClient() {
        ClientLifecycleEvents.CLIENT_STARTED.register(client -> {
            try {
                OpenBrowser.start();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}