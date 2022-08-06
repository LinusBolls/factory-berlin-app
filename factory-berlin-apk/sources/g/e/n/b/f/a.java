package g.e.n.b.f;

import android.content.Context;
import g.e.n.b.g.c;
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

    /* renamed from: g.e.n.b.f.a$a  reason: collision with other inner class name */
    /* compiled from: KoinModule.kt */
    static final class C0692a extends l implements kotlin.e0.c.l<m.a.c.h.a, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f9979h;

        /* renamed from: g.e.n.b.f.a$a$a  reason: collision with other inner class name */
        /* compiled from: KoinModule.kt */
        static final class C0693a extends l implements p<m.a.c.l.a, m.a.c.i.a, c> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0692a f9980h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ g.e.n.b.a f9981i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0693a(C0692a aVar, g.e.n.b.a aVar2) {
                super(2);
                this.f9980h = aVar;
                this.f9981i = aVar2;
            }

            /* renamed from: a */
            public final c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                g.e.n.b.a aVar3 = this.f9981i;
                Context applicationContext = this.f9980h.f9979h.getApplicationContext();
                k.d(applicationContext, "context.applicationContext");
                return aVar3.a(applicationContext);
            }
        }

        /* renamed from: g.e.n.b.f.a$a$b */
        /* compiled from: KoinModule.kt */
        static final class b extends l implements p<m.a.c.l.a, m.a.c.i.a, g.e.n.b.e.b> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0692a f9982h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ g.e.n.b.a f9983i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C0692a aVar, g.e.n.b.a aVar2) {
                super(2);
                this.f9982h = aVar;
                this.f9983i = aVar2;
            }

            /* renamed from: a */
            public final g.e.n.b.e.b l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                g.e.n.b.a aVar3 = this.f9983i;
                Context applicationContext = this.f9982h.f9979h.getApplicationContext();
                k.d(applicationContext, "context.applicationContext");
                return aVar3.b(applicationContext);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0692a(Context context) {
            super(1);
            this.f9979h = context;
        }

        public final void a(m.a.c.h.a aVar) {
            k.e(aVar, "$receiver");
            g.e.n.b.c cVar = new g.e.n.b.c();
            C0693a aVar2 = new C0693a(this, cVar);
            m.a.c.e.c cVar2 = m.a.c.e.c.a;
            d dVar = d.Single;
            m.a.c.e.b bVar = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(c.class));
            bVar.n(aVar2);
            bVar.o(dVar);
            aVar.a(bVar, new e(false, false));
            b bVar2 = new b(this, cVar);
            m.a.c.e.c cVar3 = m.a.c.e.c.a;
            d dVar2 = d.Single;
            m.a.c.e.b bVar3 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(g.e.n.b.e.b.class));
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

    public final m.a.c.h.a a(Context context) {
        k.e(context, "context");
        return b.b(false, false, new C0692a(context), 3, (Object) null);
    }
}
