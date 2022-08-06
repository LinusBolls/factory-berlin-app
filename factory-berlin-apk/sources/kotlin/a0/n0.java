package kotlin.a0;

import java.util.Iterator;
import kotlin.jvm.internal.z.a;
import kotlin.s;

/* compiled from: UIterators.kt */
public abstract class n0 implements Iterator<s>, a {
    public final long a() {
        return c();
    }

    public abstract long c();

    public /* bridge */ /* synthetic */ Object next() {
        return s.a(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
