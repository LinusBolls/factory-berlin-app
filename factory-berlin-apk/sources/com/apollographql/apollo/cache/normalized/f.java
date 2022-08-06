package com.apollographql.apollo.cache.normalized;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: NormalizedCache.kt */
public abstract class f {
    private f a;

    /* compiled from: NormalizedCache.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public final f a(f fVar) {
        k.f(fVar, "cache");
        f fVar2 = this;
        while (true) {
            f fVar3 = fVar2.a;
            if (fVar3 == null) {
                fVar2.a = fVar;
                return this;
            } else if (fVar3 != null) {
                fVar2 = fVar3;
            } else {
                k.m();
                throw null;
            }
        }
    }

    public final f b() {
        return this.a;
    }

    public abstract i c(String str, g.a.a.i.a aVar);

    public Set<String> d(Collection<i> collection, g.a.a.i.a aVar) {
        k.f(collection, "recordSet");
        k.f(aVar, "cacheHeaders");
        if (aVar.a("do-not-store")) {
            return i0.b();
        }
        f fVar = this.a;
        Set<String> d2 = fVar != null ? fVar.d(collection, aVar) : null;
        if (d2 == null) {
            d2 = i0.b();
        }
        HashSet hashSet = new HashSet();
        for (i e2 : collection) {
            hashSet.addAll(e(e2, aVar));
        }
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(d2);
        hashSet2.addAll(hashSet);
        return hashSet2;
    }

    /* access modifiers changed from: protected */
    public abstract Set<String> e(i iVar, g.a.a.i.a aVar);
}
