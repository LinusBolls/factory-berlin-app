package com.sensorberg.smartspaces.backend.p;

import com.sensorberg.smartspaces.backend.j.e.a;
import com.sensorberg.smartspaces.backend.j.e.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;

/* compiled from: ScheduleMapper.kt */
public final class a {
    public static final a a = new a();

    private a() {
    }

    private final Long a(Integer num) {
        if (num == null) {
            return null;
        }
        num.intValue();
        return Long.valueOf(TimeUnit.MINUTES.toMillis((long) num.intValue()));
    }

    public final g.e.n.c.e.a b(a.d dVar) {
        a.e eVar;
        a.C0293a b;
        k.e(dVar, "data");
        List<a.e> b2 = dVar.c().b();
        if (b2 == null || (eVar = (a.e) v.A(b2)) == null || (b = eVar.b()) == null) {
            return null;
        }
        Long a2 = a.a(b.b());
        Long a3 = a.a(b.c());
        Long a4 = a.a(b.d());
        Boolean f2 = b.f();
        boolean booleanValue = f2 != null ? f2.booleanValue() : false;
        Boolean e2 = b.e();
        return new g.e.n.c.e.a(a3, a2, a4, booleanValue, e2 != null ? e2.booleanValue() : false);
    }

    public final com.sensorberg.smartspaces.backend.n.a c(b.c cVar) {
        b.d dVar;
        b.g b;
        b.f c;
        k.e(cVar, "data");
        List<b.d> b2 = cVar.c().b();
        if (b2 == null || (dVar = (b.d) v.A(b2)) == null || (b = dVar.b()) == null || (c = b.c()) == null) {
            return null;
        }
        return new com.sensorberg.smartspaces.backend.n.a(c.b(), c.c());
    }

    public final List<g.e.n.c.h.a> d(b.c cVar, String str) {
        List<T> list;
        boolean z;
        b.d dVar;
        b.g b;
        List<b.e> b2;
        k.e(cVar, "data");
        List<b.d> b3 = cVar.c().b();
        if (b3 == null || (dVar = (b.d) v.A(b3)) == null || (b = dVar.b()) == null || (b2 = b.b()) == null || (list = v.w(b2)) == null) {
            list = n.g();
        }
        ArrayList arrayList = new ArrayList(o.p(list, 10));
        for (T t : list) {
            if (str != null) {
                b.i e2 = t.e();
                if ((e2 != null ? e2.b() : null) != null) {
                    z = k.a(str, t.e().b());
                    arrayList.add(new g.e.n.c.h.a(z, t.d(), t.b()));
                }
            }
            z = false;
            arrayList.add(new g.e.n.c.h.a(z, t.d(), t.b()));
        }
        return arrayList;
    }
}
