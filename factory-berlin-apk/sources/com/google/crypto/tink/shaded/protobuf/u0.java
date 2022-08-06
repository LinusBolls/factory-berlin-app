package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.s1;
import com.google.crypto.tink.shaded.protobuf.u;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema */
final class u0<T> implements g1<T> {
    private final q0 a;
    private final m1<?, ?> b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final q<?> f3824d;

    private u0(m1<?, ?> m1Var, q<?> qVar, q0 q0Var) {
        this.b = m1Var;
        this.c = qVar.e(q0Var);
        this.f3824d = qVar;
        this.a = q0Var;
    }

    private <UT, UB> int k(m1<UT, UB> m1Var, T t) {
        return m1Var.i(m1Var.g(t));
    }

    private <UT, UB, ET extends u.b<ET>> void l(m1<UT, UB> m1Var, q<ET> qVar, T t, f1 f1Var, p pVar) {
        UB f2 = m1Var.f(t);
        u<ET> d2 = qVar.d(t);
        do {
            try {
                if (f1Var.u() == Integer.MAX_VALUE) {
                    m1Var.o(t, f2);
                    return;
                }
            } finally {
                m1Var.o(t, f2);
            }
        } while (n(f1Var, pVar, qVar, d2, m1Var, f2));
    }

    static <T> u0<T> m(m1<?, ?> m1Var, q<?> qVar, q0 q0Var) {
        return new u0<>(m1Var, qVar, q0Var);
    }

