package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import k.b0;
import retrofit2.c;

/* compiled from: DefaultCallAdapterFactory */
final class g extends c.a {
    private final Executor a;

    /* compiled from: DefaultCallAdapterFactory */
    class a implements c<Object, b<?>> {
        final /* synthetic */ Type a;
        final /* synthetic */ Executor b;

        a(g gVar, Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        public Type a() {
            return this.a;
        }

        /* renamed from: c */
        public b<Object> b(b<Object> bVar) {
            Executor executor = this.b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    /* compiled from: DefaultCallAdapterFactory */
    static final class b<T> implements b<T> {

        /* renamed from: g  reason: collision with root package name */
        final Executor f11780g;

        /* renamed from: h  reason: collision with root package name */
        final b<T> f11781h;

        /* compiled from: DefaultCallAdapterFactory */
        class a implements d<T> {
            final /* synthetic */ d a;

            /* renamed from: retrofit2.g$b$a$a  reason: collision with other inner class name */
            /* compiled from: DefaultCallAdapterFactory */
            class C0807a implements Runnable {

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ q f11782g;

                C0807a(q qVar) {
                    this.f11782g = qVar;
                }

                public void run() {
                    if (b.this.f11781h.n()) {
                        a aVar = a.this;
                        aVar.a.b(b.this, new IOException("Canceled"));
                        return;
                    }
                    a aVar2 = a.this;
                    aVar2.a.a(b.this, this.f11782g);
                }
            }

            /* renamed from: retrofit2.g$b$a$b  reason: collision with other inner class name */
            /* compiled from: DefaultCallAdapterFactory */
            class C0808b implements Runnable {

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ Throwable f11784g;

                C0808b(Throwable th) {
                    this.f11784g = th;
                }

                public void run() {
                    a aVar = a.this;
                    aVar.a.b(b.this, this.f11784g);
                }
            }

            a(d dVar) {
                this.a = dVar;
            }

            public void a(b<T> bVar, q<T> qVar) {
                b.this.f11780g.execute(new C0807a(qVar));
            }

            public void b(b<T> bVar, Throwable th) {
                b.this.f11780g.execute(new C0808b(th));
            }
        }

        b(Executor executor, b<T> bVar) {
            this.f11780g = executor;
            this.f11781h = bVar;
        }

        public q<T> a() {
            return this.f11781h.a();
        }

        public void cancel() {
            this.f11781h.cancel();
        }

        /* renamed from: i */
        public b<T> clone() {
            return new b(this.f11780g, this.f11781h.i());
        }

        public b0 j() {
            return this.f11781h.j();
        }

        public boolean n() {
            return this.f11781h.n();
        }

        public boolean n0() {
            return this.f11781h.n0();
        }

        public void t0(d<T> dVar) {
            v.b(dVar, "callback == null");
            this.f11781h.t0(new a(dVar));
        }
    }

    g(Executor executor) {
        this.a = executor;
    }

    public c<?, ?> a(Type type, Annotation[] annotationArr, r rVar) {
        Executor executor = null;
        if (c.a.c(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type h2 = v.h(0, (ParameterizedType) type);
            if (!v.m(annotationArr, t.class)) {
                executor = this.a;
            }
            return new a(this, h2, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
