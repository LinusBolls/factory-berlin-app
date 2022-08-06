package com.microsoft.appcenter;

import com.microsoft.appcenter.utils.a;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;

/* compiled from: ServiceInstrumentationUtils */
class h {
    static boolean a(String str) {
        try {
            String string = com.microsoft.appcenter.utils.h.a().getString("APP_CENTER_DISABLE");
            if (string == null) {
                return false;
            }
            for (String trim : string.split(AndroidSdkMetrics.SEPARATOR)) {
                String trim2 = trim.trim();
                if (trim2.equals("All") || trim2.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalStateException | LinkageError unused) {
            a.a("AppCenter", "Cannot read instrumentation variables in a non-test environment.");
            return false;
        }
    }
}
