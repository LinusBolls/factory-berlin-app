package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: AsyncDifferConfig */
public final class c<T> {
    private final Executor a;
    private final Executor b;
    private final h.d<T> c;

    /* compiled from: AsyncDifferConfig */
    public static final class a<T> {

        /* renamed from: d  reason: collision with root package name */
        private static final Object f1240d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private static Executor f1241e;
        private Executor a;
        private Executor b;
        private final h.d<T> c;

        public a(h.d<T> dVar) {
            this.c = dVar;
        }

        public c<T> a() {
            if (this.b == null) {
                synchronized (f1240d) {
                    if (f1241e == null) {
                        f1241e = Executors.newFixedThreadPool(2);
                    }
                }
                this.b = f1241e;
            }
            return new c<>(this.a, this.b, this.c);
        }
    }

    c(Executor executor, Executor executor2, h.d<T> dVar) {
        this.a = executor;
        this.b = executor2;
        this.c = dVar;
    }

    public Executor a() {
        return this.b;
    }

    public h.d<T> b() {
        return this.c;
    }

    public Executor c() {
        return this.a;
    }
}
