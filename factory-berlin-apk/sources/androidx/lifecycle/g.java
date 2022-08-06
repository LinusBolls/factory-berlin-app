package androidx.lifecycle;

import kotlin.c0.d;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: CoroutineLiveData.kt */
public final class g {
    public static final <T> LiveData<T> a(kotlin.c0.g gVar, long j2, p<? super a0<T>, ? super d<? super x>, ? extends Object> pVar) {
        k.f(gVar, "context");
        k.f(pVar, "block");
        return new f(gVar, j2, pVar);
    }
}
