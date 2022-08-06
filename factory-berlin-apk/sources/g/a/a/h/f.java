package g.a.a.h;

import kotlin.TypeCastException;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: ExecutionContext.kt */
public interface f {
    public static final f a = d.b;

    /* compiled from: ExecutionContext.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ExecutionContext.kt */
    public static final class b {

        /* compiled from: ExecutionContext.kt */
        static final class a extends l implements p<f, c, f> {

            /* renamed from: h  reason: collision with root package name */
            public static final a f9045h = new a();

            a() {
                super(2);
            }

            /* renamed from: a */
            public final f l(f fVar, c cVar) {
                k.f(fVar, "acc");
                k.f(cVar, "element");
                f a = fVar.a(cVar.getKey());
                return a == d.b ? cVar : new a(a, cVar);
            }
        }

        public static f a(f fVar, f fVar2) {
            k.f(fVar2, "context");
            return fVar2 == d.b ? fVar : (f) fVar2.fold(fVar, a.f9045h);
        }
    }

    /* compiled from: ExecutionContext.kt */
    public interface c extends f {

        /* compiled from: ExecutionContext.kt */
        public static final class a {
            public static <R> R a(c cVar, R r, p<? super R, ? super c, ? extends R> pVar) {
                k.f(pVar, "operation");
                return pVar.l(r, cVar);
            }

            public static <E extends c> E b(c cVar, d<E> dVar) {
                k.f(dVar, "key");
                if (!k.a(cVar.getKey(), dVar)) {
                    return null;
                }
                if (cVar != null) {
                    return cVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            }

            public static f c(c cVar, d<?> dVar) {
                k.f(dVar, "key");
                return k.a(cVar.getKey(), dVar) ? d.b : cVar;
            }

            public static f d(c cVar, f fVar) {
                k.f(fVar, "context");
                return b.a(cVar, fVar);
            }
        }

        <E extends c> E c(d<E> dVar);

        d<?> getKey();
    }

    /* compiled from: ExecutionContext.kt */
    public interface d<E extends c> {
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    f a(d<?> dVar);

    f b(f fVar);

    <R> R fold(R r, p<? super R, ? super c, ? extends R> pVar);
}
