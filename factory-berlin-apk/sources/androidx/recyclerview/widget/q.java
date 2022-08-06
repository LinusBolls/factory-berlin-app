package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import java.util.List;

/* compiled from: ListAdapter */
public abstract class q<T, VH extends RecyclerView.d0> extends RecyclerView.g<VH> {

    /* renamed from: i  reason: collision with root package name */
    final d<T> f1349i;

    /* renamed from: j  reason: collision with root package name */
    private final d.b<T> f1350j = new a();

    /* compiled from: ListAdapter */
    class a implements d.b<T> {
        a() {
        }

        public void a(List<T> list, List<T> list2) {
            q.this.J(list, list2);
        }
    }

    protected q(h.d<T> dVar) {
        d<T> dVar2 = new d<>(new b(this), new c.a(dVar).a());
        this.f1349i = dVar2;
        dVar2.a(this.f1350j);
    }

    /* access modifiers changed from: protected */
    public T I(int i2) {
        return this.f1349i.b().get(i2);
    }

    public void J(List<T> list, List<T> list2) {
    }

    public void K(List<T> list) {
        this.f1349i.e(list);
    }

    public int d() {
        return this.f1349i.b().size();
    }
}
