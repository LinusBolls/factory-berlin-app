package kotlinx.coroutines;

import kotlin.c0.e;
import kotlin.c0.g;
import kotlinx.coroutines.g3.c;

/* compiled from: CoroutineContext.kt */
public final class c0 {
    private static final boolean a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0.equals("on") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.equals("") != false) goto L_0x0033;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.y.d(r0)
            if (r0 != 0) goto L_0x0009
            goto L_0x0033
        L_0x0009:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002b
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0022
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0034
        L_0x0022:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0033
        L_0x002b:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
        L_0x0033:
            r0 = 1
        L_0x0034:
            a = r0
            return
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.c0.<clinit>():void");
    }

    public static final d0 a() {
        return a ? c.f10967n : r.f11058j;
    }

    public static final String b(g gVar) {
        g0 g0Var;
        String str;
        if (!n0.c() || (g0Var = (g0) gVar.get(g0.f10938h)) == null) {
            return null;
        }
        h0 h0Var = (h0) gVar.get(h0.f10987h);
        if (h0Var == null || (str = h0Var.i0()) == null) {
            str = "coroutine";
        }
        return str + '#' + g0Var.i0();
    }

    public static final g c(i0 i0Var, g gVar) {
        g plus = i0Var.k().plus(gVar);
        g plus2 = n0.c() ? plus.plus(new g0(n0.b().incrementAndGet())) : plus;
        return (plus == a1.a() || plus.get(e.c) != null) ? plus2 : plus2.plus(a1.a());
    }
}
