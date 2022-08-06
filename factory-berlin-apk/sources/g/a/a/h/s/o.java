package g.a.a.h.s;

import g.a.a.h.o;
import java.util.List;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;

/* compiled from: ResponseReader.kt */
public interface o {

    /* compiled from: ResponseReader.kt */
    public static final class a {

        /* renamed from: g.a.a.h.s.o$a$a  reason: collision with other inner class name */
        /* compiled from: ResponseReader.kt */
        public static final class C0600a implements d<T> {
            final /* synthetic */ l a;

            C0600a(l lVar) {
                this.a = lVar;
            }

            public T a(o oVar) {
                k.f(oVar, "reader");
                return this.a.o(oVar);
            }
        }

        /* compiled from: ResponseReader.kt */
        public static final class b implements c<T> {
            final /* synthetic */ l a;

            b(l lVar) {
                this.a = lVar;
            }

            public T a(b bVar) {
                k.f(bVar, "reader");
                return this.a.o(bVar);
            }
        }

        /* compiled from: ResponseReader.kt */
        public static final class c implements d<T> {
            final /* synthetic */ l a;

            c(l lVar) {
                this.a = lVar;
            }

            public T a(o oVar) {
                k.f(oVar, "reader");
                return this.a.o(oVar);
            }
        }

        public static <T> T a(o oVar, g.a.a.h.o oVar2, l<? super o, ? extends T> lVar) {
            k.f(oVar2, "field");
            k.f(lVar, "block");
            return oVar.h(oVar2, new C0600a(lVar));
        }

        public static <T> List<T> b(o oVar, g.a.a.h.o oVar2, l<? super b, ? extends T> lVar) {
            k.f(oVar2, "field");
            k.f(lVar, "block");
            return oVar.a(oVar2, new b(lVar));
        }

        public static <T> T c(o oVar, g.a.a.h.o oVar2, l<? super o, ? extends T> lVar) {
            k.f(oVar2, "field");
            k.f(lVar, "block");
            return oVar.i(oVar2, new c(lVar));
        }
    }

    /* compiled from: ResponseReader.kt */
    public interface b {

        /* compiled from: ResponseReader.kt */
        public static final class a {

            /* renamed from: g.a.a.h.s.o$b$a$a  reason: collision with other inner class name */
            /* compiled from: ResponseReader.kt */
            public static final class C0601a implements d<T> {
                final /* synthetic */ l a;

                C0601a(l lVar) {
                    this.a = lVar;
                }

                public T a(o oVar) {
                    k.f(oVar, "reader");
                    return this.a.o(oVar);
                }
            }

            public static <T> T a(b bVar, l<? super o, ? extends T> lVar) {
                k.f(lVar, "block");
                return bVar.a(new C0601a(lVar));
            }
        }

        <T> T a(d<T> dVar);

        <T> T b(l<? super o, ? extends T> lVar);
    }

    /* compiled from: ResponseReader.kt */
    public interface c<T> {
        T a(b bVar);
    }

    /* compiled from: ResponseReader.kt */
    public interface d<T> {
        T a(o oVar);
    }

    <T> List<T> a(g.a.a.h.o oVar, c<T> cVar);

    <T> T b(g.a.a.h.o oVar, l<? super o, ? extends T> lVar);

    <T> T c(o.d dVar);

    <T> T d(g.a.a.h.o oVar, l<? super o, ? extends T> lVar);

    Integer e(g.a.a.h.o oVar);

    String f(g.a.a.h.o oVar);

    <T> List<T> g(g.a.a.h.o oVar, l<? super b, ? extends T> lVar);

    <T> T h(g.a.a.h.o oVar, d<T> dVar);

    <T> T i(g.a.a.h.o oVar, d<T> dVar);

    Boolean j(g.a.a.h.o oVar);

    Double k(g.a.a.h.o oVar);
}
