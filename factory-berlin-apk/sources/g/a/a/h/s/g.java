package g.a.a.h.s;

import g.a.a.h.p;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: InputFieldWriter.kt */
public interface g {

    /* compiled from: InputFieldWriter.kt */
    public static final class a {

        /* renamed from: g.a.a.h.s.g$a$a  reason: collision with other inner class name */
        /* compiled from: InputFieldWriter.kt */
        public static final class C0599a implements c {
            final /* synthetic */ l b;

            C0599a(l lVar) {
                this.b = lVar;
            }

            public void a(b bVar) {
                k.f(bVar, "listItemWriter");
                this.b.o(bVar);
            }
        }

        public static void a(g gVar, String str, l<? super b, x> lVar) {
            k.f(str, "fieldName");
            k.f(lVar, "block");
            gVar.b(str, new C0599a(lVar));
        }
    }

    /* compiled from: InputFieldWriter.kt */
    public interface b {
        void a(p pVar, Object obj);

        void b(String str);

        void c(f fVar);
    }

    /* compiled from: InputFieldWriter.kt */
    public interface c {
        public static final a a = a.a;

        /* compiled from: InputFieldWriter.kt */
        public static final class a {
            static final /* synthetic */ a a = new a();

            private a() {
            }
        }

        void a(b bVar);
    }

    void a(String str, Integer num);

    void b(String str, c cVar);

    void c(String str, l<? super b, x> lVar);

    void d(String str, p pVar, Object obj);

    void e(String str, String str2);
}
