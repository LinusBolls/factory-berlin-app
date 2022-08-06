package g.e.k;

import androidx.lifecycle.LiveData;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: ExportLiveData.kt */
public final class b<T> extends LiveData<T> {
    private final l<T, x> q = new a(this);
    private final e<T> r;

    /* compiled from: ExportLiveData.kt */
    static final class a extends kotlin.jvm.internal.l implements l<T, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f9829h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.f9829h = bVar;
        }

        public final void a(T t) {
            this.f9829h.s(t);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    public b(e<T> eVar) {
        k.f(eVar, "source");
        this.r = eVar;
    }

    public T l() {
        return this.r.n();
    }

    /* access modifiers changed from: protected */
    public void q() {
        this.r.r(this.q);
    }

    /* access modifiers changed from: protected */
    public void r() {
        this.r.v(this.q);
    }
}
