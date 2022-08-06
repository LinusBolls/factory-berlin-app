package g.b.a.b.c.f;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class o1 {
    private static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f9398d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f9399e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<String, String> f9400f;

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap<String, Boolean> f9401g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, Integer> f9402h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, Long> f9403i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, Float> f9404j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private static Object f9405k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f9406l;

    /* renamed from: m  reason: collision with root package name */
    private static String[] f9407m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T a(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
            java.lang.Class<g.b.a.b.c.f.o1> r0 = g.b.a.b.c.f.o1.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0015 }
            if (r2 == 0) goto L_0x0010
            r4 = r2
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return r4
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            r2 = 0
            return r2
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a.b.c.f.o1.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r13 = r13.query(a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r14}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r13 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r13.moveToFirst() != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r15 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (r15.equals((java.lang.Object) null) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        e(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r15 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0091, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        e(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        if (r13 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0097, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009b, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009c, code lost:
        if (r13 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a1, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.Class<g.b.a.b.c.f.o1> r15 = g.b.a.b.c.f.o1.class
            monitor-enter(r15)
            d(r13)     // Catch:{ all -> 0x00a2 }
            java.lang.Object r0 = f9405k     // Catch:{ all -> 0x00a2 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f9400f     // Catch:{ all -> 0x00a2 }
            boolean r1 = r1.containsKey(r14)     // Catch:{ all -> 0x00a2 }
            r2 = 0
            if (r1 == 0) goto L_0x001e
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f9400f     // Catch:{ all -> 0x00a2 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a2 }
            if (r13 == 0) goto L_0x001c
            r2 = r13
        L_0x001c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            return r2
        L_0x001e:
            java.lang.String[] r1 = f9407m     // Catch:{ all -> 0x00a2 }
            int r3 = r1.length     // Catch:{ all -> 0x00a2 }
            r4 = 0
            r5 = 0
        L_0x0023:
            r6 = 1
            if (r5 >= r3) goto L_0x0061
            r7 = r1[r5]     // Catch:{ all -> 0x00a2 }
            boolean r7 = r14.startsWith(r7)     // Catch:{ all -> 0x00a2 }
            if (r7 == 0) goto L_0x005e
            boolean r0 = f9406l     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x003a
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f9400f     // Catch:{ all -> 0x00a2 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x005c
        L_0x003a:
            java.lang.String[] r0 = f9407m     // Catch:{ all -> 0x00a2 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f9400f     // Catch:{ all -> 0x00a2 }
            java.util.Map r13 = c(r13, r0)     // Catch:{ all -> 0x00a2 }
            r1.putAll(r13)     // Catch:{ all -> 0x00a2 }
            f9406l = r6     // Catch:{ all -> 0x00a2 }
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f9400f     // Catch:{ all -> 0x00a2 }
            boolean r13 = r13.containsKey(r14)     // Catch:{ all -> 0x00a2 }
            if (r13 == 0) goto L_0x005c
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f9400f     // Catch:{ all -> 0x00a2 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a2 }
            if (r13 == 0) goto L_0x005a
            r2 = r13
        L_0x005a:
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            return r2
        L_0x005c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            return r2
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0061:
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            android.net.Uri r8 = a
            r9 = 0
            r10 = 0
            java.lang.String[] r11 = new java.lang.String[r6]
            r11[r4] = r14
            r12 = 0
            r7 = r13
            android.database.Cursor r13 = r7.query(r8, r9, r10, r11, r12)
            if (r13 == 0) goto L_0x0092
            boolean r15 = r13.moveToFirst()     // Catch:{ all -> 0x009b }
            if (r15 != 0) goto L_0x0079
            goto L_0x0092
        L_0x0079:
            java.lang.String r15 = r13.getString(r6)     // Catch:{ all -> 0x009b }
            if (r15 == 0) goto L_0x0086
            boolean r1 = r15.equals(r2)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0086
            r15 = r2
        L_0x0086:
            e(r0, r14, r15)     // Catch:{ all -> 0x009b }
            if (r15 == 0) goto L_0x008c
            r2 = r15
        L_0x008c:
            if (r13 == 0) goto L_0x0091
            r13.close()
        L_0x0091:
            return r2
        L_0x0092:
            e(r0, r14, r2)     // Catch:{ all -> 0x009b }
            if (r13 == 0) goto L_0x009a
            r13.close()
        L_0x009a:
            return r2
        L_0x009b:
            r14 = move-exception
            if (r13 == 0) goto L_0x00a1
            r13.close()
        L_0x00a1:
            throw r14
        L_0x00a2:
            r13 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a.b.c.f.o1.b(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static Map<String, String> c(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(b, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void d(ContentResolver contentResolver) {
        if (f9400f == null) {
            f9399e.set(false);
            f9400f = new HashMap<>();
            f9405k = new Object();
            f9406l = false;
            contentResolver.registerContentObserver(a, true, new p1((Handler) null));
        } else if (f9399e.getAndSet(false)) {
            f9400f.clear();
            f9401g.clear();
            f9402h.clear();
            f9403i.clear();
            f9404j.clear();
            f9405k = new Object();
            f9406l = false;
        }
    }

    private static void e(Object obj, String str, String str2) {
        synchronized (o1.class) {
            if (obj == f9405k) {
                f9400f.put(str, str2);
            }
        }
    }

    public static boolean f(ContentResolver contentResolver, String str, boolean z) {
        Object h2 = h(contentResolver);
        Boolean bool = (Boolean) a(f9401g, str, Boolean.TRUE);
        if (bool != null) {
            return bool.booleanValue();
        }
        String b2 = b(contentResolver, str, (String) null);
        boolean z2 = true;
        if (b2 != null && !b2.equals("")) {
            if (c.matcher(b2).matches()) {
                bool = Boolean.TRUE;
            } else if (f9398d.matcher(b2).matches()) {
                z2 = false;
                bool = Boolean.FALSE;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + b2 + "\") as boolean");
            }
        }
        HashMap<String, Boolean> hashMap = f9401g;
        synchronized (o1.class) {
            if (h2 == f9405k) {
                hashMap.put(str, bool);
                f9400f.remove(str);
            }
        }
        return z2;
    }

    private static Object h(ContentResolver contentResolver) {
        Object obj;
        synchronized (o1.class) {
            d(contentResolver);
            obj = f9405k;
        }
        return obj;
    }
}
