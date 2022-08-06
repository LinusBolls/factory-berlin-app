package kotlin.a0;

import java.util.Iterator;
import kotlin.jvm.internal.z.a;
import kotlin.v;

/* compiled from: UIterators.kt */
public abstract class o0 implements Iterator<v>, a {
    public final short a() {
        return c();
    }

    public abstract short c();

    public /* bridge */ /* synthetic */ Object next() {
        return v.a(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
