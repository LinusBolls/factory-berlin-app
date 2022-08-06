package g.e.n.d.a0;

import android.content.Context;
import com.sensorberg.smartspaces.myrenz.storage.MyRenzDatabase;
import g.e.n.d.s;
import g.e.n.d.t;
import g.e.n.d.u;
import g.e.n.d.w;
import g.e.n.d.y;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import kotlinx.coroutines.d0;
import m.a.d.b;

/* compiled from: KoinModule.kt */
public final class a {
    public static final a a = new a();

    /* renamed from: g.e.n.d.a0.a$a  reason: collision with other inner class name */
    /* compiled from: KoinModule.kt */
    static final class C0710a extends l implements kotlin.e0.c.l<m.a.c.h.a, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f10084h;

        /* renamed from: g.e.n.d.a0.a$a$a  reason: collision with other inner class name */
        /* compiled from: KoinModule.kt */
        static final class C0711a extends l implements p<m.a.c.l.a, m.a.c.i.a, t> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0711a f10085h = new C0711a();

            C0711a() {
                super(2);
            }

            /* renamed from: a */
            public final t l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return new t();
            }
        }

        /* renamed from: g.e.n.d.a0.a$a$b */
        /* compiled from: KoinModule.kt */
        static final class b extends l implements p<m.a.c.l.a, m.a.c.i.a, g.e.n.d.x> {

            /* renamed from: h  reason: collision with root package name */
            public static final b f10086h = new b();

            b() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.d.x l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return g.e.n.d.x.a;
            }
        }

        /* renamed from: g.e.n.d.a0.a$a$c */
        /* compiled from: KoinModule.kt */
        static final class c extends l implements p<m.a.c.l.a, m.a.c.i.a, s> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f10087h = new c();

            c() {
                super(2);
            }

            /* renamed from: a */
            public final s l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return new u((g.e.n.d.x) aVar.e(v.b(g.e.n.d.x.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (t) aVar.e(v.b(t.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), new w((String) null, 1, (DefaultConstructorMarker) null));
            }
        }

        /* renamed from: g.e.n.d.a0.a$a$d */
        /* compiled from: KoinModule.kt */
        static final class d extends l implements p<m.a.c.l.a, m.a.c.i.a, g.e.n.c.g.f.e> {

            /* renamed from: h  reason: collision with root package name */
            public static final d f10088h = new d();

            d() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.c.g.f.e l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return new y((s) aVar.e(v.b(s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (d0) null, (Long) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: g.e.n.d.a0.a$a$e */
        /* compiled from: KoinModule.kt */
        static final class e extends l implements p<m.a.c.l.a, m.a.c.i.a, MyRenzDatabase> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0710a f10089h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(C0710a aVar) {
                super(2);
                this.f10089h = aVar;
            }

            /* renamed from: a */
            public final MyRenzDatabase l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                MyRenzDatabase d2 = androidx.room.k.a(this.f10089h.f10084h.getApplicationContext(), MyRenzDatabase.class, "myrenz_database").d();
                k.d(d2, "Room.databaseBuilder(con…myrenz_database\").build()");
                return d2;
            }
        }

        /* renamed from: g.e.n.d.a0.a$a$f */
        /* compiled from: KoinModule.kt */
        static final class f extends l implements p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.myrenz.storage.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final f f10090h = new f();

            f() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.myrenz.storage.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return ((MyRenzDatabase) aVar.e(v.b(MyRenzDatabase.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).y();
            }
        }

        /* renamed from: g.e.n.d.a0.a$a$g */
        /* compiled from: KoinModule.kt */
        static final class g extends l implements p<m.a.c.l.a, m.a.c.i.a, g.e.n.c.g.f.f> {

            /* renamed from: h  reason: collision with root package name */
            public static final g f10091h = new g();

            g() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.c.g.f.f l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.myrenz.storage.d((com.sensorberg.smartspaces.myrenz.storage.a) aVar.e(v.b(com.sensorberg.smartspaces.myrenz.storage.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (d0) null, 2, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: g.e.n.d.a0.a$a$h */
        /* compiled from: KoinModule.kt */
        static final class h extends l implements p<m.a.c.l.a, m.a.c.i.a, g.e.n.c.g.f.d> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0710a f10092h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(C0710a aVar) {
                super(2);
                this.f10092h = aVar;
            }

            /* renamed from: a */
            public final g.e.n.c.g.f.d l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                k.e(aVar, "$receiver");
                k.e(aVar2, "it");
                return new g.e.n.d.z.a(this.f10092h.f10084h, g.e.n.d.z.b.a, (d0) null, 4, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0710a(Context context) {
            super(1);
            this.f10084h = context;
        }

        public final void a(m.a.c.h.a aVar) {
            k.e(aVar, "$receiver");
            C0711a aVar2 = C0711a.f10085h;
            m.a.c.e.c cVar = m.a.c.e.c.a;
            m.a.c.e.d dVar = m.a.c.e.d.Single;
            m.a.c.e.b bVar = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(t.class));
            bVar.n(aVar2);
            bVar.o(dVar);
            aVar.a(bVar, new m.a.c.e.e(false, false));
            b bVar2 = b.f10086h;
            m.a.c.e.c cVar2 = m.a.c.e.c.a;
            m.a.c.e.d dVar2 = m.a.c.e.d.Single;
            m.a.c.e.b bVar3 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(g.e.n.d.x.class));
            bVar3.n(bVar2);
            bVar3.o(dVar2);
            aVar.a(bVar3, new m.a.c.e.e(false, false));
            c cVar3 = c.f10087h;
            m.a.c.e.c cVar4 = m.a.c.e.c.a;
            m.a.c.e.d dVar3 = m.a.c.e.d.Single;
            m.a.c.e.b bVar4 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(s.class));
            bVar4.n(cVar3);
            bVar4.o(dVar3);
            aVar.a(bVar4, new m.a.c.e.e(false, false));
            d dVar4 = d.f10088h;
            m.a.c.e.c cVar5 = m.a.c.e.c.a;
            m.a.c.e.d dVar5 = m.a.c.e.d.Single;
            m.a.c.e.b bVar5 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(g.e.n.c.g.f.e.class));
            bVar5.n(dVar4);
            bVar5.o(dVar5);
            aVar.a(bVar5, new m.a.c.e.e(false, false));
            e eVar = new e(this);
            m.a.c.e.c cVar6 = m.a.c.e.c.a;
            m.a.c.e.d dVar6 = m.a.c.e.d.Single;
            m.a.c.e.b bVar6 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(MyRenzDatabase.class));
            bVar6.n(eVar);
            bVar6.o(dVar6);
            aVar.a(bVar6, new m.a.c.e.e(false, false));
            f fVar = f.f10090h;
            m.a.c.e.c cVar7 = m.a.c.e.c.a;
            m.a.c.e.d dVar7 = m.a.c.e.d.Single;
            m.a.c.e.b bVar7 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(com.sensorberg.smartspaces.myrenz.storage.a.class));
            bVar7.n(fVar);
            bVar7.o(dVar7);
            aVar.a(bVar7, new m.a.c.e.e(false, false));
            g gVar = g.f10091h;
            m.a.c.e.c cVar8 = m.a.c.e.c.a;
            m.a.c.e.d dVar8 = m.a.c.e.d.Single;
            m.a.c.e.b bVar8 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(g.e.n.c.g.f.f.class));
            bVar8.n(gVar);
            bVar8.o(dVar8);
            aVar.a(bVar8, new m.a.c.e.e(false, false));
            h hVar = new h(this);
            m.a.c.e.c cVar9 = m.a.c.e.c.a;
            m.a.c.e.d dVar9 = m.a.c.e.d.Single;
            m.a.c.e.b bVar9 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(g.e.n.c.g.f.d.class));
            bVar9.n(hVar);
            bVar9.o(dVar9);
            aVar.a(bVar9, new m.a.c.e.e(false, false));
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
        return b.b(false, false, new C0710a(context), 3, (Object) null);
    }
}
