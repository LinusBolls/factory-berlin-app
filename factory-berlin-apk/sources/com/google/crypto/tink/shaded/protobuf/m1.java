package com.google.crypto.tink.shaded.protobuf;

/* compiled from: UnknownFieldSchema */
abstract class m1<T, B> {
    m1() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(B b, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract void b(B b, int i2, long j2);

    /* access modifiers changed from: package-private */
    public abstract void c(B b, int i2, T t);

    /* access modifiers changed from: package-private */
    public abstract void d(B b, int i2, i iVar);

    /* access modifiers changed from: package-private */
    public abstract void e(B b, int i2, long j2);

    /* access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int h(T t);

    /* access modifiers changed from: package-private */
    public abstract int i(T t);

    /* access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T k(T t, T t2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(B r3, com.google.crypto.tink.shaded.protobuf.f1 r4) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.u()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.m1.l(java.lang.Object, com.google.crypto.tink.shaded.protobuf.f1):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean m(B b, f1 f1Var) {
        int a = f1Var.a();
        int a2 = s1.a(a);
        int b2 = s1.b(a);
        if (b2 == 0) {
            e(b, a2, f1Var.N());
            return true;
        } else if (b2 == 1) {
            b(b, a2, f1Var.h());
            return true;
        } else if (b2 == 2) {
            d(b, a2, f1Var.z());
            return true;
        } else if (b2 == 3) {
            Object n2 = n();
            int c = s1.c(a2, 4);
            l(n2, f1Var);
            if (c == f1Var.a()) {
                c(b, a2, r(n2));
                return true;
            }
            throw InvalidProtocolBufferException.a();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                a(b, a2, f1Var.r());
                return true;
            }
            throw InvalidProtocolBufferException.d();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract B n();

    /* access modifiers changed from: package-private */
    public abstract void o(Object obj, B b);

    /* access modifiers changed from: package-private */
    public abstract void p(Object obj, T t);

    /* access modifiers changed from: package-private */
    public abstract boolean q(f1 f1Var);

    /* access modifiers changed from: package-private */
    public abstract T r(B b);

    /* access modifiers changed from: package-private */
    public abstract void s(T t, t1 t1Var);

    /* access modifiers changed from: package-private */
    public abstract void t(T t, t1 t1Var);
}
