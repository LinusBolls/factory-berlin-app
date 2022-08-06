package e.p;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.r;
import e.p.h;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: AsyncPagedListDiffer */
public class a<T> {
    final r a;
    final androidx.recyclerview.widget.c<T> b;
    Executor c = e.b.a.a.a.g();

    /* renamed from: d  reason: collision with root package name */
    private final List<c<T>> f8779d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    private boolean f8780e;

    /* renamed from: f  reason: collision with root package name */
    private h<T> f8781f;

    /* renamed from: g  reason: collision with root package name */
    private h<T> f8782g;

    /* renamed from: h  reason: collision with root package name */
    int f8783h;

    /* renamed from: i  reason: collision with root package name */
    private h.e f8784i = new C0577a();

    /* renamed from: e.p.a$a  reason: collision with other inner class name */
    /* compiled from: AsyncPagedListDiffer */
    class C0577a extends h.e {
        C0577a() {
        }

        public void a(int i2, int i3) {
            a.this.a.d(i2, i3, (Object) null);
        }

        public void b(int i2, int i3) {
            a.this.a.c(i2, i3);
        }

        public void c(int i2, int i3) {
            a.this.a.a(i2, i3);
        }
    }

    /* compiled from: AsyncPagedListDiffer */
    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f8785g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f8786h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f8787i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h f8788j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Runnable f8789k;

        /* renamed from: e.p.a$b$a  reason: collision with other inner class name */
        /* compiled from: AsyncPagedListDiffer */
        class C0578a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ h.c f8791g;

            C0578a(h.c cVar) {
                this.f8791g = cVar;
            }

            public void run() {
                b bVar = b.this;
                a aVar = a.this;
                if (aVar.f8783h == bVar.f8787i) {
                    aVar.d(bVar.f8788j, bVar.f8786h, this.f8791g, bVar.f8785g.f8824l, bVar.f8789k);
                }
            }
        }

        b(h hVar, h hVar2, int i2, h hVar3, Runnable runnable) {
            this.f8785g = hVar;
            this.f8786h = hVar2;
            this.f8787i = i2;
            this.f8788j = hVar3;
            this.f8789k = runnable;
        }

        public void run() {
            a.this.c.execute(new C0578a(k.a(this.f8785g.f8823k, this.f8786h.f8823k, a.this.b.b())));
        }
    }

    /* compiled from: AsyncPagedListDiffer */
    public interface c<T> {
        void a(h<T> hVar, h<T> hVar2);
    }

    public a(RecyclerView.g gVar, h.d<T> dVar) {
        this.a = new androidx.recyclerview.widget.b(gVar);
        this.b = new c.a(dVar).a();
    }

    private void e(h<T> hVar, h<T> hVar2, Runnable runnable) {
        for (c<T> a2 : this.f8779d) {
            a2.a(hVar, hVar2);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(c<T> cVar) {
        this.f8779d.add(cVar);
    }

    public T b(int i2) {
        h<T> hVar = this.f8781f;
        if (hVar == null) {
            h<T> hVar2 = this.f8782g;
            if (hVar2 != null) {
                return hVar2.get(i2);
            }
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        hVar.J(i2);
        return this.f8781f.get(i2);
    }

    public int c() {
        h<T> hVar = this.f8781f;
        if (hVar != null) {
            return hVar.size();
        }
        h<T> hVar2 = this.f8782g;
        if (hVar2 == null) {
            return 0;
        }
        return hVar2.size();
    }

    /* access modifiers changed from: package-private */
    public void d(h<T> hVar, h<T> hVar2, h.c cVar, int i2, Runnable runnable) {
        h<T> hVar3 = this.f8782g;
        if (hVar3 == null || this.f8781f != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.f8781f = hVar;
        this.f8782g = null;
        k.b(this.a, hVar3.f8823k, hVar.f8823k, cVar);
        hVar.n(hVar2, this.f8784i);
        if (!this.f8781f.isEmpty()) {
            int c2 = k.c(cVar, hVar3.f8823k, hVar2.f8823k, i2);
            h<T> hVar4 = this.f8781f;
            hVar4.J(Math.max(0, Math.min(hVar4.size() - 1, c2)));
        }
        e(hVar3, this.f8781f, runnable);
    }

    public void f(h<T> hVar) {
        g(hVar, (Runnable) null);
    }

    public void g(h<T> hVar, Runnable runnable) {
        if (hVar != null) {
            if (this.f8781f == null && this.f8782g == null) {
                this.f8780e = hVar.E();
            } else if (hVar.E() != this.f8780e) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i2 = this.f8783h + 1;
        this.f8783h = i2;
        h<T> hVar2 = this.f8781f;
        if (hVar != hVar2) {
            h<T> hVar3 = this.f8782g;
            if (hVar3 != null) {
                hVar2 = hVar3;
            }
            if (hVar == null) {
                int c2 = c();
                h<T> hVar4 = this.f8781f;
                if (hVar4 != null) {
                    hVar4.Q(this.f8784i);
                    this.f8781f = null;
                } else if (this.f8782g != null) {
                    this.f8782g = null;
                }
                this.a.a(0, c2);
                e(hVar2, (h<T>) null, runnable);
            } else if (this.f8781f == null && this.f8782g == null) {
                this.f8781f = hVar;
                hVar.n((List<T>) null, this.f8784i);
                this.a.c(0, hVar.size());
                e((h) null, hVar, runnable);
            } else {
                h<T> hVar5 = this.f8781f;
                if (hVar5 != null) {
                    hVar5.Q(this.f8784i);
                    this.f8782g = (h) this.f8781f.R();
                    this.f8781f = null;
                }
                h<T> hVar6 = this.f8782g;
                if (hVar6 == null || this.f8781f != null) {
                    throw new IllegalStateException("must be in snapshot state to diff");
                }
                this.b.a().execute(new b(hVar6, (h) hVar.R(), i2, hVar, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
