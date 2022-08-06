package kotlin.i0;

import java.util.Iterator;
import kotlin.jvm.internal.k;

/* compiled from: Sequences.kt */
class h extends g {

    /* compiled from: Sequences.kt */
    public static final class a implements d<T> {
        final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        public Iterator<T> iterator() {
            return this.a;
        }
    }

    public static <T> d<T> a(Iterator<? extends T> it) {
        k.e(it, "$this$asSequence");
        return b(new a(it));
    }

    public static final <T> d<T> b(d<? extends T> dVar) {
        k.e(dVar, "$this$constrainOnce");
        return dVar instanceof a ? (a) dVar : new a(dVar);
    }
}
