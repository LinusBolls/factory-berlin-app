package com.google.crypto.tink.shaded.protobuf;

/* compiled from: UnknownFieldSetLiteSchema */
class o1 extends m1<n1, n1> {
    o1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public n1 g(Object obj) {
        return ((y) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int h(n1 n1Var) {
        return n1Var.f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int i(n1 n1Var) {
        return n1Var.g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public n1 k(n1 n1Var, n1 n1Var2) {
        return n1Var2.equals(n1.e()) ? n1Var : n1.k(n1Var, n1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public n1 n() {
        return n1.l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void o(Object obj, n1 n1Var) {
        p(obj, n1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void p(Object obj, n1 n1Var) {
        ((y) obj).unknownFields = n1Var;
    }

    /* access modifiers changed from: package-private */
    public n1 H(n1 n1Var) {
        n1Var.j();
        return n1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void s(n1 n1Var, t1 t1Var) {
        n1Var.o(t1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void t(n1 n1Var, t1 t1Var) {
        n1Var.q(t1Var);
    }

    /* access modifiers changed from: package-private */
    public void j(Object obj) {
        g(obj).j();
    }

    /* access modifiers changed from: package-private */
    public boolean q(f1 f1Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public /* bridge */ /* synthetic */ Object r(Object obj) {
        n1 n1Var = (n1) obj;
        H(n1Var);
        return n1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void a(n1 n1Var, int i2, int i3) {
        n1Var.n(s1.c(i2, 5), Integer.valueOf(i3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void b(n1 n1Var, int i2, long j2) {
        n1Var.n(s1.c(i2, 1), Long.valueOf(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void c(n1 n1Var, int i2, n1 n1Var2) {
        n1Var.n(s1.c(i2, 3), n1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void d(n1 n1Var, int i2, i iVar) {
        n1Var.n(s1.c(i2, 2), iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void e(n1 n1Var, int i2, long j2) {
        n1Var.n(s1.c(i2, 0), Long.valueOf(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public n1 f(Object obj) {
        n1 A = g(obj);
        if (A != n1.e()) {
            return A;
        }
        n1 l2 = n1.l();
        p(obj, l2);
        return l2;
    }
}
