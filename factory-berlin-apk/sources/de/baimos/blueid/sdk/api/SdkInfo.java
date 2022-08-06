package de.baimos.blueid.sdk.api;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class SdkInfo {
    public static final String BUILDTIME = "2019-09-03 13:41";
    public static boolean DEBUG_LOG_BLE = false;
    public static boolean DEBUG_LOG_CONSOLE = false;
    public static boolean DEBUG_LOG_INTENT = false;
    public static final String REVISION = "53484";
    public static final String VERSION = "3.4.2";

    private SdkInfo() {
    }

    public static String getUrlEncodedVersion() {
        try {
            return URLEncoder.encode("Android 3.4.2 53484", "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
