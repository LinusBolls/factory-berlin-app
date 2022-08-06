package de.baimos.blueid.sdk.api;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class SdkForAndroid {
    private static Map<String, BlueIDMobileDevice> instances = new HashMap();

    private SdkForAndroid() {
    }

    public static BlueIDMobileDevice getInstance(Context context) {
        return getInstance(context, System.getProperty("de.baimos.blueid.sdk.storePath", "blueid"));
    }

    private static BlueIDMobileDevice getInstance(Context context, String str) {
        if (instances.containsKey(str)) {
            return instances.get(str);
        }
        try {
            BlueIDMobileDevice blueIDMobileDevice = (BlueIDMobileDevice) Class.forName("de.baimos.blueid.sdk.api.a").getMethod("init", new Class[]{Context.class, String.class}).invoke((Object) null, new Object[]{context, str});
            instances.put(str, blueIDMobileDevice);
            return blueIDMobileDevice;
        } catch (Exception e2) {
            throw new RuntimeException("Failed to initialize BlueID SDK for Android!", e2);
        }
    }
}
