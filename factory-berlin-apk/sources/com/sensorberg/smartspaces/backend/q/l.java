package com.sensorberg.smartspaces.backend.q;

import android.content.SharedPreferences;
import k.d0;
import k.w;
import kotlin.jvm.internal.k;
import org.threeten.bp.format.c;

/* compiled from: ServerTimeInterceptor.kt */
public final class l implements w {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final c f6099d = c.f11509m;

    /* renamed from: e  reason: collision with root package name */
    public static final a f6100e = new a((DefaultConstructorMarker) null);
    private volatile long b;
    private final SharedPreferences c;

    /* compiled from: ServerTimeInterceptor.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return 0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long b(long r7, k.d0 r9) {
            /*
                r6 = this;
                java.lang.String r0 = "Date"
                r1 = 0
                r2 = 2
                java.lang.String r9 = k.d0.q(r9, r0, r1, r2, r1)
                if (r9 == 0) goto L_0x0057
                org.threeten.bp.format.c r0 = com.sensorberg.smartspaces.backend.q.l.f6099d     // Catch:{ Exception -> 0x0057 }
                java.lang.String r1 = "PARSER"
                kotlin.jvm.internal.k.d(r0, r1)     // Catch:{ Exception -> 0x0057 }
                monitor-enter(r0)     // Catch:{ Exception -> 0x0057 }
                org.threeten.bp.format.c r1 = com.sensorberg.smartspaces.backend.q.l.f6099d     // Catch:{ all -> 0x0054 }
                org.threeten.bp.temporal.e r9 = r1.l(r9)     // Catch:{ all -> 0x0054 }
                org.threeten.bp.d r9 = org.threeten.bp.d.G(r9)     // Catch:{ all -> 0x0054 }
                long r1 = r9.e0()     // Catch:{ all -> 0x0054 }
                long r3 = r7 - r1
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
                r9.<init>()     // Catch:{ all -> 0x0054 }
                java.lang.String r5 = "Time received. Local("
                r9.append(r5)     // Catch:{ all -> 0x0054 }
                r9.append(r7)     // Catch:{ all -> 0x0054 }
                java.lang.String r7 = ") - Remote("
                r9.append(r7)     // Catch:{ all -> 0x0054 }
                r9.append(r1)     // Catch:{ all -> 0x0054 }
                java.lang.String r7 = ") = Diff("
                r9.append(r7)     // Catch:{ all -> 0x0054 }
                r9.append(r3)     // Catch:{ all -> 0x0054 }
                r7 = 41
                r9.append(r7)     // Catch:{ all -> 0x0054 }
                java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0054 }
                r8 = 0
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0054 }
                n.a.a.j(r7, r8)     // Catch:{ all -> 0x0054 }
                monitor-exit(r0)     // Catch:{ Exception -> 0x0057 }
                return r3
            L_0x0054:
                r7 = move-exception
                monitor-exit(r0)     // Catch:{ Exception -> 0x0057 }
                throw r7     // Catch:{ Exception -> 0x0057 }
            L_0x0057:
                r7 = 0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.q.l.a.b(long, k.d0):long");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public l(SharedPreferences sharedPreferences) {
        k.e(sharedPreferences, "prefs");
        this.c = sharedPreferences;
        this.b = sharedPreferences.getLong("key.time_diff", 0);
    }

    public d0 a(w.a aVar) {
        k.e(aVar, "chain");
        long currentTimeMillis = System.currentTimeMillis();
        d0 a2 = aVar.a(aVar.j());
        long a3 = f6100e.b((currentTimeMillis + System.currentTimeMillis()) / ((long) 2), a2);
        if (a3 != this.b) {
            this.b = a3;
            this.c.edit().putLong("key.time_diff", this.b).apply();
        }
        return a2;
    }

    public final long c() {
        return this.b;
    }

    public final long d() {
        return System.currentTimeMillis() - this.b;
    }
}
