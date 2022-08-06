package kotlin.a0;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.z.a;

/* compiled from: Collections.kt */
public final class w implements ListIterator, a {

    /* renamed from: g  reason: collision with root package name */
    public static final w f10589g = new w();

    private w() {
    }

    public Void a() {
        throw new NoSuchElementException();
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void c() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        a();
        throw null;
    }

    public int nextIndex() {
        return 0;
    }

    public /* bridge */ /* synthetic */ Object previous() {
        c();
        throw null;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
