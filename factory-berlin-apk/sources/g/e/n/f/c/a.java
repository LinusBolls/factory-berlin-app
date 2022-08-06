package g.e.n.f.c;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import g.e.n.c.c.b.c;
import g.e.n.e.d;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import kotlinx.coroutines.d0;
import m.a.c.e.e;
import m.a.d.b;

/* compiled from: KoinModule.kt */
public final class a {
    public static final a a = new a();

    /* renamed from: g.e.n.f.c.a$a  reason: collision with other inner class name */
    /* compiled from: KoinModule.kt */
    static final class C0722a extends l implements kotlin.e0.c.l<m.a.c.h.a, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f10189h;

        /* renamed from: g.e.n.f.c.a$a$a  reason: collision with other inner class name */
        /* compiled from: KoinModule.kt */
        static final class C0723a extends l implements p<m.a.c.l.a, m.a.c.i.a, g.e.n.f.a> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0722a f10190h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0723a(C0722a aVar) {
                super(2);
                this.f10190h = aVar;
            }

            /* renamed from: a */
            public final g.e.n.f.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                Resources resources = this.f10190h.f10189h.getResources();
                k.d(resources, "context.resources");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                k.d(displayMetrics, "context.resources.displayMetrics");
                return new g.e.n.f.d.b(displayMetrics);
            }
        }

        /* renamed from: g.e.n.f.c.a$a$b */
        /* compiled from: KoinModule.kt */
        static final class b extends l implements p<m.a.c.l.a, m.a.c.i.a, c> {

            /* renamed from: h  reason: collision with root package name */
            public static final b f10191h = new b();

            b() {
                super(2);
            }

            /* renamed from: a */
            public final c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return new g.e.n.f.b(((d) aVar.e(v.b(d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).a(), (g.e.n.f.a) aVar.e(v.b(g.e.n.f.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (d0) null, 4, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0722a(Context context) {
            super(1);
            this.f10189h = context;
        }

        public final void a(m.a.c.h.a aVar) {
            k.e(aVar, "$receiver");
            C0723a aVar2 = new C0723a(this);
            m.a.c.e.c cVar = m.a.c.e.c.a;
            m.a.c.e.d dVar = m.a.c.e.d.Factory;
            m.a.c.e.b bVar = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(g.e.n.f.a.class));
            bVar.n(aVar2);
            bVar.o(dVar);
            aVar.a(bVar, new e(false, false, 1, (DefaultConstructorMarker) null));
            b bVar2 = b.f10191h;
            m.a.c.e.c cVar2 = m.a.c.e.c.a;
            m.a.c.e.d dVar2 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar3 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(c.class));
            bVar3.n(bVar2);
            bVar3.o(dVar2);
            aVar.a(bVar3, new e(false, false, 1, (DefaultConstructorMarker) null));
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
        return b.b(false, false, new C0722a(context), 3, (Object) null);
    }
}
