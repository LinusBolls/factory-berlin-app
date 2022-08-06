package kotlin.a0;

import java.util.Iterator;
import kotlin.jvm.internal.z.a;
import kotlin.o;

/* compiled from: UIterators.kt */
public abstract class l0 implements Iterator<o>, a {
    public final byte a() {
        return c();
    }

    public abstract byte c();

    public /* bridge */ /* synthetic */ Object next() {
        return o.a(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
