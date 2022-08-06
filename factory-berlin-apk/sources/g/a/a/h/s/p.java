package g.a.a.h.s;

import g.a.a.h.o;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: ResponseWriter.kt */
public interface p {

    /* compiled from: ResponseWriter.kt */
    public static final class a {

        /* renamed from: g.a.a.h.s.p$a$a  reason: collision with other inner class name */
        /* compiled from: ResponseWriter.kt */
        public static final class C0602a implements c<T> {
            final /* synthetic */ kotlin.e0.c.p a;

            C0602a(kotlin.e0.c.p pVar) {
                this.a = pVar;
            }

            public void a(List<? extends T> list, b bVar) {
                k.f(bVar, "listItemWriter");
                this.a.l(list, bVar);
            }
        }

        public static <T> void a(p pVar, o oVar, List<? extends T> list, kotlin.e0.c.p<? super List<? extends T>, ? super b, x> pVar2) {
            k.f(oVar, "field");
            k.f(pVar2, "block");
            pVar.i(oVar, list, new C0602a(pVar2));
        }
    }

    /* compiled from: ResponseWriter.kt */
    public interface b {
        void a(n nVar);
    }

    /* compiled from: ResponseWriter.kt */
    public interface c<T> {
        void a(List<? extends T> list, b bVar);
    }

    void a(o oVar, Integer num);

    void b(o.d dVar, Object obj);

    void c(o oVar, n nVar);

    <T> void d(o oVar, List<? extends T> list, kotlin.e0.c.p<? super List<? extends T>, ? super b, x> pVar);

    void e(o oVar, Boolean bool);

    void f(o oVar, String str);

    void g(n nVar);

    void h(o oVar, Double d2);

    <T> void i(o oVar, List<? extends T> list, c<T> cVar);
}
