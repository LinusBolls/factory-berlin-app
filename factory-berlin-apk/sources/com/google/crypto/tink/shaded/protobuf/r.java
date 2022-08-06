package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s1;
import com.google.crypto.tink.shaded.protobuf.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite */
final class r extends q<y.d> {

    /* compiled from: ExtensionSchemaLite */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.s1$b[] r0 = com.google.crypto.tink.shaded.protobuf.s1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r.a.<clinit>():void");
        }
    }

    r() {
    }

    /* access modifiers changed from: package-private */
    public int a(Map.Entry<?, ?> entry) {
        return ((y.d) entry.getKey()).m();
    }

    /* access modifiers changed from: package-private */
    public Object b(p pVar, q0 q0Var, int i2) {
        return pVar.a(q0Var, i2);
    }

    /* access modifiers changed from: package-private */
    public u<y.d> c(Object obj) {
        return ((y.c) obj).extensions;
    }

    /* access modifiers changed from: package-private */
    public u<y.d> d(Object obj) {
        return ((y.c) obj).M();
    }

    /* access modifiers changed from: package-private */
    public boolean e(q0 q0Var) {
        return q0Var instanceof y.c;
    }

    /* access modifiers changed from: package-private */
    public void f(Object obj) {
        c(obj).s();
    }

    /* access modifiers changed from: package-private */
    public <UT, UB> UB g(f1 f1Var, Object obj, p pVar, u<y.d> uVar, UB ub, m1<UT, UB> m1Var) {
        Object h2;
        ArrayList arrayList;
        y.e eVar = (y.e) obj;
        int c = eVar.c();
        if (!eVar.b.s() || !eVar.b.J()) {
            Object obj2 = null;
            if (eVar.a() != s1.b.ENUM) {
                switch (a.a[eVar.a().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(f1Var.D());
                        break;
                    case 2:
                        obj2 = Float.valueOf(f1Var.F());
                        break;
                    case 3:
                        obj2 = Long.valueOf(f1Var.N());
                        break;
                    case 4:
                        obj2 = Long.valueOf(f1Var.f());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(f1Var.C());
                        break;
                    case 6:
                        obj2 = Long.valueOf(f1Var.h());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(f1Var.r());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(f1Var.t());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(f1Var.B());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(f1Var.G());
                        break;
                    case 11:
                        obj2 = Long.valueOf(f1Var.w());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(f1Var.j());
                        break;
                    case 13:
                        obj2 = Long.valueOf(f1Var.l());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = f1Var.z();
                        break;
                    case 16:
                        obj2 = f1Var.p();
                        break;
                    case 17:
                        obj2 = f1Var.n(eVar.b().getClass(), pVar);
                        break;
                    case 18:
                        obj2 = f1Var.s(eVar.b().getClass(), pVar);
                        break;
                }
            } else {
                int C = f1Var.C();
                if (eVar.b.f().a(C) == null) {
                    return i1.L(c, C, ub, m1Var);
                }
                obj2 = Integer.valueOf(C);
            }
            if (eVar.d()) {
                uVar.a(eVar.b, obj2);
            } else {
                int i2 = a.a[eVar.a().ordinal()];
                if ((i2 == 17 || i2 == 18) && (h2 = uVar.h(eVar.b)) != null) {
                    obj2 = a0.h(h2, obj2);
                }
                uVar.w(eVar.b, obj2);
            }
        } else {
            switch (a.a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    f1Var.J(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    f1Var.A(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    f1Var.K(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    f1Var.x(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    f1Var.Q(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    f1Var.P(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    f1Var.g(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    f1Var.o(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    f1Var.m(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    f1Var.i(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    f1Var.L(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    f1Var.c(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    f1Var.k(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    f1Var.R(arrayList);
                    ub = i1.z(c, arrayList, eVar.b.f(), ub, m1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.u());
            }
            uVar.w(eVar.b, arrayList);
        }
        return ub;
    }

    /* access modifiers changed from: package-private */
    public void h(f1 f1Var, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        uVar.w(eVar.b, f1Var.s(eVar.b().getClass(), pVar));
    }

    /* access modifiers changed from: package-private */
    public void i(i iVar, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        q0 L = eVar.b().h().L();
        f S = f.S(ByteBuffer.wrap(iVar.y()), true);
        c1.a().b(L, S, pVar);
        uVar.w(eVar.b, L);
        if (S.u() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(t1 t1Var, Map.Entry<?, ?> entry) {
        y.d dVar = (y.d) entry.getKey();
        if (dVar.s()) {
            switch (a.a[dVar.u().ordinal()]) {
                case 1:
                    i1.P(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 2:
                    i1.T(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 3:
                    i1.W(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 4:
                    i1.e0(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 5:
                    i1.V(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 6:
                    i1.S(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 7:
                    i1.R(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 8:
                    i1.N(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 9:
                    i1.d0(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 10:
                    i1.Y(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 11:
                    i1.Z(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 12:
                    i1.a0(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 13:
                    i1.b0(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 14:
                    i1.V(dVar.m(), (List) entry.getValue(), t1Var, dVar.J());
                    return;
                case 15:
                    i1.O(dVar.m(), (List) entry.getValue(), t1Var);
                    return;
                case 16:
                    i1.c0(dVar.m(), (List) entry.getValue(), t1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        i1.U(dVar.m(), (List) entry.getValue(), t1Var, c1.a().d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        i1.X(dVar.m(), (List) entry.getValue(), t1Var, c1.a().d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (a.a[dVar.u().ordinal()]) {
                case 1:
                    t1Var.o(dVar.m(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    t1Var.C(dVar.m(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    t1Var.d(dVar.m(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    t1Var.H(dVar.m(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    t1Var.k(dVar.m(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    t1Var.z(dVar.m(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    t1Var.n(dVar.m(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    t1Var.e(dVar.m(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    t1Var.f(dVar.m(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    t1Var.i(dVar.m(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    t1Var.p(dVar.m(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    t1Var.N(dVar.m(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    t1Var.B(dVar.m(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    t1Var.k(dVar.m(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    t1Var.v(dVar.m(), (i) entry.getValue());
                    return;
                case 16:
                    t1Var.F(dVar.m(), (String) entry.getValue());
                    return;
                case 17:
                    t1Var.M(dVar.m(), entry.getValue(), c1.a().d(entry.getValue().getClass()));
                    return;
                case 18:
                    t1Var.s(dVar.m(), entry.getValue(), c1.a().d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
