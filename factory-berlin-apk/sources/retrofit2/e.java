package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.c;

@IgnoreJRERequirement
/* compiled from: CompletableFutureCallAdapterFactory */
final class e extends c.a {
    static final c.a a = new e();

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    private static final class a<R> implements c<R, CompletableFuture<R>> {
        private final Type a;

        /* renamed from: retrofit2.e$a$a  reason: collision with other inner class name */
        /* compiled from: CompletableFutureCallAdapterFactory */
        class C0805a extends CompletableFuture<R> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ b f11778g;

            C0805a(a aVar, b bVar) {
                this.f11778g = bVar;
            }

            public boolean cancel(boolean z) {
                if (z) {
                    this.f11778g.cancel();
                }
                return super.cancel(z);
            }
        }

        /* compiled from: CompletableFutureCallAdapterFactory */
        class b implements d<R> {
            final /* synthetic */ CompletableFuture a;

            b(a aVar, CompletableFuture completableFuture) {
                this.a = completableFuture;
            }

            public void a(b<R> bVar, q<R> qVar) {
                if (qVar.e()) {
                    this.a.complete(qVar.a());
                } else {
                    this.a.completeExceptionally(new HttpException(qVar));
                }
            }

            public void b(b<R> bVar, Throwable th) {
                this.a.completeExceptionally(th);
            }
        }

        a(Type type) {
            this.a = type;
        }

        public Type a() {
            return this.a;
        }

        /* renamed from: c */
        public CompletableFuture<R> b(b<R> bVar) {
            C0805a aVar = new C0805a(this, bVar);
            bVar.t0(new b(this, aVar));
            return aVar;
        }
    }

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    private static final class b<R> implements c<R, CompletableFuture<q<R>>> {
        private final Type a;

        /* compiled from: CompletableFutureCallAdapterFactory */
        class a extends CompletableFuture<q<R>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ b f11779g;

            a(b bVar, b bVar2) {
                this.f11779g = bVar2;
            }

            public boolean cancel(boolean z) {
                if (z) {
                    this.f11779g.cancel();
                }
                return super.cancel(z);
            }
        }

        /* renamed from: retrofit2.e$b$b  reason: collision with other inner class name */
        /* compiled from: CompletableFutureCallAdapterFactory */
        class C0806b implements d<R> {
            final /* synthetic */ CompletableFuture a;

            C0806b(b bVar, CompletableFuture completableFuture) {
                this.a = completableFuture;
            }

            public void a(b<R> bVar, q<R> qVar) {
                this.a.complete(qVar);
            }

            public void b(b<R> bVar, Throwable th) {
                this.a.completeExceptionally(th);
            }
        }

        b(Type type) {
            this.a = type;
        }

        public Type a() {
            return this.a;
        }

        /* renamed from: c */
        public CompletableFuture<q<R>> b(b<R> bVar) {
            a aVar = new a(this, bVar);
            bVar.t0(new C0806b(this, aVar));
            return aVar;
        }
    }

    e() {
    }

    public c<?, ?> a(Type type, Annotation[] annotationArr, r rVar) {
        if (c.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b2 = c.a.b(0, (ParameterizedType) type);
            if (c.a.c(b2) != q.class) {
                return new a(b2);
            }
            if (b2 instanceof ParameterizedType) {
                return new b(c.a.b(0, (ParameterizedType) b2));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
