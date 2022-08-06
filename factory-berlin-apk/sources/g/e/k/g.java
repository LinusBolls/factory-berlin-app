package g.e.k;

import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: ObservableDataWrapper.kt */
public class g<T> extends e<T> {
    /* access modifiers changed from: private */
    public e<T> q;
    /* access modifiers changed from: private */
    public final l<T, x> r = new b(this);

    /* compiled from: ObservableDataWrapper.kt */
    static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f9866h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.f9866h = gVar;
        }

        public final void a() {
            e z = this.f9866h.q;
            if (z != null) {
                z.v(this.f9866h.r);
            }
            this.f9866h.q = null;
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: ObservableDataWrapper.kt */
    static final class b extends kotlin.jvm.internal.l implements l<T, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f9867h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(1);
            this.f9867h = gVar;
        }

        public final void a(T t) {
            this.f9867h.C(t);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    /* compiled from: ObservableDataWrapper.kt */
    static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f9868h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f9869i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, e eVar) {
            super(0);
            this.f9868h = gVar;
            this.f9869i = eVar;
        }

        public final void a() {
            e z;
            if (!k.a(this.f9868h.q, this.f9869i)) {
                this.f9868h.B();
                this.f9868h.q = this.f9869i;
                if (this.f9868h.o() && (z = this.f9868h.q) != null) {
                    z.r(this.f9868h.r);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    public final void B() {
        e.p.a(new a(this));
    }

    /* access modifiers changed from: protected */
    public void C(T t) {
        w(t);
    }

    public final void D(e<T> eVar) {
        e.p.a(new c(this, eVar));
    }

    /* access modifiers changed from: protected */
    public void s() {
        e<T> eVar = this.q;
        if (eVar != null) {
            eVar.r(this.r);
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
        e<T> eVar = this.q;
        if (eVar != null) {
            eVar.v(this.r);
        }
    }
}
