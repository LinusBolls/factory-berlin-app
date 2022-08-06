package kotlin.b0;

import java.util.Comparator;
import kotlin.jvm.internal.k;

/* compiled from: Comparisons.kt */
final class f implements Comparator<Comparable<? super Object>> {

    /* renamed from: g  reason: collision with root package name */
    public static final f f10595g = new f();

    private f() {
    }

    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        k.e(comparable, "a");
        k.e(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return e.f10594g;
    }
}
