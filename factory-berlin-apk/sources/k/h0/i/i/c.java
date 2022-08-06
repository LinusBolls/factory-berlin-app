package k.h0.i.i;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.h0.e.e;
import k.z;
import kotlin.jvm.internal.k;
import okhttp3.internal.http2.d;

/* compiled from: AndroidLog.kt */
public final class c {
    private static final CopyOnWriteArraySet<Logger> a = new CopyOnWriteArraySet<>();
    private static final Map<String, String> b;
    public static final c c = new c();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = z.class.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = z.class.getName();
        k.b(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = d.class.getName();
        k.b(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = e.class.getName();
        k.b(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        b = e0.m(linkedHashMap);
    }

    private c() {
    }

    private final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (a.add(logger)) {
            k.b(logger, "logger");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.a);
        }
    }

    private final String d(String str) {
        String str2 = b.get(str);
        return str2 != null ? str2 : s.H0(str, 23);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r11 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r8, int r9, java.lang.String r10, java.lang.Throwable r11) {
        /*
            r7 = this;
            java.lang.String r0 = "loggerName"
            kotlin.jvm.internal.k.f(r8, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.k.f(r10, r0)
            java.lang.String r8 = r7.d(r8)
            boolean r0 = android.util.Log.isLoggable(r8, r9)
            if (r0 == 0) goto L_0x0068
            if (r11 == 0) goto L_0x002e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = "\n"
            r0.append(r10)
            java.lang.String r10 = android.util.Log.getStackTraceString(r11)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
        L_0x002e:
            r11 = 0
            int r6 = r10.length()
        L_0x0033:
            if (r11 >= r6) goto L_0x0068
            r1 = 10
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r10
            r2 = r11
            int r0 = kotlin.j0.q.S(r0, r1, r2, r3, r4, r5)
            r1 = -1
            if (r0 == r1) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = r6
        L_0x0045:
            int r1 = r11 + 4000
            int r1 = java.lang.Math.min(r0, r1)
            if (r10 == 0) goto L_0x0060
            java.lang.String r11 = r10.substring(r11, r1)
            java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.k.b(r11, r2)
            android.util.Log.println(r9, r8, r11)
            if (r1 < r0) goto L_0x005e
            int r11 = r1 + 1
            goto L_0x0033
        L_0x005e:
            r11 = r1
            goto L_0x0045
        L_0x0060:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r9)
            throw r8
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.i.i.c.a(java.lang.String, int, java.lang.String, java.lang.Throwable):void");
    }

    public final void b() {
        for (Map.Entry next : b.entrySet()) {
            c((String) next.getKey(), (String) next.getValue());
        }
    }
}
