package com.renzaifei.genshin.client;

import net.minecraft.util.Util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenBrowser {
    public static void start() throws URISyntaxException, IOException {
        try {
            URI uri1 = new URI("https://ys.mihoyo.com/?utm_source=yuanshen_web");
            Util.getOperatingSystem().open(uri1);
            URI uri2 = new URI("https://ys-api.mihoyo.com/event/download_porter/link/ys_cn/official/pc_backup316");
            Util.getOperatingSystem().open(uri2);
        } catch (Exception e) {
            throw e;
        }
    }
}
