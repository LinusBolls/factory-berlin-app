package m.a.c.m;

import kotlin.j;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: Measure.kt */
public final class a {
    public static final <T> j<T, Double> a(kotlin.e0.c.a<? extends T> aVar) {
        k.f(aVar, "code");
        return new j<>(aVar.d(), Double.valueOf(((double) (System.nanoTime() - System.nanoTime())) / 1000000.0d));
    }

    public static final double b(kotlin.e0.c.a<x> aVar) {
        k.f(aVar, "code");
        long nanoTime = System.nanoTime();
        aVar.d();
        return ((double) (System.nanoTime() - nanoTime)) / 1000000.0d;
    }
}
