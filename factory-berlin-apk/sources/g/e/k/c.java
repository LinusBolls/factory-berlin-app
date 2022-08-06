package g.e.k;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: MediatorObservableData.kt */
public class c<T> extends d<T> {
    /* access modifiers changed from: private */
    public final Map<e<?>, a<?>> q = new LinkedHashMap();

    /* compiled from: MediatorObservableData.kt */
    private static final class a<T> {
        private final e<T> a;
        private final l<T, x> b;

        public a(e<T> eVar, l<? super T, x> lVar) {
            k.f(eVar, "source");
            k.f(lVar, "observer");
            this.a = eVar;
            this.b = lVar;
        }

        public final void a() {
            this.a.r(this.b);
        }

        public final void b() {
            this.a.v(this.b);
        }
    }

    /* compiled from: MediatorObservableData.kt */
    static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f9830h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f9831i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ l f9832j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, e eVar, l lVar) {
            super(0);
            this.f9830h = cVar;
            this.f9831i = eVar;
            this.f9832j = lVar;
        }

        public final void a() {
            if (!this.f9830h.q.containsKey(this.f9831i)) {
                a aVar = new a(this.f9831i, this.f9832j);
                this.f9830h.q.put(this.f9831i, aVar);
                if (this.f9830h.o()) {
                    aVar.a();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("This source was already added with the different observer");
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* renamed from: g.e.k.c$c  reason: collision with other inner class name */
    /* compiled from: MediatorObservableData.kt */
    static final class C0677c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f9833h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f9834i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0677c(c cVar, e eVar) {
            super(0);
            this.f9833h = cVar;
            this.f9834i = eVar;
        }

        public final void a() {
            a aVar = (a) this.f9833h.q.remove(this.f9834i);
            if (aVar != null) {
                aVar.b();
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    public final <S> void A(e<S> eVar) {
        k.f(eVar, "source");
        e.p.a(new C0677c(this, eVar));
    }

    /* access modifiers changed from: protected */
    public void s() {
        for (Map.Entry<e<?>, a<?>> value : this.q.entrySet()) {
            ((a) value.getValue()).a();
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
        for (Map.Entry<e<?>, a<?>> value : this.q.entrySet()) {
            ((a) value.getValue()).b();
        }
    }

    public final <S> void z(e<S> eVar, l<? super S, x> lVar) {
        k.f(eVar, "source");
        k.f(lVar, "observer");
        e.p.a(new b(this, eVar, lVar));
    }
}
