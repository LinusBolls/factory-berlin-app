package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.cache.normalized.k.g;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.k;

/* compiled from: Record.kt */
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final b f1827e = new b((DefaultConstructorMarker) null);
    private volatile UUID a;
    private int b = -1;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f1828d;

    /* compiled from: Record.kt */
    public static final class a {
        private final Map<String, Object> a;
        private final String b;
        private UUID c;

        public a(String str, Map<String, ? extends Object> map, UUID uuid) {
            k.f(str, "key");
            k.f(map, "fields");
            this.b = str;
            this.c = uuid;
            this.a = new LinkedHashMap(map);
        }

        public final a a(String str, Object obj) {
            k.f(str, "key");
            this.a.put(str, obj);
            return this;
        }

        public final i b() {
            return new i(this.b, this.a, this.c);
        }

        public final String c() {
            return this.b;
        }

        public final a d(UUID uuid) {
            this.c = uuid;
            return this;
        }
    }

    /* compiled from: Record.kt */
    public static final class b {
        private b() {
        }

        public final a a(String str) {
            k.f(str, "key");
            return new a(str, new LinkedHashMap(), (UUID) null);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i(String str, Map<String, Object> map, UUID uuid) {
        k.f(str, "key");
        k.f(map, "_fields");
        this.c = str;
        this.f1828d = map;
        this.a = uuid;
    }

    private final synchronized void a(Object obj, Object obj2) {
        if (this.b != -1) {
            this.b += g.a(obj, obj2);
        }
    }

    public static final a b(String str) {
        return f1827e.a(str);
    }

    public final Object c(String str) {
        k.f(str, "fieldKey");
        return d().get(str);
    }

    public final Map<String, Object> d() {
        return this.f1828d;
    }

    public final String e() {
        return this.c;
    }

    public final UUID f() {
        return this.a;
    }

    public final boolean g(String str) {
        k.f(str, "fieldKey");
        return d().containsKey(str);
    }

    public final String h() {
        return this.c;
    }

    public final Set<String> i(i iVar) {
        k.f(iVar, "otherRecord");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry next : iVar.d().entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            boolean containsKey = d().containsKey(str);
            Object obj = d().get(str);
            if (!containsKey || (!k.a(obj, value))) {
                this.f1828d.put(str, value);
                linkedHashSet.add(this.c + '.' + str);
                a(value, obj);
            }
        }
        this.a = iVar.a;
        return linkedHashSet;
    }

    public final a j() {
        return new a(this.c, d(), this.a);
    }

    public String toString() {
        return "Record(key='" + this.c + "', fields=" + d() + ", mutationId=" + this.a + ')';
    }
}
