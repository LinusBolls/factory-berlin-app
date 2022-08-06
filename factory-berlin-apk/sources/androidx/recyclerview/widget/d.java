package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.h;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: AsyncListDiffer */
public class d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final Executor f1242h = new c();
    private final r a;
    final c<T> b;
    Executor c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b<T>> f1243d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<T> f1244e;

    /* renamed from: f  reason: collision with root package name */
    private List<T> f1245f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    int f1246g;

    /* compiled from: AsyncListDiffer */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f1247g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List f1248h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f1249i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Runnable f1250j;

        /* renamed from: androidx.recyclerview.widget.d$a$a  reason: collision with other inner class name */
        /* compiled from: AsyncListDiffer */
        class C0029a extends h.b {
            C0029a() {
            }

            public boolean a(int i2, int i3) {
                Object obj = a.this.f1247g.get(i2);
                Object obj2 = a.this.f1248h.get(i3);
                if (obj != null && obj2 != null) {
                    return d.this.b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            public boolean b(int i2, int i3) {
                Object obj = a.this.f1247g.get(i2);
                Object obj2 = a.this.f1248h.get(i3);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.b.b().b(obj, obj2);
            }

            public Object c(int i2, int i3) {
                Object obj = a.this.f1247g.get(i2);
                Object obj2 = a.this.f1248h.get(i3);
                if (obj != null && obj2 != null) {
                    return d.this.b.b().c(obj, obj2);
                }
                throw new AssertionError();
            }

            public int d() {
                return a.this.f1248h.size();
            }

            public int e() {
                return a.this.f1247g.size();
            }
        }

        /* compiled from: AsyncListDiffer */
        class b implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ h.c f1252g;

            b(h.c cVar) {
                this.f1252g = cVar;
            }

            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f1246g == aVar.f1249i) {
                    dVar.c(aVar.f1248h, this.f1252g, aVar.f1250j);
                }
            }
        }

        a(List list, List list2, int i2, Runnable runnable) {
            this.f1247g = list;
            this.f1248h = list2;
            this.f1249i = i2;
            this.f1250j = runnable;
        }

        public void run() {
            d.this.c.execute(new b(h.a(new C0029a())));
        }
    }

    /* compiled from: AsyncListDiffer */
    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    /* compiled from: AsyncListDiffer */
    private static class c implements Executor {

        /* renamed from: g  reason: collision with root package name */
        final Handler f1254g = new Handler(Looper.getMainLooper());

        c() {
        }

        public void execute(Runnable runnable) {
            this.f1254g.post(runnable);
        }
    }

    public d(r rVar, c<T> cVar) {
        this.a = rVar;
        this.b = cVar;
        if (cVar.c() != null) {
            this.c = cVar.c();
        } else {
            this.c = f1242h;
        }
    }

    private void d(List<T> list, Runnable runnable) {
        for (b<T> a2 : this.f1243d) {
            a2.a(list, this.f1245f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b<T> bVar) {
        this.f1243d.add(bVar);
    }

    public List<T> b() {
        return this.f1245f;
    }

    /* access modifiers changed from: package-private */
    public void c(List<T> list, h.c cVar, Runnable runnable) {
        List<T> list2 = this.f1245f;
        this.f1244e = list;
        this.f1245f = Collections.unmodifiableList(list);
        cVar.e(this.a);
        d(list2, runnable);
    }

    public void e(List<T> list) {
        f(list, (Runnable) null);
    }

    public void f(List<T> list, Runnable runnable) {
        int i2 = this.f1246g + 1;
        this.f1246g = i2;
        List<T> list2 = this.f1244e;
        if (list != list2) {
            List<T> list3 = this.f1245f;
            if (list == null) {
                int size = list2.size();
                this.f1244e = null;
                this.f1245f = Collections.emptyList();
                this.a.a(0, size);
                d(list3, runnable);
            } else if (list2 == null) {
                this.f1244e = list;
                this.f1245f = Collections.unmodifiableList(list);
                this.a.c(0, list.size());
                d(list3, runnable);
            } else {
                this.b.a().execute(new a(list2, list, i2, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
