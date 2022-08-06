package androidx.room.x;

import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;

/* compiled from: StringUtil */
public class e {
    public static void a(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("?");
            if (i3 < i2 - 1) {
                sb.append(AndroidSdkMetrics.SEPARATOR);
            }
        }
    }

    public static StringBuilder b() {
        return new StringBuilder();
    }
}
