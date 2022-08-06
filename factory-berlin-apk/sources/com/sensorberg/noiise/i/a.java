package com.sensorberg.noiise.i;

import com.sensorberg.noiise.c;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import m.a.c.e.b;
import m.a.c.e.d;
import m.a.c.e.e;

/* compiled from: NoiiseModule.kt */
public final class a {
    public static final a a = new a();

    /* renamed from: com.sensorberg.noiise.i.a$a  reason: collision with other inner class name */
    /* compiled from: NoiiseModule.kt */
    static final class C0164a extends l implements kotlin.e0.c.l<m.a.c.h.a, x> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0164a f5132h = new C0164a();

        /* renamed from: com.sensorberg.noiise.i.a$a$a  reason: collision with other inner class name */
        /* compiled from: NoiiseModule.kt */
        static final class C0165a extends l implements p<m.a.c.l.a, m.a.c.i.a, c> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0165a f5133h = new C0165a();

            C0165a() {
                super(2);
            }

            /* renamed from: a */
            public final c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "<name for destructuring parameter 0>");
                return new c((String) aVar2.a(), (String) aVar2.b());
            }
        }

        C0164a() {
            super(1);
        }

        public final void a(m.a.c.h.a aVar) {
            k.e(aVar, "$receiver");
            C0165a aVar2 = C0165a.f5133h;
            m.a.c.e.c cVar = m.a.c.e.c.a;
            d dVar = d.Factory;
            b bVar = new b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(c.class));
            bVar.n(aVar2);
            bVar.o(dVar);
            aVar.a(bVar, new e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((m.a.c.h.a) obj);
            return x.a;
        }
    }

    private a() {
    }

    public final m.a.c.h.a a() {
        return m.a.d.b.b(false, false, C0164a.f5132h, 3, (Object) null);
    }
}
