package kotlin.b0;

import java.util.Comparator;
import kotlin.jvm.internal.k;

/* compiled from: Comparisons.kt */
final class e implements Comparator<Comparable<? super Object>> {

    /* renamed from: g  reason: collision with root package name */
    public static final e f10594g = new e();

    private e() {
    }

    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        k.e(comparable, "a");
        k.e(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return f.f10595g;
    }
}
