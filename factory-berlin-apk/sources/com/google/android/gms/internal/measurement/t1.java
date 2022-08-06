package com.google.android.gms.internal.measurement;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class t1 extends p2 {
    private final Context a;
    private final g3<c3<c2>> b;

    t1(Context context, g3<c3<c2>> g3Var) {
        if (context != null) {
            this.a = context;
            this.b = g3Var;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final g3<c3<c2>> b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.p2
            r2 = 0
            if (r1 == 0) goto L_0x002d
            com.google.android.gms.internal.measurement.p2 r5 = (com.google.android.gms.internal.measurement.p2) r5
            android.content.Context r1 = r4.a
            android.content.Context r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            com.google.android.gms.internal.measurement.g3<com.google.android.gms.internal.measurement.c3<com.google.android.gms.internal.measurement.c2>> r1 = r4.b
            if (r1 != 0) goto L_0x0022
            com.google.android.gms.internal.measurement.g3 r5 = r5.b()
            if (r5 != 0) goto L_0x002d
            goto L_0x002c
        L_0x0022:
            com.google.android.gms.internal.measurement.g3 r5 = r5.b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x002d
        L_0x002c:
            return r0
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.t1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        g3<c3<c2>> g3Var = this.b;
        return hashCode ^ (g3Var == null ? 0 : g3Var.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
