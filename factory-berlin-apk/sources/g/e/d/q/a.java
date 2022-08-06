package g.e.d.q;

import android.content.Context;
import g.e.d.s.b;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import m.a.c.e.c;
import m.a.c.e.d;
import m.a.c.e.e;

/* compiled from: CoreModule.kt */
public final class a {
    public static final a a = new a();

    /* renamed from: g.e.d.q.a$a  reason: collision with other inner class name */
    /* compiled from: CoreModule.kt */
    static final class C0661a extends l implements kotlin.e0.c.l<m.a.c.h.a, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f9764h;

        /* renamed from: g.e.d.q.a$a$a  reason: collision with other inner class name */
        /* compiled from: CoreModule.kt */
        static final class C0662a extends l implements p<m.a.c.l.a, m.a.c.i.a, g.e.d.s.a> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0661a f9765h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0662a(C0661a aVar) {
                super(2);
                this.f9765h = aVar;
            }

            /* renamed from: a */
            public final g.e.d.s.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return new b(this.f9765h.f9764h);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0661a(Context context) {
            super(1);
            this.f9764h = context;
        }

        public final void a(m.a.c.h.a aVar) {
            k.e(aVar, "$receiver");
            C0662a aVar2 = new C0662a(this);
            c cVar = c.a;
            d dVar = d.Single;
            m.a.c.e.b bVar = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(g.e.d.s.a.class));
            bVar.n(aVar2);
            bVar.o(dVar);
            aVar.a(bVar, new e(false, false));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((m.a.c.h.a) obj);
            return x.a;
        }
    }

    private a() {
    }

    public final m.a.c.h.a a(Context context) {
        k.e(context, "context");
        return m.a.d.b.b(false, false, new C0661a(context), 3, (Object) null);
    }
}
