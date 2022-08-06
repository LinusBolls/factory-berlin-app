package com.microsoft.appcenter.j;

import com.microsoft.appcenter.j.b;
import com.microsoft.appcenter.k.b;
import com.microsoft.appcenter.k.c;
import com.microsoft.appcenter.k.d.i.g;
import com.microsoft.appcenter.k.d.j.l;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: OneCollectorChannelListener */
public class d extends a {
    private final b a;
    private final g b;
    private final UUID c;

    /* renamed from: d  reason: collision with root package name */
    private final b f4547d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, a> f4548e;

    /* compiled from: OneCollectorChannelListener */
    private static class a {
        final String a;
        long b;

        a(String str) {
            this.a = str;
        }
    }

    public d(b bVar, g gVar, com.microsoft.appcenter.http.d dVar, UUID uuid) {
        this(new c(dVar, gVar), bVar, gVar, uuid);
    }

    private static String h(String str) {
        return str + "/one";
    }

    private static boolean i(com.microsoft.appcenter.k.d.d dVar) {
        return !(dVar instanceof com.microsoft.appcenter.k.d.j.b) && !dVar.f().isEmpty();
    }

    private static boolean j(String str) {
        return str.endsWith("/one");
    }

    public void b(com.microsoft.appcenter.k.d.d dVar, String str, int i2) {
        if (i(dVar)) {
            try {
                Collection<com.microsoft.appcenter.k.d.j.b> a2 = this.b.a(dVar);
                for (com.microsoft.appcenter.k.d.j.b next : a2) {
                    next.z(Long.valueOf((long) i2));
                    a aVar = this.f4548e.get(next.s());
                    if (aVar == null) {
                        aVar = new a(UUID.randomUUID().toString());
                        this.f4548e.put(next.s(), aVar);
                    }
                    l r = next.q().r();
                    r.o(aVar.a);
                    long j2 = aVar.b + 1;
                    aVar.b = j2;
                    r.r(Long.valueOf(j2));
                    r.p(this.c);
                }
                String h2 = h(str);
                for (com.microsoft.appcenter.k.d.j.b m2 : a2) {
                    this.a.m(m2, h2, i2);
                }
            } catch (IllegalArgumentException e2) {
                com.microsoft.appcenter.utils.a.b("AppCenter", "Cannot send a log to one collector: " + e2.getMessage());
            }
        }
    }

    public void c(String str, b.a aVar, long j2) {
        if (!j(str)) {
            this.a.l(h(str), 50, j2, 2, this.f4547d, aVar);
        }
    }

    public boolean d(com.microsoft.appcenter.k.d.d dVar) {
        return i(dVar);
    }

    public void e(String str) {
        if (!j(str)) {
            this.a.h(h(str));
        }
    }

    public void f(String str) {
        if (!j(str)) {
            this.a.j(h(str));
        }
    }

    public void g(boolean z) {
        if (!z) {
            this.f4548e.clear();
        }
    }

    public void k(String str) {
        this.f4547d.f(str);
    }

    d(c cVar, b bVar, g gVar, UUID uuid) {
        this.f4548e = new HashMap();
        this.a = bVar;
        this.b = gVar;
        this.c = uuid;
        this.f4547d = cVar;
    }
}
