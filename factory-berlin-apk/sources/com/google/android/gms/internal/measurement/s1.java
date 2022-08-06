package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import e.e.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class s1 implements w1 {

    /* renamed from: g  reason: collision with root package name */
    private static final Map<Uri, s1> f2519g = new a();

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f2520h = {"key", "value"};
    private final ContentResolver a;
    private final Uri b;
    private final ContentObserver c = new u1(this, (Handler) null);

    /* renamed from: d  reason: collision with root package name */
    private final Object f2521d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private volatile Map<String, String> f2522e;

    /* renamed from: f  reason: collision with root package name */
    private final List<x1> f2523f = new ArrayList();

    private s1(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, this.c);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.s1 b(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.s1> r0 = com.google.android.gms.internal.measurement.s1.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.s1> r1 = f2519g     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.s1) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.internal.measurement.s1 r2 = new com.google.android.gms.internal.measurement.s1     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.s1> r3 = f2519g     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s1.b(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.s1");
    }

    static synchronized void e() {
        synchronized (s1.class) {
            for (s1 next : f2519g.values()) {
                next.a.unregisterContentObserver(next.c);
            }
            f2519g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    private final Map<String, String> g() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) z1.a(new v1(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public final /* synthetic */ Object a(String str) {
        return c().get(str);
    }

    public final Map<String, String> c() {
        Map<String, String> map = this.f2522e;
        if (map == null) {
            synchronized (this.f2521d) {
                map = this.f2522e;
                if (map == null) {
                    map = g();
                    this.f2522e = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    public final void d() {
        synchronized (this.f2521d) {
            this.f2522e = null;
            h2.g();
        }
        synchronized (this) {
            for (x1 b2 : this.f2523f) {
                b2.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map f() {
        Map map;
        Cursor query = this.a.query(this.b, f2520h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }
}
