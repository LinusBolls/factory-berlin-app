package com.apollographql.apollo.cache.normalized;

import g.a.a.h.k;
import g.a.a.h.o;
import java.util.Map;

/* compiled from: CacheKeyResolver.kt */
public abstract class d {
    /* access modifiers changed from: private */
    public static final c a = new c("QUERY_ROOT");
    public static final a b = new a((DefaultConstructorMarker) null);

    /* compiled from: CacheKeyResolver.kt */
    public static final class a {
        private a() {
        }

        public final c a(k<?, ?, ?> kVar) {
            kotlin.jvm.internal.k.f(kVar, "operation");
            return d.a;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final c d(k<?, ?, ?> kVar) {
        return b.a(kVar);
    }

    public abstract c b(o oVar, k.c cVar);

    public abstract c c(o oVar, Map<String, Object> map);
}
