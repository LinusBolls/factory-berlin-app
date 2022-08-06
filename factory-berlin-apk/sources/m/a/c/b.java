package m.a.c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: KoinApplication.kt */
public final class b {
    /* access modifiers changed from: private */
    public static m.a.c.g.c b = new m.a.c.g.a();
    public static final a c = new a((DefaultConstructorMarker) null);
    private final a a;

    /* compiled from: KoinApplication.kt */
    public static final class a {
        private a() {
        }

        public final b a() {
            b bVar = new b((DefaultConstructorMarker) null);
            bVar.e();
            return bVar;
        }

        public final m.a.c.g.c b() {
            return b.b;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: m.a.c.b$b  reason: collision with other inner class name */
    /* compiled from: KoinApplication.kt */
    static final class C0783b extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f11149h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0783b(b bVar) {
            super(0);
            this.f11149h = bVar;
        }

        public final void a() {
            this.f11149h.d().b();
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: KoinApplication.kt */
    static final class c extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f11150h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List f11151i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, List list) {
            super(0);
            this.f11150h = bVar;
            this.f11151i = list;
        }

        public final void a() {
            this.f11150h.f(this.f11151i);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    private b() {
        this.a = new a();
    }

    /* access modifiers changed from: private */
    public final void f(Iterable<m.a.c.h.a> iterable) {
        this.a.d().f().j(iterable);
        this.a.e().f(iterable);
    }

    public final b c() {
        if (b.d(m.a.c.g.b.DEBUG)) {
            double b2 = m.a.c.m.a.b(new C0783b(this));
            m.a.c.g.c cVar = b;
            cVar.a("instances started in " + b2 + " ms");
        } else {
            this.a.b();
        }
        return this;
    }

    public final a d() {
        return this.a;
    }

    public final void e() {
        this.a.e().e(this.a);
    }

    public final b g(List<m.a.c.h.a> list) {
        k.f(list, "modules");
        if (b.d(m.a.c.g.b.INFO)) {
            double b2 = m.a.c.m.a.b(new c(this, list));
            int size = this.a.d().f().i().size();
            Collection<m.a.c.l.c> d2 = this.a.e().d();
            ArrayList arrayList = new ArrayList(o.p(d2, 10));
            for (m.a.c.l.c a2 : d2) {
                arrayList.add(Integer.valueOf(a2.a().size()));
            }
            int O = size + v.O(arrayList);
            m.a.c.g.c cVar = b;
            cVar.c("total " + O + " registered definitions");
            m.a.c.g.c cVar2 = b;
            cVar2.c("load modules in " + b2 + " ms");
        } else {
            f(list);
        }
        return this;
    }

    public final b h(m.a.c.h.a aVar) {
        k.f(aVar, "modules");
        g(m.b(aVar));
        return this;
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
