package com.sensorberg.smartspaces.backend.r;

import com.sensorberg.smartspaces.backend.j.c.b;
import com.sensorberg.smartspaces.backend.j.g.a;
import g.e.n.c.j.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: UnitMapper.kt */
public final class a {
    public static final a a = new a();

    private a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<g.e.n.c.j.a.C0709a> a(com.sensorberg.smartspaces.backend.j.c.b.c r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.k.e(r12, r0)
            com.sensorberg.smartspaces.backend.j.c.b$i r12 = r12.c()
            java.util.List r12 = r12.b()
            if (r12 == 0) goto L_0x0016
            java.util.List r12 = kotlin.a0.v.w(r12)
            if (r12 == 0) goto L_0x0016
            goto L_0x001a
        L_0x0016:
            java.util.List r12 = kotlin.a0.n.g()
        L_0x001a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.a0.o.p(r12, r1)
            r0.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x0029:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00c0
            java.lang.Object r1 = r12.next()
            com.sensorberg.smartspaces.backend.j.c.b$d r1 = (com.sensorberg.smartspaces.backend.j.c.b.d) r1
            com.sensorberg.smartspaces.backend.j.c.b$g r2 = r1.d()
            if (r2 == 0) goto L_0x0099
            java.util.List r2 = r2.b()
            if (r2 == 0) goto L_0x0099
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x004a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x009d
            java.lang.Object r4 = r2.next()
            com.sensorberg.smartspaces.backend.j.c.b$e r4 = (com.sensorberg.smartspaces.backend.j.c.b.e) r4
            r5 = 0
            if (r4 == 0) goto L_0x0093
            if (r13 == 0) goto L_0x0074
            com.sensorberg.smartspaces.backend.j.c.b$j r6 = r4.e()
            if (r6 == 0) goto L_0x0065
            java.lang.String r5 = r6.b()
        L_0x0065:
            if (r5 == 0) goto L_0x0074
            com.sensorberg.smartspaces.backend.j.c.b$j r5 = r4.e()
            java.lang.String r5 = r5.b()
            boolean r5 = kotlin.jvm.internal.k.a(r13, r5)
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            java.lang.Long r6 = r4.b()
            if (r6 == 0) goto L_0x0080
            long r6 = r6.longValue()
            goto L_0x0085
        L_0x0080:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0085:
            g.e.n.c.h.a r8 = new g.e.n.c.h.a
            long r9 = r4.d()
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r8.<init>(r5, r9, r4)
            r5 = r8
        L_0x0093:
            if (r5 == 0) goto L_0x004a
            r3.add(r5)
            goto L_0x004a
        L_0x0099:
            java.util.List r3 = kotlin.a0.n.g()
        L_0x009d:
            g.e.n.c.j.a$a r2 = new g.e.n.c.j.a$a
            java.lang.String r4 = r1.b()
            java.lang.String r5 = r1.c()
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r5 = r6
        L_0x00ad:
            com.sensorberg.smartspaces.backend.j.c.b$h r1 = r1.e()
            java.lang.String r1 = r1.b()
            if (r1 == 0) goto L_0x00b8
            r6 = r1
        L_0x00b8:
            r2.<init>(r4, r5, r6, r3)
            r0.add(r2)
            goto L_0x0029
        L_0x00c0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.r.a.a(com.sensorberg.smartspaces.backend.j.c.b$c, java.lang.String):java.util.List");
    }

    public final com.sensorberg.smartspaces.backend.n.a b(b.c cVar) {
        k.e(cVar, "data");
        b.f c = cVar.c().c();
        return new com.sensorberg.smartspaces.backend.n.a(c.b(), c.c());
    }

    public final List<a.b> c(a.c cVar) {
        a.b bVar;
        k.e(cVar, "data");
        List<a.d> b = cVar.c().b();
        if (b == null) {
            b = n.g();
        }
        ArrayList arrayList = new ArrayList();
        for (a.d dVar : b) {
            if (dVar != null) {
                String b2 = dVar.b();
                String c = dVar.c();
                if (c == null) {
                    c = "";
                }
                bVar = new a.b(b2, c);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }
}
