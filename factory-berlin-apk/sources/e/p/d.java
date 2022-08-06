package e.p;

import e.p.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DataSource */
public abstract class d<Key, Value> {
    private AtomicBoolean a = new AtomicBoolean(false);
    private CopyOnWriteArrayList<b> b = new CopyOnWriteArrayList<>();

    /* compiled from: DataSource */
    public static abstract class a<Key, Value> {
        public abstract d<Key, Value> a();
    }

    /* compiled from: DataSource */
    public interface b {
        void a();
    }

    /* compiled from: DataSource */
    static class c<T> {
        final int a;
        private final d b;
        final g.a<T> c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f8799d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private Executor f8800e = null;

        /* renamed from: f  reason: collision with root package name */
        private boolean f8801f = false;

        /* compiled from: DataSource */
        class a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ g f8802g;

            a(g gVar) {
                this.f8802g = gVar;
            }

            public void run() {
                c cVar = c.this;
                cVar.c.a(cVar.a, this.f8802g);
            }
        }

        c(d dVar, int i2, Executor executor, g.a<T> aVar) {
            this.b = dVar;
            this.a = i2;
            this.f8800e = executor;
            this.c = aVar;
        }

        static void d(List<?> list, int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Position must be non-negative");
            } else if (list.size() + i2 > i3) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            } else if (list.size() == 0 && i3 > 0) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            if (!this.b.e()) {
                return false;
            }
            b(g.b());
            return true;
        }

        /* access modifiers changed from: package-private */
        public void b(g<T> gVar) {
            Executor executor;
            synchronized (this.f8799d) {
                if (!this.f8801f) {
                    this.f8801f = true;
                    executor = this.f8800e;
                } else {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
            }
            if (executor != null) {
                executor.execute(new a(gVar));
            } else {
                this.c.a(this.a, gVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(Executor executor) {
            synchronized (this.f8799d) {
                this.f8800e = executor;
            }
        }
    }

    d() {
    }

    static <A, B> List<B> b(e.b.a.c.a<List<A>, List<B>> aVar, List<A> list) {
        List<B> a2 = aVar.a(list);
        if (a2.size() == list.size()) {
            return a2;
        }
        throw new IllegalStateException("Invalid Function " + aVar + " changed return size. This is not supported.");
    }

    public void a(b bVar) {
        this.b.add(bVar);
    }

    public void c() {
        if (this.a.compareAndSet(false, true)) {
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract boolean d();

    public boolean e() {
        return this.a.get();
    }

    public void f(b bVar) {
        this.b.remove(bVar);
    }
}
