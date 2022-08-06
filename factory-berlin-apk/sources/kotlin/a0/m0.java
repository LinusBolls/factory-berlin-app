package kotlin.a0;

import java.util.Iterator;
import kotlin.jvm.internal.z.a;
import kotlin.q;

/* compiled from: UIterators.kt */
public abstract class m0 implements Iterator<q>, a {
    public final int a() {
        return c();
    }

    public abstract int c();

    public /* bridge */ /* synthetic */ Object next() {
        return q.a(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
