package e.p;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import androidx.recyclerview.widget.h;
import e.p.a;

/* compiled from: PagedListAdapter */
public abstract class i<T, VH extends RecyclerView.d0> extends RecyclerView.g<VH> {

    /* renamed from: i  reason: collision with root package name */
    final a<T> f8841i;

    /* renamed from: j  reason: collision with root package name */
    private final a.c<T> f8842j = new a();

    /* compiled from: PagedListAdapter */
    class a implements a.c<T> {
        a() {
        }

        public void a(h<T> hVar, h<T> hVar2) {
            i.this.J(hVar2);
            i.this.K(hVar, hVar2);
        }
    }

    protected i(h.d<T> dVar) {
        a<T> aVar = new a<>(this, dVar);
        this.f8841i = aVar;
        aVar.a(this.f8842j);
    }

    /* access modifiers changed from: protected */
    public T I(int i2) {
        return this.f8841i.b(i2);
    }

    @Deprecated
    public void J(h<T> hVar) {
    }

    public void K(h<T> hVar, h<T> hVar2) {
    }

    public void L(h<T> hVar) {
        this.f8841i.f(hVar);
    }

    public int d() {
        return this.f8841i.c();
    }
}
