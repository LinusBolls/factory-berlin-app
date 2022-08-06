package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.a0.n0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: ULongArray.kt */
public final class t implements Collection<s>, kotlin.jvm.internal.z.a {

    /* renamed from: g  reason: collision with root package name */
    private final long[] f10702g;

    /* compiled from: ULongArray.kt */
    private static final class a extends n0 {

        /* renamed from: g  reason: collision with root package name */
        private int f10703g;

        /* renamed from: h  reason: collision with root package name */
        private final long[] f10704h;

        public a(long[] jArr) {
            k.e(jArr, "array");
            this.f10704h = jArr;
        }

        public long c() {
            int i2 = this.f10703g;
            long[] jArr = this.f10704h;
            if (i2 < jArr.length) {
                this.f10703g = i2 + 1;
                long j2 = jArr[i2];
                s.i(j2);
                return j2;
            }
            throw new NoSuchElementException(String.valueOf(this.f10703g));
        }

        public boolean hasNext() {
            return this.f10703g < this.f10704h.length;
        }
    }

    private /* synthetic */ t(long[] jArr) {
        k.e(jArr, "storage");
        this.f10702g = jArr;
    }

    public static boolean d(long[] jArr, long j2) {
        return j.n(jArr, j2);
    }

    public static boolean e(long[] jArr, Collection<s> collection) {
        boolean z;
        k.e(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof s) || !j.n(jArr, ((s) next).n())) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean g(long[] jArr, Object obj) {
        return (obj instanceof t) && k.a(jArr, ((t) obj).q());
    }

    public static int j(long[] jArr) {
        return jArr.length;
    }

    public static int k(long[] jArr) {
        if (jArr != null) {
            return Arrays.hashCode(jArr);
        }
        return 0;
    }

    public static boolean l(long[] jArr) {
        return jArr.length == 0;
    }

    public static n0 n(long[] jArr) {
        return new a(jArr);
    }

    public static String o(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ")";
    }

    public boolean a(long j2) {
        return d(this.f10702g, j2);
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends s> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof s) {
            return a(((s) obj).n());
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return e(this.f10702g, collection);
    }

    public boolean equals(Object obj) {
        return g(this.f10702g, obj);
    }

    public int hashCode() {
        return k(this.f10702g);
    }

    public int i() {
        return j(this.f10702g);
    }

    public boolean isEmpty() {
        return l(this.f10702g);
    }

    /* renamed from: m */
    public n0 iterator() {
        return n(this.f10702g);
    }

    public final /* synthetic */ long[] q() {
        return this.f10702g;
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
        return i();
    }

    public Object[] toArray() {
        return f.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return f.b(this, tArr);
    }

    public String toString() {
        return o(this.f10702g);
    }
}
