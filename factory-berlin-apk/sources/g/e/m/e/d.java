package g.e.m.e;

import g.e.k.e;
import g.e.m.a;
import java.lang.ref.WeakReference;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: RxObservableObserver.kt */
public final class d<T, P> implements l<g.e.m.a<T, P>, x> {

    /* renamed from: g  reason: collision with root package name */
    private l<? super T, x> f9926g;

    /* renamed from: h  reason: collision with root package name */
    private l<? super Exception, x> f9927h;

    /* renamed from: i  reason: collision with root package name */
    private l<? super P, x> f9928i;

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<g.e.m.a<T, P>> f9929j;

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.e0.c.a<x> f9930k;

    /* renamed from: l  reason: collision with root package name */
    private final g.e.k.a f9931l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public e<g.e.m.a<T, P>> f9932m;

    /* compiled from: RxObservableObserver.kt */
    static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f9933h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.f9933h = dVar;
        }

        public final void a() {
            e a = this.f9933h.f9932m;
            if (a != null) {
                a.v(this.f9933h);
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    public d(g.e.k.a aVar, e<g.e.m.a<T, P>> eVar) {
        this.f9931l = aVar;
        this.f9932m = eVar;
        a aVar2 = new a(this);
        this.f9930k = aVar2;
        g.e.k.a aVar3 = this.f9931l;
        if (aVar3 != null) {
            aVar3.d(aVar2);
        }
    }

    public void b(g.e.m.a<T, P> aVar) {
        l<? super P, x> lVar;
        if (aVar == null) {
            this.f9929j = null;
            return;
        }
        this.f9929j = new WeakReference<>(aVar);
        if (aVar.f() == a.b.SUCCESS || aVar.f() == a.b.FAIL) {
            g.e.k.a aVar2 = this.f9931l;
            if (aVar2 != null) {
                aVar2.e(this.f9930k);
            }
            e<g.e.m.a<T, P>> eVar = this.f9932m;
            if (eVar != null) {
                eVar.v(this);
            }
            this.f9932m = null;
        }
        int i2 = c.a[aVar.f().ordinal()];
        if (i2 == 1) {
            l<? super T, x> lVar2 = this.f9926g;
            if (lVar2 != null) {
                x o = lVar2.o(aVar.c());
            }
        } else if (i2 == 2) {
            l<? super Exception, x> lVar3 = this.f9927h;
            if (lVar3 != null) {
                x o2 = lVar3.o(aVar.d());
            }
        } else if (i2 == 3 && (lVar = this.f9928i) != null) {
            x o3 = lVar.o(aVar.e());
        }
    }

    public final d<T, P> c(l<? super P, x> lVar) {
        g.e.m.a aVar;
        k.e(lVar, "executingCallback");
        this.f9928i = lVar;
        WeakReference<g.e.m.a<T, P>> weakReference = this.f9929j;
        if (!(weakReference == null || (aVar = (g.e.m.a) weakReference.get()) == null || aVar.f() != a.b.EXECUTING)) {
            lVar.o(aVar.e());
        }
        return this;
    }

    public final d<T, P> e(l<? super Exception, x> lVar) {
        g.e.m.a aVar;
        k.e(lVar, "failCallback");
        this.f9927h = lVar;
        WeakReference<g.e.m.a<T, P>> weakReference = this.f9929j;
        if (!(weakReference == null || (aVar = (g.e.m.a) weakReference.get()) == null || aVar.f() != a.b.FAIL)) {
            lVar.o(aVar.d());
        }
        return this;
    }

    public final d<T, P> f(l<? super T, x> lVar) {
        g.e.m.a aVar;
        k.e(lVar, "successCallback");
        this.f9926g = lVar;
        WeakReference<g.e.m.a<T, P>> weakReference = this.f9929j;
        if (!(weakReference == null || (aVar = (g.e.m.a) weakReference.get()) == null || aVar.f() != a.b.SUCCESS)) {
            lVar.o(aVar.c());
        }
        return this;
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        b((g.e.m.a) obj);
        return x.a;
    }
}
