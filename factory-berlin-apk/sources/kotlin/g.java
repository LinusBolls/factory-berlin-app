package kotlin;

import kotlin.e0.c.a;
import kotlin.jvm.internal.k;

/* compiled from: LazyJVM.kt */
class g {
    public static <T> e<T> a(a<? extends T> aVar) {
        k.e(aVar, "initializer");
        return new m(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
    }
}
