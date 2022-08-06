package kotlinx.coroutines.e3;

import kotlin.c0.d;
import kotlin.e0.c.p;
import kotlin.x;

/* compiled from: Builders.kt */
final /* synthetic */ class f {

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements c<T> {
        final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        public Object a(d dVar, d dVar2) {
            Object a2 = dVar.a(this.a, dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
    }

    public static final <T> c<T> a() {
        return b.a;
    }

    public static final <T> c<T> b(p<? super d<? super T>, ? super d<? super x>, ? extends Object> pVar) {
        return new r(pVar);
    }

    public static final <T> c<T> c(T t) {
        return new a(t);
    }
}
