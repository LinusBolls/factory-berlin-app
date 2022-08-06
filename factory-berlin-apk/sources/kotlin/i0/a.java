package kotlin.i0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.k;

/* compiled from: SequencesJVM.kt */
public final class a<T> implements d<T> {
    private final AtomicReference<d<T>> a;

    public a(d<? extends T> dVar) {
        k.e(dVar, "sequence");
        this.a = new AtomicReference<>(dVar);
    }

    public Iterator<T> iterator() {
        d andSet = this.a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
