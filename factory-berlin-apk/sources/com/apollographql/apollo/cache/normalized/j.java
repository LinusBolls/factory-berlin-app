package com.apollographql.apollo.cache.normalized;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: RecordSet.kt */
public final class j {
    private final Map<String, i> a = new LinkedHashMap();

    public final Collection<i> a() {
        return v.R(this.a.values());
    }

    public final Set<String> b(i iVar) {
        k.f(iVar, "apolloRecord");
        i iVar2 = this.a.get(iVar.e());
        if (iVar2 != null) {
            return iVar2.i(iVar);
        }
        this.a.put(iVar.e(), iVar);
        return i0.b();
    }
}
