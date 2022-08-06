package g.e.p.b;

import android.os.Handler;
import android.os.Looper;
import g.e.p.c.c;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import m.a.c.e.d;
import m.a.c.e.e;
import m.a.d.b;

/* compiled from: KoinModule.kt */
public final class a {
    public static final a a = new a();

    /* renamed from: g.e.p.b.a$a  reason: collision with other inner class name */
    /* compiled from: KoinModule.kt */
    static final class C0731a extends l implements kotlin.e0.c.l<m.a.c.h.a, x> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0731a f10246h = new C0731a();

        /* renamed from: g.e.p.b.a$a$a  reason: collision with other inner class name */
        /* compiled from: KoinModule.kt */
        static final class C0732a extends l implements p<m.a.c.l.a, m.a.c.i.a, g.e.p.c.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0732a f10247h = new C0732a();

            C0732a() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.p.c.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return g.e.p.c.b.a;
            }
        }

        /* renamed from: g.e.p.b.a$a$b */
        /* compiled from: KoinModule.kt */
        static final class b extends l implements p<m.a.c.l.a, m.a.c.i.a, c> {

            /* renamed from: h  reason: collision with root package name */
            public static final b f10248h = new b();

            /* renamed from: g.e.p.b.a$a$b$a  reason: collision with other inner class name */
            /* compiled from: KoinModule.kt */
            public static final class C0733a implements c {
                C0733a() {
                }

                public Handler a() {
                    return new Handler(Looper.getMainLooper());
                }
            }

            b() {
                super(2);
            }

            /* renamed from: a */
            public final c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return new C0733a();
            }
        }

        C0731a() {
            super(1);
        }

        public final void a(m.a.c.h.a aVar) {
            k.e(aVar, "$receiver");
            C0732a aVar2 = C0732a.f10247h;
            m.a.c.e.c cVar = m.a.c.e.c.a;
            d dVar = d.Single;
            m.a.c.e.b bVar = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(g.e.p.c.a.class));
            bVar.n(aVar2);
            bVar.o(dVar);
            aVar.a(bVar, new e(false, false));
            b bVar2 = b.f10248h;
            m.a.c.e.c cVar2 = m.a.c.e.c.a;
            d dVar2 = d.Single;
            m.a.c.e.b bVar3 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(c.class));
            bVar3.n(bVar2);
            bVar3.o(dVar2);
            aVar.a(bVar3, new e(false, false));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((m.a.c.h.a) obj);
            return x.a;
        }
    }

    private a() {
    }

    public final m.a.c.h.a a() {
        return b.b(false, false, C0731a.f10246h, 3, (Object) null);
    }
}
