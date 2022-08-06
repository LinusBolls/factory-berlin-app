package de.baimos;

import android.content.Context;
import android.content.Intent;
import de.baimos.blueid.sdk.api.SdkInfo;
import java.util.concurrent.atomic.AtomicLong;

public class bj {
    public static Context a;
    private static final dr b = ds.a(bj.class);
    private static AtomicLong c = new AtomicLong(0);

    public static void a(String str) {
        if (SdkInfo.DEBUG_LOG_INTENT && a != null) {
            Intent intent = new Intent("de.baimos.blueid.sdk.LOG");
            long andSet = c.getAndSet(System.currentTimeMillis());
            if (andSet != 0) {
                str = "+" + (System.currentTimeMillis() - andSet) + " " + str;
            }
            intent.putExtra("message", str);
            b.c(intent.getStringExtra("message"));
            a.sendBroadcast(intent);
        }
    }
}
