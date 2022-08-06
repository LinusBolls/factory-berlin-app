package com.apollographql.apollo.cache.normalized;

import kotlin.j0.f;
import kotlin.jvm.internal.k;

/* compiled from: CacheReference.kt */
public final class e {
    private final String a;

    /* compiled from: CacheReference.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
        new f("ApolloCacheReference\\{(.*)\\}");
    }

    public e(String str) {
        k.f(str, "key");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str = this.a;
        String str2 = null;
        if (!(obj instanceof e)) {
            obj = null;
        }
        e eVar = (e) obj;
        if (eVar != null) {
            str2 = eVar.a;
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