    private <UT, UB, ET extends u.b<ET>> boolean n(f1 f1Var, p pVar, q<ET> qVar, u<ET> uVar, m1<UT, UB> m1Var, UB ub) {
        int a2 = f1Var.a();
        if (a2 == s1.a) {
            int i2 = 0;
            Object obj = null;
            i iVar = null;
            while (f1Var.u() != Integer.MAX_VALUE) {
                int a3 = f1Var.a();
                if (a3 == s1.c) {
                    i2 = f1Var.B();
                    obj = qVar.b(pVar, this.a, i2);
                } else if (a3 == s1.f3792d) {
                    if (obj != null) {
                        qVar.h(f1Var, obj, pVar, uVar);
                    } else {
                        iVar = f1Var.z();
                    }
                } else if (!f1Var.E()) {
                    break;
                }
            }
            if (f1Var.a() == s1.b) {
                if (iVar != null) {
                    if (obj != null) {
                        qVar.i(iVar, obj, pVar, uVar);
                    } else {
                        m1Var.d(ub, i2, iVar);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.a();
        } else if (s1.b(a2) != 2) {
            return f1Var.E();
        } else {
            Object b2 = qVar.b(pVar, this.a, s1.a(a2));
            if (b2 == null) {
                return m1Var.m(ub, f1Var);
            }
            qVar.h(f1Var, b2, pVar, uVar);
            return true;
        }
    }

    private <UT, UB> void o(m1<UT, UB> m1Var, T t, t1 t1Var) {
        m1Var.s(m1Var.g(t), t1Var);
    }

    public void a(T t, T t2) {
        i1.G(this.b, t, t2);
        if (this.c) {
            i1.E(this.f3824d, t, t2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.crypto.tink.shaded.protobuf.y$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.e.b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.crypto.tink.shaded.protobuf.y r0 = (com.google.crypto.tink.shaded.protobuf.y) r0
            com.google.crypto.tink.shaded.protobuf.n1 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.n1 r2 = com.google.crypto.tink.shaded.protobuf.n1.e()
            if (r1 != r2) goto L_0x0011
            com.google.crypto.tink.shaded.protobuf.n1 r1 = com.google.crypto.tink.shaded.protobuf.n1.l()
            r0.unknownFields = r1
        L_0x0011:
            com.google.crypto.tink.shaded.protobuf.y$c r11 = (com.google.crypto.tink.shaded.protobuf.y.c) r11
            com.google.crypto.tink.shaded.protobuf.u r11 = r11.M()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r13, r15)
            int r13 = r15.a
            int r3 = com.google.crypto.tink.shaded.protobuf.s1.a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = com.google.crypto.tink.shaded.protobuf.s1.b(r13)
            if (r3 != r5) goto L_0x0066
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r10.f3824d
            com.google.crypto.tink.shaded.protobuf.p r3 = r15.f3720d
            com.google.crypto.tink.shaded.protobuf.q0 r5 = r10.a
            int r6 = com.google.crypto.tink.shaded.protobuf.s1.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.crypto.tink.shaded.protobuf.y$e r8 = (com.google.crypto.tink.shaded.protobuf.y.e) r8
            if (r8 == 0) goto L_0x005b
            com.google.crypto.tink.shaded.protobuf.c1 r13 = com.google.crypto.tink.shaded.protobuf.c1.a()
            com.google.crypto.tink.shaded.protobuf.q0 r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.g1 r13 = r13.d(r2)
            int r13 = com.google.crypto.tink.shaded.protobuf.e.p(r13, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.y$d r2 = r8.b
            java.lang.Object r3 = r15.c
            r11.w(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.crypto.tink.shaded.protobuf.e.G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = com.google.crypto.tink.shaded.protobuf.e.N(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r6 = r15.a
            int r7 = com.google.crypto.tink.shaded.protobuf.s1.a(r6)
            int r8 = com.google.crypto.tink.shaded.protobuf.s1.b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            com.google.crypto.tink.shaded.protobuf.c1 r6 = com.google.crypto.tink.shaded.protobuf.c1.a()
            com.google.crypto.tink.shaded.protobuf.q0 r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.crypto.tink.shaded.protobuf.g1 r6 = r6.d(r7)
            int r4 = com.google.crypto.tink.shaded.protobuf.e.p(r6, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.y$d r6 = r2.b
            java.lang.Object r7 = r15.c
            r11.w(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.b(r12, r4, r15)
            java.lang.Object r3 = r15.c
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.i) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r13 = r15.a
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r10.f3824d
            com.google.crypto.tink.shaded.protobuf.p r6 = r15.f3720d
            com.google.crypto.tink.shaded.protobuf.q0 r7 = r10.a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.crypto.tink.shaded.protobuf.y$e r2 = (com.google.crypto.tink.shaded.protobuf.y.e) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = com.google.crypto.tink.shaded.protobuf.s1.b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = com.google.crypto.tink.shaded.protobuf.e.N(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = com.google.crypto.tink.shaded.protobuf.s1.c(r13, r5)
            r1.n(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r11 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.b(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):void");
    }

    public void c(T t, t1 t1Var) {
        Iterator<Map.Entry<?, Object>> r = this.f3824d.c(t).r();
        while (r.hasNext()) {
            Map.Entry next = r.next();
            u.b bVar = (u.b) next.getKey();
            if (bVar.H() != s1.c.MESSAGE || bVar.s() || bVar.J()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof c0.b) {
                t1Var.h(bVar.m(), ((c0.b) next).a().e());
            } else {
                t1Var.h(bVar.m(), next.getValue());
            }
        }
        o(this.b, t, t1Var);
    }

    public void d(T t, f1 f1Var, p pVar) {
        l(this.b, this.f3824d, t, f1Var, pVar);
    }

    public void e(T t) {
        this.b.j(t);
        this.f3824d.f(t);
    }

    public final boolean f(T t) {
        return this.f3824d.c(t).o();
    }

    public boolean g(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.f3824d.c(t).equals(this.f3824d.c(t2));
        }
        return true;
    }

    public int h(T t) {
        int k2 = k(this.b, t) + 0;
        return this.c ? k2 + this.f3824d.c(t).i() : k2;
    }

    public T i() {
        return this.a.h().L();
    }

    public int j(T t) {
        int hashCode = this.b.g(t).hashCode();
        return this.c ? (hashCode * 53) + this.f3824d.c(t).hashCode() : hashCode;
    }
}
