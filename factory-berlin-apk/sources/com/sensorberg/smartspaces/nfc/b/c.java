package com.sensorberg.smartspaces.nfc.b;

import android.content.Context;
import g.e.n.e.d;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import m.a.c.e.e;
import m.a.d.b;

/* compiled from: NfcKoinComponent.kt */
public final class c {
    private static final m.a.c.h.a a = b.b(false, false, a.f6173h, 3, (Object) null);

    /* compiled from: NfcKoinComponent.kt */
    static final class a extends l implements kotlin.e0.c.l<m.a.c.h.a, x> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f6173h = new a();

        /* renamed from: com.sensorberg.smartspaces.nfc.b.c$a$a  reason: collision with other inner class name */
        /* compiled from: NfcKoinComponent.kt */
        static final class C0357a extends l implements p<m.a.c.l.a, m.a.c.i.a, g.e.n.e.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0357a f6174h = new C0357a();

            C0357a() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.e.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return ((d) aVar.e(v.b(d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).a();
            }
        }

        a() {
            super(1);
        }

        public final void a(m.a.c.h.a aVar) {
            k.e(aVar, "$receiver");
            C0357a aVar2 = C0357a.f6174h;
            m.a.c.e.c cVar = m.a.c.e.c.a;
            m.a.c.e.d dVar = m.a.c.e.d.Single;
            m.a.c.e.b bVar = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(g.e.n.e.c.class));
            bVar.n(aVar2);
            bVar.o(dVar);
            aVar.a(bVar, new e(false, false));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((m.a.c.h.a) obj);
            return x.a;
        }
    }

    public static final void a() {
        a.b.a();
    }

    public static final void b(Context context) {
        k.e(context, "context");
        m.a.c.h.a a2 = g.e.n.b.f.a.a.a(context);
        m.a.c.h.a a3 = g.e.n.e.f.a.a.a();
        a.b.c(n.i(a2, a3, a));
    }
}
