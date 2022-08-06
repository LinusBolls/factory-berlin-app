package com.apollographql.apollo.cache.normalized.k;

import com.apollographql.apollo.cache.normalized.c;
import com.apollographql.apollo.cache.normalized.e;
import com.apollographql.apollo.cache.normalized.i;
import g.a.a.h.k;
import g.a.a.h.o;
import g.a.a.h.s.d;
import g.a.a.i.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CacheFieldValueResolver.kt */
public final class b implements d<i> {
    private final e a;
    private final k.c b;
    private final com.apollographql.apollo.cache.normalized.d c;

    /* renamed from: d  reason: collision with root package name */
    private final a f1829d;

    /* renamed from: e  reason: collision with root package name */
    private final c f1830e;

    public b(e eVar, k.c cVar, com.apollographql.apollo.cache.normalized.d dVar, a aVar, c cVar2) {
        kotlin.jvm.internal.k.f(eVar, "readableCache");
        kotlin.jvm.internal.k.f(cVar, "variables");
        kotlin.jvm.internal.k.f(dVar, "cacheKeyResolver");
        kotlin.jvm.internal.k.f(aVar, "cacheHeaders");
        kotlin.jvm.internal.k.f(cVar2, "cacheKeyBuilder");
        this.a = eVar;
        this.b = cVar;
        this.c = dVar;
        this.f1829d = aVar;
        this.f1830e = cVar2;
    }

    private final <T> T b(i iVar, o oVar) {
        String a2 = this.f1830e.a(oVar, this.b);
        if (iVar.g(a2)) {
            return iVar.c(a2);
        }
        throw new IllegalStateException(("Missing value: " + oVar.c()).toString());
    }

    private final List<?> d(List<?> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(o.p(list, 10));
        for (T next : list) {
            if (next instanceof e) {
                next = this.a.j(((e) next).a(), this.f1829d);
                if (next == null) {
                    throw new IllegalStateException("Cache MISS: failed to find record in cache by reference".toString());
                }
            } else if (next instanceof List) {
                next = d((List) next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private final i e(i iVar, o oVar) {
        e eVar;
        c b2 = this.c.b(oVar, this.b);
        if (kotlin.jvm.internal.k.a(b2, c.b)) {
            eVar = (e) b(iVar, oVar);
        } else {
            eVar = new e(b2.a());
        }
        if (eVar == null) {
            return null;
        }
        i j2 = this.a.j(eVar.a(), this.f1829d);
        if (j2 != null) {
            return j2;
        }
        throw new IllegalStateException("Cache MISS: failed to find record in cache by reference".toString());
    }

    /* renamed from: c */
    public <T> T a(i iVar, o oVar) {
        kotlin.jvm.internal.k.f(iVar, "recordSet");
        kotlin.jvm.internal.k.f(oVar, "field");
        int i2 = a.a[oVar.f().ordinal()];
        if (i2 == 1) {
            return e(iVar, oVar);
        }
        if (i2 != 2) {
            return b(iVar, oVar);
        }
        return d((List) b(iVar, oVar));
    }
}
