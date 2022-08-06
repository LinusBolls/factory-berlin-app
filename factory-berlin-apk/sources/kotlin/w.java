package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.a0.o0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: UShortArray.kt */
public final class w implements Collection<v>, kotlin.jvm.internal.z.a {

    /* renamed from: g  reason: collision with root package name */
    private final short[] f10706g;

    /* compiled from: UShortArray.kt */
    private static final class a extends o0 {

        /* renamed from: g  reason: collision with root package name */
        private int f10707g;

        /* renamed from: h  reason: collision with root package name */
        private final short[] f10708h;

        public a(short[] sArr) {
            k.e(sArr, "array");
            this.f10708h = sArr;
        }

        public short c() {
            int i2 = this.f10707g;
            short[] sArr = this.f10708h;
            if (i2 < sArr.length) {
                this.f10707g = i2 + 1;
                short s = sArr[i2];
                v.i(s);
                return s;
            }
            throw new NoSuchElementException(String.valueOf(this.f10707g));
        }

        public boolean hasNext() {
            return this.f10707g < this.f10708h.length;
        }
    }

    private /* synthetic */ w(short[] sArr) {
        k.e(sArr, "storage");
        this.f10706g = sArr;
    }

    public static boolean d(short[] sArr, short s) {
        return j.p(sArr, s);
    }

    public static boolean e(short[] sArr, Collection<v> collection) {
        boolean z;
        k.e(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof v) || !j.p(sArr, ((v) next).n())) {
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

    public static boolean g(short[] sArr, Object obj) {
        return (obj instanceof w) && k.a(sArr, ((w) obj).q());
    }

    public static int j(short[] sArr) {
        return sArr.length;
    }

    public static int k(short[] sArr) {
        if (sArr != null) {
            return Arrays.hashCode(sArr);
        }
        return 0;
    }

    public static boolean l(short[] sArr) {
        return sArr.length == 0;
    }

    public static o0 n(short[] sArr) {
        return new a(sArr);
    }

    public static String o(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ")";
    }

    public boolean a(short s) {
        return d(this.f10706g, s);
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends v> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof v) {
            return a(((v) obj).n());
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return e(this.f10706g, collection);
    }

    public boolean equals(Object obj) {
        return g(this.f10706g, obj);
    }

    public int hashCode() {
        return k(this.f10706g);
    }

    public int i() {
        return j(this.f10706g);
    }

    public boolean isEmpty() {
        return l(this.f10706g);
    }

    /* renamed from: m */
    public o0 iterator() {
        return n(this.f10706g);
    }

    public final /* synthetic */ short[] q() {
        return this.f10706g;
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
        return o(this.f10706g);
    }
}
