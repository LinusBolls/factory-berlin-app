package kotlin.b0;

import java.util.Comparator;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;

/* compiled from: Comparisons.kt */
class b {

    /* compiled from: Comparisons.kt */
    static final class a<T> implements Comparator<T> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ l[] f10593g;

        a(l[] lVarArr) {
            this.f10593g = lVarArr;
        }

        public final int compare(T t, T t2) {
            return b.d(t, t2, this.f10593g);
        }
    }

    public static <T> Comparator<T> b(l<? super T, ? extends Comparable<?>>... lVarArr) {
        k.e(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return new a(lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static <T extends Comparable<?>> int c(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* access modifiers changed from: private */
    public static final <T> int d(T t, T t2, l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int c = c((Comparable) lVar.o(t), (Comparable) lVar.o(t2));
            if (c != 0) {
                return c;
            }
        }
        return 0;
    }

    public static <T extends Comparable<? super T>> Comparator<T> e() {
        e eVar = e.f10594g;
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
    }
}
