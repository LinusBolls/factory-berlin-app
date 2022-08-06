package kotlin.a0;

import java.util.Iterator;
import kotlin.jvm.internal.z.a;

/* compiled from: Iterators.kt */
public abstract class a0 implements Iterator<Integer>, a {
    /* renamed from: a */
    public final Integer next() {
        return Integer.valueOf(c());
    }

    public abstract int c();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
