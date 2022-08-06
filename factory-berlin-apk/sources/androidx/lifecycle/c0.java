package androidx.lifecycle;

import e.b.a.b.b;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MediatorLiveData */
public class c0<T> extends e0<T> {
    private b<LiveData<?>, a<?>> q = new b<>();

    /* compiled from: MediatorLiveData */
    private static class a<V> implements f0<V> {

        /* renamed from: g  reason: collision with root package name */
        final LiveData<V> f970g;

        /* renamed from: h  reason: collision with root package name */
        final f0<? super V> f971h;

        /* renamed from: i  reason: collision with root package name */
        int f972i = -1;

        a(LiveData<V> liveData, f0<? super V> f0Var) {
            this.f970g = liveData;
            this.f971h = f0Var;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f970g.p(this);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f970g.t(this);
        }

        public void k(V v) {
            if (this.f972i != this.f970g.m()) {
                this.f972i = this.f970g.m();
                this.f971h.k(v);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.q.iterator();
        while (it.hasNext()) {
            ((a) it.next().getValue()).a();
        }
    }

    /* access modifiers changed from: protected */
    public void r() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.q.iterator();
        while (it.hasNext()) {
            ((a) it.next().getValue()).b();
        }
    }

    public <S> void v(LiveData<S> liveData, f0<? super S> f0Var) {
        a aVar = new a(liveData, f0Var);
        a k2 = this.q.k(liveData, aVar);
        if (k2 != null && k2.f971h != f0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (k2 == null && n()) {
            aVar.a();
        }
    }

    public <S> void w(LiveData<S> liveData) {
        a l2 = this.q.l(liveData);
        if (l2 != null) {
            l2.b();
        }
    }
}
