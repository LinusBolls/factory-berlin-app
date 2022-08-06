package kotlin.a0;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: AbstractCollection.kt */
public abstract class a<E> implements Collection<E>, kotlin.jvm.internal.z.a {

    /* renamed from: kotlin.a0.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractCollection.kt */
    static final class C0754a extends l implements kotlin.e0.c.l<E, CharSequence> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f10572h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0754a(a aVar) {
            super(1);
            this.f10572h = aVar;
        }

        /* renamed from: a */
        public final CharSequence o(E e2) {
            return e2 == this.f10572h ? "(this Collection)" : String.valueOf(e2);
        }
    }

    protected a() {
    }

    public abstract int a();

    public boolean add(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (k.a(a, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        k.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public Object[] toArray() {
        return f.a(this);
    }

    public String toString() {
        return v.F(this, ", ", "[", "]", 0, (CharSequence) null, new C0754a(this), 24, (Object) null);
    }

    public <T> T[] toArray(T[] tArr) {
        k.e(tArr, "array");
        T[] b = f.b(this, tArr);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
