package com.apollographql.apollo.cache.normalized;

import kotlin.jvm.internal.k;

/* compiled from: CacheKey.kt */
public final class c {
    public static final c b = new c("");
    private final String a;

    /* compiled from: CacheKey.kt */
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

    public c(String str) {
        k.f(str, "key");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str = this.a;
        String str2 = null;
        if (!(obj instanceof c)) {
            obj = null;
        }
        c cVar = (c) obj;
        if (cVar != null) {
            str2 = cVar.a;
        }
        return k.a(str, str2);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
