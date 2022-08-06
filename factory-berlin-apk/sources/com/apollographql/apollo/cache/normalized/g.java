package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.cache.normalized.f;
import kotlin.jvm.internal.k;

/* compiled from: NormalizedCacheFactory.kt */
public abstract class g<T extends f> {
    private g<? extends f> a;

    public abstract T a(RecordFieldJsonAdapter recordFieldJsonAdapter);

    public final f b(RecordFieldJsonAdapter recordFieldJsonAdapter) {
        k.f(recordFieldJsonAdapter, "recordFieldAdapter");
        g<? extends f> gVar = this.a;
        if (gVar == null) {
            return a(recordFieldJsonAdapter);
        }
        f a2 = a(recordFieldJsonAdapter);
        a2.a(gVar.b(recordFieldJsonAdapter));
        return a2;
    }
}
