package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.a0.m0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: UIntArray.kt */
public final class r implements Collection<q>, kotlin.jvm.internal.z.a {

    /* renamed from: g  reason: collision with root package name */
    private final int[] f10698g;

    /* compiled from: UIntArray.kt */
    private static final class a extends m0 {

        /* renamed from: g  reason: collision with root package name */
        private int f10699g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f10700h;

        public a(int[] iArr) {
            k.e(iArr, "array");
            this.f10700h = iArr;
        }

        public int c() {
            int i2 = this.f10699g;
            int[] iArr = this.f10700h;
            if (i2 < iArr.length) {
                this.f10699g = i2 + 1;
                int i3 = iArr[i2];
                q.i(i3);
                return i3;
            }
            throw new NoSuchElementException(String.valueOf(this.f10699g));
        }

        public boolean hasNext() {
            return this.f10699g < this.f10700h.length;
        }
    }

    private /* synthetic */ r(int[] iArr) {
        k.e(iArr, "storage");
        this.f10698g = iArr;
    }

    public static boolean d(int[] iArr, int i2) {
        return j.m(iArr, i2);
    }

    public static boolean e(int[] iArr, Collection<q> collection) {
        boolean z;
        k.e(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof q) || !j.m(iArr, ((q) next).n())) {
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

    public static boolean g(int[] iArr, Object obj) {
        return (obj instanceof r) && k.a(iArr, ((r) obj).q());
    }

    public static int j(int[] iArr) {
        return iArr.length;
    }

    public static int k(int[] iArr) {
        if (iArr != null) {
            return Arrays.hashCode(iArr);
        }
        return 0;
    }

    public static boolean l(int[] iArr) {
        return iArr.length == 0;
    }

    public static m0 n(int[] iArr) {
        return new a(iArr);
    }

    public static String o(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ")";
    }

    public boolean a(int i2) {
        return d(this.f10698g, i2);
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends q> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof q) {
            return a(((q) obj).n());
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return e(this.f10698g, collection);
    }

    public boolean equals(Object obj) {
        return g(this.f10698g, obj);
    }

    public int hashCode() {
        return k(this.f10698g);
    }

    public int i() {
        return j(this.f10698g);
    }

    public boolean isEmpty() {
        return l(this.f10698g);
    }

    /* renamed from: m */
    public m0 iterator() {
        return n(this.f10698g);
    }

    public final /* synthetic */ int[] q() {
        return this.f10698g;
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
        return o(this.f10698g);
    }
}
