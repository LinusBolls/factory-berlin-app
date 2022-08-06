package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public class n7 {
    private volatile j8 a;
    private volatile t5 b;

    static {
        m6.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.j8 c(com.google.android.gms.internal.measurement.j8 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.j8 r0 = r1.a
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.j8 r0 = r1.a     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.a = r2     // Catch:{ zzig -> 0x0012 }
            com.google.android.gms.internal.measurement.t5 r0 = com.google.android.gms.internal.measurement.t5.f2545h     // Catch:{ zzig -> 0x0012 }
            r1.b = r0     // Catch:{ zzig -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.a = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.t5 r2 = com.google.android.gms.internal.measurement.t5.f2545h     // Catch:{ all -> 0x001a }
            r1.b = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.measurement.j8 r2 = r1.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n7.c(com.google.android.gms.internal.measurement.j8):com.google.android.gms.internal.measurement.j8");
    }

    public final j8 a(j8 j8Var) {
        j8 j8Var2 = this.a;
        this.b = null;
        this.a = j8Var;
        return j8Var2;
    }

    public final int b() {
        if (this.b != null) {
            return this.b.d();
        }
        if (this.a != null) {
            return this.a.d();
        }
        return 0;
    }

    public final t5 d() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                t5 t5Var = this.b;
                return t5Var;
            }
            if (this.a == null) {
                this.b = t5.f2545h;
            } else {
                this.b = this.a.c();
            }
            t5 t5Var2 = this.b;
            return t5Var2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7)) {
            return false;
        }
        n7 n7Var = (n7) obj;
        j8 j8Var = this.a;
        j8 j8Var2 = n7Var.a;
        if (j8Var == null && j8Var2 == null) {
            return d().equals(n7Var.d());
        }
        if (j8Var != null && j8Var2 != null) {
            return j8Var.equals(j8Var2);
        }
        if (j8Var != null) {
            return j8Var.equals(n7Var.c(j8Var.m()));
        }
        return c(j8Var2.m()).equals(j8Var2);
    }

    public int hashCode() {
        return 1;
    }
}
