package com.apollographql.apollo.cache.normalized.k;

import g.a.a.h.p;
import g.a.a.h.s.f;
import g.a.a.h.s.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: SortedInputFieldMapWriter.kt */
public final class j implements g {
    /* access modifiers changed from: private */
    public final TreeMap<String, Object> a = new TreeMap<>(this.b);
    private final Comparator<String> b;

    /* compiled from: SortedInputFieldMapWriter.kt */
    private static class a implements g.b {
        private final List<Object> a = new ArrayList();
        private final Comparator<String> b;

        public a(Comparator<String> comparator) {
            k.f(comparator, "fieldNameComparator");
            this.b = comparator;
        }

        public void a(p pVar, Object obj) {
            k.f(pVar, "scalarType");
            if (obj != null) {
                this.a.add(obj);
            }
        }

        public void b(String str) {
            if (str != null) {
                this.a.add(str);
            }
        }

        public void c(f fVar) {
            if (fVar != null) {
                j jVar = new j(this.b);
                fVar.a(jVar);
                this.a.add(jVar.a);
            }
        }

        public final List<Object> d() {
            return this.a;
        }
    }

    public j(Comparator<String> comparator) {
        k.f(comparator, "fieldNameComparator");
        this.b = comparator;
    }

    public void a(String str, Integer num) {
        k.f(str, "fieldName");
        this.a.put(str, num);
    }

    public void b(String str, g.c cVar) {
        k.f(str, "fieldName");
        if (cVar == null) {
            this.a.put(str, (Object) null);
            return;
        }
        a aVar = new a(this.b);
        cVar.a(aVar);
        this.a.put(str, aVar.d());
    }

    public void c(String str, l<? super g.b, x> lVar) {
        k.f(str, "fieldName");
        k.f(lVar, "block");
        g.a.a(this, str, lVar);
    }

    public void d(String str, p pVar, Object obj) {
        k.f(str, "fieldName");
        k.f(pVar, "scalarType");
        this.a.put(str, obj);
    }

    public void e(String str, String str2) {
        k.f(str, "fieldName");
        this.a.put(str, str2);
    }

    public final Map<String, Object> g() {
        Map<String, Object> unmodifiableMap = Collections.unmodifiableMap(this.a);
        k.b(unmodifiableMap, "Collections.unmodifiableMap(buffer)");
        return unmodifiableMap;
    }
}
