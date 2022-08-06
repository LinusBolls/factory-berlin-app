package com.sensorberg.debug.e;

import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import m.a.c.e.b;
import m.a.c.e.c;
import m.a.c.e.d;
import m.a.c.e.e;

/* compiled from: DebugModule.kt */
public final class a {
    public static final a a = new a();

    /* renamed from: com.sensorberg.debug.e.a$a  reason: collision with other inner class name */
    /* compiled from: DebugModule.kt */
    static final class C0155a extends l implements kotlin.e0.c.l<m.a.c.h.a, x> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0155a f5068h = new C0155a();

        /* renamed from: com.sensorberg.debug.e.a$a$a  reason: collision with other inner class name */
        /* compiled from: DebugModule.kt */
        static final class C0156a extends l implements p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.debug.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0156a f5069h = new C0156a();

            C0156a() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.debug.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return new com.sensorberg.debug.a();
            }
        }

        C0155a() {
            super(1);
        }

        public final void a(m.a.c.h.a aVar) {
            k.e(aVar, "$receiver");
            C0156a aVar2 = C0156a.f5069h;
            c cVar = c.a;
            d dVar = d.Factory;
            b bVar = new b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(com.sensorberg.debug.a.class));
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
        return m.a.d.b.b(false, false, C0155a.f5068h, 3, (Object) null);
    }
}
