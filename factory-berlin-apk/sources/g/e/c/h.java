package g.e.c;

import androidx.lifecycle.f0;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: Watcher.kt */
public class h<T> implements f0<T> {

    /* renamed from: g  reason: collision with root package name */
    private final l<T, x> f9746g;

    public h(l<? super T, x> lVar) {
        k.f(lVar, "onNonNull");
        this.f9746g = lVar;
    }

    public void k(T t) {
        if (t != null) {
            x o = this.f9746g.o(t);
        }
    }
}
