package com.sensorberg.smartspaces.backend.q;

import com.github.jasminb.jsonapi.d;
import g.e.k.e;
import g.e.k.h;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: ObservableRetrofitCall.kt */
public final class j {

    /* compiled from: ObservableRetrofitCall.kt */
    static final class a extends l implements kotlin.e0.c.l<g.e.m.a<T, Void>, g.e.m.a<Void, Void>> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f6090h = new a();

        /* renamed from: com.sensorberg.smartspaces.backend.q.j$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableRetrofitCall.kt */
        static final class C0348a extends l implements kotlin.e0.c.l<T, Void> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0348a f6091h = new C0348a();

            C0348a() {
                super(1);
            }

            /* renamed from: a */
            public final Void o(T t) {
                return null;
            }
        }

        a() {
            super(1);
        }

        /* renamed from: a */
        public final g.e.m.a<Void, Void> o(g.e.m.a<T, Void> aVar) {
            if (aVar != null) {
                return g.e.m.b.a(aVar, C0348a.f6091h);
            }
            return null;
        }
    }

    /* compiled from: ObservableRetrofitCall.kt */
    static final class b extends l implements kotlin.e0.c.l<g.e.m.a<d<T>, Void>, g.e.m.a<T, Void>> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f6092h = new b();

        /* compiled from: ObservableRetrofitCall.kt */
        static final class a extends l implements kotlin.e0.c.l<d<T>, T> {

            /* renamed from: h  reason: collision with root package name */
            public static final a f6093h = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final T o(d<T> dVar) {
                if (dVar != null) {
                    return dVar.a();
                }
                return null;
            }
        }

        b() {
            super(1);
        }

        /* renamed from: a */
        public final g.e.m.a<T, Void> o(g.e.m.a<d<T>, Void> aVar) {
            if (aVar != null) {
                return g.e.m.b.a(aVar, a.f6093h);
            }
            return null;
        }
    }

    public static final String a(retrofit2.b<?> bVar) {
        k.e(bVar, "$this$logString");
        try {
            return "Network call " + bVar.j().h() + ':' + bVar.j().k();
        } catch (Exception unused) {
            return "";
        }
    }

    public static final <T> e<g.e.m.a<Void, Void>> b(e<g.e.m.a<T, Void>> eVar) {
        k.e(eVar, "$this$mapToVoid");
        return h.a.b(eVar, a.f6090h);
    }

    public static final <T> e<g.e.m.a<T, Void>> c(e<g.e.m.a<d<T>, Void>> eVar) {
        k.e(eVar, "$this$unpackJsonApi");
        return h.a.b(eVar, b.f6092h);
    }
}
