package de.baimos.blueid.sdk.api.log;

public class BlueIDLog {
    private static int ALLOWED_LEVEL = 4;
    private static String TAG_NAME = "BlueID";

    static {
        String property = System.getProperty("log.tag." + TAG_NAME);
        if (property == null || "".equals(property)) {
            System.setProperty("log.tag." + TAG_NAME, "INFO");
        }
    }

    public static String getLogTag() {
        return TAG_NAME;
    }

    public static boolean isLevelAllowed(int i2) {
        return i2 >= ALLOWED_LEVEL;
    }

    public static void setLogTag(String str) {
        TAG_NAME = str;
    }

    public static void setMaxLogLevel(int i2) {
        ALLOWED_LEVEL = i2;
    }
}
