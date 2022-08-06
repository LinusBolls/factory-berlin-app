package com.sensorberg.smartspaces.backend.k;

import com.sensorberg.smartspaces.backend.j.c.a;
import com.sensorberg.smartspaces.backend.j.c.c;
import g.e.n.c.e.b;
import g.e.n.c.e.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: BookingMapper.kt */
public final class a {
    public static final a a = new a();

    private a() {
    }

    public final b a(a.c cVar) {
        k.e(cVar, "data");
        a.f c = cVar.c();
        k.c(c);
        a.e c2 = c.c();
        k.c(c2);
        a.d b = c.b();
        return new b(c2.c(), b.c(), c2.d(), c2.b(), b.b());
    }

    public final List<b> b(c.C0252c cVar) {
        c.h c;
        c.g b;
        List<c.d> b2;
        List<T> w;
        if (cVar == null || (c = cVar.c()) == null || (b = c.b()) == null || (b2 = b.b()) == null || (w = v.w(b2)) == null) {
            return n.g();
        }
        ArrayList arrayList = new ArrayList(o.p(w, 10));
        for (T t : w) {
            arrayList.add(new b(t.c(), t.e().c(), t.d(), t.b(), t.e().b()));
        }
        return arrayList;
    }

    public final com.sensorberg.smartspaces.backend.n.a c(c.C0252c cVar) {
        c.h c;
        c.g b;
        c.e c2;
        if (cVar == null || (c = cVar.c()) == null || (b = c.b()) == null || (c2 = b.c()) == null) {
            return null;
        }
        return new com.sensorberg.smartspaces.backend.n.a(c2.b(), c2.c());
    }

    public final List<com.sensorberg.smartspaces.backend.j.f.c> d(List<? extends g.e.n.c.e.c> list) {
        com.sensorberg.smartspaces.backend.j.f.c cVar;
        k.e(list, "bookingStates");
        ArrayList arrayList = new ArrayList(o.p(list, 10));
        for (g.e.n.c.e.c cVar2 : list) {
            if (k.a(cVar2, c.a.C0701c.b)) {
                cVar = com.sensorberg.smartspaces.backend.j.f.c.PLANNED;
            } else if (k.a(cVar2, c.a.b.b)) {
                cVar = com.sensorberg.smartspaces.backend.j.f.c.ONGOING;
            } else if (k.a(cVar2, c.b.a.a)) {
                cVar = com.sensorberg.smartspaces.backend.j.f.c.CANCELLED;
            } else if (k.a(cVar2, c.b.d.a)) {
                cVar = com.sensorberg.smartspaces.backend.j.f.c.FINISHED;
            } else if (k.a(cVar2, c.b.C0703c.a)) {
                cVar = com.sensorberg.smartspaces.backend.j.f.c.ENDED;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
