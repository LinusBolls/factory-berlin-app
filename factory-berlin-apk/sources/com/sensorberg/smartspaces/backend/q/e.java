package com.sensorberg.smartspaces.backend.q;

import com.github.jasminb.jsonapi.d;
import com.sensorberg.smartspaces.backend.model.BeBooking;
import com.sensorberg.smartspaces.backend.model.User;
import com.sensorberg.smartspaces.backend.model.units.BeUnit;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;
import retrofit2.b;

/* compiled from: CallsCache.kt */
public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static final a f6080g = new a((DefaultConstructorMarker) null);
    private final e.e.e<String, d<?>> a;
    private final WeakHashMap<d<?>, String> b;
    private final Map<String, d<?>> c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f6081d;

    /* renamed from: e  reason: collision with root package name */
    private final g.e.k.a f6082e;

    /* renamed from: f  reason: collision with root package name */
    private final k f6083f;

    /* compiled from: CallsCache.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final String d(b<?> bVar) {
            return bVar.j().k().toString();
        }

        public final e b(c cVar, g.e.k.a aVar, k kVar) {
            k.e(cVar, "backendApi");
            k.e(aVar, "cancellation");
            k.e(kVar, "responseErrorHandler");
            return new e(c(cVar), aVar, kVar, (DefaultConstructorMarker) null);
        }

        public final List<String> c(c cVar) {
            k.e(cVar, "backendApi");
            b<d<User>> m2 = cVar.m();
            k.d(m2, "backendApi.user");
            b<d<List<BeUnit>>> o = cVar.o();
            k.d(o, "backendApi.unitsFromNetwork");
            b<d<List<BeBooking>>> b = cVar.b();
            k.d(b, "backendApi.myBookings");
            return n.i(d(m2), d(o), d(b));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private e(List<String> list, g.e.k.a aVar, k kVar) {
        this.f6081d = list;
        this.f6082e = aVar;
        this.f6083f = kVar;
        this.a = new e.e.e<>(6);
        this.b = new WeakHashMap<>();
        this.c = new LinkedHashMap();
    }

    private final <T> d<T> a(String str) {
        d<T> c2 = this.a.c(str);
        if (c2 == null) {
            d<T> dVar = this.c.get(str);
            if (dVar == null) {
                for (Map.Entry next : this.b.entrySet()) {
                    if (k.a((String) next.getValue(), str)) {
                        Object key = next.getKey();
                        if (key != null) {
                            return (d) key;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartspaces.backend.transport.CallWrapper<T>");
                    }
                }
                return null;
            } else if (dVar != null) {
                return dVar;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartspaces.backend.transport.CallWrapper<T>");
            }
        } else if (c2 != null) {
            return c2;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartspaces.backend.transport.CallWrapper<T>");
        }
    }

    private final <T> d<T> e(String str, b<T> bVar) {
        d<T> dVar = new d<>(new g(this.f6083f), bVar, this.f6082e);
        this.a.d(str, dVar);
        this.b.put(dVar, str);
        if (this.f6081d.contains(str)) {
            this.c.put(str, dVar);
        }
        return dVar;
    }

    public final void b(l<? super d<?>, x> lVar) {
        k.e(lVar, "callback");
        ArrayList arrayList = new ArrayList();
        Map<String, d<?>> g2 = this.a.g();
        Map<String, d<?>> map = this.c;
        ArrayList<Map.Entry> arrayList2 = new ArrayList<>(map.size());
        for (Map.Entry<String, d<?>> add : map.entrySet()) {
            arrayList2.add(add);
        }
        WeakHashMap<d<?>, String> weakHashMap = this.b;
        ArrayList<Map.Entry> arrayList3 = new ArrayList<>(weakHashMap.size());
        for (Map.Entry<d<?>, String> add2 : weakHashMap.entrySet()) {
            arrayList3.add(add2);
        }
        k.d(g2, "lruCache");
        for (Map.Entry next : g2.entrySet()) {
            Object key = next.getKey();
            k.d(key, "it.key");
            arrayList.add(key);
            Object value = next.getValue();
            k.d(value, "it.value");
            lVar.o(value);
        }
        for (Map.Entry entry : arrayList2) {
            if (!arrayList.contains(entry.getKey())) {
                arrayList.add(entry.getKey());
                lVar.o(entry.getValue());
            }
        }
        for (Map.Entry entry2 : arrayList3) {
            if (!arrayList.contains(entry2.getValue())) {
                Object value2 = entry2.getValue();
                k.d(value2, "it.value");
                arrayList.add(value2);
                Object key2 = entry2.getKey();
                k.d(key2, "it.key");
                lVar.o(key2);
            }
        }
    }

    public final <T> d<T> c(b<T> bVar) {
        k.e(bVar, "original");
        return a(f6080g.d(bVar));
    }

    public final <T> d<T> d(b<T> bVar) {
        k.e(bVar, "original");
        String a2 = f6080g.d(bVar);
        d<T> a3 = a(a2);
        return a3 != null ? a3 : e(a2, bVar);
    }

    public /* synthetic */ e(List list, g.e.k.a aVar, k kVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, aVar, kVar);
    }
}
