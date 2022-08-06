package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class p8<T> implements y8<T> {
    private final j8 a;
    private final q9<?, ?> b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final o6<?> f2480d;

    private p8(q9<?, ?> q9Var, o6<?> o6Var, j8 j8Var) {
        this.b = q9Var;
        this.c = o6Var.e(j8Var);
        this.f2480d = o6Var;
        this.a = j8Var;
    }

    static <T> p8<T> j(q9<?, ?> q9Var, o6<?> o6Var, j8 j8Var) {
        return new p8<>(q9Var, o6Var, j8Var);
    }

    public final int a(T t) {
        int hashCode = this.b.f(t).hashCode();
        return this.c ? (hashCode * 53) + this.f2480d.b(t).hashCode() : hashCode;
    }

    public final T b() {
        return this.a.g().o();
    }

    public final boolean c(T t) {
        return this.f2480d.b(t).r();
    }

    public final boolean d(T t, T t2) {
        if (!this.b.f(t).equals(this.b.f(t2))) {
            return false;
        }
        if (this.c) {
            return this.f2480d.b(t).equals(this.f2480d.b(t2));
        }
        return true;
    }

    public final void e(T t) {
        this.b.j(t);
        this.f2480d.g(t);
    }

    public final int f(T t) {
        q9<?, ?> q9Var = this.b;
        int k2 = q9Var.k(q9Var.f(t)) + 0;
        return this.c ? k2 + this.f2480d.b(t).s() : k2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.measurement.z6$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.s5 r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.z6 r0 = (com.google.android.gms.internal.measurement.z6) r0
            com.google.android.gms.internal.measurement.s9 r1 = r0.zzb
            com.google.android.gms.internal.measurement.s9 r2 = com.google.android.gms.internal.measurement.s9.a()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.measurement.s9 r1 = com.google.android.gms.internal.measurement.s9.g()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.measurement.z6$d r10 = (com.google.android.gms.internal.measurement.z6.d) r10
            r10.B()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.measurement.p5.i(r11, r12, r14)
            int r2 = r14.a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.measurement.o6<?> r12 = r9.f2480d
            com.google.android.gms.internal.measurement.m6 r0 = r14.f2529d
            com.google.android.gms.internal.measurement.j8 r3 = r9.a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.z6$f r0 = (com.google.android.gms.internal.measurement.z6.f) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.p5.c(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.measurement.u8.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.measurement.p5.a(r2, r11, r4, r13, r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.p5.i(r11, r4, r14)
            int r5 = r14.a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.p5.q(r11, r4, r14)
            java.lang.Object r2 = r14.c
            com.google.android.gms.internal.measurement.t5 r2 = (com.google.android.gms.internal.measurement.t5) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.measurement.u8.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.p5.i(r11, r4, r14)
            int r12 = r14.a
            com.google.android.gms.internal.measurement.o6<?> r0 = r9.f2480d
            com.google.android.gms.internal.measurement.m6 r5 = r14.f2529d
            com.google.android.gms.internal.measurement.j8 r6 = r9.a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            com.google.android.gms.internal.measurement.z6$f r0 = (com.google.android.gms.internal.measurement.z6.f) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.p5.a(r5, r11, r4, r13, r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.c(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.measurement.zzig r10 = com.google.android.gms.internal.measurement.zzig.e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p8.g(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.s5):void");
    }

    public final void h(T t, na naVar) {
        Iterator<Map.Entry<?, Object>> p = this.f2480d.b(t).p();
        while (p.hasNext()) {
            Map.Entry next = p.next();
            u6 u6Var = (u6) next.getKey();
            if (u6Var.d() != ka.MESSAGE || u6Var.e() || u6Var.g()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof l7) {
                naVar.u(u6Var.b(), ((l7) next).a().d());
            } else {
                naVar.u(u6Var.b(), next.getValue());
            }
        }
        q9<?, ?> q9Var = this.b;
        q9Var.g(q9Var.f(t), naVar);
    }

    public final void i(T t, T t2) {
        z8.o(this.b, t, t2);
        if (this.c) {
            z8.m(this.f2480d, t, t2);
        }
    }
}
